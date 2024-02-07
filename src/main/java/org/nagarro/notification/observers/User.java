package org.nagarro.notification.observers;

import org.nagarro.notification.interfaces.Observer;

public class User implements Observer {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }

}

