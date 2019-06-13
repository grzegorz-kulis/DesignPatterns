package com.lisek.chain;

public class EmailMessageHandler implements MessageHandler {

    private MessageHandler messageHandler;

    public EmailMessageHandler() {
    }

    public EmailMessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    public void processMessage(Message message) {
        if (message.getText().equalsIgnoreCase("mail")) {
            System.out.println("Processing mail with priority " + message.getPriority());
        }
        else {
            if (messageHandler != null) {
                messageHandler.processMessage(message);
            } else {
                System.out.println("NO HANDLER RESPONSIBLE FOUND");
            }
        }
    }

    public void setNextChain(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }
}
