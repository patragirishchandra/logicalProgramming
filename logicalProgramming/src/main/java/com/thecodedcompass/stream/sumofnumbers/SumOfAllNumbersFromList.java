package com.thecodedcompass.stream.sumofnumbers;

import java.util.Arrays;

public class SumOfAllNumbersFromList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sumOfNumbers = Arrays.stream(arr).sum();
        System.out.println("Sum of Numbers:: "+sumOfNumbers);
    }
}
