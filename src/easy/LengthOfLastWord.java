package easy;

import java.util.Arrays;
import java.util.List;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

//    Given a string s consisting of some words separated by some number of spaces,
//    return the length of the last word in the string.
//    A word is a maximal substring consisting of non-space characters only.

    public static int lengthOfLastWord(String s) {
        List<String> stringList = Arrays.asList(s.trim().split("\\s+"));
        return stringList.get(stringList.size() - 1).length();
    }
}
