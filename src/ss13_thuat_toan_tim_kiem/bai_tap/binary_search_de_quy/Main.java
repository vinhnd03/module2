package ss13_thuat_toan_tim_kiem.bai_tap.binary_search_de_quy;

import java.util.Scanner;

public class Main {
    private static int binarySearch(int[] list, int left, int right, int value) {
        if (right >= left) {
            // chú ý
            int mid = left + (right - left) / 2; //tối ưu, không bắt buộc
//            int mid = (left + right) / 2;

            if (list[mid] == value) {
                return mid;
            } else if (list[mid] < value){
                return binarySearch(list, mid + 1, right, value);
            } else {
                return binarySearch(list, left,  mid - 1, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 7, 13, 17, 23, 29, 31, 37, 39, 41, 43, 47, 51};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số muốn tìm vị trí index: ");
        int num = Integer.parseInt(scanner.nextLine());
        int result = binarySearch(numbers, 0, numbers.length - 1, num);
        System.out.println((result >= 0) ? "Số năm ở vị trí là: " + result : "Số không tồn lại trong mảng");
    }
}
