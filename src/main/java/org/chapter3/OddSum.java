package org.chapter3;

public class OddSum {
    public static void main(String[] args) {
        int iNum = 0;
        int sum = 0;
        while (iNum < 100) {
            if(iNum%2!=0) {
                sum += iNum;
            }
            iNum++;
        }
        System.out.println(sum);
    }
}
