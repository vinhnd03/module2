package ss3_mang.bai_tap.find_min_element;

import java.util.Scanner;

public class FindMinElement {
    public static int minValue(int[] array) {
        int min = array[0];
        for (int a : array) {
            if (min > a) {
                min = a;
            }
        }
        return min;
    }

    public static int minIndex(int[] array){
        int min = array[0];
        int index = 0;
        for(int i = 1; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Phần tử nhỏ nhất: " + minValue(array));
        System.out.println("Vị trí của phần tử nhỏ nhất: " + minIndex(array));
    }
}
