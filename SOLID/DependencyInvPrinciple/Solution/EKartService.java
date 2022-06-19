package main.java.DependencyInvPrinciple.Solution;


public class EKartService {
    PaymentType payment = new UPIPayment();
    public boolean doTransaction(){
        return payment.transactMoney("from", "to", 1000L);
    }
}
