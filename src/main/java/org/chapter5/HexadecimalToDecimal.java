package org.chapter5;

import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a hexadecimal digit:");
        String hexadecimal = input.nextLine();
        char ch;
        int place = hexadecimal.length();
        int decimalNum = 0;
        for(int i=0;i<hexadecimal.length();i++) {
            ch = hexadecimal.charAt(i);
            if(ch<'a') {
                decimalNum += (int) (Integer.parseInt(""+ch) * Math.pow(16,place-1));
                place--;
            } else if (ch<='f') {
                decimalNum += (10 + (ch-'a')) * Math.pow(16,place-1);
                place--;
            }
        }
        System.out.println(decimalNum);
    }
}
