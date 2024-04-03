package logicalPrograms;

import java.util.LinkedHashSet;

//Write a program to remove duplicates from a string
//Ex: input: My name is Khan  ouput: My nae is Kh
public class RemoveDuplicateCharacters {
public static void main(String[] args) {

    String input = "My name is Khan";
    String result = removeDuplicates(input);
    System.out.println("String after removing duplicates: " + result);
}

public static String removeDuplicates(String input) {
    // Using LinkedHashSet to maintain order and remove duplicates
    LinkedHashSet<Character> set = new LinkedHashSet<>();

    // Add characters from input string to the set
    for (char c : input.toCharArray()) {
        set.add(c);
    }

    // Convert the set back to string
    StringBuilder sb = new StringBuilder();
    for (Character c : set) {
        sb.append(c);
    }
    return sb.toString();
}
}

