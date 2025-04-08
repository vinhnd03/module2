package ss3_mang.bai_tap.find_max_in_matrix;

public class FindMaxInMatrix {
    public static void main(String[] args) {
        double[][] matrix = {{1.4, 2.3, 5.2}, {1.0, 2.3, 4.3}, {8.6, 4.3, 2.4}, {7.8, 9.3, 10.0}};
        double max = matrix[0][0];
        int indexI = 0;
        int indexJ = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng 2 chiều là: " + max + " ở vị trí [" + indexI + "][" + indexJ + "]");
    }
}
