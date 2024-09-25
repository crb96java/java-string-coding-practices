package com.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateWordsFromString {
    public static void main(String[] args) {
        //Created String Value
        String str = "Hello World and Hero and Hello India";

        //Created Set Object
        Set<String> setValues = new HashSet<>();

        //Convert that String words into List of String
        List<String> listOfStrings = Arrays.stream(str.split(" "))
                .collect(Collectors.toList());

        //Logic for to remove the duplicate words from the List of Strings
        String response = listOfStrings.stream().filter(setValues::add).collect(Collectors.joining(" "));
        System.out.println(response);
    }
}
