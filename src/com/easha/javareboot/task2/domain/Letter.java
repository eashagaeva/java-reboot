package com.easha.javareboot.task2.domain;

public class Letter extends Document  {
    private String recipient; // получатель
    private String sender; // отправитель

    public Letter(String number) {
        super(number);
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "recipient='" + recipient + '\'' +
                ", sender='" + sender + '\'' +
                "} " + super.toString();
    }
}
