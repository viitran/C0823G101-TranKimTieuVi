CREATE DATABASE covert_erd_to_relational_model;
USE covert_erd_to_relational_model;

CREATE TABLE nha_cung_cap (
    id VARCHAR(20) PRIMARY KEY,
    `name` VARCHAR(50),
    dia_chi VARCHAR(30)
);

CREATE TABLE so_dien_thoai (
    id INT PRIMARY KEY,
    phone VARCHAR(20),
    nha_cung_cap_id VARCHAR(20),
    FOREIGN KEY (nha_cung_cap_id)
        REFERENCES nha_cung_cap (id)
);

CREATE TABLE don_dat_hang (
    so_don_hang INT PRIMARY KEY,
    ngay_dat_hang DATETIME,
    nha_cung_cap_id VARCHAR(20),
    FOREIGN KEY (nha_cung_cap_id)
        REFERENCES nha_cung_cap (id)
);

CREATE TABLE phieu_xuat (
    so_phieu_xuat INT PRIMARY KEY,
    ngay_xuat DATETIME
);

CREATE TABLE vat_tu (
    id VARCHAR(10) PRIMARY KEY,
    `name` VARCHAR(20)
);

CREATE TABLE phieu_nhap (
    so_phieu_nhap INT PRIMARY KEY,
    ngay_nhap DATETIME
);

CREATE TABLE chi_tiet_don_dat_hang (
    vat_tu_id VARCHAR(10),
    so_don_hang INT,
    PRIMARY KEY (vat_tu_id , so_don_hang),
    FOREIGN KEY (vat_tu_id)
        REFERENCES vat_tu (id),
    FOREIGN KEY (so_don_hang)
        REFERENCES don_dat_hang (so_don_hang)
);

CREATE TABLE chi_tiet_phieu_nhap (
    don_gia_nhap VARCHAR(10),
    so_luong_nhap VARCHAR(30),
    vat_tu_id VARCHAR(10),
    so_phieu_nhap INT,
    PRIMARY KEY (vat_tu_id , so_phieu_nhap),
    FOREIGN KEY (vat_tu_id)
        REFERENCES vat_tu (id),
    FOREIGN KEY (so_phieu_nhap)
        REFERENCES phieu_nhap (so_phieu_nhap)
);

CREATE TABLE chi_tiet_phieu_xuat (
    don_gia_xuat VARCHAR(10),
    so_luong_xuat VARCHAR(30),
    so_phieu_xuat INT,
    vat_tu_id VARCHAR(10),
    PRIMARY KEY (so_phieu_xuat , vat_tu_id),
    FOREIGN KEY (so_phieu_xuat)
        REFERENCES phieu_xuat (so_phieu_xuat),
    FOREIGN KEY (vat_tu_id)
        REFERENCES vat_tu (id)
);


