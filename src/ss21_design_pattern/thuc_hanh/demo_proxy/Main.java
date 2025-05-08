package ss21_design_pattern.thuc_hanh.demo_proxy;

public class Main {
    public static void main(String[] args) {
        ICaculator caculator = new CaculatorProxy();
        System.out.println(caculator.add(1, 2));
        System.out.println(caculator.div(1, 0));
    }
}
