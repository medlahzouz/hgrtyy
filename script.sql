create database if not exists dbproduitsExo1; 



create table if not exists PRODUIT 
(ID int primary key auto_increment, 
Libelle varchar(30), FAMILLE varchar(30), PRIX_ACHAT double , PRIX_VENTE double);