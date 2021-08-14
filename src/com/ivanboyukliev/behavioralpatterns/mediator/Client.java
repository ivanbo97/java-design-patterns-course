package com.ivanboyukliev.behavioralpatterns.mediator;

public class Client {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();

        User user1 = new UserImpl(chatMediator,"Ivan");
        User user2 = new UserImpl(chatMediator,"Maria");
        User user3 = new UserImpl(chatMediator,"Dimitar");
        User user4 = new UserImpl(chatMediator,"Georgi");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);

        user1.send("Hi All");

    }
}
