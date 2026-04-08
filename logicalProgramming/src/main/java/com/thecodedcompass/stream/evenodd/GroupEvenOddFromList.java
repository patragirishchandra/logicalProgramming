package com.thecodedcompass.stream.evenodd;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEvenOddFromList {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6};
        Map<String, List<Integer>> groupedEvenOdd = Arrays.stream(intArray)
                .boxed()
                .collect(Collectors.groupingBy(element -> element % 2 == 0 ? "Even" : "Odd"));
        System.out.println(groupedEvenOdd);
    }
}
