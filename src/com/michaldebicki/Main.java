package com.michaldebicki;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	String challange1 = "I want a bike";
	String challange2 = "I want a ball";
	String pattern = "I want a b.*";
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(challange1);
        System.out.println(matcher.matches());

        matcher.reset();

        matcher = pattern1.matcher(challange2);
        System.out.println(matcher.matches());




//        System.out.println(challange1.matches(pattern));
//        System.out.println(challange2.matches(pattern));


        //challange 4

        String challange4 = "Replace all blanks with underscores.";
        System.out.println(challange4.replaceAll("\\s","_"));

        String challange5 = "aaaaaabbcccccccddd";
        System.out.println(challange5.matches("[abcdefg]+"));




//        System.out.println(matcher.matches());
//
//        System.out.println();
    }
}
