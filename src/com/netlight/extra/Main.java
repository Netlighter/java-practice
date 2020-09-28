package com.netlight.extra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = new Scanner(System.in).nextInt();
        int a = 0;

        for (int i = sum / 5; i >= 0; i--) {
            for (int j = (sum - i * 5) / 3; j >= 0; j--) {
                for (int k = sum - j * 3 - i * 5; k >= 0; k--) {
                    if (i * 5 + j * 3 + k == sum)
                        a++;
                }
            }
        }

        System.out.print(a);
    }

}