package com.netlight.lab14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] rules = new String[Integer.parseInt(s.nextLine())];
        int rlen = rules.length;

        for (int i = 0; i < rlen; i++) {
            rules[i] = s.nextLine();
        }
        String text = s.nextLine();
        String result;
        String[] src = new String[rlen];
        String[] ptr = new String[rlen];

        // w/o regex
        result = text;
        for (int i = 0; i < rlen; i++) {
            src[i] = rules[i].split(" ")[0];
            ptr[i] = rules[i].split(" ")[1];

            if (result.contains(src[i])) result = result.
                    replaceAll(src[i], ptr[i]);
        }
        System.out.println(result);

        // w/ regex
        result = text;
        Pattern pattern = Pattern.compile("(?<src>\\w+) (?<ptr>\\w+)");
        for (int i = 0; i < rlen; i++) {
            Matcher matcher = pattern.matcher(rules[i]);
            if (matcher.find()) result = result.
                    replaceAll(matcher.group("src"),
                            matcher.group("ptr"));
        }
        System.out.println(result);

    }
}

