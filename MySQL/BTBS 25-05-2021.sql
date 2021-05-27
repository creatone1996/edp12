DROP DATABASE IF EXISTS NHANVIEN_IT;
CREATE DATABASE NHANVIEN_IT;
USE NHANVIEN_IT;

DROP TABLE IF EXISTS Department;
CREATE TABLE Department (
Department_Number MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Department_Name   VARCHAR(50) UNIQUE KEY
);

DROP TABLE IF EXISTS Employee_Table;
CREATE TABLE Employee_Table (
Employee_Number MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Employee_Name   VARCHAR(50) UNIQUE KEY,
Department_Number MEDIUMINT UNSIGNED,
FOREIGN KEY (Department_Number) REFERENCES Department(Department_Number)
);

DROP TABLE IF EXISTS Skill_Table;
CREATE TABLE Skill_Table(
Skill_Number MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
Skill_Name 	NVARCHAR(50) NOT NULL UNIQUE KEY
);

DROP TABLE IF EXISTS Employee_Skill_Table;
CREATE TABLE Employee_Skill_Table (
Employee_Number MEDIUMINT UNSIGNED,
Skill_Number 	MEDIUMINT UNSIGNED,
Date_Registered	DATE,
FOREIGN KEY (Employee_Number) REFERENCES Employee_Table(Employee_Number),
FOREIGN KEY (Skill_Number) REFERENCES Skill_Table (Skill_Number)
);



INSERT INTO Department (Department_Name)
VALUES ('GIAM DOC'),
('KE TOAN'),
('MKT'),
('TEST'),
('SALE');

INSERT INTO Employee_Table (Employee_Name,Department_Number)
VALUES ('NGUYEN VAN A', 1 ),
('TRAN VAN QUANG', 2 ),
('NGUYEN TRAN TRUNG QUAN', 3 ),
('PHUNG DUC HOA', 4 ),
('NGUYEN THI DINH', 5 ),
('TRAN SON', 3 ),
('PHAM VAN LAM', 3 ),
('NGUYEN DUY MANH', 4 ),
('NGUYEN VAN HOANG', 3 ),
('DO HUNG DUNG', 4 );

INSERT INTO Skill_Table (Skill_Name)
VALUES ('java' ),
('SQL' ),
('Postman' ),
('Ruby' ),
('Python' ),
('PHP' ),
('ADO.NET' ),
('C Sharp' );

INSERT INTO Employee_Skill_Table (Employee_Number,Skill_Number,Date_Registered)
VALUES (1,3,'2021-04-12'),
(1,5,'2021-04-12'),
(1,1,'2021-04-12'),
(1,7,'2021-04-12'),
(2,5,'2021-02-14'),
(2,6,'2021-02-14'),
(2,7,'2021-02-14'),
(3,1,'2021-03-21'),
(3,3,'2021-03-21'),
(3,5,'2021-03-21'),
(3,7,'2021-03-21'),
(4,1,'2021-01-21'),
(4,5,'2021-01-21'),
(5,6,'2021-03-01'),
(5,7,'2021-03-01'),
(5,2,'2021-03-01'),
(6,7,'2021-04-19'),
(6,8,'2021-04-19'),
(6,3,'2021-04-19'),
(7,2,'2021-02-02'),
(7,8,'2021-02-02'),
(8,7,'2021-01-27'),
(8,5,'2021-01-27'),
(8,1,'2021-01-27'),
(9,2,'2021-01-06'),
(9,4,'2021-01-06'),
(10,4,'2021-01-09'),
(10,5,'2021-01-09'),
(10,6,'2021-01-09');

-- cau 3
SELECT * FROM ((Employee_Skill_Table AS A
JOIN Skill_Table AS B ON A.Skill_Number = B.Skill_Number)
JOIN Employee_Table AS C ON A.Employee_Number = C.Employee_Number)
WHERE Skill_Name = 'JAVA';

-- CAU 4
SELECT B.Department_Name , COUNT(B.Department_Number) FROM Employee_Table AS A
JOIN Department AS B ON A.Department_Number = B.Department_Number
GROUP BY B.Department_Number HAVING COUNT(B.Department_Number) >3;

-- cau 5
SELECT B.Department_Name, A.Employee_Name FROM Employee_Table AS A
JOIN Department AS B ON A.Department_Number = B.Department_Number
ORDER BY B.Department_Name;

-- CAU 6
SELECT B.Employee_Name, COUNT(A.Employee_Number) as SL_skill FROM Employee_Skill_Table AS A
JOIN Employee_Table AS B ON A.Employee_Number = B.Employee_Number
GROUP BY A.Employee_Number HAVING COUNT(A.Employee_Number) >1;




