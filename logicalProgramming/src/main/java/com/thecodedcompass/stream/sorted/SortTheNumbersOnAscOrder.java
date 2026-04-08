package com.thecodedcompass.stream.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortTheNumbersOnAscOrder {
    public static void main(String[] args) {
        int[] arr = {10,12,1,2,7,4,5,6};
        List<Integer> sortedAsc = Arrays.stream(arr).boxed().sorted().toList();
        System.out.println("ASC numbers:: " + sortedAsc);
    }
}
