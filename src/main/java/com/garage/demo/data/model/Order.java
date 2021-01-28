package com.garage.demo.data.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_details")
public class Order implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "order_id")
  private String order_id;

  @Column(name = "Car_Id")
  private String Car_Id;

  @Column(name = "Customer_Id")
  private String Customer_Id;
  
  @Column(name = "Order_date")
  private Date order_date;

  @Column(name = "quantity")
  private int quantity;

  @Override
  public String toString() {
    return "Order [order_id=" + order_id + ", Car_Id=" + Car_Id +", Customer_Id="+ Customer_Id + ", order_date=" + order_date
        + ", quantity=" + quantity + "]";
  }

  public String getOrder_id() {
    return order_id;
  }

  public void setOrder_id(String order_id) {
    this.order_id = order_id;
  }

  public String getCar_Id() {
    return Car_Id;
  }

  public void setCar_Id(String Car_Id) { this.Car_Id = Car_Id; }

  public String getCustomer_Id() { return Customer_Id; }

  public void setCustomer_Id(String customer_Id) { this.Customer_Id = customer_Id; }

  public Date getOrder_date() {
    return order_date;
  }

  public void setOrder_date(Date order_date) {
    this.order_date = order_date;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

}
