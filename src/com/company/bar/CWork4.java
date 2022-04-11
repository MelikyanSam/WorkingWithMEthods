package com.company.bar;

public class CWork4 {
    static int isEqual(int v1, int v2) {
        if (v1 > v2)
            return 1;
        else if (v1 == v2)
            return 0;
        else
            return -1;
    }

    static int isEqual(float v1, float v2) {
        if (v1 > v2)
            return 1;
        else if (v1 == v2)
            return 0;
        else
            return -1;
    }

    static int p(int e1){
        return e1 * 4 ;
    }
    static int p(int e1,int e2){
        return (e1 + e2) * 2 ;
    }
    static int p(int e1,int e2, int e3){
        return e1 + e2 + e3;
    }


    static void test(int ... args){
        int sum = 0;
        for (int i: args) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    static private void test(boolean p, String ... args){
        boolean negate = !p;
        System.out.println("negate = " + negate);
        System.out.println("args.length = "+ args.length);
    }
    public static void main(String[] args) {
//        System.out.println(isEqual(8, 20));
//        System.out.println(isEqual(9.3f, 2.4f));
//        System.out.println(p(8)+ " is square's perimeter.");
//        System.out.println(p(8,10)+ " is rectangle's perimeter.");
//        System.out.println(p(8,5,8)+  " is triangel's perimeter.");




                test(1, 2, 3);
                test(true, "hello", "world");



    }
}
