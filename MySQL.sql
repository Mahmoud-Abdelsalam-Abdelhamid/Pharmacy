CREATE DATABASE  IF NOT EXISTS `project0` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `project0`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: project0
-- ------------------------------------------------------
-- Server version	5.6.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `details`
--

DROP TABLE IF EXISTS `details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `details` (
  `id` int(11) NOT NULL,
  `address` varchar(45) DEFAULT NULL,
  `spe_disease` varchar(45) DEFAULT NULL,
  `dt_exam` varchar(45) DEFAULT NULL,
  `nxt_vst_dt` varchar(45) DEFAULT NULL,
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `details`
--

LOCK TABLES `details` WRITE;
/*!40000 ALTER TABLE `details` DISABLE KEYS */;
INSERT INTO `details` VALUES (1,'suez','nearsightedness','10/5/2010','10/8/2010'),(18,'hurghada','','10/10/2023','10/1/2024'),(20,'hurghada','','10/5/2023','10/10/2023'),(21,'suez','swelling','15/6/2020','15/12/2020'),(22,'ismaeliya','','20/1/2022','20/7/2022');
/*!40000 ALTER TABLE `details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `items`
--

DROP TABLE IF EXISTS `items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `items` (
  `iditems` int(11) DEFAULT '0',
  `idname` int(11) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `items`
--

LOCK TABLES `items` WRITE;
/*!40000 ALTER TABLE `items` DISABLE KEYS */;
INSERT INTO `items` VALUES (10,1,'eye cure 1',5,75),(11,0,'dental cure 1',5,250),(12,0,'eye cure 1',10,600),(13,0,'dental cure 1',7,350),(15,0,'dental cure 1',5,250),(16,0,'eye cure 1',88,1320),(16,NULL,'dental cure 1',77,3850),(16,NULL,'dental cure 1',5,500),(17,NULL,'eye cure 1',50,750),(17,NULL,'eye cure 1',50,750),(18,NULL,'dental cure 1',4,400),(19,NULL,'dental cure 1',5,250),(20,NULL,'bones cure 1',10,400),(21,NULL,'dental cure 1',5,500),(21,NULL,'eye cure 1',2,120),(23,NULL,'kindey cure 1',5,100),(24,NULL,'dental cure 1',5,500),(25,NULL,'stomach cure 1 ',3,360),(25,NULL,'kindey cure 1',4,80),(26,NULL,'veneral cure 1',5,750),(27,NULL,'bones cure 1',2,80),(27,NULL,'kindey cure 1',5,100);
/*!40000 ALTER TABLE `items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patient` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `age` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `disease` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` VALUES (1,'venom abdelsalam','23','010907667','Eyes'),(18,'alora mohamed','21','01098737','Dental'),(20,'jogeto hossam','20','01545612','Bones'),(21,'dappo khaled','22','01545665','Venereal'),(22,'bedo gaber','24','01102145','Eyes');
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pharmacy_purchase`
--

DROP TABLE IF EXISTS `pharmacy_purchase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pharmacy_purchase` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `for_` varchar(45) DEFAULT NULL,
  `price_per_bar` double DEFAULT NULL,
  `price` double DEFAULT NULL,
  `num_of_bar` int(11) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pharmacy_purchase`
--

LOCK TABLES `pharmacy_purchase` WRITE;
/*!40000 ALTER TABLE `pharmacy_purchase` DISABLE KEYS */;
INSERT INTO `pharmacy_purchase` VALUES (5,'bones cure 1','Bones',20,40,2,38),(6,'kindey cure 1','Kindey',10,20,2,36),(7,'veneral cure 1','Venereal',50,150,3,45),(8,'stomach cure 1 ','stomach',40,120,3,27);
/*!40000 ALTER TABLE `pharmacy_purchase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transaction` (
  `idtransaction` int(11) NOT NULL AUTO_INCREMENT,
  `emp` varchar(45) DEFAULT NULL,
  `cname` varchar(45) DEFAULT NULL,
  `cphone` varchar(45) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idtransaction`),
  UNIQUE KEY `idtransaction_UNIQUE` (`idtransaction`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction`
--

LOCK TABLES `transaction` WRITE;
/*!40000 ALTER TABLE `transaction` DISABLE KEYS */;
INSERT INTO `transaction` VALUES (1,'momo','nono','010101',NULL,NULL),(2,'koko','soso','212121',NULL,NULL),(3,'venom','mido','01010101','25/6/2023','15:16'),(4,'alora','mido','01090766','25/6/2023','15:25'),(5,'jogeto','momo','010101','25/6/2023','15:30'),(6,'dappo','momo','121212','25/6/2023','15:36'),(7,'venom','mido','01090766','25/6/2023','15:39'),(8,'venom','mando','0102121','25/6/2023','15:42'),(9,'jogeto','mimi','01110011','25/6/2023','16:01'),(10,'venom','moko','0101010','25/6/2023','16:21'),(11,'dappo','mimo','0101010','25/6/2023','16:32'),(12,'alora','gfhbbf','6454','25/6/2023','16:37'),(13,'alora','ghn','541','25/6/2023','16:40'),(14,'alora','ghn','541','25/6/2023','16:40'),(15,'venom','hgngh','5445454','25/6/2023','16:46'),(16,'venom','ppp','5454','25/6/2023','16:48'),(17,'venom','gogo','55555','25/6/2023','17:05'),(18,'venom','fgfg','56465','25/6/2023','17:07'),(19,'venom','hgjmkh','752','25/6/2023','17:31'),(20,'venom','hjhj','5454','25/6/2023','17:47'),(21,'alora','mando','5454545','25/6/2023','17:57'),(22,'venom','ggg','54454','25/6/2023','18:05'),(23,'jogeto','shosho','0110050','25/6/2023','19:12'),(24,'venom','mando','212121','26/6/2023','18:17'),(25,'dappo','mando','0103212','26/6/2023','18:34'),(26,'momo','mazin','555555','26/6/2023','18:34'),(27,'gaber','zizo','01554545','14/8/2023','13:49');
/*!40000 ALTER TABLE `transaction` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-20 10:57:06
