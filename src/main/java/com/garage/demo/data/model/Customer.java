package com.garage.demo.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
  @Id
  @Column(name = "Customer_Id")
  private String Customer_Id;
  @Column(name = "name")
  private String name;
  @Column(name = "phone")
  private String phone;

  @Override
  public String toString() {
    return "Customer [Id=" + Customer_Id + ", name=" + name + ", phone=" + phone + "]";
  }

  public Customer(String id, String name, String phone) {
    super();
    Customer_Id = id;
    this.name = name;
    this.phone = phone;
  }

  public String getCustomer_Id() {
    return Customer_Id;
  }

  public void setCustomer_Id(String customer_Id) {
    Customer_Id = customer_Id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Customer() {
    super();
  }

}
