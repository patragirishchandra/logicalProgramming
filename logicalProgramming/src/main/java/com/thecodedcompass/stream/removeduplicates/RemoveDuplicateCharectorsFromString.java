package com.thecodedcompass.stream.removeduplicates;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateCharectorsFromString {
    public static void main(String[] args) {
        String word = "programming";
        System.out.println("Original string "+ word);
        //extract unique charterers
       List<Character> distChar = word.chars()
               .mapToObj(c -> (char)c)
                       .distinct().toList();
        System.out.println("After removing the duplicates char:: "+ distChar);

        String dist = word.chars()
                .mapToObj(c -> String.valueOf((char)c))
                .distinct().collect(Collectors.joining());
        System.out.println("After removing the duplicates char:: "+ dist);
    }
}
