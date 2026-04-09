package com.thecodedcompass.stream.findsecondhighestnumber;

import java.util.Arrays;

public class FindSecondHighestNumber {
    public static void main(String[] args) {
        int[] arr = {10, 12, 1, 2, 7, 4, 5, 6};
        int secondHighestNumber = Arrays.stream(arr)
                .distinct()
                .sorted()
                .skip(arr.length-2).findFirst().getAsInt();
        System.out.println(secondHighestNumber);
    }
}
