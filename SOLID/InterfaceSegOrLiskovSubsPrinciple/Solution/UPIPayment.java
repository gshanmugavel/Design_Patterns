package main.java.InterfaceSegOrLiskovSubsPrinciple.Solution;

public class UPIPayment implements GenericPaymentType {
    @Override
    public boolean transactMoney(String from, String to, Long amount) {
        return false;
    }
}