package org.example;

public class StringPalindrome {
    public static void main(String[] args) {
        /*
        Input: "madam", "racecar" → true

        Input: "hello" → false
         */
        String input1 = "madam";
        String input2 = "racecar";
        String input3 = "hello";

        System.out.println(input1 + " is a palindrome: "+isPalindrome(input1));
        System.out.println(input2 + " is a palindrome: "+isPalindrome(input2));
        System.out.println(input3 + " is a palindrome: "+isPalindrome(input3));
    }

    private static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();
        return str.equals(reversedStr);
    }
}
