-- 2.a
SELECT * FROM Competencia WHERE categoria > 2;

-- 2.b
SELECT Club.nro_club, Club.nombre_club, Club.presupuesto, Competencia.categoria
FROM Club
JOIN Participacion ON Club.nro_club = Participacion.nro_club
JOIN Competencia ON Participacion.nro_competencia = Competencia.nro_competencia
HAVING Competencia.categoria > 2;

-- 2.c
SELECT Club.nombre_club, Competencia.categoria
FROM Club
JOIN Participacion ON Club.nro_club = Participacion.nro_club
JOIN Competencia ON Participacion.nro_competencia = Competencia.nro_competencia
HAVING Competencia.categoria = 2;