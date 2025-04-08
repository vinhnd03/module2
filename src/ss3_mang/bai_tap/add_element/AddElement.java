package ss3_mang.bai_tap.add_element;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void addElement (int[] array, int element, int index){
        for (int i = 0; i < array.length; i++){
            if(i == index){
                for(int j = array.length - 1; j > index; j--){
                    array[j] = array[j - 1];
                }
                array[i] = element;
            }
        }
        System.out.println("Add element success!");
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] array = {1 ,2, 3, 5, 6, 7, 8, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(array));
        System.out.print("Enter element you want to add: ");
        int addElement = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter index: ");
        int index = Integer.parseInt(scanner.nextLine());
        addElement(array, addElement, index);
    }
}
