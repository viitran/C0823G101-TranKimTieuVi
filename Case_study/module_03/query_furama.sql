-- Câu 2 :	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
SELECT 
    *
FROM
    nhan_vien nv
WHERE
    nv.ho_ten LIKE 'H%'
        OR nv.ho_ten LIKE 'T%'
        OR nv.ho_ten LIKE 'K%'
        AND CHAR_LENGTH(nv.ho_ten) <= 15;
        
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

-- câu 5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien 
-- (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) 
-- cho tất cả các khách hàng đã từng đặt phòng. (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra). 
SELECT 
    khach_hang.ma_khach_hang,
    khach_hang.ho_ten,
    loai_khach.ten_loai_khach,
    SUM(dich_vu.chi_phi_thue + (dich_vu_di_kem.gia * hop_dong_chi_tiet.so_luong)) AS 'tổng tiền'
FROM
    loai_khach
        LEFT JOIN
    khach_hang ON khach_hang.ma_khach_hang = loai_khach.ma_loai_khach
        LEFT JOIN
    hop_dong ON khach_hang.ma_khach_hang = hop_dong.ma_hop_dong
        LEFT JOIN
    hop_dong_chi_tiet ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
        LEFT JOIN
    dich_vu_di_kem ON hop_dong_chi_tiet.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
        LEFT JOIN
    dich_vu ON hop_dong.ma_dich_vu = dich_vu.ma_loai_dich_vu
GROUP BY khach_hang.ma_khach_hang , hop_dong.ma_hop_dong;

-- câu 6: 	Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue
--  ten_loai_dich_vu của tất cả các loại dịch vụ chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).

SELECT 
    dich_vu.ma_dich_vu,
    dich_vu.ten_dich_vu,
    dich_vu.dien_tich,
    dich_vu.chi_phi_thue,
    loai_dich_vu.ten_loai_dich_vu
FROM
    dich_vu
        JOIN
    hop_dong ON dich_vu.ma_dich_vu = hop_dong.ma_hop_dong
        JOIN
    loai_dich_vu ON dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
WHERE
    hop_dong.ngay_lam_hop_dong > '2021-01-01';
    
-- câu 7: 	Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich
-- so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu của tất cả các loại dịch vụ đã 
-- từng được khách hàng đặt phòng trong năm 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021.
    
    SELECT 
    dich_vu.ma_dich_vu,
    dich_vu.ten_dich_vu,
    dich_vu.dien_tich,
    dich_vu.so_nguoi_toi_da,
    dich_vu.chi_phi_thue,
    dich_vu.ten_dich_vu
FROM
    dich_vu
        JOIN
    hop_dong ON dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
        JOIN
    loai_dich_vu ON dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
WHERE
    YEAR(hop_dong.ngay_lam_hop_dong) = 2020
        AND hop_dong.ma_dich_vu NOT IN (SELECT 
            hop_dong.ma_dich_vu
        FROM
            hop_dong
        WHERE
            YEAR(hop_dong.ngay_lam_hop_dong) = 2021)
GROUP BY dich_vu.ma_dich_vu;
    
-- --8.	Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên.

-- cách 1 

SELECT 
    khach_hang.ho_ten
FROM
    khach_hang
GROUP BY ho_ten;

-- cách 2

SELECT 
    ho_ten
FROM
    khach_hang; 
    
    -- cách 3 - chưa tìm ra  

--  9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có 
-- bao nhiêu khách hàng thực hiện đặt phòng.

SELECT 
    MONTH(hop_dong.ngay_lam_hop_dong) AS 'tháng',
    COUNT(khach_hang.ho_ten) AS 'số lượng khách hàng'
FROM
    hop_dong
        JOIN
    khach_hang ON hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
WHERE
    YEAR(hop_dong.ngay_lam_hop_dong) = 2021
GROUP BY MONTH(hop_dong.ngay_lam_hop_dong)
ORDER BY MONTH(hop_dong.ngay_lam_hop_dong);

-- 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm.
--  Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).

SELECT 
    hop_dong.ma_hop_dong,
    hop_dong.ngay_lam_hop_dong,
    hop_dong.ngay_ket_thuc,
    hop_dong.tien_dat_coc,
    SUM(IFNULL(hop_dong_chi_tiet.so_luong, 0)) AS 'số lượng dịch vụ đi kèm'
FROM
    hop_dong
		 LEFT JOIN
    hop_dong_chi_tiet ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
GROUP BY hop_dong.ma_hop_dong;

-- 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” và 
-- có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.

SELECT 
    dvdk.ma_dich_vu_di_kem, dvdk.ten_dich_vu_di_kem
FROM
    hop_dong_chi_tiet hdct
        JOIN
    dich_vu_di_kem dvdk ON hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
        JOIN
    hop_dong hd ON hdct.ma_hop_dong = hd.ma_hop_dong
        JOIN
    khach_hang kh ON hd.ma_khach_hang = kh.ma_khach_hang
        JOIN
    loai_khach lk ON kh.ma_loai_khach = lk.ma_loai_khach
WHERE
    lk.ten_loai_khach = 'Diamond'
        AND kh.dia_chi LIKE '%Vinh%'
        OR kh.dia_chi LIKE '%Quảng Ngãi%';
        
-- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu,
--  so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), tien_dat_coc của tất cả các dịch vụ đã từng được 
-- khách hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021. -> hdct

-- select hd.ma_hop_dong,nv.ho_ten as 'nv',kh.ho_ten as 'kh',kh.so_dien_thoai,dv.ten_dich_vu,sum(so_luong)
select hd.ma_hop_dong,nv.ho_ten as'nhan vien', kh.ho_ten as'khach hang',kh.so_dien_thoai,dv.ten_dich_vu,hd.tien_dat_coc
from hop_dong hd
join nhan_vien nv on hd.ma_nhan_vien = nv.ma_nhan_vien
join khach_hang kh on hd.ma_khach_hang = kh.ma_khach_hang
join dich_vu dv on hd.ma_dich_vu = dv.ma_dich_vu
join hop_dong_chi_tiet hdct on 
