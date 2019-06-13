package com.lisek.chain;

public class IssueRaiser {

    private MessageHandler messageHandler;

    public IssueRaiser(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    public void raiseMessage(Message message) {
        if (messageHandler != null) {
            messageHandler.processMessage(message);
        }
    }
}
