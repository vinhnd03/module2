package ss14_thuat_toan_sap_xep.bai_tap.cai_dat_insertion_sort;

import java.util.Arrays;

public class InsertionSort {
    public static int[] sortIntegerArray(int[] array){
        int pos, x;
        for (int i = 1; i < array.length; i++){
            pos = i;
            x = array[i];
            while (pos > 0 && x < array[pos - 1]){
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 9, 3, 8, 4, 2, 6};
        System.out.println(Arrays.toString(sortIntegerArray(array)));
    }
}
