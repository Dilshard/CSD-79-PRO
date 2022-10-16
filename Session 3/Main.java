package com.company;

class Main {

    public static void main(String[] args) {
        int mk1 = 65;
        int mk2 = 70;
        int tot = mk1 + mk2;
        double avg = tot / 2;

        String grd;

        if(avg >= 50)
        {
            grd = "Pass";
        }
        else
        {
            grd = "Fail";
        }

        System.out.println("Total\t: "+tot);
        System.out.println("Average\t: "+avg);
        System.out.println("Grade\t: "+grd);
    }
}
