package hw1;

public class Task1 {
    //You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
    // starting with word1. If a string is longer than the other, append the additional letters onto the end
    // of the merged string.Return the merged string.
    public String mergeAlternately(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        StringBuilder res= new StringBuilder();
        int max=Math.max(chars1.length,chars2.length);
        for (int i = 0; i < max; i++) {
            if (i<chars1.length) res.append(chars1[i]);
            if (i<chars2.length) res.append(chars2[i]);
        }
        return res.toString();
    }
}
