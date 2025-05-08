package ss21_design_pattern.thuc_hanh.demo_singleton;

public class Main {
    public static void main(String[] args) {
        Connection connection = Connection.getInstance();
        Connection connection1 = Connection.getInstance();
    }
}
