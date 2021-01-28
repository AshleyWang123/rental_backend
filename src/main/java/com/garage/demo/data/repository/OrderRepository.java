package com.garage.demo.data.repository;

import org.springframework.data.repository.CrudRepository;
import com.garage.demo.data.model.Order;

public interface OrderRepository extends CrudRepository<Order, String> {
}
