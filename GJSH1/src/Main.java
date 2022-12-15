import hw1.*;

import javax.xml.crypto.Data;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        Task1 task1 = new Task1();
        System.out.println(task1.mergeAlternately(word1, word2));

        int[] arr = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int k = 2;
        Task2 task2 = new Task2();
        System.out.println(task2.removeElement(arr, k));

        Task3 task3 = new Task3();
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 3, 5};
        int m = 3, n = 3;
        task3.merge(nums1, m, nums2, n);

        Task4 task4 = new Task4();
        String s = "  hello world  ";
        System.out.println(task4.reverseWords(s));

        Task5 task5 = new Task5();
        String str = "a.b,.";
        System.out.println(task5.isPalindromeTwo(str));
    }
}