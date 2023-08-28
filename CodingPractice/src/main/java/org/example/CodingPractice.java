package org.example;

public class CodingPractice {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 4, 5, 35, 20, 21};
        printHelloWorld(arr);
        System.out.println(findSecondBiggest(arr));
    }

    static void printHelloWorld(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 7 == 0 && arr[i] % 5 == 0)
                System.out.println("Hello World ");
            else if (arr[i] % 5 == 0)
                System.out.println("Hello ");
            else if (arr[i] % 7 == 0)
                System.out.println("World ");

        }
    }

    static int findSecondBiggest(int [] arr){
        int max = arr[0];
        int secondMax = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > secondMax && arr[i] != max)
                secondMax = arr[i];
        }

        return secondMax;
    }
}