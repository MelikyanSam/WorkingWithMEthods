package com.company.bar;

public class Class {

    public static void main(String[] args) {

//    if(5==6){
//        System.out.println("If statmant");
//
//    } else if(5<6){
//
//        System.out.println("Else IF statmant");
//    }

//    int a = 4;
//    int b = 4;
//    int c = 8;
//
//    if ((a+b)>c && ((a+c)>b) && ((c+b)>a)){
//        System.out.println("This sides could be a triangle");
//    }else {
//        System.out.println("This sides could't be a triangle");
//
//    }

//        int month = 3;
//
//        if ((month == 12) || (month == 1) || (month == 2)) {
//            System.out.println("This is a winter's month");
//        }
//        else if((month == 3) || (month == 4) || (month == 5)){
//            System.out.println("This is a spring's month");
//        }
//        else if((month == 6) || (month == 7) || (month == 8)){
//            System.out.println("This is a summer's month");
//        }
//        else if((month == 9) || (month == 10) || (month == 11)){
//            System.out.println("This is a autumn's month");
//        }
//        else{
//            System.out.println("This number is not a month!");
//        }
//------------------------------------------------------------------------------------------------------------------------
//        int month = 3;
////
//        switch(month){
//            case 12: case 1: case 2:
//                System.out.println("This is a winter's month");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("This is a spring's month");
//                break;
//            case 6: case 7: case 8:
//                System.out.println("This is a summer's month");
//                break;
//            case 9: case 10: case 11:
//                System.out.println("This is a autumn's month");
//                break;
//            default:
//                System.out.println("This number is not a month!");
//        }

        int n = 0;

        while (n<11){
            System.out.println("n is "+n+" now");
            ++n;
        }
        n=12;
        do{

            System.out.println(n+" is n in do-while loop");
            if(n==1) System.out.println();
            --n;
        }while(n>0);

        for (;n<11;n++) {
            if (n==4) {
                System.out.println("'"+n+"'" + " is jumped out from 'for loop'");
                continue;
            }
            if (n==7) {
                System.out.println("'for loop' has ended after "+ --n);
                break;
            }
            System.out.println(n + " is n in 'for loop'");
        }


    }

}