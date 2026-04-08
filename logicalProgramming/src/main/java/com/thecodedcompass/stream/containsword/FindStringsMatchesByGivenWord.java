package com.thecodedcompass.stream.containsword;

import java.util.Arrays;
import java.util.List;

public class FindStringsMatchesByGivenWord {
    public static void main(String[] args) {
        String[] names = {"John","Jenny","Functional Interface","Jenn","Smith","Michel","Functional Programming"};
        List<String> matchedWords = Arrays.stream(names).filter(name -> name.contains("Function")).toList();
        System.out.println("Matched word:: " + matchedWords);
    }
}
