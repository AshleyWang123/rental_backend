package com.garage.demo.controller;

import com.garage.demo.data.model.Car;
import com.garage.demo.data.model.Order;
import com.garage.demo.data.model.Customer;
import com.garage.demo.data.repository.CarRepository;
import com.garage.demo.data.repository.OrderRepository;
import com.garage.demo.data.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private CarRepository carRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private OrderRepository orderRepository;


    /**
     * METHOD: GET: 1. GETALL 2. GET BY ID
     */
    @RequestMapping(value = "/getCars" +
            "", method = RequestMethod.GET, produces = "application/json")
    public List<Car> getCars() {
        List<Car> li = new ArrayList<Car>();
        carRepository.findAll().forEach(li::add);
        return li;
    }

    @RequestMapping(value = "/getCars/{Car_Id}", method = RequestMethod.GET, produces = "application/json")
    public Car getCar(@PathVariable String Car_Id){
        return carRepository.findById(Car_Id).get();
    }

    @RequestMapping(value = "/getCustomers",method = RequestMethod.GET, produces = "application/json")
    public List<Customer> getUsers(){
        List<Customer> li = new ArrayList<Customer>();
        customerRepository.findAll().forEach(li::add);
        return li;
    }

    @RequestMapping(value = "/getCustomers/{Customer_Id}", method = RequestMethod.GET, produces = "application/json")
    public Customer getCustomer(@PathVariable String Customer_Id){ return customerRepository.findById(Customer_Id).get(); }

    @RequestMapping(value = "/getOrders", method = RequestMethod.GET, produces = "application/json")
    public List<Order> getOrders() {
        List<Order> li = new ArrayList<Order>();
        orderRepository.findAll().forEach(li::add);
        return li;
    }

    @RequestMapping(value = "/getOrders/{order_id}", method = RequestMethod.GET, produces = "application/json")
    public Order getOrder(@PathVariable String order_id){ return orderRepository.findById(order_id).get(); }
    /**
     * METHOD: GET: 1. GETALL 2. GET BY ID
     */


    /**
     * METHOD: POST
     */
    @RequestMapping(value = "/addCar", method = RequestMethod.POST, produces = "application/json")
    public void addCars(@RequestBody Car cars) { carRepository.save(cars); }

    @RequestMapping(value = "/addCustomer", method = RequestMethod.POST, produces = "application/json")
    public void addCustomer(@RequestBody Customer customer) { customerRepository.save(customer); }

    @RequestMapping(value = "/addOrder", method = RequestMethod.POST, produces = "application/json")
    public void addOrder(@RequestBody Order orderDetails) { orderRepository.save(orderDetails); }
    /**
     * METHOD: POST
     */

    /**
     * METHOD: DELETE
     */
    @RequestMapping(value = "/delCar/{Car_Id}", method = RequestMethod.DELETE, produces = "application/json")
    public void delCars(@PathVariable String car_id) { carRepository.delete(carRepository.findById(car_id).get()); }

    @RequestMapping(value = "/delCustomer/{Customer_Id}", method = RequestMethod.DELETE, produces = "application/json")
    public void delCustomer(@PathVariable String customer_id) {
        customerRepository.delete(customerRepository.findById(customer_id).get()); }

    @RequestMapping(value = "/delOrder/{order_id}", method = RequestMethod.DELETE, produces = "application/json")
    public void delOrder(@PathVariable String order_id) {
        orderRepository.delete(orderRepository.findById(order_id).get()); }
    /**
     * METHOD: DELETE
     */
}
