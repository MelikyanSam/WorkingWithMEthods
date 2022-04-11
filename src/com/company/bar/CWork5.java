package com.company.bar;
class Box{
    int width;
    int depth;
    int height;
}
class Triangle{
    int sideA;
    int sideB;
    int sideC;
    int perimeter(){
        return sideA + sideB + sideC;
    }

}
public class CWork5 {
    public static void main(String[] args) {
        Triangle t = new Triangle();

        Triangle $3 = new Triangle();
        $3.sideA = 10;
        $3.sideB = 10;
        $3.sideC = 7;
        System.out.println($3.perimeter() + " perimeter of '$3' triangle");

        Box myBox = new Box();

        myBox.width = 2;
        myBox.height = 2;
        myBox.depth = 4;


//        System.out.println(myBox.height);
//        System.out.println(myBox.width);
//        System.out.println(myBox.depth);

        Box b1 = new Box();
        Box b2 = b1;
        b1 = null;
//        b2.height = 2;

//        System.out.println(b2.height);
    }
}
