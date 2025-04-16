package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.entity.Vehicle;

public interface IVehicleService {
    Vehicle findByLicensePlate(String licensePlate);

    void delete(Vehicle vehicle);
}
