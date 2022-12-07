package org.chapter5;

import java.util.Scanner;

public class IsFound {
    public static void main(String[] args) {
        boolean bFlag = false;
        Scanner inputCh = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        System.out.println("Please input a letter:");
        char ch = inputCh.nextLine().charAt(0);
        System.out.println("Please input a String:");
        String str = inputStr.nextLine();
        for(int i=str.length()-1;i>=0;i--) {
            if(str.charAt(i) == ch) {
                System.out.println(i);
                bFlag = true;
                break;
            }
        }
        if(!bFlag) {
            System.out.println("Not Found!");
        }
    }
}
