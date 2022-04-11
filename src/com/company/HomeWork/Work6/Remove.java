package com.company.HomeWork.Work6;

public class Remove {
    static int [] remove(int a[], int e){
        int arr[] = new int [a.length-1];
        for (int i = 0; i< arr.length; i++){
            if (i == arr.length)
                break;
            else if (i >= e)
                arr[i] = a[i + 1];
            else
                arr[i] = a[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int array[] = {5, 8, 12, 30, 2, 10 };
        array = remove(array, 3);

        for (int i = 0; i< array.length; i++){
            System.out.println(array[i]);
            //
        }
    }
}
