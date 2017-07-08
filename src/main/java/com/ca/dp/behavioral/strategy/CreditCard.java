package com.ca.dp.behavioral.strategy;

/**
 * Created by yanya04 on 6/19/2017.
 */
public class CreditCard {

    private String number;
    private String date;
    private String cvv;
    private ValidationStrategy strategy;

    public CreditCard(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean isValid(){
        return strategy.isValid(this);
    }

    public String getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
