package com.string;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharsAndCounts {
    public static void main(String[] args) {

        String myName = "ramesh babu cheppali";

        //logs for find the duplicate characters and counts also.
        Arrays.stream(myName.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e ->e.getValue() > 1)
                .forEach(System.out::println);
    }
}
