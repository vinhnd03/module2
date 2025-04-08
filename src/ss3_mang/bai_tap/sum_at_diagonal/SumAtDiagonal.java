package ss3_mang.bai_tap.sum_at_diagonal;

public class SumAtDiagonal {
    public static void main(String[] args) {
        int sum = 0;
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || j == (matrix[i].length - i - 1)) {
                    sum += matrix[i][j];
                }
            }
        }
        System.err.println(sum);
    }
}
