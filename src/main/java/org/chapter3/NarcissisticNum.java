package org.chapter3;

public class NarcissisticNum {
    public static void main(String[] args) {
        int iNum = 100;
        int onePlace;
        int tenPlace;
        int hundredPlace;
        System.out.println("Narcissistic Number:");
        while (iNum < 1000) {
            hundredPlace = iNum/100;
            tenPlace = iNum%100/10;
            onePlace = iNum%100%10;
            if(hundredPlace*hundredPlace*hundredPlace+tenPlace*tenPlace*tenPlace+onePlace*onePlace*onePlace == iNum) {
                System.out.println(iNum);
            }
            iNum++;
        }
    }
}
