package com.company.HomeWork.Work;

public class Work2 {
    public static void main(String[] args) {
        //Find out does a year extra or not?

        int year = 2022;
        boolean condition = ((year % 4) == 0);

        if(condition == true){
            System.out.println(year +" is a year with an estra day.");
        }else {
            System.out.println(year + " is a simple year,without an extra day.");
        }

        //Find the biggest number form 4 number's.

        int a = 7,b = 12,c = 41;
        double d = 22.7;
        if ((a>b)&&(a>c)&&(a>d)){
            System.out.println(a+" is the biggest number from 4 number's");
        }else if((b>a)&&(b>c)&&(b>d)){
            System.out.println(b+" is the biggest number from 4 number's");
        }else if((c>a)&&(c>b)&&(c>d)){
            System.out.println(c+" is the biggest number from 4 number's");
        }else {
            System.out.println(d+" is the biggest number from 4 number's");
        }
    }
}