package com.ca.dp.structural.adapter;

/**
 * Created by yanya04 on 5/10/2017.
 */
public class EmployeeAdapterLdap implements  Employee{

    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance){
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getGivenName();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }
}
