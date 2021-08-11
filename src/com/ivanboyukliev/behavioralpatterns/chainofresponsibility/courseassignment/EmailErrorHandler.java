package com.ivanboyukliev.behavioralpatterns.chainofresponsibility.courseassignment;

public class EmailErrorHandler implements IReceiver {
    private IReceiver nextErrorReceiver;
    @Override
    public boolean processMessage(Message message) {
        String errorText = message.getMessageText();
        if(errorText.contains("Email")){
            System.out.println("Handling Email Error with priority: " + message.getPriority().name());
            return true;
        }

        if(nextErrorReceiver != null){
            nextErrorReceiver.processMessage(message);
        }
        return false;
    }

    @Override
    public void setNextReceiver(IReceiver nextReceiver) {
        nextErrorReceiver = nextReceiver;
    }
}
