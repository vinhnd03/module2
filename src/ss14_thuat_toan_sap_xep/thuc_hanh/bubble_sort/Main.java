package ss14_thuat_toan_sap_xep.thuc_hanh.bubble_sort;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static int[] bubbleSort(int[] array) {
        boolean isSorted = true;
        for (int i = 0; i < array.length - 1 && isSorted; i++) {
            isSorted = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = true;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 9, 3, 8, 4, 2, 6};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }
}
