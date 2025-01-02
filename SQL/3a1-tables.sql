-- Creación de tablas

CREATE TABLE Cliente (
	nro_cliente INT NOT NULL,
    apellido VARCHAR(20) NOT NULL,
    nombre VARCHAR(40) DEFAULT NULL,
    direccion VARCHAR(30) DEFAULT NULL,
    telefono VARCHAR(15) DEFAULT NULL,
    CONSTRAINT pk_nroC PRIMARY KEY (nro_cliente)
);

CREATE TABLE Producto (
	cod_producto INT NOT NULL,
    descripcion VARCHAR(40) DEFAULT NULL,
    precio DECIMAL(9,2) DEFAULT NULL,
    CONSTRAINT pk_codP PRIMARY KEY (cod_producto)
);

CREATE TABLE Factura (
	nro_factura VARCHAR(12) NOT NULL,
    nro_cliente INT NOT NULL,
    fecha DATE NOT NULL,
    monto DECIMAL(9,2) DEFAULT NULL,
    CONSTRAINT pk_nroF PRIMARY KEY (nro_factura),
    CONSTRAINT fk_nroC FOREIGN KEY (nro_cliente) REFERENCES Cliente(nro_cliente)
);

CREATE TABLE ItemFactura (
	cod_producto INT NOT NULL,
    nro_factura VARCHAR(12) NOT NULL,
    cantidad INT NOT NULL,
    precio DECIMAL(9,2) NOT NULL,
    CONSTRAINT fk_codP FOREIGN KEY (cod_producto) REFERENCES Producto(cod_producto),
    CONSTRAINT fk_nroF FOREIGN KEY (nro_factura) REFERENCES Factura(nro_factura)
);

-- ------------------------------------------------------------------------------------
-- Inserción de datos

INSERT INTO Cliente (nro_cliente, apellido, nombre, direccion, telefono) VALUES
 (1,'ALVAREZ','MATIAS','San Martin 20','0358-4676529'),
 (2,'ARIAS SCHIAVI','JUAN PABLO','Bs. As. 150','0358-4676235'),
 (3,'BARALE','MAYCO','Bs. As. 1363','0358-4676235'),
 (4,'BETTIOL','NICOLAS MATIAS','Mendoza 1258','0358-155458497'),
 (5,'BONO','FEDERICO','Jujuy 3540','0358-4598712'),
 (6,'CABRAL','HERNAN','Pje. Mercedario 758','0358-4639741'),
 (7,'CAMPAGNA','JULIETA','Roma 1158','0358-4482567'),
 (8,'CAMPOS','GONZALO','Lago Traful 2987','0358-4795412'),
 (9,'CARDETTI','SILVINA','Belgrano 150','0358-4601100'),
 (10,'CARRENO','GERMAN','Dean funes 358','0358-155478445'),
 (11,'CASTELLI','JESUS','Dinkeldein 450','0358-459128'),
 (12,'CASTELLINA','FRANCO','Carlos Goudard 2589','0358-156448114'),
 (13,'CHIOTTA','FRANCISCO','Maria Olguin 1348','0358-174145654'),
 (14,'DOMINGUEZ','ELIANA','Cabrera 1589','0358- 555741'),
 (15,'TURLETTI','LUCAS','Laguna Blanca 933 1ro A','0358-4798562'),
 (16,'PAUTASSO','MATIAS','Paunero 750','0358-458726'),
 (17,'ONTIVERO','MARIANO','Sobremonte 1789','0358-4623332');
 
INSERT INTO Cliente (nro_cliente, apellido, nombre, direccion, telefono) VALUES 
 (18,'MONTANARI','GISELA','Sarmiento 458','0350-4987526'),
 (19,'VARELA','MANUEL','Alvear 1390','0358-155078905'),
 (20,'RIBERI','FRANCO','Constitucion 1154','0358-4680000'),
 (21,'ROMERO','SYDOR','Sadi Carnot 120','0358-4635975'),
 (22,'ROVERA','CHRISTIAN','Rio Cuarto - Belgrano 100','0358-457844'),
 (23,'LAGABLE','NATALIA','Rioja 990','155879145');
 
 INSERT INTO Factura (nro_factura, fecha, nro_cliente, monto) VALUES 
 ('000-0001','2010-03-31',1,'1795.00'),
 ('000-0002','2010-03-31',2,'90275.80'),
 ('000-0003','2010-04-02',2,'46768.00'),
 ('000-0004','2010-04-02',4,'16846.00'),
 ('000-0005','2010-04-02',5,'202.00'),
 ('000-0006','2010-04-02',3,'8000.00'),
 ('000-0007','2010-04-02',2,'6820.00');
 
 INSERT INTO Producto (cod_producto, descripcion, precio) VALUES 
 (1,'Acondicionador de Aire SPLIT GE 3000F','1794.56'),
 (2,'Acondicionador de Aire SPLIT GE 1500F','998.00'),
 (3,'Home Cinema c/DVD PHILIPS MX3090','946.30'),
 (4,'Reproducto DVD PHILIPS ','314.70'),
 (5,'TV Sony 21\" ','1465.60'),
 (6,'TV Sony 29\"','2950.58'),
 (7,'TV PLASMA PHILIPS 42\"','6999.00'),
 (8,'Heladera Ariston MT451 NF 450L','2472.60'),
 (9,'Heladera Gafa HGF3880P 420L','1815.80'),
 (10,'Heladera Whirlpool WRM36D 325L','2081.00'),
 (11,'Heladera Whirlpool WRX48X 439L','3330.50'),
 (12,'TV BGH LCD 32\" BL 3201S','5332.60'),
 (13,'Filmadora JVC GRD350','1998.90'),
 (14,'Camara Digital Olimpus 6MPX X760','841.10'),
 (15,'Rerproductor MP3 PHILIPS 1GB SA1115','397.80'),
 (16,'Microondas BGH Quick Chef 30L ','1899.00'),
 (17,'Lavasecarropas LONGVIE LS3817','2195.30'),
 (18,'Lavavajilla Whirlpool RLD20A','1420.00'),
 (19,'Cocina LONGVIE 3501X','2224.00'),
 (20,'Calefactor LONGVIE 6000 Cal/h','679.00'),
 (21,'Calefon LONGVIE C212BSN 12L','740.00'),
 (22,'CTI Nokia NK1600 Kit Prepago','202.80');
 
INSERT INTO Producto (cod_producto, descripcion, precio) VALUES
 (23,'Mesa 1x3m madera','452.00');
 
 INSERT INTO ItemFactura (nro_factura, cod_producto, cantidad, precio) VALUES 
 ('000-0001',1,2,'1795.00'),
 ('000-0002',1,1,'1795.00'),
 ('000-0002',2,1,'998.00'),
 ('000-0002',3,2,'945.00'),
 ('000-0002',4,10,'3140.00'),
 ('000-0002',5,4,'1465.60'),
 ('000-0002',6,4,'2950.00'),
 ('000-0002',7,4,'7000.00'),
 ('000-0002',8,4,'2472.60'),
 ('000-0002',9,4,'1815.00'),
 ('000-0002',10,4,'2081.00'),
 ('000-0002',11,4,'3300.00'),
 ('000-0003',12,4,'5335.00'),
 ('000-0003',13,2,'1998.00'),
 ('000-0003',14,2,'841.00'),
 ('000-0003',15,2,'398.00'),
 ('000-0003',16,5,'1900.00'),
 ('000-0003',17,2,'2200.00'),
 ('000-0003',18,2,'1420.00'),
 ('000-0003',19,1,'2224.00'),
 ('000-0004',1,1,'1800.00'),
 ('000-0004',3,1,'946.00'),
 ('000-0004',7,2,'7050.00'),
 ('000-0005',22,1,'202.00'),
 ('000-0006',4,1,'1000.00'),
 ('000-0006',5,1,'1400.00'),
 ('000-0006',11,1,'3400.00'),
 ('000-0006',19,1,'2200.00'),
 ('000-0007',20,3,'680.00'),
 ('000-0007',21,1,'740.00'),
 ('000-0007',22,20,'202.00');