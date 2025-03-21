package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task implements ISubject {
    private String taskName;
    private String status;
    private List<IObserver> observers = new ArrayList<>();

    public Task(String taskName) {
        this.taskName = taskName;
        this.status = "New";
    }

    @Override
    public void attach(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update("Task '" + taskName + "' đã được cập nhật trạng thái: " + status);
        }
    }

    public void setStatus(String newStatus) {
        if (!this.status.equals(newStatus)) {
            this.status = newStatus;
            notifyObservers();
        }
    }
}
