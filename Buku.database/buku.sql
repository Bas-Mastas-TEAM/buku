CREATE DATABASE  IF NOT EXISTS `buku` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `buku`;
-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: buku
-- ------------------------------------------------------
-- Server version	8.0.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `surname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `books` (
  `ISBN` varchar(45) NOT NULL,
  `Cote` varchar(45) NOT NULL,
  `Titre` varchar(45) DEFAULT NULL,
  `Auteur` varchar(45) DEFAULT NULL,
  `Publication` varchar(45) DEFAULT NULL,
  `Annee` varchar(45) DEFAULT NULL,
  `Domain` varchar(45) DEFAULT NULL,
  `Status` varchar(45) DEFAULT NULL,
  `motsClefs` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ISBN`,`Cote`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` VALUES ('978-81-259-4632-8','9','Web Technology-1','Dr.N.P.Singh','Punjab Technical University','2010','Programmation','out','Tech.'),('azerty','azert','azer','aze','az','a','treza','in','reza'),('cv','red','ddr','tr','jhg','jhg','uy','in','tre');
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `issue`
--

DROP TABLE IF EXISTS `issue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `issue` (
  `Number` int NOT NULL AUTO_INCREMENT,
  `Matricule` varchar(45) NOT NULL,
  `ISBN` varchar(45) NOT NULL,
  `Title` varchar(45) DEFAULT NULL,
  `Author` varchar(45) DEFAULT NULL,
  `Cote` varchar(45) DEFAULT NULL,
  `Status` varchar(45) DEFAULT NULL,
  `Issue_Date` date DEFAULT NULL,
  `Return_Date` date DEFAULT NULL,
  PRIMARY KEY (`Number`,`Matricule`,`ISBN`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `issue`
--

LOCK TABLES `issue` WRITE;
/*!40000 ALTER TABLE `issue` DISABLE KEYS */;
INSERT INTO `issue` VALUES (10,'155','021215','il est pede','Lagerfeild','2515','out','2021-07-27','2021-07-05'),(12,'si123','978-81-259-4632-8','Web Technology-1','Dr.N.P.Singh','9','out','2021-07-27','2021-08-14');
/*!40000 ALTER TABLE `issue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `register`
--

DROP TABLE IF EXISTS `register`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `register` (
  `Date` varchar(45) NOT NULL,
  `FASI` varchar(45) DEFAULT NULL,
  `FASE` varchar(45) DEFAULT NULL,
  `MEDECINE` varchar(45) DEFAULT NULL,
  `THEOLOGIE` varchar(45) DEFAULT NULL,
  `DROIT` varchar(45) DEFAULT NULL,
  `AUTORITE` varchar(45) DEFAULT NULL,
  `EXTERIEUR` varchar(45) NOT NULL,
  `TOTAL` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `register`
--

LOCK TABLES `register` WRITE;
/*!40000 ALTER TABLE `register` DISABLE KEYS */;
INSERT INTO `register` VALUES ('21/07/2021','20','30','40','50','60',NULL,'70','270'),('21/07/2021','1','2',NULL,'4','5','6','7','21/07/2021124567'),('21/07/2021','1','2',NULL,'4','5','6','7','25'),('21/07/2021','1','2','3','4','5','6','7','28'),('24/07/2021','1','2','3','4','5','6','8','29'),('27/07/2021','30','3','7','21','23','10','0','94'),('27/07/2021','30','3','7','21','23','10','0','94'),('27/07/2021','30','3','7','21','23','10','0','94'),('27/07/2021','30','3','7','21','23','10','0','94'),('27/07/2021','30','3','7','21','23','10','0','94'),('27/07/2021','30','3','7','21','23','10','0','94'),('27/07/2021','30','3','7','21','23','10','0','94'),('27/07/2021','30','3','7','21','23','10','0','94'),('27/07/2021','30','3','7','21','23','10','0','94'),('27/07/2021','30','3','7','21','23','10','0','94'),('27/07/2021','30','3','7','21','23','10','0','94'),('27/07/2021','2','4','5','4','6','9','3','33'),('27/07/2021','2','4','5','4','6','9','3','33'),('27/07/2021','2','4','5','4','6','9','3','33'),('27/07/2021','2','4','5','4','6','9','3','33'),('27/07/2021','2','4','5','4','6','9','3','33'),('27/07/2021','2','4','5','4','6','9','3','33'),('27/07/2021','30','40','50','11','12','45','89','277'),('31/07/2021','10','45','1','0','9','4','5','74');
/*!40000 ALTER TABLE `register` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subscribers`
--

DROP TABLE IF EXISTS `subscribers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subscribers` (
  `Matricule` varchar(45) NOT NULL,
  `Nom` varchar(45) DEFAULT NULL,
  `Postnom` varchar(45) DEFAULT NULL,
  `Sex` varchar(45) DEFAULT NULL,
  `Fonction` varchar(45) DEFAULT NULL,
  `Faculte` varchar(45) DEFAULT NULL,
  `Promotion` varchar(45) DEFAULT NULL,
  `Tel` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Address` varchar(45) NOT NULL,
  `Image` blob,
  PRIMARY KEY (`Matricule`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subscribers`
--

LOCK TABLES `subscribers` WRITE;
/*!40000 ALTER TABLE `subscribers` DISABLE KEYS */;
INSERT INTO `subscribers` VALUES ('ME156932','Laurel','kadima','M','ETUDIANT UPC','MEDECINE','G2','0782365096','laurel@gmail.com','riviere',NULL),('si0123','hans','hybani','M','ETUDIANT EXTERIEUR','INFORMATIQUE','G1','08251449699','hybqniprinciq@gmail.com','bodila 48',NULL),('SI016120','kameb','Kas','M','ETUDIANT EXTERIEUR','MEDECINE','G3','0856642524','kas@gmail.com','lolo',NULL),('si123','andedi','andedi','M','ETUDIANT EXTERIEUR','INFORMATIQUE','G1','0889945632','andedi@.escroc','limete',NULL);
/*!40000 ALTER TABLE `subscribers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'buku'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-31  3:08:07
