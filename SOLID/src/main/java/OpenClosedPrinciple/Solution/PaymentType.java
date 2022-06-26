package main.java.OpenClosedPrinciple.Solution;

public interface PaymentType {
    boolean transactMoney(String from, String to, Long amount);
}
