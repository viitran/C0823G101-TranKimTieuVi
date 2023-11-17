USE sales_management;

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order

SELECT 
    *
FROM
    `order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách

SELECT 
	c.`name`,
    c.id,
    group_concat(product_name)
			AS "Danh sách sản phẩm được mua"
FROM 
	customer c
JOIN 
	`order` o ON c.id = o.customer_id
JOIN 
	order_details od  ON o.id = od.order_id
JOIN
	product p ON od.product_id = p.id
GROUP BY 
	c.id;
    
SET GLOBAL sql_mode	=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào

SELECT 
    *
FROM
    order_details
WHERE
    order_id IS NULL;

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
-- (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn.
--  Giá bán của từng loại được tính = odQTY*pPrice)
 
SELECT 
    c.`name`,
    p.product_name,
    o.id,
    o.`date`,
    p.price * od.quantity AS 'Giá bán'
FROM
    customer c
        JOIN
    `order` o ON c.id = o.customer_id
        JOIN
    order_details od ON o.id = od.order_id
        JOIN
    product p ON od.product_id = p.id
 