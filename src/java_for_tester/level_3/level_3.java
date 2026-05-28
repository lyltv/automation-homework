public static int[] twoSum(int[] numbers, int target) {
    int left = 0, right = numbers.length - 1;
    while (left < right) {
        int sum = numbers[left] + numbers[right];
        if (sum == target) return new int[]{left + 1, right + 1}; // Index từ 1 
        if (sum < target) left++;
        else right--;
    }
    return new int[]{-1, -1};
}
public static String longestPalindrome(String s) {
    if (s == null || s.length() < 1) return "";
    int start = 0, end = 0;
    for (int i = 0; i < s.length(); i++) {
        int len1 = expand(s, i, i);     // Tâm 1 ký tự
        int len2 = expand(s, i, i + 1); // Tâm 2 ký tự
        int len = Math.max(len1, len2);
        if (len > end - start) {
            start = i - (len - 1) / 2;
            end = i + len / 2;
        }
    }
    return s.substring(start, end + 1);
}

private static int expand(String s, int L, int R) {
    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
        L--; R++;
    }
    return R - L - 1;
}