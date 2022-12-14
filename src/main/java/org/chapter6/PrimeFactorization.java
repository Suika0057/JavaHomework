package org.chapter6;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number:");
        int n = input.nextInt();
        if (n <= 2) {
            System.out.println("not a prime");
        } else {
            for (int i = 2; i < n + 1; i++) {
                boolean flag = true;
                for (int j : arrayList) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) arrayList.add(i);
            }
        }
        int n1 = n;
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        while (n1 > 2) {
            for (int i : arrayList) {
                if (n1 % i == 0) {
                    arrayList1.add(i);
                    n1 = n1 / i;
                    break;
                }
            }
        }
        System.out.print(n + "=");
        for (int i = 0; i < arrayList1.size() - 1; i++) {
            System.out.print(arrayList1.get(i) + "*");
        }
        System.out.print(arrayList1.get(arrayList1.size() - 1));
    }
}
