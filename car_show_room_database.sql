CREATE DATABASE IF NOT EXISTS car_show_room_databasecar_details;

DROP TABLE IF EXISTS `car_details`;
CREATE TABLE `car_details` (
  `car_Brand` varchar(25) DEFAULT NULL,
  `car_Model` varchar(30) DEFAULT NULL,
  `Mileage` varchar(8) DEFAULT NULL,
  `Engine` varchar(8) DEFAULT NULL,
  `BHP` varchar(8) DEFAULT NULL,
  `Transmission` varchar(10) DEFAULT NULL,
  `TopSpeed` varchar(6) DEFAULT NULL,
  `Color` varchar(30) DEFAULT NULL,
  `yearly_SChargee` varchar(9) DEFAULT NULL,
  `Prise` varchar(15) DEFAULT NULL,
  `fuel_Type` varchar(10) DEFAULT NULL
);
