package com.company.HomeWork.Work;

public class Work1 {

    public static void main(String[] args) {

        byte x = 7;
        byte y = 5;

        int bigNumber = x > y ?  x: + y;
        System.out.println("The bigest number is "+ bigNumber);
        int lowNumber = x < y ? x: y;
        System.out.println("The lowest number is "+ lowNumber);

    }

}