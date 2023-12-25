create database bai_tap_them_m3;
use bai_tap_them_m3;

create table loai_hang_hoa(
	id int not null primary key auto_increment,
    ten_loai_hang_hoa varchar(255)
);

insert into loai_hang_hoa(ten_loai_hang_hoa)
values("Quả"),
("Rau"),
("Củ");


create table hang_hoa(
	id int not null primary key auto_increment,
    ma_hang_hoa varchar(255) not null,
    ten_hang_hoa varchar(255) not null,
    don_vi varchar(255) not null,
    gia double not null,
    id_loai_hang_hoa int not null,
    foreign key (id_loai_hang_hoa) references loai_hang_hoa(id),
    ngay_thu_hoach date,
    is_delete bit(1) default 0
);

insert into hang_hoa(ma_hang_hoa,ten_hang_hoa,don_vi,gia,id_loai_hang_hoa,ngay_thu_hoach)
values("NHH-0001","Cà chua","kg",20000,"1","2023-12-14"),
("NHH-0002","Rau muống","Bó",10000,"2","2023-12-14"),
("NHH-0003","Tỏi","kg",20000,"3","2023-12-14");

delimiter //
create procedure quan_ly()
begin
select hh.id, hh.ma_hang_hoa,hh.ten_hang_hoa,hh.don_vi,hh.gia,lhh.ten_loai_hang_hoa,hh.ngay_thu_hoach,hh.is_delete
from hang_hoa hh
join loai_hang_hoa lhh on hh.id_loai_hang_hoa = lhh.id
where hh.is_delete = 0;
end //
delimiter ;

call quan_ly();

delimiter //

