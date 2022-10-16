package com.company;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your course name?");
        String cName = scan.next();
        int cFee = 0;

        if(cName.equals("HND"))
            cFee = 275000;
        else if(cName.equals("QS"))
            cFee = 180_000;
        else if(cName.equals("BMS"))
            cFee = 375000;
        else if(cName.equals("BM"))
            cFee = 23000;
        else if(cName.equals("ACC"))
            cFee = 70000;
        else
            System.out.println("Invalid Course Name");

        System.out.println(cFee);

    }
}
