-- MySQL dump 10.13  Distrib 5.7.16, for Win64 (x86_64)
--
-- Host: localhost    Database: sms
-- ------------------------------------------------------
-- Server version	5.7.16-log

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
-- Current Database: `sms`
--

/*!40000 DROP DATABASE IF EXISTS `sms`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `sms` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `sms`;

--
-- Table structure for table `all_groups`
--

DROP TABLE IF EXISTS `all_groups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `all_groups` (
  `name_group` varchar(100) NOT NULL,
  `name_day` varchar(100) NOT NULL,
  `hour` varchar(100) DEFAULT NULL,
  KEY `name_group` (`name_group`),
  KEY `name_day` (`name_day`),
  CONSTRAINT `all_groups_ibfk_1` FOREIGN KEY (`name_group`) REFERENCES `groups` (`name`),
  CONSTRAINT `all_groups_ibfk_2` FOREIGN KEY (`name_day`) REFERENCES `day` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `all_groups`
--

LOCK TABLES `all_groups` WRITE;
/*!40000 ALTER TABLE `all_groups` DISABLE KEYS */;
/*!40000 ALTER TABLE `all_groups` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attendence`
--

DROP TABLE IF EXISTS `attendence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attendence` (
  `class_num` varchar(100) NOT NULL,
  `student_id` varchar(100) NOT NULL,
  `group_name` varchar(100) NOT NULL,
  `level_name` varchar(100) NOT NULL,
  `mark` varchar(100) DEFAULT NULL,
  KEY `class_num` (`class_num`),
  KEY `student_id` (`student_id`),
  KEY `group_name` (`group_name`),
  KEY `level_name` (`level_name`),
  CONSTRAINT `attendence_ibfk_1` FOREIGN KEY (`class_num`) REFERENCES `class` (`num`),
  CONSTRAINT `attendence_ibfk_2` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`),
  CONSTRAINT `attendence_ibfk_3` FOREIGN KEY (`group_name`) REFERENCES `groups` (`name`),
  CONSTRAINT `attendence_ibfk_4` FOREIGN KEY (`level_name`) REFERENCES `level` (`level_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendence`
--

LOCK TABLES `attendence` WRITE;
/*!40000 ALTER TABLE `attendence` DISABLE KEYS */;
/*!40000 ALTER TABLE `attendence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `class`
--

DROP TABLE IF EXISTS `class`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `class` (
  `num` varchar(100) NOT NULL,
  PRIMARY KEY (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `class`
--

LOCK TABLES `class` WRITE;
/*!40000 ALTER TABLE `class` DISABLE KEYS */;
/*!40000 ALTER TABLE `class` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `class_level`
--

DROP TABLE IF EXISTS `class_level`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `class_level` (
  `class_num` varchar(100) NOT NULL,
  `level_name` varchar(100) NOT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  KEY `class_num` (`class_num`),
  KEY `level_name` (`level_name`),
  CONSTRAINT `class_level_ibfk_1` FOREIGN KEY (`class_num`) REFERENCES `class` (`num`),
  CONSTRAINT `class_level_ibfk_2` FOREIGN KEY (`level_name`) REFERENCES `level` (`level_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `class_level`
--

LOCK TABLES `class_level` WRITE;
/*!40000 ALTER TABLE `class_level` DISABLE KEYS */;
/*!40000 ALTER TABLE `class_level` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `date`
--

DROP TABLE IF EXISTS `date`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `date` (
  `end_date` date DEFAULT NULL,
  `this_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `date`
--

LOCK TABLES `date` WRITE;
/*!40000 ALTER TABLE `date` DISABLE KEYS */;
INSERT INTO `date` VALUES ('2019-08-01','2018-07-18');
/*!40000 ALTER TABLE `date` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `day`
--

DROP TABLE IF EXISTS `day`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `day` (
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `day`
--

LOCK TABLES `day` WRITE;
/*!40000 ALTER TABLE `day` DISABLE KEYS */;
INSERT INTO `day` VALUES ('الاثنين'),('الاحد'),('الاربعاء'),('الثلاثاء'),('الجمعة'),('الخميس'),('السبت');
/*!40000 ALTER TABLE `day` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deletecode`
--

DROP TABLE IF EXISTS `deletecode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deletecode` (
  `dCode` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deletecode`
--

LOCK TABLES `deletecode` WRITE;
/*!40000 ALTER TABLE `deletecode` DISABLE KEYS */;
INSERT INTO `deletecode` VALUES ('1');
/*!40000 ALTER TABLE `deletecode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exam`
--

DROP TABLE IF EXISTS `exam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exam` (
  `num_exam` varchar(100) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `total_degree` varchar(100) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `level_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`num_exam`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam`
--

LOCK TABLES `exam` WRITE;
/*!40000 ALTER TABLE `exam` DISABLE KEYS */;
/*!40000 ALTER TABLE `exam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exam_degree`
--

DROP TABLE IF EXISTS `exam_degree`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exam_degree` (
  `student_id` varchar(100) DEFAULT NULL,
  `student_name` varchar(100) DEFAULT NULL,
  `num_exam` varchar(100) DEFAULT NULL,
  `exam_name` varchar(100) DEFAULT NULL,
  `student_degree` varchar(100) DEFAULT NULL,
  `level_name` varchar(100) DEFAULT NULL,
  KEY `student_id` (`student_id`),
  KEY `num_exam` (`num_exam`),
  CONSTRAINT `exam_degree_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`),
  CONSTRAINT `exam_degree_ibfk_2` FOREIGN KEY (`num_exam`) REFERENCES `exam` (`num_exam`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam_degree`
--

LOCK TABLES `exam_degree` WRITE;
/*!40000 ALTER TABLE `exam_degree` DISABLE KEYS */;
/*!40000 ALTER TABLE `exam_degree` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `external_money`
--

DROP TABLE IF EXISTS `external_money`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `external_money` (
  `person_name` varchar(200) DEFAULT NULL,
  `reason` varchar(200) DEFAULT NULL,
  `money` varchar(100) DEFAULT NULL,
  `data` varchar(100) DEFAULT NULL,
  `month` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `external_money`
--

LOCK TABLES `external_money` WRITE;
/*!40000 ALTER TABLE `external_money` DISABLE KEYS */;
/*!40000 ALTER TABLE `external_money` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `footer`
--

DROP TABLE IF EXISTS `footer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `footer` (
  `footer` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `footer`
--

LOCK TABLES `footer` WRITE;
/*!40000 ALTER TABLE `footer` DISABLE KEYS */;
INSERT INTO `footer` VALUES (' ');
/*!40000 ALTER TABLE `footer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groups`
--

DROP TABLE IF EXISTS `groups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `groups` (
  `name` varchar(100) NOT NULL,
  `max_num` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groups`
--

LOCK TABLES `groups` WRITE;
/*!40000 ALTER TABLE `groups` DISABLE KEYS */;
/*!40000 ALTER TABLE `groups` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groups_level`
--

DROP TABLE IF EXISTS `groups_level`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `groups_level` (
  `name_group` varchar(100) NOT NULL,
  `name_level` varchar(100) NOT NULL,
  KEY `name_group` (`name_group`),
  KEY `name_level` (`name_level`),
  CONSTRAINT `groups_level_ibfk_1` FOREIGN KEY (`name_group`) REFERENCES `groups` (`name`),
  CONSTRAINT `groups_level_ibfk_2` FOREIGN KEY (`name_level`) REFERENCES `level` (`level_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groups_level`
--

LOCK TABLES `groups_level` WRITE;
/*!40000 ALTER TABLE `groups_level` DISABLE KEYS */;
/*!40000 ALTER TABLE `groups_level` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `level`
--

DROP TABLE IF EXISTS `level`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `level` (
  `level_name` varchar(100) NOT NULL,
  `books_cost` varchar(100) DEFAULT NULL,
  `month_cost` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`level_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `level`
--

LOCK TABLES `level` WRITE;
/*!40000 ALTER TABLE `level` DISABLE KEYS */;
/*!40000 ALTER TABLE `level` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `money`
--

DROP TABLE IF EXISTS `money`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `money` (
  `student_id` varchar(100) DEFAULT NULL,
  `student_name` varchar(100) DEFAULT NULL,
  `level_name` varchar(100) DEFAULT NULL,
  `books_cost` varchar(100) DEFAULT NULL,
  `month_cost` varchar(100) DEFAULT NULL,
  `date` varchar(100) DEFAULT NULL,
  `rest1` varchar(100) DEFAULT NULL,
  `rest2` varchar(100) DEFAULT NULL,
  `discount1` varchar(10) DEFAULT NULL,
  `discount2` varchar(10) DEFAULT NULL,
  `day` varchar(100) DEFAULT NULL,
  KEY `student_id` (`student_id`),
  KEY `level_name` (`level_name`),
  CONSTRAINT `money_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`),
  CONSTRAINT `money_ibfk_2` FOREIGN KEY (`level_name`) REFERENCES `level` (`level_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `money`
--

LOCK TABLES `money` WRITE;
/*!40000 ALTER TABLE `money` DISABLE KEYS */;
/*!40000 ALTER TABLE `money` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `note_of_sec`
--

DROP TABLE IF EXISTS `note_of_sec`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `note_of_sec` (
  `sec_id` varchar(100) NOT NULL,
  `sec_name` varchar(100) DEFAULT NULL,
  `note` varchar(200) DEFAULT NULL,
  KEY `sec_id` (`sec_id`),
  CONSTRAINT `note_of_sec_ibfk_1` FOREIGN KEY (`sec_id`) REFERENCES `secretary` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `note_of_sec`
--

LOCK TABLES `note_of_sec` WRITE;
/*!40000 ALTER TABLE `note_of_sec` DISABLE KEYS */;
/*!40000 ALTER TABLE `note_of_sec` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `note_of_student`
--

DROP TABLE IF EXISTS `note_of_student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `note_of_student` (
  `student_id` varchar(100) NOT NULL,
  `student_name` varchar(100) DEFAULT NULL,
  `note` varchar(200) DEFAULT NULL,
  KEY `student_id` (`student_id`),
  CONSTRAINT `note_of_student_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `note_of_student`
--

LOCK TABLES `note_of_student` WRITE;
/*!40000 ALTER TABLE `note_of_student` DISABLE KEYS */;
/*!40000 ALTER TABLE `note_of_student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `path`
--

DROP TABLE IF EXISTS `path`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `path` (
  `path` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `path`
--

LOCK TABLES `path` WRITE;
/*!40000 ALTER TABLE `path` DISABLE KEYS */;
INSERT INTO `path` VALUES (' ');
/*!40000 ALTER TABLE `path` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quiz`
--

DROP TABLE IF EXISTS `quiz`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quiz` (
  `num_quiz` varchar(100) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `total_degree` varchar(100) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `level_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`num_quiz`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quiz`
--

LOCK TABLES `quiz` WRITE;
/*!40000 ALTER TABLE `quiz` DISABLE KEYS */;
/*!40000 ALTER TABLE `quiz` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quiz_degree`
--

DROP TABLE IF EXISTS `quiz_degree`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quiz_degree` (
  `student_id` varchar(100) DEFAULT NULL,
  `student_name` varchar(100) DEFAULT NULL,
  `num_quiz` varchar(100) DEFAULT NULL,
  `quiz_name` varchar(100) DEFAULT NULL,
  `student_degree` varchar(100) DEFAULT NULL,
  `level_name` varchar(100) DEFAULT NULL,
  `time` varchar(100) DEFAULT NULL,
  `date` varchar(100) DEFAULT NULL,
  KEY `student_id` (`student_id`),
  KEY `num_quiz` (`num_quiz`),
  CONSTRAINT `quiz_degree_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`),
  CONSTRAINT `quiz_degree_ibfk_2` FOREIGN KEY (`num_quiz`) REFERENCES `quiz` (`num_quiz`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quiz_degree`
--

LOCK TABLES `quiz_degree` WRITE;
/*!40000 ALTER TABLE `quiz_degree` DISABLE KEYS */;
/*!40000 ALTER TABLE `quiz_degree` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `secretary`
--

DROP TABLE IF EXISTS `secretary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `secretary` (
  `id` varchar(100) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `pass` varchar(100) DEFAULT NULL,
  `phone` varchar(100) DEFAULT NULL,
  `salary` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `secretary`
--

LOCK TABLES `secretary` WRITE;
/*!40000 ALTER TABLE `secretary` DISABLE KEYS */;
/*!40000 ALTER TABLE `secretary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `student_id` varchar(100) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `phone` varchar(100) DEFAULT NULL,
  `parent_name` varchar(100) DEFAULT NULL,
  `parent_job` varchar(100) DEFAULT NULL,
  `parent_phone` varchar(100) DEFAULT NULL,
  `parent_degree` varchar(100) DEFAULT NULL,
  `student_group` varchar(100) DEFAULT NULL,
  `student_level` varchar(100) DEFAULT NULL,
  `student_year` varchar(100) DEFAULT NULL,
  `date` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `system`
--

DROP TABLE IF EXISTS `system`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `system` (
  `date` varchar(100) DEFAULT NULL,
  `time` varchar(100) NOT NULL,
  `event` varchar(100) NOT NULL,
  `event_name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `system`
--

LOCK TABLES `system` WRITE;
/*!40000 ALTER TABLE `system` DISABLE KEYS */;
/*!40000 ALTER TABLE `system` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-18 12:38:42
