package com.nw.internbu3.hw4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Homework4 {

    public static void convertToUpperCase(List<String> args) {
        System.out.println(args.stream().map(String::toUpperCase).collect(Collectors.toList()));
    }

    public static void convertToLowerCase(List<String> args) {
        System.out.println(args.stream().map(String::toLowerCase).collect(Collectors.toList()));
    }

    public static void PersonListToMap(List<Person> people) {
        Map<String, Person> personMap = people.stream()
                .collect(Collectors.toMap(
                        Person::getName, // Key: name của Person
                        person -> person, // Value: chính đối tượng Person
                        (existing, replacement) -> existing // Nếu trùng key, giữ lại đối tượng đầu tiên
                ));
        personMap.entrySet().forEach(System.out::println);
    }

    public static void findfirstEven(List<Integer> list) {
        Optional<Integer> firstEven = list.stream()
                .filter(n -> n % 2 == 0) // Lọc các số chẵn
                .findFirst(); // Tìm phần tử đầu tiên
        if (firstEven.isPresent()) {
            System.out.println("first even number: " + firstEven.get());
        } else {
            System.out.println("NA");
        }
    }
    public static void main(String[] args) {
        // Bai 1
        List<String> string1 = List.of("hello", "world", "java", "streams");
        convertToUpperCase(string1);
        List<String> string2 = Arrays.asList("HELLO", "WORLD", "JAVA", "STREAMS");
        convertToLowerCase(string2);
        // Bai2
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int evenSum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(evenSum);
        int oldSum = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(oldSum);
        // Bai3
        System.out.println(string1
                .stream()
                .sorted()
                .collect(Collectors.toList()));

        System.out.println(string1
                .stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList()));
//Bai4
        //second smallest
        System.out.println(numbers
                .stream()
                .sorted((s1, s2) -> s2 - s1)
                .skip(numbers.size()-2) // Bo qua n phan tu dau tien
                .findFirst().get()); // lay ptu dau tien
//      second largest
        System.out.println(numbers.stream()
                .sorted((a, b) -> b - a)
                .distinct()
                .skip(1)
                .findFirst().get());
// Bai 5
        System.out.println(string1.stream().collect(Collectors
                .groupingBy(String::length)));
        // Bai 6
        System.out.println(string1.stream().collect(Collectors.joining(",")));
        //Bai 7
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 22),
                new Person("Alice", 28), // Alice bị trùng
                new Person("David", 35)
        );
        PersonListToMap(people);
        // bai8
        findfirstEven(numbers);
    }
}
