package org.chapter4;

import java.util.Random;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        int length = 10;
        int temp;
        Random random = new Random(1000);
        int[] arr = new int[length];
        for (int i=0;i<length;i++) {
            arr[i] = random.nextInt(89) + 10;
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<length-1;i++) {
            for (int j=0;j<length-1-i;j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        for (int i=0;i<length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Please input a number:");
        Scanner input = new Scanner(System.in);
        int iNum = input.nextInt();
        int[] tempArr = new int[length+1];
        for (int i=0;i<length;i++) {
            tempArr[i] = arr[i];
        }
        tempArr[length] = iNum;
        for (int i=0;i<length;i++) {
            for (int j=0;j<length-i;j++) {
                if(tempArr[j] > tempArr[j+1]) {
                    temp = tempArr[j+1];
                    tempArr[j+1] = tempArr[j];
                    tempArr[j] = temp;
                }
            }
        }
        for (int i=0;i<length+1;i++) {
            System.out.print(tempArr[i]+" ");
        }
    }
}
