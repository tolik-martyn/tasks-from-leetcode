package longest_common_prefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            minLength = Math.min(minLength, strs[i].length());
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != currentChar) {
                    return result.toString();
                }
            }
            result.append(currentChar);
        }
        return result.toString();
    }
}
