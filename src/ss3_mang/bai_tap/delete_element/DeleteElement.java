package ss3_mang.bai_tap.delete_element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void deleteElement(int[] array, int element){
        boolean check = false;
        for (int i = 0; i < array.length; i++){
            if(array[i] == element){
                check = true;
                for (int j = i; j < array.length; j++){
                    if(j == array.length - 1){
                        array[j] = 0;
                    }else{
                        array[j] = array[j + 1];
                    }
                }
                break;
            }
        }
        if(!check){
            System.out.println("Can not find " + element + " in array");
        }else{
            System.out.println("Delete success!");
            System.out.println(Arrays.toString(array));
        }
    }
    public static void main(String[] args) {

        int[] array = {1, 5, 2, 3, 6, 8, 4, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(array));
        System.out.print("Enter element you want to delete: ");
        int deleteEle = Integer.parseInt(scanner.nextLine());
        deleteElement(array, deleteEle);
    }
}
