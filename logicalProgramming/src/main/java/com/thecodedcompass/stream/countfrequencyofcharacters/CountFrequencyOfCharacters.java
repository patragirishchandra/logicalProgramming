package com.thecodedcompass.stream.countfrequencyofcharacters;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyOfCharacters {
    public static void main(String[] args) {
        String word = "programming";

        //Traditional for loop
        Map<Character, Integer> frequen = new HashMap<>();

        for (int i =0; i < word.length(); i++) {
            int count = frequen.getOrDefault(word.charAt(i), 0);
            frequen.put(word.charAt(i), count+1);
        }
        System.out.println(frequen);


        //Use of Collectors.groupingBy and Collectors.counting
        Map<Character, Long> frequencyOfCharacters = word.chars()
                                                        .mapToObj(charc -> (char)charc)
                                                        .collect(Collectors.groupingBy(c -> c , Collectors.counting()));
        System.out.println(frequencyOfCharacters);

        //Use of Function.identity()
       Map<Character, Long> frequency =  word.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequency);

        //Use of Collectors.toMap
        Map<Character, Integer> fre = word.chars()
        .mapToObj(c -> (char)c)
        .collect(Collectors.toMap(Function.identity(), c -> 1, (existingValue, newValue) -> existingValue + newValue));
        System.out.println(fre);

    }
}
