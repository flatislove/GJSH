import hw5.Task1;
import hw5.Task2;

public class Main {
    public static void main(String[] args) {
        String[] words1 = new String[]{"leetcode", "is", "amazing", "as", "is"};
        String[] words2 = new String[]{"amazing", "leetcode", "is"};
        Task1 task1 = new Task1();
        System.out.println("Task1");
        System.out.println(task1.countWords(words1, words2));
        System.out.println(task1.countWordsVersion(words1, words2));

        String[] strings = new String[]{"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        Task2 task2 = new Task2();
        System.out.println("\nTask2");
        System.out.println(task2.findDuplicate(strings));
    }
}