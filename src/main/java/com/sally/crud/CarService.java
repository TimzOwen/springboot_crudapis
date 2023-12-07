package com.sally.crud;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
public class CarService {

    CarRepository residentRepository;

    // save single entity to database
    public Car saveResident(Car resident){
        return residentRepository.save(resident);
    }

    // update multiple residents
    public List<Car> saveMultipleResident(List<Car> residents){
        return residentRepository.saveAll(residents);
    }




}
