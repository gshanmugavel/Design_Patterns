package main.java.OpenClosedPrinciple;

public class PaymentType {
    public boolean transactMoney(String payType, String from, String to, long amount){
        if("NetBankingPayment".equals(payType)){
            //transact money via netbanking
        }else if("CardPayment".equals(payType)){
            //transact money via debit/credit card
        }
        return true;
    }
}
