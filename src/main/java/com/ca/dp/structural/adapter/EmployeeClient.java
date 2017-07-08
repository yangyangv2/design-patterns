package com.ca.dp.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanya04 on 5/10/2017.
 */
public class EmployeeClient {

    public List<Employee> getEmployeeList(){

        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");

        employees.add(employeeFromDB);

        EmployeeLdap employeeLdap = new EmployeeLdap("chewie", "solo", "han", "han.solo@wick.com");

        employees.add(new EmployeeAdapterLdap(employeeLdap));

        return employees;
    }
}
