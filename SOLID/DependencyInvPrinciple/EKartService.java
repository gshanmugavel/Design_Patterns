package main.java.DependencyInvPrinciple;

public class EKartService {
    UPIPayment payment = new UPIPayment();

    public boolean doTransaction(){
        return payment.transactMoney("from", "to", 1000L);
    }
}
