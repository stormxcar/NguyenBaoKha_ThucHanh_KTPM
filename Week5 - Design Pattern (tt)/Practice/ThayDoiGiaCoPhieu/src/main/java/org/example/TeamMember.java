package org.example;

public class TeamMember implements IObserver {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Thành viên " + name + " nhận được thông báo: " + message);
    }
}
