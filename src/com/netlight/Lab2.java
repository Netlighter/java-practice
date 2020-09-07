package com.netlight;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("1.");

        int[] arr = {34, 53, 63, 4190, 93};
        int x;
        int sum = 0;
        int len = arr.length-1;
        for (x = 0;x<len; x++)
            sum+=arr[x];
        while (x<len)
            sum+=arr[x];
        do sum+=arr[x];
        while (x<len);

        System.out.println(sum/3);

        System.out.println("2.");

        System.out.println("args length " + args.length);
        for (x = 0;x<args.length-1; x++)
            System.out.println(args[x]);

        System.out.println("3.");

        System.out.print("1/1");
        for (x = 2;x<11; x++){
            System.out.print(" + 1/"+x);
        }
        System.out.println("");
        System.out.println("4.");

        int[] randarr = new int[10];

        // can relate
        Random R = new Random();
        R.nextInt();

        for (x = 0;x<randarr.length; x++)
            randarr[x] = 0 + (int) (Math.random() * 100);
        for (int y: randarr)
            System.out.print(y+" ");
        System.out.println("");
        Arrays.sort(randarr);

        for (int y: randarr)
            System.out.print(y+" ");

        System.out.println("");
        System.out.println("5.");

        System.out.println(fact(10));

    }
    public static int fact(int n) {
        int result = 1;
        for (int x = 1; x <= n; x++)
            result = result * x;
        return result;
    }
}


