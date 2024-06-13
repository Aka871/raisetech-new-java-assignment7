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

    //2.要素数が10個の文字列のリストを作成
    //文字数が2以上のものを抽出し、文字列に変換。区切り文字はカンマ(,)で行い、出力する
    List<String> teacherList = List.of("城", "鈴木", "七五三掛", "田中", "田母神", "小鳥遊", "山口",
        "伊藤", "田口", "甲");
    System.out.println(teacherList.stream()
        .filter(v -> v.length() >= 2)
        .collect(Collectors.joining(",")));

    //3.要素数が10個の数値のリストを作成
    //奇数のものだけを抽出し、平均値を出力する
    List<Integer> scoreList = List.of(85, 90, 95, 100, 60, 75, 71, 96, 89, 73);
    System.out.println(scoreList.stream()
        .filter(n -> n % 2 != 0)
        .mapToInt(Integer::intValue)
        .average());
  }
}

