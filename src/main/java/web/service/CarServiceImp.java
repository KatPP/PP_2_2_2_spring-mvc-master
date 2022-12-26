package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarServis {

    @Override
    public List<Car> getCarList(int count) {
        List<Car> resultList = new ArrayList<>();
        resultList.add(new Car("Chery", "Amulet", 2007));
        resultList.add(new Car("LADA", "Vesta", 2010));
        resultList.add(new Car("UAZ", "Patriot", 1995));
        resultList.add(new Car("Audi", "A3", 1999));
        resultList.add(new Car("Opel", "Astra", 1975));
        resultList.add(new Car("Mercedes", "C180", 2020));
        if (count != 0 && count <= resultList.size() && count >= 0)
            return resultList.stream().limit(count).collect(Collectors.toList());
        return resultList;
    }
}
