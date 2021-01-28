# Rental Car API Service
Basic API Service Build on Spring Boot
REST Controller + MySQL

Download this project
Import data to database
Run it as Spring Boot app

Index URL: http://39.106.222.220:8888/

## Initialising a Database
import data to your Mysql database and modiy the file 'application.properties'

```
dbscript/dbscript.sql
```

## Making requests
**GET /**

Returns a list of all Cars/Customers/Orders in the database.
```
GET http://39.106.222.220:8888/api/getCars
GET http://39.106.222.220:8888/api/getCustomers
GET http://39.106.222.220:8888/api/getOrders
```

**GET /:Car_Id/Customer_Id/order_id**

Returns the Cars/Customer/Order with the specified `Car_Id`/`Customer_Id`/`order_id`.
```
GET http://39.106.222.220:8888/api/getCars/Car001
GET http://39.106.222.220:8888/api/getCustomers/Customer001
GET http://39.106.222.220:8888/api/getOrders/order001
```

**POST /**

Creates/Updates a new Car/Customer/Order. Fields for the Car/Customer/Order should be included as the body of the POST request.
```
POST http://39.106.222.220:8888/api/addCar
{"car_Id":"Car001","model":"Toyota Camry","available":2}

POST http://39.106.222.220:8888/api/addCustomer
{"customer_Id":"Customer001","name":"Cat Tom","phone":"123456789"}

POST http://39.106.222.220:8888/api/addOrder
{"order_id":"order001","order_date":"2021-01-25","quantity":1,"car_Id":"Car001","customer_Id":"Customer001"}
```

**DELETE /:Car_Id/Customer_Id/order_id**

Deletes the Car with the specified `Car_Id`/`Customer_Id`/`order_id`.

```
DELETE http://39.106.222.220:8888/api/delCar/car001
DELETE http://39.106.222.220:8888/api/delCustomer/Customer001
DELETE http://39.106.222.220:8888/api/delOrder/order001
```
# rental_backend
