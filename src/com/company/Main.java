package com.company;

public class Main {

    public static void main(String[] args) {
//       int x = 5;
//       x = 22026566;
//       byte b = (byte) x;
//        System.out.println(b);
        byte a = 127;
        short b = (2^16)/2-1;//8
        int c = (2^32)/2-1;//16
        long d = (2^64)/2-1;//32
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        c = a + c;
//        System.out.println(c);

        float f = 4.954f;
        double db = 56.328492;

//        System.out.println(f);
//        System.out.println(db);
//        db = f * 2;
//        System.out.println(db);
//        db = c;
//        System.out.println(db);
//        c =(int) f;
//        System.out.println(c);

        boolean boo = false;
        a = -4;
        char ch = 100;
//        ch -= 14;
//        S
        d = (char) ch;          //      d -ն դարձավ char-ով հայտարարված փոփոխական
//        ch = (long) d;  -->  հնարավոր չի
//        System.out.println(ch);
//        System.out.println(d);
        byte num = 2^6;

//        System.out.println(num);

        int x = 5;
        int y = 7;
        int z = 0;
        z = x; //5
        x = y; //7
        y = z; //5


        //x = 7
        //y  = 5

        x = x - y; //2
        y = x + y; //7
        x = y - x; //5
//        System.out.println(x);/

//        ++x;
//        System.out.println(y);

        x = x^y;
        y = x^y;
        x = x^y;
//        System.out.println(x);
//        System.out.println(y);

        x = 7;
        y = 5;

        int bigNumber = x > y ?  x: + y;
        System.out.println("The bigest number is "+ bigNumber);
        int lowNumber = x < y ? x: y;
        System.out.println("The lowest number is "+ lowNumber);

    }

}
