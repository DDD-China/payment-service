CREATE TABLE `payment` (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `order_id` bigint(0) NOT NULL,
  `method` varchar(100) DEFAULT NULL,
  `price` decimal(10, 2) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `IDX_ORDER_ID` (`order_id`)
);