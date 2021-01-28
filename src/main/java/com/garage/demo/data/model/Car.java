package com.garage.demo.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Car")
public class Car {
  @Id
  @Column(name = "Car_Id")
  private String Car_Id;
  @Column(name = "model")
  private String model;
  @Column(name = "available")
  private int available;

  @Override
  public String toString() {
    return "Car [Id=" + Car_Id + ", car model=" + model + ",available=" + available + "]";
  }

  public Car(String id, String model, int available) {
    super();
    Car_Id = id;
    this.model = model;
    this.available = available;
  }

  public String getCar_Id() {
    return Car_Id;
  }

  public void setCar_Id(String car_Id) {
    Car_Id = car_Id;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getAvailable() {
    return available;
  }

  public void setAvailable(int available) {
    this.available = available;
  }

  public Car() {
    super();
  }

}
