package ss3_mang.bai_tap.merge_array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng 1: ");
        int size1 = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[size1];
        for (int i = 0; i < array1.length; i++){
            System.out.print("Nhập nhần tử thứ " + i + " của mảng 1: ");
            array1[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.print("Nhập độ dài của mảng 2: ");
        int size2 = Integer.parseInt(scanner.nextLine());
        int[] array2 = new int[size2];
        for (int i = 0; i < array2.length; i++){
            System.out.print("Nhập nhần tử thứ " + i + " của mảng 2: ");
            array2[i] = Integer.parseInt(scanner.nextLine());
        }

        int[] array3 = new int[size1 + size2];
        for (int i = 0; i < array3.length; i++){
            if(i < array3.length - size1){
                array3[i] = array1[i];
            }else{
                array3[i] = array2[i - size2];
            }
        }
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Array 3: " + Arrays.toString(array3));
    }
}
