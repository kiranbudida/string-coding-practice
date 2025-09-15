package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveVowels {

    public static final Set<Character> VOWELS =
            new HashSet<>(Arrays.asList('a','e','i','o','u'));

    public static void main(String[] args) {
        /*
            Input: "interview" → "ntrvw"
         */

        String str = "interview";
        String updatedInput = removeVowels(str);
        System.out.println("After removing vowels from the input: '"+str+"' is: '"+ updatedInput+"'");
    }

    private static String removeVowels(String input) {

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(!VOWELS.contains(Character.toLowerCase(c))) {
                output.append(c);
            }
        }

        return output.toString();
    }
}
