package org.example;

import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String input = "java";
        String noDuplicates = input.chars().mapToObj(c->(char)c)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(noDuplicates);
    }
}
