package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;

public class DuplicateChars {
    public static void main(String[] args) {
        String input = "java";
        List<Character> chars = input.chars().mapToObj( ch-> (char)ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        chars.forEach(System.out::println);
    }
}
