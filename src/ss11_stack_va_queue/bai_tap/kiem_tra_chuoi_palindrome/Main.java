package ss11_stack_va_queue.bai_tap.kiem_tra_chuoi_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    private static void checkPalindrome(){
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack<>();
        Queue queue = new LinkedList();

        System.out.print("Nhập một chuỗi: ");
        String s = scanner.nextLine();
        String[] array = s.split("");

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
            queue.add(array[i]);
        }

        boolean check = true;
        for (int i = 0; i < array.length/2; i++) {
            if(!stack.pop().equals(queue.poll())){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("Là chuỗi palindrome");
        }else {
            System.out.println("Không phải chuỗi palindrome");
        }
    }
    public static void main(String[] args) {
        checkPalindrome();
    }
}
