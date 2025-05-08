package ss21_design_pattern.thuc_hanh.demo_singleton;

public class Connection {
    private static Connection instance;

    private Connection(){};

    public synchronized static Connection getInstance(){
        if(instance == null){
            instance = new Connection();
        }
        return instance;
    }
}
