package ss4_class_va_object.bai_tap.lop_stop_watch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Want to stop?");
        scanner.nextLine();

        stopWatch.stop();
        System.out.println("Millisecond: " + stopWatch.getElapsedTime());
    }
}
