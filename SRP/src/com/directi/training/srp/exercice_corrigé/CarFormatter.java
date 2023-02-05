package com.directi.training.srp.exercice_corrigé;
import java.util.List;

public class CarFormatter {
    public String getCarsNames(List<Car> _carsDb)
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

}
