CREATE DATABASE sales_management;
USE sales_management;

CREATE TABLE customer (
    id INT PRIMARY KEY,
    `name` VARCHAR(25) NOT NULL,
    age TINYINT NOT NULL
);

INSERT INTO customer(id,`name`,age)
	VALUES (1,"Minh Quan",10),
			(2,"Ngoc Oanh",20),
			(3,"Hong Ha",50);

CREATE TABLE `order` (
    id INT NOT NULL PRIMARY KEY,
    customer_id INT NOT NULL,
    `date` DATETIME,
    FOREIGN KEY (customer_id)
        REFERENCES customer (id)
);

INSERT INTO `order`(id,customer_id,`date`)
	VALUES (1,1,"2016-03-21"),
		(2,2,"2016-03-23"),
		(3,1,"2016-03-16");

CREATE TABLE product (
	id INT NOT NULL PRIMARY KEY,
    product_name VARCHAR(25) NOT NULL,
    price INT NOT NULL CHECK (price > 0)
);

INSERT INTO product(id,product_name,price)
	VALUES (1,"May Giat",3),
		(2,"Tu Lanh",5),
		(3,"Dieu Hoa",7),
		(4,"Quat",1),
		(5,"Bep Dien",2);
 
CREATE TABLE order_details (
    order_id INT NOT NULL,
    product_id INT NOT NULL,
    quantity INT NOT NULL DEFAULT 1,
    PRIMARY KEY (order_id , product_id),
    FOREIGN KEY (order_id)
        REFERENCES `order` (id),
    FOREIGN KEY (product_id)
        REFERENCES product (id)
);

INSERT INTO order_details(order_id,product_id,quantity)
	VALUES (1,1,3),
		(1,3,7),
		(1,4,2),
		(2,1,1),
		(3,1,8),
		(2,5,4),
		(2,3,3);
