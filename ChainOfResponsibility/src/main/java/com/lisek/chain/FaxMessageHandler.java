package com.lisek.chain;

public class FaxMessageHandler implements MessageHandler {

    private MessageHandler messageHandler;

    public FaxMessageHandler() {
    }

    public FaxMessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    public void processMessage(Message message) {
        if (message.getText().equalsIgnoreCase("fax")) {
            System.out.println("Processing fax with priority " + message.getPriority());
        }
        else {
            if (messageHandler != null) {
                messageHandler.processMessage(message);
            }
            else {
                System.out.println("NO HANDLER RESPONSIBLE FOUND");
            }
        }
    }

    public void setNextChain(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }
}
