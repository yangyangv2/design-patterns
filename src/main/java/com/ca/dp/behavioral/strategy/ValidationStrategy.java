package com.ca.dp.behavioral.strategy;

/**
 * Created by yanya04 on 6/19/2017.
 */
public abstract class ValidationStrategy {

    public abstract boolean isValid(CreditCard creditCard);


    protected static boolean passLuhn(String ccNumber) {
        int sum = 0;
        boolean alternate = false;
        for (int i = ccNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(ccNumber.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }
}
