package org.chapter5;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the string:");
        String string = input.nextLine();
        String invertedStr = new String();
        for(int i=0;i<string.length();i++) {
            invertedStr = invertedStr + string.charAt(string.length()-i-1);
        }
        if(string.equals(invertedStr) == true) {
            System.out.println("This is a Palindrome String!");
        } else {
            System.out.println("This is not a Palindrome String!");
        }
    }
}
