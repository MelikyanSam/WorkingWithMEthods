package com.company.bar.test;

public class SecHigh {
    static int max(int a[]) {
        int n = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > n) {
                n = a[i];
            }
        }
        return n;
    }

    static int secHighestNum(int a[]){
        int n = max(a);
        int l = a[0];
        for (int i = 1; i < a.length; i++){
            if(a[i] > l && a[i] < n) {
                l = a[i];
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int nums[] = {47, 48, 203,54, 2, 995,  35};

        System.out.println(secHighestNum(nums));

    }
}
