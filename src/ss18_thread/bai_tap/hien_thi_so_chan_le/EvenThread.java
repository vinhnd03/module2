package ss18_thread.bai_tap.hien_thi_so_chan_le;

public class EvenThread implements Runnable {

    private Thread t;
    private String threadName;

    public EvenThread() {
        threadName = "EvenThread";
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    Thread.sleep(15);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void start() {
        System.out.println("EvenThread starting");
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
