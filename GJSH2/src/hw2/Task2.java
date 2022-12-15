package hw2;

/*An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the
pixel image[sr][sc]. To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally
to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those
pixels (also with the same color), and so on. Replace the color of all the aforementioned pixels with color.
Return the modified image after performing the flood fill.*/

public class Task2 {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if (oldColor != color) {
            floodFillAroundCell(image, sr, sc, oldColor, color);
        }
        return image;
    }

    public void floodFillAroundCell(int[][] image, int row, int column, int oldColor, int newColor) {
        if (row < 0 || row >= image.length || column < 0 || column >= image[0].length || image[row][column] == newColor) {
            return;
        }
        if (image[row][column] == oldColor) {
            image[row][column] = newColor;
            floodFillAroundCell(image, row - 1, column, oldColor, newColor);
            floodFillAroundCell(image, row + 1, column, oldColor, newColor);
            floodFillAroundCell(image, row, column - 1, oldColor, newColor);
            floodFillAroundCell(image, row, column + 1, oldColor, newColor);
        }
    }
}