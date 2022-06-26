package main.java.InterfaceSegOrLiskovSubsPrinciple.Solution;

public class DebitCardPayment implements CardBasedPaymentType {
    @Override
    public boolean transactMoney(String from, String to, Long amount) {
        return false;
    }

    @Override
    public boolean validateCardNumber(long cardNo) {
        return false;
    }
}
