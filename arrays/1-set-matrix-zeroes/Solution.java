import java.util.Arrays;

/**
 * SetMatrixZeroes
 *
 * Problem restated in my own words:
 * Given an m x n integer matrix, if any cell contains a 0, then the whole
 * row and the whole column that this cell belongs to must be overwritten
 * with 0s. The transformation has to happen "in place", using the matrix
 * itself as much as possible instead of allocating separate row/column
 * marker arrays.
 *
 * Approach:
 * The key trick is to reuse the first row and first column of the matrix
 * itself as marker arrays instead of allocating extra O(m+n) space.
 *
 *  1. First, scan the matrix and determine whether the first row and the
 *     first column originally contain any zero. Store these two booleans
 *     separately (col0 and row0) because we are about to overwrite the
 *     first row/column with marker information.
 *  2. For every other cell (i, j) with i>=1 and j>=1, if matrix[i][j]==0,
 *     mark matrix[i][0]=0 and matrix[0][j]=0. This records "row i must be
 *     zeroed" and "column j must be zeroed" using the borders as flags.
 *  3. Traverse the matrix again (excluding first row/column) and for each
 *     cell (i, j), if matrix[i][0]==0 OR matrix[0][j]==0, set matrix[i][j]=0.
 *     This applies the recorded marks to the interior of the matrix.
 *  4. Finally, use the previously saved row0/col0 booleans to decide
 *     whether to zero out the first row and first column themselves.
 *
 * Time complexity : O(m * n) — the matrix is scanned a constant number of
 *                    times (three passes).
 * Space complexity: O(1) extra space — only a couple of boolean flags are
 *                    used; the matrix itself is reused for marking.
 *
 * @see <a href="https://takeuforward.org/data-structure/set-matrix-zeroes/">Set Matrix Zeroes - takeUforward</a>
 */
public class SetMatrixZeroes {

    /**
     * Sets entire rows and columns to zero in place wherever a zero is
     * found in the original matrix.
     *
     * @param matrix the input matrix, modified in place
     */
    public static void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        // Check if first row has any zero
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowHasZero = true;
                break;
            }
        }

        // Check if first column has any zero
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColHasZero = true;
                break;
            }
        }

        // Use first row and first column as marker arrays for the rest of the matrix
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Use markers to set zeroes for the interior of the matrix
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Finally, handle the first row and first column themselves
        if (firstRowHasZero) {
            Arrays.fill(matrix[0], 0);
        }

        if (firstColHasZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    /**
     * Utility method to print a matrix for demonstration purposes.
     *
     * @param matrix the matrix to print
     */
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    /**
     * Demonstrates the SetMatrixZeroes solution with a small hard-coded
     * example.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        System.out.println("Original matrix:");
        printMatrix(matrix);

        setZeroes(matrix);

        System.out.println("Matrix after setting zeroes:");
        printMatrix(matrix);

        // A second example with multiple zeroes
        int[][] matrix2 = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };

        System.out.println("\nOriginal matrix2:");
        printMatrix(matrix2);

        setZeroes(matrix2);

        System.out.println("Matrix2 after setting zeroes:");
        printMatrix(matrix2);
    }
}
