import hw2.Task1;
import hw2.Task2;
import hw2.Task3;
import hw2.TreeNode;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] grid = new int[][]{
               {0,0,1,0,0,0,0,1,0,0,0,0,0},
               {0,0,0,0,0,0,0,1,1,1,0,0,0},
               {0,1,1,0,1,0,0,0,0,0,0,0,0},
               {0,1,0,0,1,1,0,0,1,0,1,0,0},
               {0,1,0,0,1,1,0,0,1,1,1,0,0},
               {0,0,0,0,0,0,0,0,0,0,1,0,0},
               {0,0,0,0,0,0,0,1,1,1,0,0,0},
               {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        Task1 task1 = new Task1();
        System.out.println(task1.maxAreaOfIsland(grid));

        int[][] image = new int[][]{
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };
        Task2 task2 = new Task2();
        int [][] newImage=task2.floodFill(image,1,1,2);
        Arrays.stream(newImage).forEach(row-> System.out.println(Arrays.toString(row)));

        TreeNode nodeL3=new TreeNode(3,null,null);
        TreeNode nodeL4=new TreeNode(4,null,null);
        TreeNode nodeR4=new TreeNode(4,null,null);
        TreeNode nodeR3=new TreeNode(3,null,null);
        TreeNode nodeR2=new TreeNode(2,nodeR4,nodeR3);
        TreeNode nodeL2=new TreeNode(2,nodeL3,nodeL4);
        TreeNode nodeRoot = new TreeNode(1,nodeL2,nodeR2);
        Task3 task3 = new Task3();
        System.out.println(task3.isSymmetric(nodeRoot));
    }
}