package com.company;

public class Finance {
    int cFee;
    int initialPay;
    private int inst1;
    private int inst2;
    private int inst3;
    int balance;

    public int setInst1(int pay){
        if(pay >= 0){
            inst1 = pay;
        }else {
            inst1 = 0;
        }
        return inst1;
    }

    public int setInst2(int pay){
        if(pay >= 0){
            inst2 = pay;
        }else {
            inst2 = 0;
        }
        return inst2;
    }

    public int setInst3(int pay){
        if(pay >= 0){
            inst3 = pay;
        }else {
            inst3 = 0;
        }
        return inst3;
    }

    public void balance(){
        this.balance = cFee - (initialPay + inst1 + inst2 + inst3);
        int totalPaid = initialPay + inst1 + inst2 + inst3;
        System.out.println();
        System.out.println("Paid: "+totalPaid);
        System.out.println("Balance : "+balance);
        System.out.println();
    }
}
