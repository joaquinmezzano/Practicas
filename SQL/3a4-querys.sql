-- 4.a
SELECT Competidor.* FROM Competidor JOIN Deporte 
ON Competidor.cod_deporte = Deporte.cod_deporte
WHERE Deporte.denominacion = "FUTBOL";

-- 4.b
SELECT DISTINCT pais FROM Competicion
EXCEPT
SELECT DISTINCT pais FROM Medalla;