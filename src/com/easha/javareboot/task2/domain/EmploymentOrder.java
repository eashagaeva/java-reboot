package com.easha.javareboot.task2.domain;

public class EmploymentOrder extends EmployeeDocument {

    public EmploymentOrder(String number, String employee) {
        super(number, employee);
    }

    @Override
    public String toString() {
        return "EmploymentOrder{} " + super.toString();
    }
}
