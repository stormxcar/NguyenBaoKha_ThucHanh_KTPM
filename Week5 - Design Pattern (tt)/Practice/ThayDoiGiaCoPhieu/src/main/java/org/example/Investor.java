package org.example;

public class Investor implements IObserver {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " nhận được thông báo: " + message);
    }
}
