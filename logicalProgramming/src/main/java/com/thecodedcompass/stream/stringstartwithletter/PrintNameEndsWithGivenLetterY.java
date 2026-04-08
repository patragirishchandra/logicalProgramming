package com.thecodedcompass.stream.stringstartwithletter;

import java.util.Arrays;
import java.util.List;

public class PrintNameEndsWithGivenLetterY {
    public static void main(String[] args) {
        String[] names = {"John", "Jenny", "Jenn", "Smith", "Michel", "Functional Programming"};
       List<String> nameStartWithLetterS = Arrays.stream(names)
               .filter(name -> name.endsWith("y"))
               .toList();
        System.out.println("Name ends with letter 'y' are :: " + nameStartWithLetterS);
    }
}
