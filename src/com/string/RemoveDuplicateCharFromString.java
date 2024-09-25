package com.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharFromString {
    public static void main(String[] args) {
        String myName = "ramesh babu cheppali";

        //Remove the duplicate characters from the String
        Set<Character> setValue = new HashSet<>();
        myName.chars().mapToObj(c -> (char) c).filter(setValue::add).forEach(System.out::print);

    }
}
