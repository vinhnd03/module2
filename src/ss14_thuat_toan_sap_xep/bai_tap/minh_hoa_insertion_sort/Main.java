package ss14_thuat_toan_sap_xep.bai_tap.minh_hoa_insertion_sort;

import ss14_thuat_toan_sap_xep.bai_tap.cai_dat_insertion_sort.InsertionSort;

import java.util.Arrays;

public class Main {
    private static int[] insertionSort(int[] array) {
        System.out.println("Danh sách trước khi sắp xếp: " + Arrays.toString(array));
        System.out.println("=========================================================");
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            pos = i;
            x = array[i];
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;

                System.out.println("Di chuyển");
            }
            array[pos] = x;
            System.out.println(Arrays.toString(array));
            System.out.println("kết thúc vòng lặp thứ i = " + i);
        }
        System.out.println("=========================================================");
        System.out.println("Danh sách sau khi sắp xếp: " + Arrays.toString(array));

        return array;
    }

    public static void main(String[] args) {
        int[] numbers = {9, 3, 7, 2, 5, 4, 1, 8, 0, 6};
        insertionSort(numbers);
    }
}
