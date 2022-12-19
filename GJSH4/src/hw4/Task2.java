package hw4;

import java.util.ArrayDeque;

public class Task2 {
    public int maxAreaOfIsland(int[][] grid) {
        int[][] steps = {{0, -1}, {1, 0}, {0, 1}, {-1, 0}};
        int max_area = 0;
        ArrayDeque<int[]> stack = new ArrayDeque<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int tmp_max = 0;
                if (grid[i][j] == 1) {
                    stack.push(new int[]{i, j});
                    grid[i][j] = 0;
                    tmp_max++;
                }
                while (!stack.isEmpty()) {
                    int[] currentCell = stack.pop();
                    int newRow = currentCell[0];
                    int newColumn = currentCell[1];
                    for (int[] step : steps) {
                        if (newRow + step[0] >= 0 && newRow + step[0] < grid.length
                                && newColumn + step[1] >= 0 && newColumn + step[1] < grid[0].length
                                && grid[newRow + step[0]][newColumn + step[1]] == 1) {
                            tmp_max++;
                            grid[newRow + step[0]][newColumn + step[1]] = 0;
                            stack.push(new int[]{newRow + step[0], newColumn + step[1]});
                        }
                    }
                }
                max_area = Math.max(tmp_max, max_area);
            }
        }
        return max_area;
    }
}
