package quan_ly_phuong_tien_giao_thong2.repository;

import quan_ly_phuong_tien_giao_thong2.entity.Vehicle;

import java.util.ArrayList;

public interface IVehicleRepository {
    ArrayList<Vehicle> findAll();

    Vehicle findByLicensePlate(String licensePlate);

    void delete(Vehicle vehicle);
}
