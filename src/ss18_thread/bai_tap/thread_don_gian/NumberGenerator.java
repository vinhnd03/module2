package ss18_thread.bai_tap.thread_don_gian;

public class NumberGenerator implements Runnable {
    private Thread myThread;
    private String threadName;
    private int priority;

    public NumberGenerator(String name, int priority) {
       threadName = name;
       this.priority = priority;
       System.out.println("Creating " + this.threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 1; i <= 10; i++){
                System.out.println(threadName + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("Thread " + threadName + " interrupted");
        }
        System.out.println("Thread " + threadName + " exiting");
    }

    public void start(){
        System.out.println("Starting " + threadName);
        if(myThread == null){
            myThread = new Thread(this, threadName);
            myThread.setPriority(priority);
            myThread.start();
        }
    }
}
