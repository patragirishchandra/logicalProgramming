package com.thecodedcompass.stream.stringstartwithletter;

import java.util.Arrays;
import java.util.List;

public class PrintNameStartWithGivenLetterJ {
    public static void main(String[] args) {
        String[] names = {"John", "Jenny", "Jenn", "Smith", "Michel", "Functional Programming"};
       List<String> nameStartWithLetterS = Arrays.stream(names)
               .filter(name -> name.startsWith("J"))
               .toList();
        System.out.println("Name start with letter 'J' are :: " + nameStartWithLetterS);
    }
}
