package ss3_mang.thuc_hanh.find_max_element;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++){
            System.out.print("Element at " + i + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        System.out.println("Max element in array is: " + max);
    }
}
