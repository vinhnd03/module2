package ss11_stack_va_queue.bai_tap.dao_nguoc_phan_tu_trong_mang;

import java.util.List;
import java.util.Stack;

public class Main {
    private static void integerArray(){
        Stack<Integer> stack = new Stack<>();

        Integer[] nums = new Integer[]{1, 2, 3, 4, 5, 6, 7};

        System.out.println("Before: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%-5d", nums[i]);
            stack.push(nums[i]);
        }

        System.out.println("\nAfter: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = stack.pop();
            System.out.printf("%-5d", nums[i]);
        }
    }

    private static void stringArray(){
        Stack<String> stack = new Stack<>();
        System.out.println("Before: ");

        String s1 = "Một Hai Ba Bốn Năm Sáu Bảy";

        String[] strings = s1.split(" ");
        for (int i = 0; i < strings.length; i++) {
            System.out.printf("%-5s", strings[i]);
            stack.push(strings[i]);
        }

        System.out.println("\nAfter: ");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = stack.pop();
            System.out.printf("%-5s", strings[i]);
        }
    }
    public static void main(String[] args) {
        integerArray();
        System.out.println("\n");
        stringArray();
    }
}
