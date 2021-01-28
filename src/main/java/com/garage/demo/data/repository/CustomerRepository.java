package com.garage.demo.data.repository;

import com.garage.demo.data.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {

}
