package com.lisek.chain;

public interface MessageHandler {
    void processMessage(Message message);
    void setNextChain(MessageHandler messageHandler);
}
