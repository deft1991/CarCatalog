package service;

import model.Car;

import java.util.Collection;

/**
 * Created by deft1 on 01.07.2017.
 */
public interface CarService {

    Boolean add(Car car);

    void update(Car car);

    Collection<Car> getCars(String search);

    void delete(Car car);

}