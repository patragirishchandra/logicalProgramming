package com.thecodedcompass.stream.sorted;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortTheNumbersOnDescOrder {
    public static void main(String[] args) {
        int[] arr = {10,12,1,2,7,4,5,6};
        List<Integer> descNumbers = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).toList();
        System.out.println(descNumbers);
    }
}
