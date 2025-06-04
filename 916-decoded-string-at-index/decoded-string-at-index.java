class Solution {
    public String decodeAtIndex(String s, int k) {
        long size = 0;

        // First pass: calculate the size of the expanded string
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                size *= ch - '0';
            } else {
                size += 1;
            }
        }

        // Second pass: go backwards to find the k-th character
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            k %= size;

            if (k == 0 && Character.isLetter(ch)) {
                return String.valueOf(ch);
            }

            if (Character.isDigit(ch)) {
                size /= ch - '0';
            } else {
                size--;
            }
        }

        return ""; 
    }
}