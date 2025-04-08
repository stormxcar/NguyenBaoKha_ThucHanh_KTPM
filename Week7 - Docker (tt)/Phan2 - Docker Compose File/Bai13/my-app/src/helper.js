export function calcCulateWinner(cells){
    const lineWin = [
        [0,1,2],[3,4,5],[6,7,8],
        [0,3,6],[1,4,7],[2,5,8],
        [0,4,8],[2,4,6]
    ]
    for(var i = 0 ; i < lineWin.length ; i++){
        // tạo như 3 ptu liền kề
        const [a,b,c] = lineWin[i];
        if(cells[a] && cells[a] === cells[b] && cells[a] === cells[c] ){
            return cells[a];
        }
    }
    return null;
}