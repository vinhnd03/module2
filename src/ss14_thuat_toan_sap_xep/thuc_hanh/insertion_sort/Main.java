package ss14_thuat_toan_sap_xep.thuc_hanh.insertion_sort;

import java.util.Arrays;

public class Main {
    private static int[] insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 9, 3, 8, 4, 2, 6};
        System.out.println(Arrays.toString(insertionSort(array)));
    }
}
