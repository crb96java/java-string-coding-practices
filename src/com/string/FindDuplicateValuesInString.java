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

        /*
         * Write the below code for to find the duplicate words from the String
         * **/
        // Print the duplicate words from the String
        String name = "hello world and will and jump here hello world";
        Set<String> values = new HashSet<>();

        //convert that String words into List of Strings
        List<String> listOfWords = Arrays.stream(name.split(" "))
                .collect(Collectors.toList());

        //Logs for find the duplicate values from the List of Strings
        String response = listOfWords.stream().filter(l -> !values.add(l)).collect(Collectors.joining(" "));
        System.out.println(response);


    }
}
