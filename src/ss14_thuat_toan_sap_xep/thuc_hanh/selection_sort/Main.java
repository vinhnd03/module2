package ss14_thuat_toan_sap_xep.thuc_hanh.selection_sort;

import java.util.Arrays;

public class Main {
    private static int[] selectionSort(int[] array) {
        int min;
        for(int i = 0; i < array.length - 1; i++){
            min = i;
            for (int j = i + 1; j < array.length; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 9, 3, 8, 4, 2, 6};
        System.out.println(Arrays.toString(selectionSort(array)));
    }
}
