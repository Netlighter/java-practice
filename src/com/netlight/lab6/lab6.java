package com.netlight.lab6;

import java.util.Random;
import java.util.Scanner;

public class lab6 {
    static int win = 0;
    static void justPrint(int[][] p) {
        for (int[] x: p) {
            for (int y: x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void path(int[][] sum, int[][] orig, int x, int y) {

        if (x==0 && y==0) {
            System.out.println("Sum is "+win);
            System.out.println();
            System.out.println("Path is:");
            return;
        }
        if (x==0) {
            win+=orig[x][y-1];
            path(sum, orig, x, y-1);
            System.out.println(x+" "+ y);
        }
        else if (y==0) {
            win+=orig[x-1][y];
            path(sum, orig, x-1, y);
            System.out.println(x+" "+ y);
        }

        else if (sum[x-1][y]>sum[x][y-1]) {
            win+=orig[x-1][y];
            path(sum, orig, x-1, y);
            System.out.println(x+" "+ y);
        }
        else if (sum[x-1][y]<sum[x][y-1]) {
            win+=orig[x][y-1];
            path(sum, orig, x, y-1);
            System.out.println(x+" "+ y);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size: ");
        int size = sc.nextInt();

        int[][] original = new int[size][size];
        int[][] summed = new int[size][size];

        Random r = new Random();
        System.out.println("Generating "+size*size+" values...\n");
        for (int i=0; i<original.length; i++) {
            for (int j=0; j<original[i].length; j++) {
                original[i][j] = (int) (Math.random() * ((100 - (-100)) + 1) + (-100));
            }
        }
        System.out.println("Array is:");
        justPrint(original);

        int opa = summed.length;

        for (int x=0; x<opa; x++){
            for (int y=0; y<opa; y++){
                if (x==0 && y==0) summed[x][y] = original[x][y];
                else if (x==0) summed[x][y] = original[x][y-1]+ original[x][y];
                else if (y==0) summed[x][y] = original[x-1][y] + original[x][y];
                else summed[x][y] = Math.max(original[x-1][y], original[x][y-1]) + original[x][y];
            }
        }
        win = original[opa-1][opa-1];

        System.out.println("Summed array:");
        justPrint(summed);
        path(summed, original, opa-1, opa-1);


    }

}
