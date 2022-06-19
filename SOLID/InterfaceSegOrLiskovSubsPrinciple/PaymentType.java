package main.java.InterfaceSegOrLiskovSubsPrinciple;

public interface PaymentType {
    boolean transactMoney(String from, String to, Long amount);
    boolean validateCardNumber(long cardNo);
}
