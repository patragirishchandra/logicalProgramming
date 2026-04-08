package com.thecodedcompass.stream.evenodd;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupSumOfEvenNumbersFromList {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6};
        Map<String, Integer> gropedEvenOddSum = Arrays.stream(intArray)
                .boxed()
                .collect(
                        Collectors.groupingBy(element -> element % 2 == 0 ? "Sum of Even numbers" : "Sum of Odd numbers"
                                , Collectors.summingInt(Integer::intValue)
                        ));
        System.out.println(gropedEvenOddSum);
       /*Map<String, List<Integer>> evenOddFromSum =  gropedEvenOddSum.values()
                .stream()
                .collect(Collectors.groupingBy(sumelement -> sumelement % 2 == 0 ? "Even" : "Odd"));
        System.out.println(evenOddFromSum);*/
    }
}
