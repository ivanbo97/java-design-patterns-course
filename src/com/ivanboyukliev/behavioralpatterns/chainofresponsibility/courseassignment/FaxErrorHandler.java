package com.ivanboyukliev.behavioralpatterns.chainofresponsibility.courseassignment;

public class FaxErrorHandler implements IReceiver {
    private IReceiver nextErrorReceiver;

    @Override
    public boolean processMessage(Message message) {
        String errorText = message.getMessageText();
        if (errorText.contains("Fax")) {
            System.out.println("Handling Fax Error with priority: " + message.getPriority().name());
            return true;
        }
        if (nextErrorReceiver != null) {
            nextErrorReceiver.processMessage(message);
        }
        return false;
    }

    @Override
    public void setNextReceiver(IReceiver nextReceiver) {
        nextErrorReceiver = nextReceiver;
    }
}
