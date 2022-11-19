package com.company;

public class Marks extends Finance {
    private int mk1;
    private int mk2;
    private int mk3;
    private int mk4;

    public void marksCol(int mk1, int mk2, int mk3, int mk4){

        if(mk1 >=0 && mk1 <= 100){
            this.mk1 = mk1;
        }else {
            System.out.println("Invalid marks 1!");
        }

        if(mk2 >=0 && mk2 <= 100){
            this.mk2 = mk2;
        }else {
            System.out.println("Invalid marks 2!");
        }

        if(mk3 >=0 && mk3 <= 100){
            this.mk3 = mk3;
        }else {
            System.out.println("Invalid marks 3!");
        }

        if(mk4 >=0 && mk4 <= 100){
            this.mk4 = mk4;
        }else {
            System.out.println("Invalid marks 4!");
        }
    }

    public int total(){
        int total = mk1 +  mk2 + mk3 + mk4;
        return total;
    }

    public double avg(){
        double avg = total() / 4;
        return avg;
    }

    public String grade(){
        String grd;
        if(avg() >= 50){
            grd = "Pass";
        }else {
            grd = "Fail";
        }
        return grd;
    }

    public void reportPrint(){
        System.out.println("Total : "+total());
        System.out.println("Average : "+avg());
        System.out.println("Grade : "+grade());
    }

}
