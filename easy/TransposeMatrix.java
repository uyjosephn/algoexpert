package easy;

public class TransposeMatrix {

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        TransposeMatrix transposeMatrix = new TransposeMatrix();
        transposeMatrix.transposeMatrix(matrix);
    }

    public int[][] transposeMatrix(int[][] matrix) {
        int maxRows = matrix[0].length;
        int maxColumns = matrix.length;

        int[][] result = new int[maxRows][maxColumns];

        for (int r = 0; r < maxRows; r++) {
            for (int c = 0; c < maxColumns; c++) {
                result[r][c] = matrix[c][r];
            }
        }

        return result;
    }

}
