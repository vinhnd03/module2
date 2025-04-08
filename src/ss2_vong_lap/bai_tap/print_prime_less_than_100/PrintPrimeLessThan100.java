package ss2_vong_lap.bai_tap.print_prime_less_than_100;

import java.util.ArrayList;

public class PrintPrimeLessThan100 {
    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>();
        int n = 2;
        while (n < 100) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                primes.add(n);
            }
            n++;
        }
        System.out.println(primes);
    }
}

