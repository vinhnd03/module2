package quan_ly_phuong_tien_giao_thong2.repository;

import quan_ly_phuong_tien_giao_thong2.entity.Car;
import quan_ly_phuong_tien_giao_thong2.entity.Motorbike;
import quan_ly_phuong_tien_giao_thong2.entity.Truck;
import quan_ly_phuong_tien_giao_thong2.entity.Vehicle;
import quan_ly_phuong_tien_giao_thong2.repository.*;
import quan_ly_phuong_tien_giao_thong2.repository.CarRepository;
import quan_ly_phuong_tien_giao_thong2.repository.ICarRepository;
import quan_ly_phuong_tien_giao_thong2.repository.ITruckRepository;
import quan_ly_phuong_tien_giao_thong2.repository.TruckRepository;

import java.util.ArrayList;
import java.util.List;

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

        List<Car> cars = carRepository.findAll();
        vehicles.addAll(cars);

        List<Truck> trucks = truckRepository.findAll();
        vehicles.addAll(trucks);

        List<Motorbike> motorbike = motorbikeRepository.findAll();
        vehicles.addAll(motorbike);

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
