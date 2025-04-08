package ss3_mang.bai_tap.sum_at_column;

import java.util.Scanner;

public class SumAtColumn {
    public static void main(String[] args) {
        double[][] matrix = {{1.4, 2.3, 5.2}, {1.0, 2.3, 4.3}, {8.6, 4.3, 2.4}, {7.8, 9.3, 10.0}};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cột muốn tính tổng: ");
        int column = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        for (int i = 0; i < matrix.length; i ++){
            for (int j = 0; j < matrix[i].length; j++){
                if(j == column){
                    sum += matrix[i][j];
                }
            }
        }

        System.out.print("Tổng của cột " + column + " là: " + sum);
    }
}
