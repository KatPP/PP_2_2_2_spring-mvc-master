package web.service;

import web.model.Car;

import java.util.List;

public interface CarServis {
    List<Car> getCarList(int count, List<Car> fullList);
}
