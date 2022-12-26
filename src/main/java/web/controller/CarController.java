package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;


@Controller
public class CarController {

    private final CarServiceImp carsService;

    @Autowired
    public CarController(CarServiceImp carsService) {
        this.carsService = carsService;
    }

    @GetMapping(value = "cars")
    public String printCarsList(@RequestParam(value = "count", defaultValue = "5", required = false) int count, Model model) {
        model.addAttribute("cars", carsService.getCarList(count));
        return "cars";
    }
}
