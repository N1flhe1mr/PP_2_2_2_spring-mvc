package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {
    private final CarServiceImpl carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        List<Car> cars = carService.getCars();

        if (count != null && count < 5 && count >= 0) {
            cars = cars.stream().limit(count).collect(Collectors.toList());
        }

        model.addAttribute("cars", cars);
        return "cars";
    }
}