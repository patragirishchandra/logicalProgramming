package com.thecodedcompass.stream.sorted;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTheStringsOnDescOrder {
    public static void main(String[] args) {
        String[] employees = {"John","Jenny","Jenn","Smith","Michel","Functional Programming"};
        List<String> sortedDescEmployeesName = Arrays.stream(employees).sorted(Collections.reverseOrder()).toList();
        System.out.println("Employees name on ASC order:: " + sortedDescEmployeesName);
    }
}
