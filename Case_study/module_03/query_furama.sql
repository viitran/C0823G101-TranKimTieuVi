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

-- 5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien 
-- (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) 
-- cho tất cả các khách hàng đã từng đặt phòng. (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra). 
select khach_hang.ma_khach_hang,khach_hang.ho_ten,loai_khach.ten_loai_khach,sum(dich_vu.chi_phi_thue +(dich_vu_di_kem.gia * hop_dong_chi_tiet.so_luong)) as 'tổng tiền' 
from loai_khach
left join khach_hang on khach_hang.ma_khach_hang = loai_khach.ma_loai_khach
left join hop_dong on khach_hang.ma_khach_hang = hop_dong.ma_hop_dong
left join hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
left join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
left join dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_loai_dich_vu
order by khach_hang.ma_khach_hang

