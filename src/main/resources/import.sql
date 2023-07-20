--creation des utilisateurs

INSERT INTO roles (name) VALUES ('ADMIN');
INSERT INTO roles (name) VALUES ('EMPLOYE');
INSERT INTO users (password,username) VALUES ('$2y$10$hVzhEX0XjVPZdf2USwVf9uNOs4A535JpUP5ogUx4PG8oiCEMzPJDy','vparrot@garageparrot.fr');
INSERT INTO user_roles (user_id,role_id) VALUES (1,1);
INSERT INTO users (password,username) VALUES ('$2y$10$hVzhEX0XjVPZdf2USwVf9uNOs4A535JpUP5ogUx4PG8oiCEMzPJDy','employe@garageparrot.fr');
INSERT INTO user_roles (user_id,role_id) VALUES (2,2);

--creation d'avis

INSERT INTO avis (commentaire,nom,note,status) VALUES ('Très bien !','Jean Dupont', '9/10','EN_ATTENTE');
INSERT INTO avis (commentaire,nom,note,status) VALUES ('Rien à dire','Jean Dupuis', '7/10','EN_ATTENTE');
INSERT INTO avis (commentaire,nom,note,status) VALUES ('Pas terrible','Andi Martin', '4/10','EN_ATTENTE');
INSERT INTO avis (commentaire,nom,note,status) VALUES ('Passable','Julie Tamain', '6/10','VALIDE');
INSERT INTO avis (commentaire,nom,note,status) VALUES ('Très satisfait !','Charles Petit', '8/10','VALIDE');
INSERT INTO avis (commentaire,nom,note,status) VALUES ('Bof bof','Pierre Dubois', '4/10','VALIDE');

--creation d'horaire

INSERT INTO horaire (jour,heure_ouverture,heure_fermeture) VALUES ('LUNDI','08:45-12:00','14:00-18:00');
INSERT INTO horaire (jour,heure_ouverture,heure_fermeture) VALUES ('MARDI','08:45-12:00','14:00-18:00');
INSERT INTO horaire (jour,heure_ouverture,heure_fermeture) VALUES ('MERCREDI','08:45-12:00','14:00-18:00');
INSERT INTO horaire (jour,heure_ouverture,heure_fermeture) VALUES ('JEUDI','08:45-12:00','14:00-18:00');
INSERT INTO horaire (jour,heure_ouverture,heure_fermeture) VALUES ('VENDREDI','08:45-12:00','14:00-18:00');
INSERT INTO horaire (jour,heure_ouverture,heure_fermeture) VALUES ('SAMEDI','08:45-12:00');
INSERT INTO horaire (jour,heure_ouverture,heure_fermeture) VALUES ('FERIE','10:00-12:00','14:00-18:00');

-- creation de service

INSERT INTO service_garage (nom,description) VALUES ('Mécanique générale','Nous réalisons toutes les réparations classiques sur vos véhicules');
INSERT INTO service_garage (nom,description) VALUES ('Entretien','Nous réalisons le suivi de vos véhicules');
INSERT INTO service_garage (nom,description) VALUES ('Carrosserie','Nous réalisons tous vos travaux de carrosserie');

-- creation de voiture
INSERT INTO voiture (annee_mise_en_circulation,energie,kilometre,prix,description,denomination) VALUES (2020,'ELECTRIQUE',2000,24000,"Voiture quasi neuve, occasion à saisir","Peugeot e-208");
INSERT INTO voiture (annee_mise_en_circulation,energie,kilometre,prix,description,denomination) VALUES (2008,'DIESEL',180000,8000,"Voiture en bon état, CT à jour","Renault Clio V");
INSERT INTO voiture (annee_mise_en_circulation,energie,kilometre,prix,description,denomination) VALUES (2012,'ESSENCE',50000,15000,"Voiture entretenue en garage, encore de belles années devant elle","Citroën C3");

-- creation d'option
INSERT INTO option (nom,voiture_voiture_id) VALUES ('climatisation',1);
INSERT INTO option (nom,voiture_voiture_id) VALUES ('radio',1);
INSERT INTO option (nom,voiture_voiture_id) VALUES ('GPS',1);
INSERT INTO option (nom,voiture_voiture_id) VALUES ('radar de recul',3);
INSERT INTO option (nom,voiture_voiture_id) VALUES ('climatisation',3);



