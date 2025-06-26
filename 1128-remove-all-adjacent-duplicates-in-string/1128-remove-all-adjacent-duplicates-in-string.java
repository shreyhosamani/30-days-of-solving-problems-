class Solution {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = stack.length();
            if (len > 0 && stack.charAt(len - 1) == c) {
                stack.deleteCharAt(len - 1); // Remove previous character if same
            } else {
                stack.append(c); // Add current character
            }
        }

        return stack.toString();
    }
}
