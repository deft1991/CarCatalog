package service.impl;

import model.Car;
import model.dao.CarDao;
import service.CarService;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

/**
 * Created by deft1 on 01.07.2017.
 */
public class CarServiceImpl implements CarService {

    private CarDao carDao;

    public CarDao getCarDao() {
        return carDao;
    }

    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    @Transactional
    @Override
    public Boolean add(Car car) {
        List<Car> duplicate = carDao.findByCar(car.getName(), car.getPrice());
        if (duplicate.isEmpty()) {
            carDao.add(car);
            return true;
        }
        return false;
    }

    @Transactional
    @Override
    public void update(Car car) {
        carDao.update(car);
    }

    @Transactional
    @Override
    public Collection<Car> getCars(String search) {
        return carDao.getCars(search);
    }

    @Transactional
    @Override
    public void delete(Car car) {
        carDao.delete(car);
    }

}