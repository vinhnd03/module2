package ss18_thread.bai_tap.thread_don_gian;

public class Main {
    public static void main(String[] args) {
        NumberGenerator gen1 = new NumberGenerator("gen1", Thread.MAX_PRIORITY);
        NumberGenerator gen2 = new NumberGenerator("gen2", Thread.MIN_PRIORITY);
        gen1.start();
        gen2.start();
    }
}
