DROP TABLE IF Exists Student;
DROP TABLE IF Exists Teacher;
DROP TABLE IF Exists Address;

Create table Address (
   add_id int NOT NULL AUTO_INCREMENT,
   pincode int NOT NULL,
   street VARCHAR(100) ,
   PRIMARY KEY ( add_id )
);

Create table Teacher (
   tech_id int NOT NULL AUTO_INCREMENT,
   tech_name VARCHAR(100) NOT NULL,
   gender VARCHAR(15) NOT NULL,
   age int ,
   add_id int,
   PRIMARY KEY ( tech_id ),
   FOREIGN KEY (add_id) REFERENCES Address(add_id)
);

Create table Student (
   std_id int NOT NULL AUTO_INCREMENT,
   std_name VARCHAR(100) NOT NULL,
   gender VARCHAR(10),
   age int ,
   std_roll_num int ,
   enroll_dt DATE,
   tech_id int ,
   add_id int,
   PRIMARY KEY ( std_id ),
   FOREIGN KEY (tech_id) REFERENCES Teacher(tech_id),
   FOREIGN KEY (add_id) REFERENCES Address(add_id)
);
Insert into Address(pincode,street) values
(110112,'address1'),
(110112,'address2'),
(110112,'address3'),
(110112,'address4');

Insert into Teacher(tech_name,gender,age,add_id) values
('T1','Male',29,2),
('T2','Female',24,2),
('T3','Transgender',32,4),
('T4','Male',25,1);

Insert into Student(std_name,std_roll_num,enroll_dt,age,gender,add_id,tech_id) values
('S1',1,now(),8,'Male',4,1),
('S2',2,now(),9,'Male',2,3),
('S3',3,now(),8,'Female',2,2),
('S4',4,now(),10,'Female',1,1);



