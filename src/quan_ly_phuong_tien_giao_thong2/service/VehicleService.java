package quan_ly_phuong_tien_giao_thong2.service;

import quan_ly_phuong_tien_giao_thong2.entity.Vehicle;
import quan_ly_phuong_tien_giao_thong2.repository.IVehicleRepository;
import quan_ly_phuong_tien_giao_thong2.repository.VehicleRepository;
import quan_ly_phuong_tien_giao_thong2.service.IVehicleService;

public class VehicleService implements IVehicleService {
    private IVehicleRepository vehicleRepository = new VehicleRepository();
    @Override
    public Vehicle findByLicensePlate(String licensePlate) {
        return vehicleRepository.findByLicensePlate(licensePlate);
    }

    @Override
    public void delete(Vehicle vehicle) {
        vehicleRepository.delete(vehicle);
    }
}
