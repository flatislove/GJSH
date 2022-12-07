package hw1;

public class Task5 {
    /* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
    non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include
    letters and numbers.*/
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[_\\W]+", "");
        StringBuilder sb = new StringBuilder(s1);
        return s1.equalsIgnoreCase(sb.reverse().toString());
    }
}