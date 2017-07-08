package com.ca.dp.creational.abfactory;

import javax.xml.validation.Validator;

/**
 * Created by yanya04 on 5/10/2017.
 */
public abstract  class CreditCardFactory {
    public static CreditCardFactory getCreditCardFactory(int creditScore){

        if(creditScore > 650){
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
