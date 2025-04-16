package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.entity.Vehicle;
import quan_ly_phuong_tien_giao_thong.repository.IVehicleRepository;
import quan_ly_phuong_tien_giao_thong.repository.VehicleRepository;

public class VehicleService implements IVehicleService{
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
