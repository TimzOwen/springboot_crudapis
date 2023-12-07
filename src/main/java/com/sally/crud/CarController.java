package com.sally.crud;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        super();
        this.carService = carService;
    }

    // Save entity to database
    @PostMapping("/createResident")
    public Car createResident(@RequestBody Car car) {
        return carService.saveResident(car);
    }

    // add Multiple residents to DB
    @PostMapping("/createAll")
    public List<Car> createMultiple(@RequestBody List<Car> cars) {
        return carService.saveMultipleResident(cars);
    }
}




