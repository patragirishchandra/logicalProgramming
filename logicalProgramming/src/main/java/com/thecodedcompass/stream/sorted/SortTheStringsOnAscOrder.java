package com.thecodedcompass.stream.sorted;

import java.util.Arrays;
import java.util.List;

public class SortTheStringsOnAscOrder {
    public static void main(String[] args) {
        String[] employees = {"John","Jenny","Jenn","Smith","Michel","Functional Programming"};
        List<String> sortedAscEmployeesName = Arrays.stream(employees).sorted().toList();
        System.out.println("Employees name on ASC order:: " + sortedAscEmployeesName);
    }
}
