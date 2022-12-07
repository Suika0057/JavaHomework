package org.chapter4;

public class Matrix {
    public static void main(String[] args) {
        int [][] c = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] d = {{2,2,2},{1,1,1},{3,3,3}};
        int [][] sum = new int[c.length][c[0].length];
        int [][] product = new int[c.length][d[0].length];
        for (int i=0;i<c.length;i++) {
            for (int j=0;j<c[i].length;j++) {
                sum[i][j] = c[i][j] + d[i][j];
                product[i][j] = c[i][0]*d[0][j] + c[i][1]*d[1][j] + c[i][2]*d[2][j];
            }
        }
        System.out.println("sum:");
        for (int i=0;i<sum.length;i++) {
            for (int j=0;j<sum[i].length;j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Product:");
        for (int i=0;i<product.length;i++) {
            for (int j=0;j<product[i].length;j++) {
                System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }
    }
}
