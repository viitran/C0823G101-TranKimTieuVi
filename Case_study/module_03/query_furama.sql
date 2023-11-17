-- Câu 2 :	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
SELECT 
    *
FROM
    nhan_vien nv
WHERE

		substring_index(nv.ho_ten," ",1) LIKE "H%" 
			OR substring_index(nv.ho_ten," ",1) LIKE "T%"
				OR substring_index(nv.ho_ten," ",1) LIKE "K%"
					AND char_length(nv.ho_ten)<=15 ;
        
-- Câu 3 : 	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
SELECT 
    *
FROM
    khach_hang
WHERE
    (DATEDIFF(NOW(), ngay_sinh) > 18 * 365
        AND DATEDIFF(NOW(), ngay_sinh) < 50 * 365)
        AND (dia_chi LIKE '%Đà Nẵng%'
        OR dia_chi LIKE '%Quảng Trị%');
-- datediff trả tổng số ngày

-- câu 4 : 	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp 
-- tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”. 

SELECT 
    khach_hang.ma_khach_hang,
    khach_hang.ho_ten,
    COUNT(hop_dong.ma_khach_hang) AS so_lan_dat_phong
FROM
    khach_hang
        JOIN
    hop_dong ON khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
WHERE
    khach_hang.ma_loai_khach = 1
GROUP BY hop_dong.ma_khach_hang
ORDER BY so_lan_dat_phong;
