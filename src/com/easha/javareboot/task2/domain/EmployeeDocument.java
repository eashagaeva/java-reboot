package com.easha.javareboot.task2.domain;

/**
 * Кадровый документ
 */
public abstract class EmployeeDocument extends Document {
    /**
     * ФИО сотрудника в формате Фамилия И.О.
     */
    private final String employee; // сотрудник
    private String text; // текст
    private DocumentStatus status = DocumentStatus.CREATED;

    public EmployeeDocument(String number, String employee) {
        super(number);
        this.employee = employee;
    }

    public String getEmployee() {
        return employee;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public DocumentStatus getStatus() {
        return status;
    }

    public void setStatus(DocumentStatus status) {
        if (this.status == DocumentStatus.EXECUTED && status == DocumentStatus.CREATED)
            return;
        this.status = status;
    }

    @Override
    public String toString() {
        return "EmployeeDocument{" +
                "employee='" + employee + '\'' +
                ", text='" + text + '\'' +
                ", status=" + status +
                "} " + super.toString();
    }
}
