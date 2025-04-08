package ss3_mang.thuc_hanh.count_student_pass;

import java.util.Scanner;

public class CountStudentPass {
    public static int countStudentPass(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= 5){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = Integer.parseInt(scanner.nextLine());
        } while (size > 30);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("The number of students passing the exam is: " + countStudentPass(array));
    }
}
