import hw4.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String test = "/a/./b/../../c/";
        Task1 task1 = new Task1();
        System.out.println("Task1");
        System.out.println(task1.simplifyPath(test));

        int[][] grid = new int[][]{
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        Task2 task2 = new Task2();
        System.out.println("\nTask2");
        System.out.println(task2.maxAreaOfIsland(grid));

        TreeNode nodeL3 = new TreeNode(3, null, null);
        TreeNode nodeR3 = new TreeNode(3, null, null);
        TreeNode nodeR2 = new TreeNode(2, null, nodeR3);
        TreeNode nodeL2 = new TreeNode(2, null, nodeL3);
        TreeNode nodeRoot = new TreeNode(1, nodeL2, nodeR2);
        Task3 task3 = new Task3();
        System.out.println("\nTask3");
        System.out.println(task3.isSymmetric(nodeRoot));

        int[][] arr2 = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        Task4 task4 = new hw4.Task4();
        System.out.println("\nTask4");
        int[][] newArr = task4.updateMatrix(arr2);
        for (int[] line : newArr) {
            System.out.println(Arrays.toString(line));
        }
    }
}