/*
SQLyog Ultimate v12.5.0 (64 bit)
MySQL - 5.6.39-log : Database - smart
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`smart` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `smart`;

/*Table structure for table `air_conditioner_log` */

DROP TABLE IF EXISTS `air_conditioner_log`;

CREATE TABLE `air_conditioner_log` (
  `id` varchar(255) NOT NULL,
  `oxygen` tinyint(1) NOT NULL,
  `humidification` tinyint(1) NOT NULL,
  `heating` tinyint(1) NOT NULL,
  `aeration` tinyint(1) NOT NULL,
  `sleeping` tinyint(1) NOT NULL,
  `timer` int(11) NOT NULL,
  `freshness` tinyint(1) NOT NULL,
  `temperature` int(11) NOT NULL,
  `deviceno` int(11) NOT NULL,
  `createtime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `air_conditioner_log` */

/*Table structure for table `asset` */

DROP TABLE IF EXISTS `asset`;

CREATE TABLE `asset` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `number` varchar(255) NOT NULL,
  `rfid` varchar(255) NOT NULL,
  `status` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `asset` */

insert  into `asset`(`id`,`name`,`number`,`rfid`,`status`) values 
('af6b4b4b-5e1f-47f8-87b6-4cfb5bbbc864','device','001','EF977918',1);

/*Table structure for table `asset_log` */

DROP TABLE IF EXISTS `asset_log`;

CREATE TABLE `asset_log` (
  `id` varchar(255) NOT NULL,
  `rfid` varchar(255) NOT NULL,
  `create_time` datetime NOT NULL,
  `status` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `asset_log` */

/*Table structure for table `attendance` */

DROP TABLE IF EXISTS `attendance`;

CREATE TABLE `attendance` (
  `id` varchar(255) NOT NULL,
  `rfid` varchar(255) NOT NULL,
  `create_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `attendance` */

/*Table structure for table `environment` */

DROP TABLE IF EXISTS `environment`;

CREATE TABLE `environment` (
  `id` varchar(255) NOT NULL,
  `body` tinyint(1) NOT NULL,
  `humidity` float NOT NULL,
  `fire` tinyint(1) NOT NULL,
  `smoke` int(11) NOT NULL,
  `temperature` float NOT NULL,
  `illuminance` int(11) NOT NULL,
  `createtime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `environment` */

insert  into `environment`(`id`,`body`,`humidity`,`fire`,`smoke`,`temperature`,`illuminance`,`createtime`) values 
('0362a7bb-f2e8-4c7c-8ab8-ab9fb50f8cb0',0,75.6,0,0,25.9,0,'2018-11-30 16:05:14'),
('06a1ed13-7da8-4259-b6b6-758bf89e62e1',0,75.6,0,0,25.9,0,'2018-11-30 16:05:19'),
('06f44a63-e779-4dce-bd25-bd27bbcfc3e9',0,75.6,0,0,25.9,0,'2018-11-30 16:05:04'),
('08153786-290b-414a-9839-0f13365c9d08',0,76.7,0,0,25.8,0,'2018-11-30 16:13:06'),
('0943bdbf-8029-4ebf-9d9f-4af5bb87cb53',0,77.1,0,0,25.9,0,'2018-11-30 16:13:24'),
('0c0d93d5-3d5a-47af-bee4-fa39487c7290',0,75.7,0,0,26,0,'2018-11-30 16:04:39'),
('0c669ac9-dfa3-4b3f-ba8f-246018a310ad',0,75.8,0,0,25.8,0,'2018-11-30 16:05:34'),
('0ce79df5-e886-48b7-a753-d68b40a9ee18',0,77.1,0,0,25.9,0,'2018-11-30 16:13:38'),
('1e99f128-bfb3-49c1-ae72-85256bd03bd2',0,76.5,0,0,25.8,0,'2018-11-30 16:01:45'),
('1f320528-06e9-4be4-b75c-235ded10c4eb',0,76.8,0,0,25.8,0,'2018-11-30 16:13:01'),
('2164216f-93ed-4825-b339-dc04a0ce8407',0,76.3,0,0,25.9,0,'2018-11-30 16:04:14'),
('23884d34-0385-431d-9f1e-c5f2b24b7063',0,76.8,0,0,25.9,0,'2018-11-30 16:13:48'),
('2d303619-4fe7-45be-b63b-6e34914115ab',0,75.9,0,0,25.8,0,'2018-11-30 16:05:49'),
('36953974-1d67-4e29-bf85-ecf8116a2d97',0,75.6,0,0,25.8,0,'2018-11-30 16:05:09'),
('38248458-e2b6-4238-a55f-f6e74cf7e215',0,76.5,0,0,25.8,0,'2018-11-30 16:01:40'),
('3e9b264d-7167-457d-b416-4214a5b744b6',0,76,0,0,25.9,0,'2018-11-30 16:04:54'),
('4051bd76-6a0f-4add-a4a7-1dc7e5567f30',0,76.4,0,0,25.8,0,'2018-11-30 16:02:00'),
('4122c1f5-74f2-4ed9-ba4a-b128acd8d64e',0,76.7,0,0,26,0,'2018-11-30 16:02:20'),
('4486b0ea-fc94-4e4c-9927-807c43aa99da',0,75.7,0,0,25.9,0,'2018-11-30 16:05:44'),
('448e079e-61a8-4a1e-9971-9de5cd0f3d2f',0,76.6,0,0,26,0,'2018-11-30 16:02:35'),
('479926e8-ae94-4487-a947-2374f20f6278',0,75.9,0,0,26,0,'2018-11-30 16:04:49'),
('486d9b6c-7658-45ec-a390-59ba12c30483',0,76.7,0,0,25.9,0,'2018-11-30 16:13:53'),
('498a2712-2adc-4147-8277-e96d01f8f193',0,76.7,0,0,25.9,0,'2018-11-30 16:02:30'),
('49b5d6e6-9270-4229-b40a-c1a85c2bedaa',0,75.6,0,0,25.9,0,'2018-11-30 16:05:24'),
('5d132706-17a4-4bf0-97a5-bd2a8c346a7c',0,75.8,0,0,25.8,0,'2018-11-30 16:05:39'),
('5f8d9b16-fdd7-4819-a9e6-92da9626d9d2',0,76.7,0,0,25.8,0,'2018-11-30 16:13:17'),
('601855e6-c9d2-45b3-aad2-35aea5f110ba',0,75.7,0,0,25.8,0,'2018-11-30 16:05:29'),
('63691dc1-f626-453f-897a-257be73c61b8',0,76,0,0,25.8,0,'2018-11-30 16:05:54'),
('6b218f1a-514b-4c74-a585-526c1f687ba2',0,76.5,0,0,25.9,0,'2018-11-30 16:02:10'),
('6ea0241d-b784-44c4-8db9-8a5550f2e951',0,76.3,0,0,26,0,'2018-11-30 16:04:04'),
('7116318a-5884-4485-984f-fefba6c4ba13',0,76.7,0,0,25.9,0,'2018-11-30 16:02:25'),
('7b11bee2-899b-4aef-a605-6e31463947fa',0,77,0,0,25.9,0,'2018-11-30 16:13:43'),
('7bea72c4-b68c-4bf0-a9b3-9cc8a36b55bf',0,76.5,0,0,25.8,0,'2018-11-30 16:01:50'),
('86a7f66e-75ce-4f16-84bf-98849c62df69',0,76.3,0,0,26,0,'2018-11-30 16:04:09'),
('99329a88-44d9-43b9-83ad-41bbb7030c8e',0,76,0,0,25.8,0,'2018-11-30 16:06:17'),
('9f493dd8-8147-489c-bb73-ce6c7baaf1fb',0,75.9,0,0,26,0,'2018-11-30 16:04:29'),
('a2fab05d-69a6-4172-8165-9813697f3c68',0,76.2,0,0,26,0,'2018-11-30 16:04:24'),
('badb0d96-f1ec-4fa3-89c5-ca157a1e18c3',0,76.5,0,0,25.9,0,'2018-11-30 16:13:58'),
('bf34c15e-55cd-4d28-826c-10f9ef3d2562',0,75.7,0,0,26,0,'2018-11-30 16:04:44'),
('bfd34ac6-4e67-4dbc-913a-c8a87a0a191b',0,76,0,0,25.8,0,'2018-11-30 16:05:59'),
('c1a03f5e-2a7e-4e2b-b749-e8c595218499',0,75.7,0,0,26,0,'2018-11-30 16:04:34'),
('ce66c0f9-adc8-4570-a689-1fbb7aff375c',0,76.5,0,0,25.9,0,'2018-11-30 16:01:55'),
('d11a71c1-bb42-4e5a-83ac-3f4a0a237b5c',0,76.5,0,0,25.9,0,'2018-11-30 16:14:03'),
('e37cc1f1-3917-48fb-b234-46b3df55e8ea',0,77.2,0,0,25.9,0,'2018-11-30 16:13:29'),
('eda9e073-ec3b-4362-86e1-1108c6e477cc',0,76.5,0,0,25.9,0,'2018-11-30 16:02:05'),
('f183e632-a911-4d05-a072-ed21a384880d',0,76.6,0,0,25.9,0,'2018-11-30 16:14:08'),
('f375db56-1da1-49a1-89cb-402207b42582',0,76.5,0,0,25.9,0,'2018-11-30 16:02:15'),
('f6435927-ba47-45a8-b12c-c564378528b7',0,75.8,0,0,25.9,0,'2018-11-30 16:04:59'),
('fd7c0e24-a957-48a5-bb69-58b876dcf25f',0,76.2,0,0,26,0,'2018-11-30 16:04:19');

/*Table structure for table `light_log` */

DROP TABLE IF EXISTS `light_log`;

CREATE TABLE `light_log` (
  `id` varchar(255) NOT NULL,
  `operation` tinyint(1) NOT NULL,
  `createtime` datetime NOT NULL,
  `deviceno` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `light_log` */

insert  into `light_log`(`id`,`operation`,`createtime`,`deviceno`) values 
('0074078b-b03a-4624-8847-bc5978206fc4',1,'2018-11-30 16:13:08',1),
('0e9d0785-3081-42c4-abf0-00ed2f465287',1,'2018-11-30 16:13:06',1),
('1395cd27-64c5-4fa7-9dcd-93a9c2c42420',1,'2018-11-30 16:13:06',1),
('50a665f8-e05d-4d56-a9ba-6a890a64fbca',0,'2018-11-30 16:13:05',1),
('63859a8a-83cd-49ff-af4a-4f70e7bbebf9',0,'2018-11-30 16:13:05',1),
('817c926f-b920-480c-9598-b37b4a300d54',1,'2018-11-30 16:13:04',1),
('8c052fcc-6a30-4322-8ad3-c208d87d18a0',0,'2018-11-30 16:06:57',1),
('92ead0ff-6f26-4ea9-88f9-be6e5ad19f9f',1,'2018-11-30 16:13:05',1),
('938d86fa-93d8-4211-998c-0367bff127d5',1,'2018-11-30 16:02:28',1),
('9a9525c8-4b78-4f5a-8dab-d8778c027377',0,'2018-11-30 16:13:06',1),
('a6e8ec7d-7dcf-4c3b-82fb-964cf47dcd0b',0,'2018-11-30 16:13:05',1),
('aca68cdb-3585-4d52-98ed-38be9c0df857',0,'2018-11-30 16:13:06',1),
('cde6b478-53c9-4758-bf87-a21541891277',1,'2018-11-30 16:06:37',1),
('e2a6a08d-c60e-4fc9-8d80-157d077a484f',0,'2018-11-30 16:13:04',1),
('e32a218b-0319-4e25-8980-4f81c9a91783',1,'2018-11-30 16:13:05',1),
('f5ca82ab-4433-4867-bbff-b3ec16c0a0c8',0,'2018-11-30 16:13:08',1);

/*Table structure for table `person` */

DROP TABLE IF EXISTS `person`;

CREATE TABLE `person` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `number` varchar(255) NOT NULL,
  `rfid` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `person` */

insert  into `person`(`id`,`name`,`number`,`rfid`) values 
('5078fda0-feea-42d8-b5a6-a4a994eba0e5','杨工','201425220138','EF977918'),
('7a8e61f4-10a8-4332-a5f0-060877015272','冯工','23123','1232341234asdsdf'),
('d24b3444-4c6a-4bf0-8150-dd15460b4ed3','钟工','21232f297a57a5a743894a0e4a801fc3','1232341234asdsdf');

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(50) NOT NULL COMMENT '登录名',
  `pass` varchar(255) NOT NULL COMMENT '密码，默认值为123',
  `phone` varchar(50) DEFAULT NULL COMMENT '手机号码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=123 DEFAULT CHARSET=utf8;

/*Data for the table `tb_user` */

insert  into `tb_user`(`id`,`name`,`pass`,`phone`) values 
(1,'scott','*23AE809DDACAF96AF0FD78ED04B6A265E05AA257','13622298413'),
(2,'gec123','*23AE809DDACAF96AF0FD78ED04B6A265E05AA257','13622221111'),
(110,'gec','*23AE809DDACAF96AF0FD78ED04B6A265E05AA257','123456789'),
(114,'abc','*23AE809DDACAF96AF0FD78ED04B6A265E05AA257','88888888'),
(120,'gec666','*23AE809DDACAF96AF0FD78ED04B6A265E05AA257','0123456789'),
(121,'gec888','*23AE809DDACAF96AF0FD78ED04B6A265E05AA257','666666666'),
(122,'gec000','*23AE809DDACAF96AF0FD78ED04B6A265E05AA257','4444444444');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
