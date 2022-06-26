package main.java.OpenClosedPrinciple.Solution;


import main.java.OpenClosedPrinciple.Solution.PaymentType;

public class UPIPayment implements PaymentType {
    @Override
    public boolean transactMoney(String from, String to, Long amount) {
        return false;
    }
}