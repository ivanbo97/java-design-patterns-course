package com.ivanboyukliev.behavioralpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

// Concrete Mediator
public class ChatMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChatMediatorImpl() {
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User usr : users) {
            // should not be received by this user
            if (usr != user) {
                usr.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
