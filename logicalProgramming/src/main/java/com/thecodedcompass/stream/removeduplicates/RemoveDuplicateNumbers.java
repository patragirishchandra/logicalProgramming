package com.thecodedcompass.stream.removeduplicates;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        List<Integer> result=Arrays.stream(arr).boxed().distinct().toList();
        System.out.println("After removing the duplicates number:: "+ result);
    }
}
