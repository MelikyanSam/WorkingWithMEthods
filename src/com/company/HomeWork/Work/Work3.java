package com.company.HomeWork.Work;

public class Work3 {
    public static void main(String[] args) {
//      the addition of 0 to 100 number's

        int num = 0;
        int sum = 0;
        while(num<101){
            sum=sum+num;
//            System.out.println(sum+"now");
            num++;
        }
        System.out.println(sum+" is the sum after addition.");

        num=0;
        sum=0;
        for(;num<101;num++){
            sum+=num;
        }
        System.out.println(sum+" is the sum after addition in 'for' loop.");

//      The factorial of 20
        System.out.println();
        long fact = 1;
        for(int i = 1;i<21;i++){
            fact *= i;
        }
        System.out.println(fact+" is the factorial of 20");
        System.out.println();
        fact=1;
        for(int i = 1;i<21;i++){
            fact *= i;
        }
        System.out.println(fact+" is the factorial of 20 in 'for' loop.");
        System.out.println();

//      The pair and odd number's bitween 0 and 100
        int x = 0;
        while(x<101){
            if(x%2==0) {
                System.out.println(x + " is a pair number bitween 0 and 100");
            }else{
                System.out.println(x + " is a odd number bitween 0 and 100");
            }
            x++;
        }
        System.out.println();

        x=0;
        for(;x<101;x++){
            if(x%2!=0) {
                System.out.println(x + " is a odd number bitween 0 and 100 in 'for' loop.");
                continue;
            }
        System.out.println(x + " is a pair number bitween 0 and 100 in 'for' loop.");

        }
        System.out.println("------------------------------------------------------");

//      Simple numbers bitween 0 and 100
//        byte k=0;
//        for(byte i =1;i<101;i++){
////            if((i/1==i) && (i/i==1))
////            System.out.println(i);
//            for(byte f=1;f==100;f++){
//                if(f==i){
//                    System.out.println(i);
//                    continue;
//                }
//                if(i%f==0)System.out.println(f);continue;
//            }
//        }
        System.out.println("------------------------------------------------------");

//      Draw a triangle using for loop.
        String s="*",sp=" ",tr="*";

        for(int i = 0;i<5;i++){
            if(i==0){
                System.out.println(tr);
            }
            tr+=s;
            System.out.println(tr);
        }
        System.out.println("=========================================");
        s="*";
        sp=" ";
        String v="", st="*",h="";
        int n=4;
        for(int i = 1;i<5;i++){
            for(byte j=1;j<n;j++){
                v+=sp;
            }
            if (i==1)System.out.println(v+s);
            else System.out.println(v+s+st);//(v+h)
            if(i==3)s+=st+st;//
            else s+=s;//
//            h+=(s+s);
            v="";
            n-=1;
        }
        System.out.println("------------------------------------------------------");

//      Print at 0 to 10 number's without filling a loop
        byte t=0,op=-1;
        for (byte i=0;i<11;i++){
            op++;
            for(;t!=op;t++){
            }
            System.out.println(t);
        }
//       ( int i;
//        int j;
//
//        for ( i=2; i<=200; i++ ) {
//            for ( j=2; j<i; j++ ) {
//                if (i%j==0)
//                    break;
//            }
//            if (j==i)
//                System.out.println(i);
//        })


    }
}
