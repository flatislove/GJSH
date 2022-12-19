package hw4;

import java.util.ArrayDeque;

public class Task4 {
    public int[][] updateMatrix(int[][] mat) {
        ArrayDeque<int[]> deque = new ArrayDeque<>();
        int[][] steps = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    deque.add(new int[]{i, j});
                }
                if (mat[i][j] == 1) {
                    mat[i][j] = Integer.MIN_VALUE;
                }
            }
        }
        while (!deque.isEmpty()) {
            int[] currentCell = deque.poll();
            int currentRow = currentCell[0];
            int currentColumn = currentCell[1];
            for (int[] step : steps) {
                int newRow = currentRow + step[0];
                int newColumn = currentColumn + step[1];
                if (newRow >= 0 && newRow < mat.length && newColumn >= 0 &&
                        newColumn < mat[0].length && mat[newRow][newColumn] == Integer.MIN_VALUE) {
                    mat[newRow][newColumn] = mat[currentRow][currentColumn] + 1;
                    deque.add(new int[]{newRow, newColumn});
                }
            }
        }
        return mat;
    }
}