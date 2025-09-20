package org.example;

import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueCharsCheck {
    public static void main(String[] args) {
        String input = "javc";
        boolean status = input.chars().mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .allMatch(e->e.getValue() == 1);

        System.out.println(status);
    }
}
