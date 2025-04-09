package ss4_class_va_object.bai_tap.lop_fan;

public class Fan {
    private boolean status;
    private double radius;
    private String color;

    private int speed;

    public Fan() {
        this.status = false;
        this.radius = 5;
        this.color = "blue";
        this.speed = Speed.SLOW;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {
        if(speed >= 1 && speed <= 3){
            this.speed = speed;
        }else{
            this.speed = Speed.SLOW;
        }

    }

    @Override
    public String toString() {
        if(this.status == true){
            return "Trạng thái của quạt là :" + (this.status ? "ON" : "OFF") + "\nMàu của quạt là: " + this.color +
                    "\nBán kính của cánh quạt là: " + this.radius + "\nTốc độ của quạt là: " + this.speed;
        }else{
            return "Trạng thái của quạt là :" + (this.status ? "ON" : "OFF") + "\nMàu của quạt là: " + this.color +
                    "\nBán kính của cánh quạt là: " + this.radius;
        }

    }
}
