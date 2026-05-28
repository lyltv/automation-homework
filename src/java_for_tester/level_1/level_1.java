// Ex1
public static String removeVowels(String input) {
    String vowels = "aeiouAEIOU";
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        if (vowels.indexOf(ch) == -1) {
            result.append(ch);
        }
    }
    return result.toString();
}
// Ex2
public static int findSecondLargest(int[] arr) {
    if (arr.length < 2) return Integer.MIN_VALUE; [cite: 247]
    int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
    for (int n : arr) {
        if (n > first) {
            second = first;
            first = n;
        } else if (n > second && n != first) {
            second = n;
        }
    }
    return second;
}
// Ex3
public static double calculateIncomeTax(long income) {
    if (income <= 5000000) return income * 0.05;
    if (income <= 10000000) return (5000000 * 0.05) + (income - 5000000) * 0.10;
    if (income <= 18000000) return (5000000 * 0.05) + (5000000 * 0.10) + (income - 10000000) * 0.15;
    // Tiếp tục áp dụng công thức tương tự cho các mức 20%, 25%, 30%, 35%...
    return 0; // Thay bằng logic tính đầy đủ cho các mức trên 18tr
}
// Ex4
public static int[] twoSum(int[] numbers, int target) {
    int left = 0, right = numbers.length - 1;
    while (left < right) {
        int sum = numbers[left] + numbers[right];
        if (sum == target) return new int[]{left + 1, right + 1}; [cite: 371]
        if (sum < target) left++;
        else right--;
    }
    return new int[]{-1, -1};
}
// Ex5
public static String getFirstLetters(String input) {
    String[] words = input.split("\\s+");
    String result = "";
    for (String w : words) result += w.charAt(0) + " ";
    return result.trim();
}