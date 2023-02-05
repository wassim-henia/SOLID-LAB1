package com.directi.training.srp.exercice_corrigé;
import java.util.Arrays;
import java.util.List;

public class CarManager
{
    private final CarDao _carDao;
    private final CarFormatter _carFormatter;
    private final CarSelector _carSelector;

    private List<Car> _carsDb = Arrays
        .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megane", "Renault"));
    
    public CarManager(CarDao carDao, CarFormatter carFormatter, CarSelector carSelector)
    {
        _carDao = carDao;
        _carFormatter = carFormatter;
        _carSelector = carSelector;
    }

    public Car getCar(String carId){

        Car _car = _carDao.getFromDb(carId, _carsDb);
        return _car;
    }

    public String getNames(){
        return _carFormatter.getCarsNames(_carsDb);
    }

    public Car bestCar(){
        return _carSelector.getBestCar(_carsDb);
    }

}
