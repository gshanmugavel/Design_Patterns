package main.java.DependencyInvPrinciple.Solution;

public interface PaymentType {
    boolean transactMoney(String from, String to, Long amount);
}
