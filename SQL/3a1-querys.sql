-- 1.a
SELECT * FROM Producto WHERE precio > 15000.00;

-- 1.b
SELECT Producto.cod_producto, Producto.descripcion 
FROM Producto, ItemFactura 
WHERE Producto.cod_producto = ItemFactura.cod_producto && ItemFactura.cantidad > 2
ORDER BY Producto.descripcion;

SELECT ItemFactura.cod_producto, descripcion 
FROM Producto JOIN ItemFactura
ON ItemFactura.cod_producto = Producto.cod_producto
WHERE cantidad > 2
ORDER BY descripcion;

-- 1.c
SELECT *
FROM Cliente
WHERE Cliente.nro_cliente NOT IN (SELECT nro_cliente FROM Factura)
ORDER BY apellido DESC, nombre DESC;

-- 1.d
SELECT *
FROM Producto
WHERE Producto.cod_producto NOT IN (SELECT cod_producto FROM Factura);

-- 1.e
SELECT *
FROM Cliente LEFT JOIN Factura
ON Cliente.nro_cliente = Factura.nro_cliente;

SELECT *
FROM Factura RIGHT JOIN Cliente
ON Cliente.nro_cliente = Factura.nro_cliente;