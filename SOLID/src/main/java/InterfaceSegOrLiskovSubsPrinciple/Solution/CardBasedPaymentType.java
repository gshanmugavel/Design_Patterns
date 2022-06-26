package main.java.InterfaceSegOrLiskovSubsPrinciple.Solution;

import main.java.InterfaceSegOrLiskovSubsPrinciple.PaymentType;

public interface CardBasedPaymentType extends PaymentType {
    boolean validateCardNumber(long cardNo);
}
