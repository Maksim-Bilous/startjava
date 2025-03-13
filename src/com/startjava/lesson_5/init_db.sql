\c robots;

CREATE TABLE Jaegers (
	id 		SERIAL PRIMARY KEY,
	modelName 	VARCHAR(20),
	mark 		INT,
	hight		NUMERIC,
	weight		REAL,
	status		TEXT,
	origin		TEXT,
	launch		DATE,
	kaijuKill	INTEGER)
;		


