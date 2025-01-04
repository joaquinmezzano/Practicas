-- 1ra consulta (UNION)
-- Todos los alumnos apellidados Gonzalez y Diaz

(SELECT * FROM Alumno WHERE Alumno.apellido = "Gonzalez")
UNION
(SELECT * FROM Alumno WHERE Alumno.apellido = "Diaz");

-- 2da consulta (DIFERENCIA)
-- Todos los alumnos femeninos
(SELECT * FROM Alumno)
EXCEPT
(SELECT * FROM Alumno WHERE Alumno.sexo = "masculino");

-- 3ra consulta (OUTER JOIN)
-- Todos los talleres que se realizaron los cuales duraron > 30

SELECT * FROM Taller LEFT JOIN Realiza ON Taller.codigo_taller = Realiza.codigo_taller
HAVING Taller.duracion > 30;