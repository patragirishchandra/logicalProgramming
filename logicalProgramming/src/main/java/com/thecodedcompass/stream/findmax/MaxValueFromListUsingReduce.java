package com.thecodedcompass.stream.findmax;

import java.util.Arrays;

public class MaxValueFromListUsingReduce {
    public static void main(String[] args) {
        //print maxvalue
        int[] arr = {1, 2, 3, 4, 5, 6};
        int maxvalue = Arrays.stream(arr).reduce(Math::max).getAsInt();
        System.out.println("Maximum value :: " + maxvalue);
    }
}
