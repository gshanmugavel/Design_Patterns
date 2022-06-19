package main.java.DependencyInvPrinciple.Solution;

public class CardPayment implements PaymentType {
    @Override
    public boolean transactMoney(String from, String to, Long amount) {
        return false;
    }
}
