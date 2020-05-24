DROP DATABASE  IF EXISTS `spring_security_demo_bcrypt`;

CREATE DATABASE  IF NOT EXISTS `spring_security_demo_bcrypt`;
USE `spring_security_demo_bcrypt`;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` char(68) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--
-- NOTE: The passwords are encrypted using BCrypt
--
-- A generation tool is avail at: http://www.luv2code.com/generate-bcrypt-password
--
-- Default passwords here are: fun123
--

INSERT INTO `users` 
VALUES 
('katya','{bcrypt}$2y$12$TZc.cPP6BMDraQ4UcqVHb.xs4k/Izph0NRxqj7xg1pk9TIY0QoLL.',1),
('dima','{bcrypt}$2y$12$fjr/i4cG/IG9Wr4eluUKE.DWVRFRpDXaW4gat0PLqs6zhgjPnoKcm',1),
('masha','{bcrypt}$2y$12$17.n6yHAySc0wv2aFqzOF.a8kkIGXFL9oSG7ZZn8IxD8XTfNtk49W',1);


--
-- Table structure for table `authorities`
--

DROP TABLE IF EXISTS `authorities`;
CREATE TABLE `authorities` (
  `username` varchar(50) NOT NULL,
  `authority` varchar(50) NOT NULL,
  UNIQUE KEY `authorities_idx_1` (`username`,`authority`),
  CONSTRAINT `authorities_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `authorities`
--

INSERT INTO `authorities` 
VALUES 
('katya','ROLE_EMPLOYEE'),
('dima','ROLE_EMPLOYEE'),
('dima','ROLE_MANAGER'),
('masha','ROLE_EMPLOYEE'),
('masha','ROLE_ADMIN');


