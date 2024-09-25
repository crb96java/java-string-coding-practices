package com.string;

public class StringReverseOrder {
    public static void main(String[] args) {
        //create string variable
        String varName = "hello world";

        //Print the String in reverse order
        String response = new StringBuilder(varName).reverse().toString();

        //print the response
        System.out.println(response);
    }
}
