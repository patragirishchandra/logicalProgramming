package com.thecodedcompass.stream.maxminlengthyword;

import java.util.Arrays;
import java.util.Comparator;

public class FindMinLengthyNameFromListOfNames {
    public static void main(String[] args) {
        String[] names = {"John","Jenny","Functional Interface","Jenn","Smith","Michel","Functional Programming"};
      String minLengthyName = Arrays.stream(names).min(Comparator.comparing(String::length)).get();
        System.out.println("minLengthyName:: "+ minLengthyName);
    }
}
