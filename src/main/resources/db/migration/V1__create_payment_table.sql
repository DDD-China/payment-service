CREATE TABLE `dmall_payment_db`.`payment` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`order_id` varchar(50) NOT NULL,
	`amount` decimal(10,0) NOT NULL,
	`method` varchar(255) DEFAULT NULL,
	PRIMARY KEY (`id`)
) ENGINE=`InnoDB` AUTO_INCREMENT=3 DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ROW_FORMAT=DYNAMIC COMMENT='' CHECKSUM=0 DELAY_KEY_WRITE=0;