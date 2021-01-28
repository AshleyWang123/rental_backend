package com.garage.demo.data.repository;

import com.garage.demo.data.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, String> {

}
