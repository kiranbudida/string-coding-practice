package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String input = "javaj";

        HashMap<Character, Integer> freqmap = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            freqmap.put(c, freqmap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqmap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
