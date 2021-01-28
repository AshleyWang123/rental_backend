/*
SQLyog Enterprise Trial - MySQL GUI v7.11
MySQL - 5.7.21-log : Database - garage
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`garage` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `garage`;


/*Table structure for table `car` */

DROP TABLE IF EXISTS `car`;

CREATE TABLE `car` (
  `Car_Id` varchar(10) NOT NULL,
  `model` varchar(1000) NOT NULL,
  `available` int(10) NOT NULL DEFAULT '1',
  PRIMARY KEY (`Car_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `car` */

insert  into `car`(`Car_Id`,`model`,`available`) values ('Car001','Toyota Camry',2),('Car002','BMW 650',2);


/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `Customer_Id` varchar(80) NOT NULL,
  `name` varchar(100) NOT NULL,
  `phone` varchar(20) NOT NULL,
  PRIMARY KEY (`Customer_Id`,`name`,`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customer` */

insert  into `customer`(`Customer_Id`,`name`,`phone`) values ('Customer001','Cat Tom','123456789'),('Customer002','Mouse Jerry','987654321');

/*Table structure for table `order_details` */

DROP TABLE IF EXISTS `order_details`;

CREATE TABLE `order_details` (
  `order_id` varchar(80) NOT NULL,
  `Car_Id` varchar(20) NOT NULL,
  `Customer_Id` varchar(20) NOT NULL,
  `order_date` date NOT NULL,
  `quantity` varchar(20) NOT NULL,
  PRIMARY KEY (`order_id`,`Car_Id`,`Customer_Id`,`order_date`,`quantity`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order_details` */

insert  into `order_details`(`order_id`,`Car_Id`,`Customer_Id`,`order_date`,`quantity`) values ('order001','Car001','Customer001','2021-01-25','1'),('order002','Car002','Customer002','2021-01-25','1');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
