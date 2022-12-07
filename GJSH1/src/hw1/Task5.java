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

    public boolean isPalindromeTwo(String s){
        int left=0,right=s.length()-1;
        for (var i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(left)) && Character.isLetterOrDigit(s.charAt(right))){
                if (Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))) return false;
                else{
                    left++;
                    right--;
                }
            }
            else{
                if (!Character.isLetterOrDigit(s.charAt(left))) left++;
                if (!Character.isLetterOrDigit(s.charAt(right))) right--;
            }
        }
        return true;
    }
}