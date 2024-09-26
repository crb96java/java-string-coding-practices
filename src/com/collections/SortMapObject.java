package com.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapObject {

    public static void main(String[] args) {

        //create mapData object
        Map<String, String> mapData = new HashMap<String, String>();
        mapData.put("abc", "value3");
        mapData.put("xyz", "value1");
        mapData.put("lmn", "value6");
        mapData.put("cdf", "value4");
        mapData.put("opq", "value2");

        /*
        * Logic for Sort the Map Object in Ascending Order
        * */
        //logic for sort the map object based on key in ascending order
        System.out.println("logic for sort the map object based on key in ascending order");
        mapData.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        //logic for sort the map object based on value in ascending order
        System.out.println("logic for sort the map object based on value in ascending order");
        mapData.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

        /*
        * Logic for sort the Map Object in Descending Order
        * */
        System.out.println("logic for sort the map object based on key in descending order");
        mapData.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);

        System.out.println("logic for sort the map object based on value in descending order");
        mapData.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}
