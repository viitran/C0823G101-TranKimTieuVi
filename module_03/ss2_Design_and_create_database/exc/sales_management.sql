CREATE DATABASE sales_management;
USE sales_management;
CREATE TABLE customer (
    id VARCHAR(10) PRIMARY KEY,
    `name` VARCHAR(20) NOT NULL,
    age VARCHAR(10) NOT NULL
);

INSERT INTO customer(id,`name`,age)
	VALUES (1,"Vi",19),
			(2,"Lati",14);

CREATE TABLE `order` (
    id VARCHAR(10) NOT NULL PRIMARY KEY,
    customer_id VARCHAR(10) NOT NULL,
    `date` DATE,
    total_price DOUBLE NOT NULL CHECK (total_price > 0),
    FOREIGN KEY (customer_id)
        REFERENCES customer (id)
);

INSERT INTO `order`(id,customer_id,`date`,total_price)
	VALUES (1,2,"2023-11-16",35000),
		(2,2,"2023-11-16",55000);

CREATE TABLE product (
    id VARCHAR(10) NOT NULL PRIMARY KEY,
    `name` VARCHAR(30) NOT NULL,
    price DOUBLE NOT NULL CHECK (price > 0)
);

INSERT INTO product(id,`name`,price)
	VALUES (1,"Laptop",650000),
		(2,"Tivi",500000);
 
CREATE TABLE order_details (
    order_id VARCHAR(10) NOT NULL,
    product_id VARCHAR(10) NOT NULL,
    quantity INT NOT NULL DEFAULT 1,
    PRIMARY KEY (order_id , product_id),
    FOREIGN KEY (order_id)
        REFERENCES `order` (id),
    FOREIGN KEY (product_id)
        REFERENCES product (id)
);

INSERT INTO order_details(order_id,product_id,quantity)
	VALUES (1,1,2),
		(2,2,1);
    