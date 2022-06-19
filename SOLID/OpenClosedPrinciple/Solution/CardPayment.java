package main.java.OpenClosedPrinciple.Solution;

public class CardPayment implements PaymentType {
    @Override
    public boolean transactMoney(String from, String to, Long amount) {
        return false;
    }
}
