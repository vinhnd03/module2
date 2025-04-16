package quan_ly_phuong_tien_giao_thong.repository;

import quan_ly_phuong_tien_giao_thong.entity.Car;
import quan_ly_phuong_tien_giao_thong.entity.Motorbike;
import quan_ly_phuong_tien_giao_thong.entity.Truck;
import quan_ly_phuong_tien_giao_thong.entity.Vehicle;

import java.util.ArrayList;

public class VehicleRepository implements IVehicleRepository {

    private static ArrayList<Vehicle> vehicles = new ArrayList<>();
    private static ICarRepository carRepository = new CarRepository();
    private static ITruckRepository truckRepository = new TruckRepository();
    private static IMotorbikeRepository motorbikeRepository = new MotorbikeRepository();

    @Override
    public ArrayList<Vehicle> findAll() {
        return null;
    }

    @Override
    public Vehicle findByLicensePlate(String licensePlate) {

        ArrayList<Car> cars = carRepository.findAll();
        for (int i = 0; i < cars.size(); i++) {
            vehicles.add(cars.get(i));
        }

        ArrayList<Truck> trucks = truckRepository.findAll();
        for (int i = 0; i < trucks.size(); i++) {
            vehicles.add(trucks.get(i));
        }

        ArrayList<Motorbike> motorbike = motorbikeRepository.findAll();
        for (int i = 0; i < motorbike.size(); i++) {
            vehicles.add(motorbike.get(i));
        }

        for (int i = 0; i< vehicles.size(); i++){
            if(vehicles.get(i).getLicensePlate().equals(licensePlate)){
                return vehicles.get(i);
            }
        }
        return null;
    }

    @Override
    public void delete(Vehicle vehicle) {
        if(vehicle instanceof Car){
            carRepository.delete((Car) vehicle);
        }else if (vehicle instanceof Truck){
            truckRepository.delete((Truck) vehicle);
        }else{
            motorbikeRepository.delete((Motorbike) vehicle);
        }
    }
}
