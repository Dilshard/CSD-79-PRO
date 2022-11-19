package com.company;

public class Main {

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.inputCol("ST001","John","077324324","Male");
        st1.marksCol(34,56,78,64);
        st1.print();
        st1.reportPrint();
        st1.initialPay = 15000;
        st1.cFee = 250000;
        st1.setInst1(65000);
        st1.setInst2(75000);
        st1.balance();


//        Student st2 = new Student();
//        st2.inputCol("ST001","Hajara","087236764","Female");
//        st2.marksCol(55,77,65,67);
//        st2.print();
//        st2.reportPrint();


//        Finance finance1 = new Finance();
//        finance1.cFee = 350000;
//        finance1.initialPay = 12500;
//        finance1.setInst1(65000);
//        finance1.setInst2(75000);
//        finance1.setInst3(45000);
//        finance1.balance();










    }
}
