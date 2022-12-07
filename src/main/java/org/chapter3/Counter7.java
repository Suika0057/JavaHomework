package org.chapter3;

public class Counter7 {
    public static void main(String[] args) {
        int iNum = 1;
        int count = 0;
        int sum = 0;
        while (iNum < 100) {
            if(iNum%7==0) {
                count++;
                sum += iNum;
            }
            iNum++;
        }
        System.out.println("count:"+count+", sum:"+sum);
    }
}
