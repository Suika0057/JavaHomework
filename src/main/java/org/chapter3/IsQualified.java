package org.chapter3;

import java.util.Scanner;

public class IsQualified {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the score:");
        double score = input.nextDouble();
        if (score>=60&&score<=100) {
            System.out.println("Qualified!!");
        } else if (score>=0&&score<60) {
            System.out.println("Disqualified!!");
        } else {
            System.out.println("Wrong Input!");
        }
    }
}
