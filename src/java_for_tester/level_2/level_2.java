
public static boolean isPalindrome(String input) {
    String reversed = new StringBuilder(input).reverse().toString();
    return input.equalsIgnoreCase(reversed);
}

public static String removeDuplicates(String input) {
    String result = "";
    for (int i = 0; i < input.length(); i++) {
        String s = String.valueOf(input.charAt(i));
        if (!result.contains(s)) result += s;
    }
    return result;
}
