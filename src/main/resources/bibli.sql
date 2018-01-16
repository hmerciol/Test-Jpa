DROP TABLE IF EXISTS
    CLIENT;
DROP TABLE IF EXISTS
    LIVRE;
DROP TABLE IF EXISTS
    EMPRUNT;
DROP TABLE IF EXISTS
    COMPO;
CREATE TABLE CLIENT(
    ID INTEGER(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    NOM VARCHAR(50) NOT NULL,
    PRENOM VARCHAR(50) NOT NULL
);
CREATE TABLE LIVRE(
    ID INTEGER(10) NOT NULL PRIMARY KEY,
    TITRE VARCHAR(255) NOT NULL,
    AUTEUR VARCHAR(50) NOT NULL
);
CREATE TABLE EMPRUNT(
    ID INTEGER(10) NOT NULL PRIMARY KEY,
    DATE_DEBUT DATETIME NOT NULL,
    DATE_FIN DATETIME,
    DELAI INTEGER(10),
    ID_CLIENT INTEGER(10) NOT NULL
);
CREATE TABLE COMPO(
    ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ID_LIV INTEGER(10) NOT NULL,
    ID_EMP INTEGER(10) NOT NULL
);
INSERT INTO CLIENT(NOM, PRENOM)
VALUES('Brigand', 'Pierre');
INSERT INTO CLIENT(NOM, PRENOM)
VALUES('YU', 'Cheng');
INSERT INTO CLIENT(NOM, PRENOM)
VALUES('BERRAD', 'Hicham');
INSERT INTO LIVRE
VALUES(
    1,
    'Vingt mille lieues sous les mers',
    'Jules Verne'
);
INSERT INTO LIVRE
VALUES(2, 'Germinal', 'Emile Zola');
INSERT INTO LIVRE
VALUES(
    3,
    'Guerre et paix',
    'Léon Tolstoï'
);
INSERT INTO LIVRE
VALUES(
    4,
    'Apprendre à parler aux animaux',
    'Gaston Pouet'
);
INSERT INTO LIVRE
VALUES(
    5,
    '1001 recettes de Cuisine',
    'Jean-Pierre Coffe'
);
INSERT INTO EMPRUNT
VALUES(
    1,
    '2017-11-12',
    '2017-11-18',
    15,
    1
);
INSERT INTO EMPRUNT
VALUES(
    2,
    '2017-12-08',
    '2017-12-23',
    30,
    2
);
INSERT INTO EMPRUNT
VALUES(
    3,
    '2017-12-09',
    '2018-01-04',
    30,
    3
);
INSERT INTO EMPRUNT
VALUES(4, '2018-01-03', NULL, 21, 1);
INSERT INTO EMPRUNT
VALUES(5, '2018-01-13', NULL, 21, 3);
INSERT INTO COMPO
VALUES(1, 1, 1);
INSERT INTO COMPO
VALUES(2, 4, 1);
INSERT INTO COMPO
VALUES(3, 2, 2);
INSERT INTO COMPO
VALUES(4, 3, 2);
INSERT INTO COMPO
VALUES(5, 1, 3);
INSERT INTO COMPO
VALUES(6, 5, 4);
INSERT INTO COMPO
VALUES(7, 2, 4);
INSERT INTO COMPO
VALUES(8, 3, 5);
