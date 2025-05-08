package ss21_design_pattern.thuc_hanh.demo_proxy;

public class RealCaculator implements ICaculator{
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double div(double a, double b) {
        return a / b;
    }
}
