package ss18_thread.bai_tap.hien_thi_so_chan_le;

public class Main {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        try {
            Thread odd = new Thread(oddThread);
            Thread even = new Thread(evenThread);
            odd.start();
            odd.join();
            even.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
