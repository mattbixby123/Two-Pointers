public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // initialize two pointers at start and end of string
        int l = 0, r = s.length() - 1;

        // keep moving pointers inward until they meet
        while (l < r) {
            // skip non-alphanumeric chars from left pointer
            while (l < r && !alphaNum(s.charAt(l))) {
                l++;
            }
            // skip non-alphanumeric chars from right pointer
            while (r > l && !alphaNum(s.charAt(r))) {
                r--;
            }
            // compare chars at both pointers (case-insensitive)
            // if they don't match, not a palindrome
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            // move both pointers inward for next comparison
            l++; r--;
        }
        // if we made it through the whole string, it's a palindrome
        return true;
    }

    // helper function to check if character is letter or number
    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||    // is uppercase letter
                c >= 'a' && c <= 'z' ||    // is lowercase letter
                c >= '0' && c <= '9');     // is number
    }
}

// reference link to practice problem:https://neetcode.io/problems/is-palindrome