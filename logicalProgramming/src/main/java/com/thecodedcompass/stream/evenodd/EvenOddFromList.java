package com.thecodedcompass.stream.evenodd;

import java.util.Arrays;
import java.util.List;

public class EvenOddFromList {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6};
        List<Integer> evenNumbers = Arrays.stream(intArray).filter(element -> element % 2 == 0).boxed().toList();
        System.out.println("evenNumbers are:"+ evenNumbers);
        List<Integer> oddNumbers = Arrays.stream(intArray).filter( elements -> elements % 2 !=0).boxed().toList();
        System.out.println("evenNumbers are:"+ oddNumbers);
    }
}
