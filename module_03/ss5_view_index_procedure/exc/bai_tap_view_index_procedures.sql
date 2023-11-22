-- buoc 1 - tao db 
 
CREATE DATABASE demo;
USE demo;

-- buoc 2 - tao bang  va them du lieu

CREATE TABLE products (
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    product_code VARCHAR(20),
    product_name VARCHAR(20),
    product_price DOUBLE,
    product_amount INT,
    product_description VARCHAR(20),
    product_status VARCHAR(10)
);
 
INSERT INTO products(product_Code,product_name,product_price,product_amount,product_description,product_status)
VALUES('01','táo vàng',350000,1,'limited','còn hàng'),
		('02','chanh',5000,5,'tươi','còn hàng'),
		('03','bánh canh ruộng',55000,8,'ngon','hết hàng');
        
-- buoc 3 - Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)

CREATE UNIQUE INDEX idx_product_code ON products(product_code);

-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)

CREATE INDEX idx_product_name_and_product_price ON products(product_name,product_price);

-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
 
 EXPLAIN SELECT *
 FROM products
 WHERE product_code = '01';
 
 EXPLAIN SELECT *
 FROM products
 WHERE product_name = 'chanh' and product_price = 5000;
 
 DROP INDEX 
	idx_product_name_and_product_price ON products;
    
 DROP INDEX 
	idx_product_code ON products;
 
 -- So sánh câu truy vấn trước và sau khi tạo index, 
 -- trước khi tạo index posible_keys,key,key_len,ref = null,type = all
 -- sau khi tạo index posible_keys,key,key_len,ref có giá trị, type = const
 
 -- buoc 4 - Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products

 CREATE VIEW product_info AS
    SELECT 
        product_code,
        product_name, 
        product_price,
        product_status
    FROM
        products;
 
 -- Tiến hành sửa đổi view 
 
 ALTER VIEW product_info AS
 SELECT 
	product_code,
    product_name,
    product_status
 FROM
	products;
 
 -- xoá view 
 
DROP VIEW product_info;
 
 -- buoc 5 - Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
 
DELIMITER //
CREATE PROCEDURE get_all_products()
BEGIN
  SELECT * FROM products;
END //
DELIMITER ;

CALL get_all_products();

-- Tạo store procedure thêm một sản phẩm mới

DELIMITER //
CREATE PROCEDURE add_product(
		p_product_code VARCHAR(20),
		p_product_name VARCHAR(20),
		p_product_price DOUBLE,
		p_product_status VARCHAR(10))
BEGIN 
	INSERT INTO products(product_code,product_name,product_price,product_status)
	VALUE (p_product_code,p_product_name,p_product_price,p_product_status);
END //
DELIMITER ;

CALL add_product('04','samsung',2300,'new');

-- Tạo store procedure sửa thông tin sản phẩm theo id 

DELIMITER //
CREATE PROCEDURE update_product( 
		p_id INT,
		p_product_code VARCHAR(20),
		p_product_name VARCHAR(20),
		p_product_price DOUBLE,
		p_product_status VARCHAR(10)
)
BEGIN 
	UPDATE products
    SET product_code = p_product_code,
		product_name = p_product_name,
        product_price = p_product_price,
        product_status = p_product_status
	WHERE products.id = p_id;
END //
DELIMITER ;

CALL update_product(6,'05','ss',390000,'cháy hàng');

-- Tạo store procedure xoá sản phẩm theo id

DELIMITER //
CREATE PROCEDURE delete_product(p_id INT)
BEGIN 
        DELETE FROM products
        WHERE products.id = p_id;
END //
DELIMITER ;

CALL delete_product(6)