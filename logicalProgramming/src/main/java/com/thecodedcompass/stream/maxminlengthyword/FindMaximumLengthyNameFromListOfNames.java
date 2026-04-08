package com.thecodedcompass.stream.maxminlengthyword;

import java.util.Arrays;
import java.util.Comparator;

public class FindMaximumLengthyNameFromListOfNames {
    public static void main(String[] args) {
        String[] names = {"John","Jenny","Functional Interface","Jenn","Smith","Michel","Functional Programming"};
        String maxLengthyName = Arrays.stream(names).max(Comparator.comparing(String::length)).get();
        System.out.println("maxLengthyName:: "+ maxLengthyName);
    }
}
