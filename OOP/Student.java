package com.company;

public class Student extends Marks {
    private String studentNo;
    private String studentName;
    private String contact;
    private String gender;

    public void inputCol(String studentNo, String studentName, String con, String gen){
        this.studentNo = studentNo;
        this.studentName = studentName;
        contact = con;
        gender = gen;
    }

    public void print(){
        System.out.println(studentNo);
        System.out.println(studentName);
        System.out.println(contact);
        System.out.println(gender);
        System.out.println();
    }
}
