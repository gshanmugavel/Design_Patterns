package main.java.DependencyInvPrinciple.Solution;

public class UPIPayment implements PaymentType {
    @Override
    public boolean transactMoney(String from, String to, Long amount) {
        return false;
    }
}