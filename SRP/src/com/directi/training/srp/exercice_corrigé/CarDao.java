package com.directi.training.srp.exercice_corrigé;
import java.util.List;

public class CarDao {
    
    public Car getFromDb(final String carId, List<Car> _carsDb)
    {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }
    
}
