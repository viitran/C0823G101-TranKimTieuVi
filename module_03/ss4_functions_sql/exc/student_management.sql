CREATE DATABASE student_management;
USE student_management;

CREATE TABLE class (
    class_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    class_name VARCHAR(60) NOT NULL,
    start_date DATETIME NOT NULL,
    status_class BIT
);

INSERT INTO class(class_name,start_date,status_class)
VALUES ("A1","2008-12-20",1),
("A2","2008-12-22",1),
("B3",current_date(),0);

CREATE TABLE student (
    student_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    student_name VARCHAR(30) NOT NULL,
    student_address VARCHAR(50),
    student_phone VARCHAR(20),
    status_student BIT,
    class_id INT NOT NULL,
    FOREIGN KEY (class_id)
        REFERENCES class (class_id)
);

INSERT INTO student(student_name,student_address,student_phone,status_student,class_id)
VALUES("Hung","Ha Noi","0912113113",1,1),
("Hoa","Hai Phong","",1,1),
("Manh","HCM","0123123123",0,2);

CREATE TABLE `subject` (
    sub_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    sub_name VARCHAR(30) NOT NULL,
    credit TINYINT NOT NULL DEFAULT 1 CHECK (credit >= 1),
    status_sub BIT DEFAULT 1
);

INSERT INTO `subject`(sub_name,credit,status_sub)
VALUES("CF",5,1),
("C",6,1),
("HDJ",5,1),
("RDBMS",10,1);

CREATE TABLE mark (
    mark_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    sub_id INT NOT NULL,
    student_id INT NOT NULL,
    UNIQUE (sub_id , student_id),
    mark FLOAT DEFAULT 0 CHECK (mark BETWEEN 0 AND 100),
    exam_times TINYINT DEFAULT 1
);

INSERT INTO mark(sub_id,student_id,mark,exam_times)
VALUES(1,1,8,1),
(1,2,10,2),
(2,1,12,1);

CREATE TABLE subject_transcript (
    student_name VARCHAR(30) NOT NULL,
    sub_name VARCHAR(30) NOT NULL,
    mark FLOAT DEFAULT 0 CHECK (mark BETWEEN 0 AND 100),
    mark_id INT NOT NULL,
    student_id INT NOT NULL,
    sub_id INT NOT NULL,
    PRIMARY KEY (mark_id , student_id , sub_id),
    FOREIGN KEY (mark_id)
        REFERENCES mark (mark_id),
    FOREIGN KEY (student_id)
        REFERENCES student (student_id),
    FOREIGN KEY (sub_id)
        REFERENCES `subject` (sub_id)
);

INSERT INTO subject_transcript(student_name,sub_name,mark,mark_id,student_id,sub_id)
VALUES("Hung","CF",8,1,1,1),
("Hoa","CF",10,2,2,1),
("Hung","C",12,3,1,2);