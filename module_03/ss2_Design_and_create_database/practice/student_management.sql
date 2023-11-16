create database student_management;
use student_management;
CREATE TABLE class (
    class_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    class_name VARCHAR(60) NOT NULL,
    start_date DATETIME NOT NULL,
    status_class BIT
);
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
CREATE TABLE `subject` (
    sub_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    sub_name VARCHAR(30) NOT NULL,
    credit TINYINT NOT NULL DEFAULT 1 CHECK (credit >= 1),
    status_sub BIT DEFAULT 1
);
CREATE TABLE mark (
    mark_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    sub_id INT NOT NULL,
    student_id INT NOT NULL,
    UNIQUE (sub_id , student_id),
    mark FLOAT DEFAULT 0 CHECK (mark BETWEEN 0 AND 100),
    exam_times TINYINT DEFAULT 1
);