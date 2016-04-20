CREATE SEQUENCE seq_Entidad;
CREATE SEQUENCE seq_Usuario;
CREATE TABLE Entidad (uid int4 NOT NULL, nombre varchar(20), apellido varchar(20), mail varchar(30), telefono varchar(20), PRIMARY KEY (uid));
CREATE TABLE Usuario (Uid int4 NOT NULL, nickname varchar(20), password varchar(30), PRIMARY KEY (Uid));
COMMENT ON COLUMN Usuario.Uid IS 'llave primaria';
COMMENT ON COLUMN Usuario.nickname IS 'apodo';
