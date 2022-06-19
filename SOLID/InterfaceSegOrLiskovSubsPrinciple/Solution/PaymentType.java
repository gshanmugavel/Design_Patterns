package main.java.InterfaceSegOrLiskovSubsPrinciple.Solution;

public interface PaymentType {
    boolean transactMoney(String from, String to, Long amount);
}
