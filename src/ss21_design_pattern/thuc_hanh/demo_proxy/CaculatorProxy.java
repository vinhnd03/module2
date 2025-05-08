package ss21_design_pattern.thuc_hanh.demo_proxy;

public class CaculatorProxy implements ICaculator{
    private RealCaculator caculator;

    public CaculatorProxy(){
        caculator = new RealCaculator();
    }
    @Override
    public double add(double a, double b) {
        if(a / 2 + b / 2 > Double.MAX_VALUE / 2){
            throw new RuntimeException("Out of range");
        }
        if(a / 2 + b / 2 < Double.MIN_VALUE / 2){
            throw new RuntimeException("Out of range");
        }
        return this.caculator.add(a, b);
    }

    @Override
    public double div(double a, double b) {
        if(b == 0){
            throw new RuntimeException("Can not divide by 0");
        }
        return this.caculator.div(a, b);
    }
}
