package ss18_thread.bai_tap.hien_thi_so_chan_le;

public class OddThread implements Runnable{
    private Thread t;
    private String threadName;

    public OddThread() {
        threadName = "OddThread";
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                    Thread.sleep(10);
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
