package org.chapter3;

import java.util.Scanner;

public class HowManyDays {
    public static void main(String[] args) {
        Scanner inputMonth = new Scanner(System.in);
        System.out.println("Month:");
        Scanner inputDay = new Scanner(System.in);
        System.out.println("Day:");
        int month = inputMonth.nextInt();
        int day = inputDay.nextInt();
        int days;
        days = (month-1)*30+day;
        switch (month) {
            case 1:
            case 2:
                break;
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = days + (month)/2 - 2;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = days + (month+1)/2 - 2;
                break;
            default: System.out.println("Wrong input");
        }
        System.out.println("This is "+days+" days in 2014.");
    }
}
