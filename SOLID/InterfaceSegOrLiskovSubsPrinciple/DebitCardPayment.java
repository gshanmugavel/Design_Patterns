package main.java.InterfaceSegOrLiskovSubsPrinciple;

public class DebitCardPayment implements PaymentType {
    @Override
    public boolean transactMoney(String from, String to, Long amount) {
        return false;
    }

    @Override
    public boolean validateCardNumber(long cardNo) {
        return false;
    }
}
