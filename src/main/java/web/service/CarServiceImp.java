package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImp implements CarServis {

    private final List<Car> resultList = new ArrayList<>();

    {
        resultList.add(new Car("Chery", "Amulet", 2007));
        resultList.add(new Car("LADA", "Vesta", 2010));
        resultList.add(new Car("UAZ", "Patriot", 1995));
        resultList.add(new Car("Audi", "A3", 1999));
        resultList.add(new Car("Opel", "Astra", 1975));
        resultList.add(new Car("Mercedes", "C180", 2020));

    }

    public List<Car> getResultList() {
        return resultList;
    }
    public List<Car> getCarList(int count, List<Car> fullList) {
        if (count >= 5) {
            return resultList;
        }
        return fullList.subList(0, count);
    }
}
