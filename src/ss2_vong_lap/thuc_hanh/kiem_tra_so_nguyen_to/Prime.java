package ss2_vong_lap.thuc_hanh.kiem_tra_so_nguyen_to;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        if(number < 2){
            System.out.printf("%d is not a prime", number);
        }else{
            boolean check = true;
            for(int i = 2; i <= Math.sqrt(number); i++){
                if(number % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.format("%d is a prime", number);
            }else{
                System.out.printf("%d is not a prime", number);

            }
        }
    }
}
