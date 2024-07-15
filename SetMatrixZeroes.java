import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        setZeroes(matrix);
        System.out.println("Output for matrix: " + Arrays.deepToString(matrix));
        }
        public static void setZeroes(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
    
            boolean fRZero = false;
            boolean fCZero = false;
    
            for (int j = 0; j < n; j++) {
                if (matrix[0][j] == 0) {
                    fRZero = true;
                    break;
                }
            }
    
            for (int i = 0; i < m; i++) {
                if (matrix[i][0] == 0) {
                    fCZero = true;
                    break;
                }
            }
    
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
    
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
    
            if (fRZero) {
                for (int j = 0; j < n; j++) {
                    matrix[0][j] = 0;
                }
            }
    
            if (fCZero) {
                for (int i = 0; i < m; i++) {
                    matrix[i][0] = 0;
                }
            }
        }
}
