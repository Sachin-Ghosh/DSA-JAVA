import java.util.Arrays;


public class SpiralMatrixGenerator {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Matrix for n = " + n + ":");
        int[][] result1 = generateMatrix(n);
        for (int[] row : result1) {
            System.out.println(Arrays.toString(row));
        }
        }
        public static int[][] generateMatrix(int n) {
            int[][] matrix = new int[n][n];
            int value = 1;
            int top = 0, bottom = n - 1, left = 0, right = n - 1;
    
            while (top <= bottom && left <= right) {
                for (int i = left; i <= right; i++) {
                    matrix[top][i] = value++;
                }
                top++;
    
                for (int i = top; i <= bottom; i++) {
                    matrix[i][right] = value++;
                }
                right--;
    
                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        matrix[bottom][i] = value++;
                    }
                    bottom--;
                }
    
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        matrix[i][left] = value++;
                    }
                    left++;
                }
            }
    
            return matrix;
        }
}
