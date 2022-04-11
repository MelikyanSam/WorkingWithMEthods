package com.company.bar;

public class CWork3 {
    static void swapp(int x, int y){
        int z = x;
        x = y;
        y = z;
        System.out.println(x+" is x");
        System.out.println(y+" is y");
    }
    static void charValue(char x){
        System.out.println(x);
    }
    long factorial(int n){
        if(n==0 || n==1)
            return n;
        else
            return  n+factorial(n-1);
    }
    static int fib(int n){
        if(n==1  || n==0)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
//       swapp(12,7);
//       charValue('A');
        System.out.println(fib(20));
    }
}
