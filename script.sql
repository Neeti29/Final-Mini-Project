select * from flight;

/*create table Employee(
E_Id int AUTO_INCREMENT PRIMARY KEY,
First_Name varchar(30),
Last_Name varchar(30),
DOB date,
Gender char,
Email_Id varchar(40),
Phone_Number varchar(13),
Address varchar(40),
Salary int,
Resume blob);
INSERT INTO Employee(First_Name, Last_Name,DOB,Gender,Email_Id,Phone_Number,Address,Salary) VALUES ('Neeti','Malhotra','1995-01-31','f','neeti.malhotra@niit-tech.com',8786456466,'New Delhi',18000),
('Bharti','Bauhara','1996-10-8','f','bharti.airtel@niit-tech.com',8786456326,'Delhi',18000),
('Akriti','Dixit','1995-12-2','f','akriti.dixit@niit-tech.com',8786465436,'Gaziabad',18000),
('Abhinav','Sharma','1997-05-25','M','abhinav.sharma@niit-tech.com',8285864867,'Gurgaon',18000)
*/
/*
CREATE TABLE `department` (
  `D_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Dept_Name` varchar(30) DEFAULT NULL,
  `E_Id` int(11) NOT NULL,
  PRIMARY KEY (`D_Id`),
  KEY `FK_ID` (`E_Id`),
  CONSTRAINT `department_ibfk_1` FOREIGN KEY (`E_Id`) REFERENCES `employee` (`E_Id`));
  
  INSERT INTO Department(Dept_Name,E_Id) VALUES('Development',2),
  ('Design',1),
  ('Testing',3),
  ('Deployment',4),
  ('Marketing',4)*/
  
  CREATE TABLE `project` (
  `Pr_Name` varchar(20) DEFAULT NULL,
  `Start_Date` date DEFAULT NULL,
  `End_Date` date DEFAULT NULL,
  `E_Id` int(11) NOT NULL,
  `D_Id` int(11) NOT NULL,
  KEY `FK_ID` (`E_Id`),
  KEY `FK_ID1` (`D_Id`),
  CONSTRAINT `project_ibfk_2` FOREIGN KEY (`D_Id`) REFERENCES `department` (`D_Id`),
  CONSTRAINT `project_ibfk_1` FOREIGN KEY (`E_Id`) REFERENCES `employee` (`E_Id`)
);

INSERT INTO Project(Pr_Name,Start_Date,End_Date,D_Id,E_Id) VALUES('British Airways','2015-01-22','2019-03-02',2,4),
('Virgin Australia','2010-01-24','2019-03-02',3,2),
('SITA','1997-02-12','2019-03-02',4,1),
('DROOM','2015-02-21','2018-11-30',1,3)


CREATE TABLE Employee(
 empId serial PRIMARY KEY,
 firstName VARCHAR (50),
  lastName VARCHAR (50),
 gender VARCHAR (50)
);


select * from Employee

insert into Employee values (1,'Neeti','Malhotra','F')

insert into Employee values (?,?,?,?);




