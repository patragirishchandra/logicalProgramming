package com.thecodedcompass.stream.evenodd;

import java.util.Arrays;

public class SumOfEvenNumbersFromList {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6};
        int sumOfEvenNumbers = Arrays.stream(intArray).filter(element -> element % 2 == 0).sum();
        System.out.println("Sum of even Numbers:" + sumOfEvenNumbers);
    }
}
