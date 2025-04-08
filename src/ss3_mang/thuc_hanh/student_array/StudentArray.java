package ss3_mang.thuc_hanh.student_array;

import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a student's name: ");
        String inputName = scanner.nextLine();
        boolean isExist = false;
        for(int i = 0; i < students.length; i++){
            if (students[i].equals(inputName)){
                System.out.println("Position of the student in the list " + inputName + " is: " + i);
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("Not found " + inputName + " in the list.");
        }
    }
}
