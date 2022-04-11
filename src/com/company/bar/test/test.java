package com.company.bar.test;

public class test {
    static double arithmeticMean(double a[]){
        double num = 0;
        for(int i = 0; i < a.length; i++){
            num += a[i];
        }
        return num / a.length;
    }
    public static void main(String[] args) {
        double arr [] = {2.202, 45.2, 320.1, 8.4, 9.16 };
        System.out.println(arithmeticMean(arr));
    }
}
