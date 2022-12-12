package hw2;

/*You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally
(horizontal or vertical.) You may assume all four edges of the grid are surrounded by water. The area of an island is
the number of cells with a value 1 on the island. Return the maximum area of an island in grid. If there is no island,
return 0.*/

public class Task1 {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, getCountAreaOfIsland(i, j, grid));
                }
            }
        }
        return max;
    }

    public int getCountAreaOfIsland(int row, int column, int[][] grid) {
        if (row < 0 || row >= grid.length || column < 0 || column >= grid[0].length) {
            return 0;
        }
        if (grid[row][column] == 1) {
            grid[row][column] = 0;
            return 1
                    + (getCountAreaOfIsland(row + 1, column, grid)
                    + getCountAreaOfIsland(row - 1, column, grid)
                    + getCountAreaOfIsland(row, column - 1, grid)
                    + getCountAreaOfIsland(row, column + 1, grid));
        }
        return 0;
    }
}