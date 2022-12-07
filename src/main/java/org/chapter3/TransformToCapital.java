package org.chapter3;

import java.util.Scanner;

public class TransformToCapital {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a letter:");
        char letter = input.next().charAt(0);
        switch (letter) {
            case 'a': letter = 'A'; break;
            case 'b': letter = 'B'; break;
            case 'c': letter = 'C'; break;
            case 'd': letter = 'D'; break;
            case 'e': letter = 'E'; break;
            default: System.out.println("other");
        }
        System.out.println(letter);
    }
}
