package org.example.Example4;

/*
Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */
public class Main {
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strings));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        for (int i = 0; i < first.length; i++) {
            if (first[i] == last[i]) {
                stringBuilder.append(first[i]);
            } else {
                break;
            }
        }
        return stringBuilder.toString();
    }

}
