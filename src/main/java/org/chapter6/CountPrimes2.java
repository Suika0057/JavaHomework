package org.chapter6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountPrimes2 {
    static boolean flag;
    public static List CountPrimes(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i=2;i<n+1;i++) {
            flag = true;
            for (int j=2;j<(int)Math.sqrt(i)+1;j++) {
                //System.out.print((int)Math.sqrt(i));
                if (i%j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res.add(i);
            }
        }
        //System.out.println();
        return res;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number:");
        int n = input.nextInt();
        if(n<=2) {
            System.out.println("not a prime.");
        } else {
            System.out.println("There are "+CountPrimes(n).size()+" primes:");
            System.out.println(CountPrimes(n));
        }
    }
}
