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

select dv.ma_dich_vu,dv.ten_dich_vu,dv.dien_tich,dv.chi_phi_thue,ldv.ten_loai_dich_vu,hd.ngay_lam_hop_dong
from dich_vu as dv
join loai_dich_vu as ldv on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
join hop_dong as hd on dv.ma_dich_vu = hd.ma_dich_vu

;


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

SELECT DISTINCT
    ho_ten
FROM
    khach_hang; 
    
    -- cách 3 - 
SELECT 
    ho_ten
FROM
    khach_hang 
UNION 
SELECT 
    ho_ten
FROM
    khach_hang; 

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
        AND (kh.dia_chi LIKE '%Vinh%'
        OR kh.dia_chi LIKE '%Quảng Ngãi%');
        
-- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu,
--  so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), tien_dat_coc của tất cả các dịch vụ đã từng được 
-- khách hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021. -> hdct

select 
    hd.ma_hop_dong,
    nv.ho_ten,
    kh.ho_ten,
    kh.so_dien_thoai,
    dv.ten_dich_vu,
    SUM(IFNULL(hdct.so_luong, 0)) AS 'SL'
from
    hop_dong hd
        join
    nhan_vien nv on hd.ma_nhan_vien = nv.ma_nhan_vien
        join
    khach_hang kh on hd.ma_khach_hang = kh.ma_khach_hang
        join
    dich_vu dv ON hd.ma_dich_vu = dv.ma_dich_vu
        left join
    hop_dong_chi_tiet hdct on hd.ma_hop_dong = hdct.ma_hop_dong
where
    month(hd.ngay_lam_hop_dong) between 10 AND 12
        AND YEAR(hd.ngay_lam_hop_dong) = 2020
        AND MONTH(hd.ngay_lam_hop_dong) NOT IN (SELECT 
            hd.ma_dich_vu
        FROM
            hop_dong hd
        WHERE
            MONTH(hd.ngay_lam_hop_dong) BETWEEN 1 AND 6
                AND YEAR(hd.ngay_lam_hop_dong) = 2021)
GROUP BY hd.ma_hop_dong;

-- 13	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
--  (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

select 
    dvk.ten_dich_vu_di_kem,
    hdc.ma_dich_vu_di_kem,
    SUM(hdc.so_luong) as so_luong_su_dung
from dich_vu_di_kem    dvk
join hop_dong_chi_tiet hdc on dvk.ma_dich_vu_di_kem = hdc.ma_dich_vu_di_kem
group by hdc.ma_dich_vu_di_kem
having SUM(hdc.so_luong) in (
		select MAX(count_dvdk.sl)
		from
			(select 
				ma_dich_vu_di_kem, 
                SUM(so_luong) as sl
			 from hop_dong_chi_tiet
			 group by ma_dich_vu_di_kem) as count_dvdk);

 -- cau 14:  	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
--  Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem).
SELECT dich_vu_di_kem.ma_dich_vu_di_kem, dich_vu_di_kem.ten_dich_vu_di_kem, sum(hop_dong_chi_tiet.so_luong) AS so_lan_su_dung
FROM hop_dong_chi_tiet 
JOIN dich_vu_di_kem  ON  hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
GROUP BY dich_vu_di_kem.ma_dich_vu_di_kem, dich_vu_di_kem.ten_dich_vu_di_kem
HAVING  sum(hop_dong_chi_tiet.so_luong) = (
  SELECT MAX(so_lan_su_dung)
  FROM (
    SELECT sum(hop_dong_chi_tiet.so_luong)AS so_lan_su_dung
    FROM hop_dong_chi_tiet
    GROUP BY ma_dich_vu_di_kem
  ) AS temp
);
-- 15.	Hiển thi thông tin của tất cả 
-- nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.
SELECT 
    nv.ma_nhan_vien,
    nv.ho_ten,
    nv.so_dien_thoai,
    nv.dia_chi,
    hd.ngay_lam_hop_dong
FROM
    nhan_vien AS nv
        JOIN
    hop_dong AS hd ON nv.ma_nhan_vien = hd.ma_nhan_vien
GROUP BY nv.ma_nhan_vien
HAVING COUNT(ma_hop_dong) <= 3
    AND (hd.ngay_lam_hop_dong BETWEEN '2020-01-01' AND '2021-12-31');
    
    -- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021. 
DELETE FROM nhan_vien
WHERE nhan_vien.ma_nhan_vien NOT IN (select * from
    (SELECT nhan_vien.ma_nhan_vien
    FROM nhan_vien
    LEFT JOIN hop_dong ON nhan_vien.ma_nhan_vien = hop_dong.ma_nhan_vien
    WHERE YEAR(hop_dong.ngay_lam_hop_dong) IN (2019,2020,2021)) as temp
);
-- 17. Cập nhật thông tin những khách hàng có ten_loai_khach 
-- từ Platinum lên Diamond, chỉ cập nhật những khách hàng 
-- đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ. 


-- 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).

	delete khach_hang.ma_khach_hang,khach_hang.ho_ten,hop_dong.ma_khach_hang
	from hop_dong
	join khach_hang on hop_dong.ma_khach_hang =  khach_hang.ma_khach_hang
	where year(hop_dong.ngay_lam_hop_dong) <= 2020;
    
-- 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.

    select dich_vu_di_kem.ma_dich_vu_di_kem,dich_vu_di_kem.ten_dich_vu_di_kem
    from dich_vu_di_kem
	join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
    join hop_dong on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
    where year(hop_dong.ngay_lam_hop_dong) <= 2020 and hop_dong_chi_tiet.so_luong >= 10;
    
    set sql_safe_updates = 0;
    update dich_vu_di_kem
    set gia = gia * 2 
    where ma_dich_vu_di_kem in ( select ma_dich_vu_di_kem 
    from hop_dong_chi_tiet hdct
    join hop_dong hd on hdct.ma_hop_dong = hd.ma_hop_dong
    where hdct.so_luong >= 10 and year(hd.ngay_lam_hop_dong) <= 2020
    group by ma_dich_vu_di_kem
    );
    
    -- 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, 
    -- thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi. 
    
    SELECT
		nv.ma_nhan_vien,
        nv.ho_ten,nv.email,
        nv.so_dien_thoai,
        nv.ngay_sinh,
        nv.dia_chi
    FROM nhan_vien AS nv
UNION ALL
    SELECT
		kh.ma_khach_hang,
        kh.ho_ten,kh.email,
        kh.so_dien_thoai,
        kh.ngay_sinh,
        kh.dia_chi
    FROM khach_hang AS kh;
    
--  21.	Tạo khung nhìn có tên là v_nhan_vien để lấy được thông tin của
--  tất cả các nhân viên có địa chỉ là “Hải Châu” và đã từng lập hợp đồng cho một hoặc nhiều khách hàng bất kì với ngày lập hợp đồng là “12/12/2019”.

create view v_nhan_vien as
select nhan_vien.*
from nhan_vien
join hop_dong on nhan_vien.ma_nhan_vien = hop_dong.ma_nhan_vien
where nhan_vien.dia_chi like '% Hải Châu' and hop_dong.ngay_lam_hop_dong = '2019-12-12';
 


select *
from v_nhan_vien;

-- 22.	Thông qua khung nhìn v_nhan_vien thực hiện cập nhật địa chỉ thành “Liên Chiểu” đối 
-- với tất cả các nhân viên được nhìn thấy bởi khung nhìn này.

update v_nhan_vien
set dia_chi = 'Liên Chiểu'
where dia_chi like '%Yên Bái%';

-- 23.	Tạo Stored Procedure sp_xoa_khach_hang dùng để xóa thông tin của một khách hàng 
-- nào đó với ma_khach_hang được truyền vào như là 1 tham số của sp_xoa_khach_hang. 

delimiter //
create procedure sp_xoa_khach_hang (ma_khach_hang int)
begin
	delete from khach_hang
    where khach_hang.ma_khach_hang = ma_khach_hang;
end //
delimiter ;


-- 24.	Tạo Stored Procedure sp_them_moi_hop_dong dùng để thêm mới vào bảng hop_dong với yêu cầu sp_them_moi_hop_dong phải thực 
-- hiện kiểm tra tính hợp lệ của dữ liệu bổ sung, với nguyên tắc không được trùng khóa chính và đảm bảo toàn vẹn tham chiếu đến các bảng liên quan.

 