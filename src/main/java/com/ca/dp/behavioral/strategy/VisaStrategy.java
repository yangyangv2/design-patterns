package com.ca.dp.behavioral.strategy;

/**
 * Created by yanya04 on 6/19/2017.
 */
public class VisaStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {

        boolean isValid = true;

        isValid = creditCard.getNumber().startsWith("4");

        if(isValid){
            isValid = creditCard.getNumber().length() == 16;
        }

        if(isValid){
            isValid = passLuhn(creditCard.getNumber());
        }

        return isValid;
    }
}
