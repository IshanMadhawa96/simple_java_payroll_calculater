Create database JAVAHNDCOM8043
use JAVAHNDCOM8043
create table logininfo 
(
UserID char(10),
FristName char(25),
LastName char(25),
UserType char(10),
Email    char(40),
UserPassword char(5),
gender char(10),
Adress char(50),
Phone_Number int,
Registerdate date,
constraint Userid primary key (Userid)
)
INSERT INTO logininfo VALUES('USE001','Ishan','Madhawa','Admin','ishanmadhawa44@gmail.com','A1234','Male','Matugama',0717613775,'2018-04-16')
INSERT INTO logininfo VALUES('USE002','Pavani','Nisansala','User','ishpvi44@gmail.com','U1234','Female','Mahagama',0717613775,'2018-04-16')
INSERT INTO logininfo VALUES('USE003','Oshan','Pamudya','Accountant','ishanmadhawa44@gmail.com','12345','Male','Matugama',0717613775,'2018-04-16')
Create table loginhistory
(
loginid char(10),
Usertype char(10),
username char(25),
logindate date,
constraint loginid primary key (loginid)
)
insert into loginhistory values ('LOG001','Admin','Ishan','2018-04-19')
 
 
 create table xyzorganization
 (
 regno char(40),
 companyname char(30),
 phonenuber int,
 Location char(20),
 Email char(25),
 constraint  regno primary key ( regno)
 )

 insert into xyzorganization values ('COM46ABCCDD2018','XYZOrganization','0345648090','Kaluthara','XYZOrganization@gmail.com')


Create Table Department
(
Department_id char (10),
Department_Name Char (10),
regno char(40),
constraint Department_id_pk Primary key (Department_id),
foreign key (regno) references xyzorganization (regno)
)
INSERT INTO Department VALUES('D01','IT','COM46ABCCDD2018')
INSERT INTO Department VALUES('D02','HR','COM46ABCCDD2018')
INSERT INTO Department VALUES('D03','Marcketing','COM46ABCCDD2018')
INSERT INTO Department VALUES('D04','Accounting','COM46ABCCDD2018')
create table Employee
(
Employee_Id char(10),
EPF_Number char(10),
Frist_Name char(25),
Last_name char(25),
DOB date,
Adress char(50),
Phone_Number int,
NIC_Number char (10),
gender char(10),
Bankname char(35),
Account_Number char(15),
Jobtitle char(10),
Salary_Type char(15),
Basic_Salary MONEY,
addedDate date,
Email char(40),
DepartmentName char(10),
Department_id char (10),
constraint Employee_Id_pk  Primary key (Employee_Id ),
constraint Department_id_fk foreign key (Department_id) references Department (Department_id)
)
INSERT INTO Employee VALUES('E001','EPF001','savani','Nisansala','2000-12-26','Demodara',717364692,'92428280v','Fe-Male','BOC','ISH0012','Manager','Monthly',75000,'2018-03-24','ishanmadhawa44@gmail.com','Accounting','D04')

select * from Employee

select  *  from Employee
create table Salarycalculation
(
PaysheetID char(20),
EPF_Number char(10),
Frist_Name char(25),
Last_name char(25),
Email char(40),
AccountNumber char(15),
ReleseDate varchar(20),
BasicSalary money,
SfiftAllowance money,
AttendenceBones money,
ProIncentive money,
OT money,
TotalEraning money,
EPFEmployee money,
Tax money,
FeAdvInst money,
TotalDeducations money,
NetSalary money,
EPFEmployer money,
ETFEmployer money,
OTRate float,
OTHoures float,
StampDuty money,
Salary_Type char(15),
Jobtitle char(10),
DepartmentName char(10),
Employee_Id char(10),
Department_id char (10),
constraint PaysheetID_pk  Primary key (PaysheetID),
constraint Employee_Id_fk foreign key (Employee_Id) references Employee (Employee_Id),
 foreign key (Department_id) references Department (Department_id)
)
insert into Salarycalculation values ('PAY001','EPF000','Test','User','testUser@gmail.com','00000','April/2018',0000,0000,0000,0000,0000,0000,0000,0000,0000,0000,0000,0000,0000,0000,0000,0000,'Monthly','Manager','IT','E001','D01')
select Frist_Name,Last_name from Salarycalculation group by Last_name,Frist_Name  having count(*)>1
--select * from Salarycalculation where tax,OT