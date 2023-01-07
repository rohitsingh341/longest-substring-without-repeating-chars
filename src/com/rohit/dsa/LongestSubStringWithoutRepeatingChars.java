package com.rohit.dsa;

import java.util.ArrayList;
import java.util.List;

public class LongestSubStringWithoutRepeatingChars {

    public static void main(String[] args) {
        String s = "abcabbde";

        int max = getLongestSubstringWithoutRepeatingChars(s);
        System.out.println("Longest substring -> " + max);
    }

    public static int getLongestSubstringWithoutRepeatingChars(String s) {
        List<Character> chars = new ArrayList<>();
        int res = 0;
        for (int right = 0; right < s.length(); right++) {
            if (chars.contains(s.charAt(right))) {
                int index = chars.indexOf(s.charAt(right));
                chars.remove(index);

                if (index > 0)
                    chars.subList(0, index).clear();

            }
            chars.add(s.charAt(right));
            res = Math.max(res, chars.size());
        }

        return res;
    }
}
