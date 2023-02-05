package com.directi.training.srp.exercice_corrigé;
import java.util.List;

public class CarSelector {
    public Car getBestCar(List<Car> _carsDb)
    {
        Car bestCar = null;
        for (Car car : _carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
