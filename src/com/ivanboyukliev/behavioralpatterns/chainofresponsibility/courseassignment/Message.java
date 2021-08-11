package com.ivanboyukliev.behavioralpatterns.chainofresponsibility.courseassignment;

public class Message {
    private String messageText;
    private MessagePriority priority;

    public Message(String messageText, MessagePriority priority) {
        this.messageText = messageText;
        this.priority = priority;
    }

    public String getMessageText() {
        return messageText;
    }

    public MessagePriority getPriority() {
        return priority;
    }
}
