create database student_database_management;
CREATE TABLE class (
    class_id int,
    `name` VARCHAR(50)
);
CREATE TABLE teacher (
    id INT,
    `name` VARCHAR(50),
    age INT,
    country VARCHAR(50)
);
drop table student;
CREATE TABLE student (
    id INT primary key auto_increment,
    `name` VARCHAR(50),
    age INT,
    gender BIT
);
insert into student(`name`,age,gender)
values("Latt",14,0),
	("N.Bảo",22,1),
	("V.Độ",21,1);
select * from student;

