package com.lisek.chain;

public class Main {
    public static void main(String[] args) {


        MessageHandler emailMsgHandler = new EmailMessageHandler();
        MessageHandler faxMsgHandler = new FaxMessageHandler();

        faxMsgHandler.setNextChain(emailMsgHandler);

        IssueRaiser issueRaiser = new IssueRaiser(faxMsgHandler);
        issueRaiser.raiseMessage(new Message("fax", MessagePriority.HIGH));
        issueRaiser.raiseMessage(new Message("mail", MessagePriority.NORMAL));
    }
}
