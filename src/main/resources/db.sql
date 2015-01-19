CREATE TABLE `user` (
  `UserID` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(32) NOT NULL,
  `last_login` datetime,
  `data_created` datetime,
  PRIMARY KEY (`UserID`),
  UNIQUE KEY `idnew_table_UNIQUE` (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
