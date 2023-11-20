USE student_management;

-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’

SELECT 
    *
FROM
    student
WHERE
    student_name LIKE 'h%';
    
-- hiển thị tất cả các thông tin lớp học có thời gian bắt đầu vào tháng 12.

SELECT 
    *
FROM
    class
WHERE
    MONTH(start_date) = 12;

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.

SELECT 
    *
FROM
    `subject`
WHERE
    credit >= 3 AND credit <= 5;
 
-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.

SET sql_safe_updates = 0;

UPDATE student 
SET 
    student.class_id = 2
WHERE
    student_name = 'Hung';

SET sql_safe_updates = 1;

SELECT 
    *
FROM
    student;

-- Hiển thị các thông tin: StudentName, SubName, Mark
--  Dữ liệu sắp xếp theo điểm thi (mark) giảm dần nếu trùng sắp theo tên tăng dần

SELECT 
    subtr.student_id,
    subtr.student_name,
    subtr.sub_name,
    subtr.mark
FROM
    subject_transcript subtr
ORDER BY subtr.mark DESC , subtr.student_name ASC;
