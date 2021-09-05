package com.easha.javareboot.task2.domain;

public abstract class Document {
    private final String number;
    private String title;

    public Document(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public final String getMainInfo() {
        return "Document{" +
                "number='" + number + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Document{" +
                "number='" + number + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
