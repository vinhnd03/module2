package ss15_exception_va_debug.thuc_hanh.su_dung_lop_exception_co_san;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random random = new Random();
        Integer[] array = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");

        try {
            int x = Integer.parseInt(scanner.nextLine());

            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }catch (NumberFormatException e){
            System.err.println("Định dạng số không đúng");
        }
    }
}
