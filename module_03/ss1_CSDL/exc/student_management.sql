create database student_management;
CREATE TABLE class (
    class_id INT PRIMARY KEY AUTO_INCREMENT,
    class_name VARCHAR(50)
);
SELECT 
    *
FROM
    class;
insert into class(class_name)
values ("C0823G1-JV101"),
("C0423G1-JV101");
CREATE TABLE teacher (
    teacher_id INT PRIMARY KEY AUTO_INCREMENT,
    teacher_name VARCHAR(50),
    teacher_age INT,
    country VARCHAR(50)
);
insert into teacher(teacher_name,teacher_age,country)
values ("CongNT",29,"Đà Nẵng");
SELECT 
    *
FROM
    teacher;