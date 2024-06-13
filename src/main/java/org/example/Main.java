package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

    //1.動画で紹介されたものを一通り実装
    List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    numberList.stream().mapToInt(number -> number).filter(number -> number <= 5)
        .forEach(System.out::println);

    numberList.stream()
        .filter(number -> number <= 5)
        .forEach(System.out::println);

    numberList.stream()
        .limit(3)
        .forEach(System.out::println);

    List<String> studentList = List.of("tanaka", "inoue", "suzuki", "tanaka");
    studentList.stream()
        .map(String::toUpperCase)
        .forEach(System.out::println);

    studentList.stream()
        .sorted()
        .forEach(System.out::println);

    studentList.stream()
        .distinct()
        .forEach(System.out::println);

    studentList.stream()
        .map(String::toUpperCase)
        .sorted()
        .distinct()
        .forEach(System.out::println);

    System.out.println(studentList.stream()
        .map(String::toUpperCase)
        .sorted()
        .distinct()
        .collect(Collectors.joining(",")));

  }
}

