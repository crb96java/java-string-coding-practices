package com.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateValuesInString {

    public static void main(String[] args) {

        //Create new String variable
        String myName = "ramesh babu cheppali";

        //Logic for to print duplicate values from String
        Arrays.stream(myName.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(l -> l.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::print);

        System.out.println();
        System.out.println("=================");

        // Print the duplicate words from the String

        String name = "hello world and will and jump here hello world";

        List<String> findListOfStrings = getListOfStrings(name);
        String response = printDuplicateWordsFromString(findListOfStrings);
        System.out.println(response);

/*
        Set<String> v1 = new HashSet<>();
        List<String> listOfStrings = getListOfStrings(name);
        listOfStrings.stream().filter(l -> !v1.add(l)).forEach(System.out::println);
*/

    }

    private static List<String> getListOfStrings(String name) {
        return Arrays.stream(name.split(" ")).collect(Collectors.toList());
    }

    private static String printDuplicateWordsFromString(List<String> list) {
        Set<String> values = new HashSet<>();
        return list.stream().filter(l -> !values.add(l)).collect(Collectors.joining(" "));
    }

}
