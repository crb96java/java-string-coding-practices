package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class SortListOfEmployObjects {

    public static void main(String[] args) {

        //created the List of Employ Objects
        List<Employ> employList = Arrays.asList(
                new Employ("ram", 25, 'M', "HCL"),
                new Employ("sam", 34, 'M', "CG"),
                new Employ("janu", 12, 'F', "IBM"),
                new Employ("madu", 41, 'M', "HCL"));

        //logic for to sort the Employ data based on age
        employList.stream().sorted(Comparator.comparing(Employ::getAge)).forEach(System.out::println);
    }
}

class Employ {
    private String name;
    private int age;
    private char gender;
    private String companyName;

    public Employ(String name, int age, char gender, String companyName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
