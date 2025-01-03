-- Creación de tablas

CREATE TABLE Competencia (
	nro_competencia INT NOT NULL,
    descripcion VARCHAR(30) NOT NULL,
    categoria INT DEFAULT NULL,
    CONSTRAINT pk_competencia PRIMARY KEY (nro_competencia)
);

CREATE TABLE Club (
	nro_club INT NOT NULL,
    nombre_club VARCHAR(30) NOT NULL,
    presupuesto DECIMAL(9,2) DEFAULT NULL,
    CONSTRAINT pk_club PRIMARY KEY (nro_club)
);

CREATE TABLE Participacion (
	nro_club INT NOT NULL,
    nro_competencia INT NOT NULL,
    puesto VARCHAR(129) DEFAULT NULL,
    CONSTRAINT fk_club FOREIGN KEY (nro_club) REFERENCES Club(nro_club),
    CONSTRAINT fk_competencia FOREIGN KEY (nro_competencia) REFERENCES Competencia(nro_competencia)
);

-- ------------------------------------------------------------------------------------
-- Inserción de datos
INSERT INTO Competencia (nro_competencia, descripcion, categoria) VALUES
 (1,'torneo de futbol infantil',' 5'),
 (2,'torneo de futbol juvenil','2'),
 (3,'torneo de futbol veteranos','5 '),
 (4,'torneo de tenis infantil','5'),
 (5,'torneo de tenis juvenil','3'),
 (6,'torneo de tenis veteranos','6 '),
 (7,'torneo de basquet infantil','3'),
 (8,'torneo de basquet juvenil','1'),
 (9,'torneo de basquet veteranos','2');

 INSERT INTO Club (nro_club, nombre_club, presupuesto) VALUES
 (1,'Atlético Estudiantes','35000.00'),
 (2,'Banda Norte','27500.80'),
 (3,'Atenas','19700.00'),
 (4,'Sportivo Municipal','21640.00'),
 (5,'Atlético Adelia María','22000.00'),
 (6,'Atlético Sampacho','18000.00'),
 (7,'Alianza Moldes','65200.00');
 
 INSERT INTO Participacion (nro_club, nro_competencia, puesto) VALUES
 (1,'1','primer puesto'),
 (2,'1','segundo puesto'),
 (3,'3','tercer puesto'),
 (4,'8','primer puesto'),
 (5,'4','segundo puesto'),
 (1,'2','primer puesto'),
 (6,'8','segundo puesto'),
 (3,'9','tercer puesto');