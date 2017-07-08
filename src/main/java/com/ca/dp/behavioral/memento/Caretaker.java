package com.ca.dp.behavioral.memento;

import java.util.Stack;

/**
 * Created by yanya04 on 6/13/2017.
 */
public class Caretaker {

    private Stack<EmployeeMemento> employeeHsitory = new Stack<>();

    public void save(Employee emp){
        employeeHsitory.push(emp.save());
    }

    public void revert(Employee emp){
        emp.revert(employeeHsitory.pop());
    }
}
