package com.easha.javareboot.task2.domain;

public class DismissalOrder extends EmployeeDocument {
    private String reason;

    public DismissalOrder(String number, String employee) {
        super(number, employee);
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "DismissalOrder{" +
                "reason='" + reason + '\'' +
                "} " + super.toString();
    }
}
