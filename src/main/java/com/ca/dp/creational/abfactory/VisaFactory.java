package com.ca.dp.creational.abfactory;

import javax.xml.validation.Validator;

/**
 * Created by yanya04 on 5/10/2017.
 */
public class VisaFactory extends CreditCardFactory {


    @Override
    public CreditCard getCreditCard(CardType cardType) {
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return null;
    }
}
