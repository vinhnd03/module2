package ss2_vong_lap.bai_tap.print_20_prime_number;

import java.util.ArrayList;

public class PrintPrimeNumber {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        int count = 0;
        int n = 2;
        while (count < 20){
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    check = false;
                    break;
                }
            }
            if(check){
                nums.add(n);
                count++;
            }
            n++;
        }
        System.out.println(nums);
    }
}
