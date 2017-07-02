package model.dao;


import model.Car;

import java.util.Collection;
import java.util.List;

/**
 * Created by deft1 on 01.07.2017.
 */
public interface CarDao {

    void add(Car car);

    void update(Car car);

    void delete(Car car);

    Collection<Car> getCars(String search);

    public List findByCar(String name, Long price);

}