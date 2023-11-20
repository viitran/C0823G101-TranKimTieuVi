USE stundet_management;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.

SELECT 
    *
FROM
    `subject` s
WHERE
    s.credit IN (SELECT 
            MAX(credit)
        FROM
            `subject`);
            
-- Hiển thị các thông tin môn học có điểm thi lớn nhất.

SELECT 
    sub.*
FROM
    `subject` sub 
        JOIN
    mark m ON sub.sub_id = m.sub_id
WHERE
    m.mark IN (SELECT 
            MAX(mark.mark)
        FROM
            mark);

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần

SELECT 
    s.*, AVG(m.mark) AS 'điểm trung bình'
FROM
    student s
        JOIN
    mark m ON s.student_id = m.student_id
GROUP BY student_id
ORDER BY AVG(m.mark) DESC;