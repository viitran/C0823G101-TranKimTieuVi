create database exam_point_management;
use exam_point_management;

create table student(
 student_code varchar(20) primary key,
 student_name varchar(50),
 student_birthday datetime,
 student_class varchar(20),
 student_gender varchar(20)
 );
 
   create table teacher(
 teacher_id varchar(20) primary key,
 teacher_name varchar(50),
 teacher_phone_number varchar(10)
 );
 
 create table `subject`(
 subject_code varchar(20) primary key,
 subject_name varchar(50),
 teacher_id varchar(20),
 foreign key(teacher_id) references teacher(teacher_id)
 );
 
 create table table_point(
 student_code varchar(20),
 subject_code varchar(50),
 point_exam int,
 `date` datetime,
 primary key(student_code,subject_code),
 foreign key(student_code) references student(student_code),
 foreign key(subject_code) references `subject`(subject_code)
 );
