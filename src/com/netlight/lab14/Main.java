package com.netlight.lab14;

import java.util.HashMap;
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
        String textPiece;
        String textCopy;
        String[] src = new String[rlen];
        String[] ptr = new String[rlen];

        // w/o regex
        textPiece = "";
        textCopy = text;

        for (int i = 0; i < rlen; i++) {
            src[i] = rules[i].split(" ")[0];
            ptr[i] = rules[i].split(" ")[1];
        }
        for (int j = 0; j < text.length(); j++) {
            textPiece += text.charAt(j);

            for (int i = 0; i < src.length; i++) {
                if (src[i].contains(textPiece) && textCopy.contains(src[i]))
                    textCopy = textCopy.replaceAll(src[i], " " + ptr[i] + " ");

                else if (textPiece.contains(src[i])) {
                    textCopy = textCopy.replaceAll(src[i], " " + ptr[i] + " ");
                    textPiece = "";
                    break;
                }
            }
        }
        System.out.println(textCopy.replace(" ", ""));

        // w/ regex
        String srcStr = "";

        for (int i = 0; i < rlen; i++) {
            srcStr += rules[i].split(" ")[0];
            if (i != rlen - 1) srcStr += "|";
        }

        HashMap<String, String> replaceMap = new HashMap<>();

        for (String t : rules) replaceMap.put(t.split(" ")[0], t.split(" ")[1]);

        Pattern pattern = Pattern.compile(srcStr);
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.replaceAll(x -> replaceMap.get(x.group())));
    }
}


