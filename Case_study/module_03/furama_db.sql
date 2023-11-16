create database case_study_furama;
use case_study_furama;

CREATE TABLE trinh_do (
    ma INT PRIMARY KEY,
    ten_bang_cap VARCHAR(30)
);

CREATE TABLE vi_tri (
    ma INT PRIMARY KEY,
    ten_vi_tri VARCHAR(30)
);

CREATE TABLE bo_phan_lam_viec (
    ma INT PRIMARY KEY,
    ten_bo_phan VARCHAR(30)
);

create table loai_khach(
	ma int primary key,
    ten_loai_khach varchar(30)
);

CREATE TABLE nhan_vien (
    ma VARCHAR(20) primary key,
    `name` VARCHAR(50),
    birthday DATE,
    identify VARCHAR(20),
    phone_number INT(20),
    email VARCHAR(30),
    trinh_do_ma INT,
    vi_tri_ma INT,
    bo_phan_lam_viec_ma INT,
    FOREIGN KEY (trinh_do_ma)
        REFERENCES trinh_do (ma),
    FOREIGN KEY (vi_tri_ma)
        REFERENCES vi_tri (ma),
    FOREIGN KEY (bo_phan_lam_viec_ma)
        REFERENCES bo_phan_lam_viec (ma)
);

create table khach_hang(
	ma varchar(30) primary key,
    `name` varchar(50),
    birthday date,
    gender varchar(5),
    identify varchar(20),
    phone_number int(20),
    email varchar(30),
    dia_chi varchar(30),
    loai_khach_ma int,
    foreign key(loai_khach_ma) references loai_khach (ma)
);

create table dich_vu(
	ma int primary key,
    ten_dich_vu varchar(30)
);

create table kieu_thue(
	ma int primary key,
    ten_kieu_thue varchar(30)
);

create table khu_nghi_duong(
 ma int primary key,
 dich_vu_ma int,
 dien_tich_su_dung double,
 so_luong_nguoi_toi_da int,
 kieu_thue_ma int,
 foreign key (kieu_thue_ma) references kieu_thue(ma),
 foreign key(dich_vu_ma) references dich_vu(ma)
);