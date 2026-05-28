import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {
        //
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> windowMap = new HashMap<>();
        int left = 0, right = 0;
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            if (tMap.containsKey(c)) {
                windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);
                if (windowMap.get(c).equals(tMap.get(c))) {
                    count++;
                }
            }

            while (count == tMap.size()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }

                char leftChar = s.charAt(left);
                if (tMap.containsKey(leftChar)) {
                    if (windowMap.get(leftChar).equals(tMap.get(leftChar))) {
                        count--;
                    }
                    windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                }
                left++;
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
    }

    public static void main(String[] args) {
        // Test
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println("TEST: " + s + " - " + t);
        System.out.println("Kết quả: " + minWindow(s, t));
    }
}