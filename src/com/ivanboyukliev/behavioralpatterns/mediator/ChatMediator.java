package com.ivanboyukliev.behavioralpatterns.mediator;

// Mediator
public interface ChatMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}
