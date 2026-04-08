package com.thecodedcompass.stream.containsword;

import java.util.Arrays;
import java.util.List;

public class FindStringsMatchesByGivenWordReturnBoolean {
    public static void main(String[] args) {
        String[] names = {"John","Jenny","Functional Interface","Jenn","Smith","Michel","Functional Programming"};
        boolean isContains = Arrays.stream(names).anyMatch(name -> name.contains("Function"));
        System.out.println("Any Matched word:: " + isContains);
    }
}
