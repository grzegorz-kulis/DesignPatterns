package com.lisek.chain;

public class Message {
    private String text;
    private MessagePriority priority;


    public Message(String test, MessagePriority priority) {
        this.text = test;
        this.priority = priority;
    }

    public MessagePriority getPriority() {
        return priority;
    }

    public void setPriority(MessagePriority priority) {
        this.priority = priority;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
