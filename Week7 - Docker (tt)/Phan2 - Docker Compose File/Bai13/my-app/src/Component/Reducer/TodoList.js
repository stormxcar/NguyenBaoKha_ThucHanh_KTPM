import React from 'react';
import { useReducer , useRef } from 'react';

// buoc 1: Initstate
const initState = {
    job: '',
    jobs: []
}

// buoc 2: Actions
const SET_JOB = 'set_job';
// payload: mang dữ liệu đi
const setJob = payload => {
    return  {
        type: SET_JOB,
        payload
    }
}

const ADD_JOB = 'add_job';
const addJob = payload => {
    return  {
        type: ADD_JOB,
        payload
    }
}

const DELETE_JOB = 'delete_job';
const deleteJob = payload => {
    return{
        type: DELETE_JOB,
        payload
    }
}

//buoc 3: create reducer phải trả về kiểu dữ liệu đúng với initState
const reducer = (state, action) => {
    switch(action.type){
        case SET_JOB:
            return{
                // bảo lưu giá trí cũ và lấy gtri mới
                ...state,
                job: action.payload
            }
        case ADD_JOB:
            return{
                ...state,
                jobs:[...state.jobs , action.payload]
            }
        case DELETE_JOB:
            // copy mảng cũ mà khi thay đổi không ảnh hưởng đến mảng cũ
            const newJob = [...state.jobs];
            //cắt phần tử trong mảng (splice) : giá trị mang theo là 1 index khi xóa trong mảng , 1: xóa 1 phần tử
            newJob.splice(action.payload , 1)
            return{
                ...state,
                jobs: newJob
            }
        default:
            throw new Error('Invalid Action !');

    }
}

const TodoList = () => {
    // buoc 4: tao dispatch để có thể kích hoạt ACTION
    const [state , dispatch] = useReducer(reducer , initState)
    // console.log(state);
    const {job , jobs} = state;

    const inputRef = useRef();

    const HandleSubmit = () => {
        dispatch(addJob(job))
        dispatch(setJob(''))

        // sau khi add xong tự đông quay lại ô nhập
        inputRef.current.focus();
    }
    return (
        <div style={{padding : '0 20px'}}>
            <h3>Todo List</h3>
            <input 
                style={{padding: 10}}
                ref={inputRef}
                value={job}
                placeholder='Enter todo ...'
                onChange={(e) => {
                    dispatch(setJob(e.target.value));
                }}
             />
             <button style={{marginLeft : 20 , padding:'10px 20px'}}
                onClick={HandleSubmit}
             >Add</button>
             <ul >
                {jobs.map((job, index) => (
                    <li key={index}>
                        {job}
                        <span
                            onClick={() => {
                                dispatch(deleteJob(index)
                                )}}
                            >&times;
                        </span>
                    </li>
                ))}
             </ul>
        </div>
    );
};

export default TodoList;