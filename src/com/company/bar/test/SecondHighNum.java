package com.company.bar.test;

public class SecondHighNum {
    static int highestNum(int a, int b, int c, int d){
        int arr[] = new int[5];
        arr[0] = a;
        arr[1] = b;
        arr[3] = c;
        arr[4] = d;
        int n = arr[0];

        for (int i = 1; i < arr.length; i++){
            if(arr[i] > n) n = arr[i];
        }
        return n;
    }
    public static void main(String[] args) {
        int k = 8;
        int l = 2;
        int m = 3;
        int n = 12;

        System.out.println(highestNum(k,l,m,n));
    }
}
