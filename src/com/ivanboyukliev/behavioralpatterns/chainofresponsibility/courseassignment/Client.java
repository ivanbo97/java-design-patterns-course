package com.ivanboyukliev.behavioralpatterns.chainofresponsibility.courseassignment;

public class Client {
    public static void main(String[] args) {
        System.out.println("* * * Chain of Responsibility Design Pattern * * *");

        // making the chain : first fax, then email
        IReceiver faxHndler,emailHandler;

        // set the end of the chain
        emailHandler = new EmailErrorHandler();

        faxHndler = new FaxErrorHandler();
        faxHndler.setNextReceiver(emailHandler);

        IssueRaiser issueRaiser = new IssueRaiser(faxHndler);

        Message m1 = new Message("Fax is reaching late to the destination",MessagePriority.HIGH);
        Message m2 = new Message("Email contains inappropriate attachments",MessagePriority.HIGH);
        Message m3 = new Message("Email server issue",MessagePriority.HIGH);
        Message m4 = new Message("Fax is can not reach destination",MessagePriority.NORMAL);

        issueRaiser.raiseMessage(m1);
        issueRaiser.raiseMessage(m2);
        issueRaiser.raiseMessage(m3);
        issueRaiser.raiseMessage(m4);
    }
}
