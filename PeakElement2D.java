public class PeakElement2D {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 4},
            {3, 2}
        };
        int[] result = findPeakGrid(mat);
        System.out.println("Peak element at: [" + result[0] + "," + result[1] + "]");
    }
    public static int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int left = 0;
        int right = cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int maxRow = findMaxRow(mat, mid);

            boolean leftIsBigger = mid > 0 && mat[maxRow][mid] < mat[maxRow][mid - 1];
            boolean rightIsBigger = mid < cols - 1 && mat[maxRow][mid] < mat[maxRow][mid + 1];

            if (!leftIsBigger && !rightIsBigger) {
                return new int[]{maxRow, mid};
            } else if (leftIsBigger) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return new int[]{-1, -1}; 
    }

    private static int findMaxRow(int[][] mat, int col) {
        int maxRow = 0;
        for (int i = 1; i < mat.length; i++) {
            if (mat[i][col] > mat[maxRow][col]) {
                maxRow = i;
            }
        }
        return maxRow;
    }
}
