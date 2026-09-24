import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> lastIndex = new HashMap<>();
        int maxLen = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (lastIndex.containsKey(c) && lastIndex.get(c) >= left) {
                left = lastIndex.get(c) + 1;
            }
            lastIndex.put(c, right);
            int windowLen = right - left + 1;
            if (windowLen > maxLen) {
                maxLen = windowLen;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solver = new LongestSubstringWithoutRepeatingCharacters();
        String[] testCases = {"abcabcbb", "bbbbb", "pwwkew", "", " ", "au", "dvdf"};
        for (String test : testCases) {
            int result = solver.lengthOfLongestSubstring(test);
            System.out.println("Input: \"" + test + "\" -> Longest substring length: " + result);
        }
    }
}
