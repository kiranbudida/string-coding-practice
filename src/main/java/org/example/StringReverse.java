package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StringReverse {
    public static void main(String[] args) {

        /*
        Input: "hello" → Output: "olleh"

        Solve with both String and StringBuilder.
         */

        String str = "hello";

        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reverse of string: "+str+" is: "+sb.reverse());
    }
}