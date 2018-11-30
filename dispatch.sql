/*
SQLyog Professional v12.08 (64 bit)
MySQL - 5.5.60-MariaDB : Database - dispatch
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`dispatch` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `dispatch`;

/*Table structure for table `dispatch` */

DROP TABLE IF EXISTS `dispatch`;

CREATE TABLE `dispatch` (
  `id` varchar(200) NOT NULL,
  `dispatchDate` datetime DEFAULT NULL,
  `recipientsid` varchar(200) DEFAULT NULL,
  `sum` decimal(10,0) DEFAULT NULL,
  `addtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `dispatch` */

insert  into `dispatch`(`id`,`dispatchDate`,`recipientsid`,`sum`,`addtime`) values ('0000001','2018-11-12 10:21:21','01',NULL,'2018-11-19 10:21:43'),('0000002','2018-11-13 10:22:04','02',NULL,'2018-11-19 10:22:14');

/*Table structure for table `dispatchDetailed` */

DROP TABLE IF EXISTS `dispatchDetailed`;

CREATE TABLE `dispatchDetailed` (
  `id` varchar(20) NOT NULL,
  `dispatchid` varchar(200) DEFAULT NULL,
  `unitsname` varchar(200) DEFAULT NULL,
  `productname` varchar(200) DEFAULT NULL,
  `unit` varchar(200) DEFAULT NULL,
  `price` decimal(10,0) DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `discountamount` decimal(10,0) DEFAULT NULL,
  `number` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `dispatchDetailed` */

insert  into `dispatchDetailed`(`id`,`dispatchid`,`unitsname`,`productname`,`unit`,`price`,`discount`,`discountamount`,`number`) values ('00000011','0000001','长江集团','钢鼓','箱','2000',0.8,'480000',300),('00000012','0000001','建工集团','轮轴','个','300',0.7,'42000',200),('00000013','0000001','哇哈哈集团','矿泉水','箱','4000',0.6,'96000',40),('00000014','0000002','建工集团','轮轴','个','300',0.7,'4200',20),('00000015','0000002','建工建材集团','吊车','台','40000',0.9,'72000',2);

/*Table structure for table `recipients` */

DROP TABLE IF EXISTS `recipients`;

CREATE TABLE `recipients` (
  `id` varchar(200) NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  `phone` varchar(200) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `postcode` varchar(200) DEFAULT NULL,
  `addtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `recipients` */

insert  into `recipients`(`id`,`name`,`phone`,`address`,`postcode`,`addtime`) values ('01','张三','13844445555','上海新发地','000004','2018-11-06 10:23:15'),('02','李四','15744442222','海南岛','000009','2018-11-13 10:23:48');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
