package com.company;

public class Main {

    public static void main(String[] args) {
        marks(70,30,"John");
        marks(34,55,"sample");
        marks(12,67,"sample2");
        marks(89,45,"Sample3");
    }

    public static void marks(int m1, int m2, String Name){
        int total = m1 + m2;
        System.out.println("Name : "+Name);
        System.out.println("Total : "+total+"\n");
    }
}
