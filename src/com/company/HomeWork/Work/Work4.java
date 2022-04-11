package com.company.HomeWork.Work;

public class Work4 {
    public static void main(String[] args) {
        int i = 0,j = 0;
        int k=0;
        int matrix[][] = {
                {115,15,24,230,54},
                {845,512,32,75},
                {8,45,23,10,45}
        };
        k= matrix[0][0];
        for(i=0;i< matrix.length;i++){
            for(j=0;j<matrix[i].length;j++){
                if(matrix[i][j] < k) k = matrix[i][j];
            }
        }
        System.out.println(k+ " is the smallest element in matrix");
        System.out.println("   --------------------------- ");

        for(i=0;i< matrix.length;i++){
            for(j=0;j<matrix[i].length;j++){
                if(matrix[i][j] > k) k = matrix[i][j];
            }
        }
        System.out.println(k + " is the biggest element in matrix");

        int array[] = {10,45,250,32,5,4,203,95,2};
        k= array[0];
        int z = array[0];
        int sum = 0;
        for(int h=0; h<array.length;h++){
            if(array[h] > k) k = array[h];
            if(array[h] < z) z = array[h];
            sum += array[h];
        }
        System.out.println("   --------------------------- ");
        System.out.println(k + " is the biggest element in array");
        System.out.println("   --------------------------- ");
        System.out.println(z + " is the smallest element in array");
        System.out.println("   --------------------------- ");
        System.out.println(sum + " is the addition of array's element's");
        System.out.println("   --------------------------- ");
        System.out.println();
        System.out.println("Sorted array's element's:");
        System.out.println();

        z = array[0];
        int var;
        for (int c = 0;c<array.length;c++ ){
            for(int f=0; f<array.length;f++){
                if(array[f] < z) {
                    z = array[f];
                    var = array[c];
                    array[c] = z;
                    array[f] = var;
                }
            }
            z = array[array.length-1];
        }
        for(int x = 0;x< array.length;x++){
            System.out.println(array[x]+" : array["+x+"]");
        }
        System.out.println("   __ __ __ __ __ __ ");

        k= array[0];
        for (int c = 0;c<array.length;c++ ){
            for(int f=0; f<array.length;f++){
                if(array[f] > k) {
                    k = array[f];
                    var = array[c];
                    array[c] = k;
                    array[f] = var;
                }
            }
            k = array[array.length-1];
        }
        for(int x = 0;x< array.length;x++){
            System.out.println(array[x]+" : array["+x+"]");
        }
        int avrege = sum/array.length;
        System.out.println("   --------------------------- ");
        System.out.println(avrege+" is the avrege of array's element's:");
        System.out.println("   --------------------------- ");

        int num = 250;
        for(int g=0; g<array.length;g++){
            if(array[g] == num) {
                System.out.println("This array contain's a number " + num);
                break;
            }
            else if(g == array.length-1){
                System.out.println("This array do not contain's a number " + num);
            }
        }



    }
}
