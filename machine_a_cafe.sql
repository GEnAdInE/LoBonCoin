-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : lun. 06 déc. 2021 à 10:34
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `machine_a_cafe`
--

-- --------------------------------------------------------

--
-- Structure de la table `boisson`
--

DROP TABLE IF EXISTS `boisson`;
CREATE TABLE IF NOT EXISTS `boisson` (
  `idBoisson` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) COLLATE utf8_bin NOT NULL,
  `description` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `prix` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`idBoisson`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `commandes`
--

DROP TABLE IF EXISTS `commandes`;
CREATE TABLE IF NOT EXISTS `commandes` (
  `idCommande` int(11) NOT NULL AUTO_INCREMENT,
  `idMachine` int(11) NOT NULL,
  `idBoisson` int(11) NOT NULL,
  PRIMARY KEY (`idCommande`),
  KEY `idMachine` (`idMachine`),
  KEY `idBoisson` (`idBoisson`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `consommable`
--

DROP TABLE IF EXISTS `consommable`;
CREATE TABLE IF NOT EXISTS `consommable` (
  `idConsommable` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`idConsommable`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `consommer`
--

DROP TABLE IF EXISTS `consommer`;
CREATE TABLE IF NOT EXISTS `consommer` (
  `idConsommable` int(11) NOT NULL,
  `idCommande` int(11) NOT NULL,
  PRIMARY KEY (`idConsommable`,`idCommande`),
  KEY `idCommande` (`idCommande`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `contenir`
--

DROP TABLE IF EXISTS `contenir`;
CREATE TABLE IF NOT EXISTS `contenir` (
  `idMachine` int(11) NOT NULL,
  `idConsommable` int(11) NOT NULL,
  `qteMax` double DEFAULT NULL,
  `qte` double DEFAULT NULL,
  PRIMARY KEY (`idMachine`,`idConsommable`),
  KEY `idConsommable` (`idConsommable`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `listeboisson`
--

DROP TABLE IF EXISTS `listeboisson`;
CREATE TABLE IF NOT EXISTS `listeboisson` (
  `idBoisson` int(11) NOT NULL,
  `idMachine` int(11) NOT NULL,
  PRIMARY KEY (`idBoisson`,`idMachine`),
  KEY `idMachine` (`idMachine`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `machine_a_cafe`
--

DROP TABLE IF EXISTS `machine_a_cafe`;
CREATE TABLE IF NOT EXISTS `machine_a_cafe` (
  `idMachine` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idMachine`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
