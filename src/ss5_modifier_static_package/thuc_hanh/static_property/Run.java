package ss5_modifier_static_package.thuc_hanh.static_property;

public class Run {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
