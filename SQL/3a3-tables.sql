-- Creación de tablas
CREATE TABLE Alumno (
	nro_alumno INT NOT NULL,
    dni INT NOT NULL,
    nombre VARCHAR(45) NOT NULL,
    apellido VARCHAR(45) NOT NULL,
    sexo VARCHAR(20) NOT NULL,
    CONSTRAINT pk_nro PRIMARY KEY (nro_alumno)
);

CREATE TABLE Taller (
	codigo_taller INT NOT NULL,
    nombre VARCHAR(45) NOT NULL,
    duracion INT NOT NULL,
    CONSTRAINT pk_cod PRIMARY KEY (codigo_taller)
);

CREATE TABLE Realiza (
	nro_alumno INT NOT NULL,
    codigo_taller INT NOT NULL,
    CONSTRAINT fk_nro_alum FOREIGN KEY (nro_alumno) REFERENCES Alumno(nro_alumno),
    CONSTRAINT fk_cod_taller FOREIGN KEY (codigo_taller) REFERENCES Taller(codigo_taller)
);

-- ------------------------------------------------------------------------------------
-- Inserción de datos
INSERT INTO Alumno VALUES
 (1, 40133723, 'Juan', 'Lopez', 'masculino'),
 (2, 41012149, 'Ana', 'Garcia', 'femenino'),
 (3, 39915686, 'Matias', 'Gonzalez', 'masculino'),
 (4, 40349213, 'Jorge', 'Romero', 'masculino'),
 (5, 40531020, 'Agustina', 'Diaz', 'femenino'),
 (6, 41294339, 'Clara', 'Suarez', 'femenino'),
 (7, 42247714, 'Alan', 'Acosta', 'masculino'),
 (8, 39893011, 'Antonela', 'Perez', 'femenino');

INSERT INTO Taller VALUES
 (1, 'Cocina', 28),
 (2, 'Reparacion de PC', 56),
 (3, 'Bordado', 28),
 (4, 'Historia Argentina', 14),
 (5, 'Disenio Grafico', 21);

INSERT INTO Realiza VALUES
 (1,1),
 (1,2),
 (1,5),
 (2,2),
 (2,3),
 (2,5),
 (3,3),
 (3,4),
 (4,1),
 (5,1),
 (5,2),
 (5,3),
 (5,4),
 (5,5),
 (6,1),
 (6,2),
 (7,3),
 (7,5),
 (8,4),
 (8,5);