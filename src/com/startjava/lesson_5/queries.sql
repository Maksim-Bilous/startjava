-- Запросы
\echo 'All table'
SELECT * FROM Jaegers; -- Вся таблица
\echo 'Activate Jaegers'
SELECT * FROM Jaegers 
	WHERE status = 'Activate'; -- егеря со статусом Активны
\echo 'Jaegers mark 1 and 4'
SELECT * FROM Jaegers 
	WHERE mark = '4' OR mark = '1'; -- егеря поколения 1 и 4
\echo 'All Jaegers without mark 1 and 4'
SELECT * FROM Jaegers 
	WHERE mark <> '1' AND mark <> '4' 
	ORDER BY mark DESC; -- все егеря кроме покаления 1 и 4 по убыванию
\echo 'The oldest Jaegers'
SELECT * FROM Jaegers 
	WHERE launch <= (SELECT MIN(launch) FROM Jaegers); -- Выводит самую раннюю дату запуска егеря не подходит
\echo 'Jaegers most killed kaiju'
SELECT "modelname", "mark", "launch", "kaijukill" FROM Jaegers 
	WHERE kaijukill >= (SELECT MAX(kaijuKill) FROM Jaegers); -- Выводит всех егерей с максиммальным колличесвтом убитых кайдзю
\echo 'Average weight'
SELECT ROUND(AVG(weight):: NUMERIC, 3) FROM Jaegers; -- Средний вес егерей с округлением до 3 знаков после запятой
\echo '+1 killed kaiju for Jaegers who has status "Activate"'
UPDATE Jaegers SET kaijukill = kaijukill + 1
	WHERE status = 'Activate';
	SELECT * FROM Jaegers WHERE status = 'Activate';
	