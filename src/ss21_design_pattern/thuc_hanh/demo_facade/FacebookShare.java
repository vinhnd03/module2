package ss21_design_pattern.thuc_hanh.demo_facade;

public class FacebookShare implements IShare{
    String message;
    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to Facebook: " + message);
    }
}
