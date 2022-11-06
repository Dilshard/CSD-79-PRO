package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double num1 = Math.round(Math.random()*100);
        double num2 = Math.round(Math.random()*100);
        double total = num1 + num2;

        System.out.println(num1 +" + "+ num2 +" = ?");

        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();

        if (total == answer){
            System.out.println("Correct!");
        }else {
            System.out.println("Wrong!");
        }

    }
}
