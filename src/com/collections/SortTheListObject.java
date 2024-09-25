package com.collections;

import java.util.Arrays;
import java.util.List;

public class SortTheListObject {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ABC", "DBA", "ZZZ", "CBA", "LMN");

        //logic for print the list of Strings in ascending order
        System.out.println("Print the list of data in ascending order");
        list.stream().sorted().forEach(System.out::println);
        System.out.println();

        System.out.println("Print the list of data in descending order");
        //logic for print the list of Strings in descending order
        list.stream().sorted((l1,l2)->l2.compareTo(l1)).forEach(System.out::println);

    }
}
