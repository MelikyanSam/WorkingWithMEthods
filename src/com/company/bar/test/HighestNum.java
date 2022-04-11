package com.company.bar.test;

public class HighestNum {
    static int highestNum(int a[]){
        int n = a[0];
        for (int i = 0; i < a.length; i++){
            if(a[i] > n) n = a[i];
        }
        return n;
    }
    public static void main(String[] args) {
        int nums[] = {9, 12, 30, 5};
        System.out.println(highestNum(nums));
    }
}
