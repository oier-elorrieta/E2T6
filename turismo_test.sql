-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3307
-- Tiempo de generación: 13-02-2025 a las 12:39:20
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `turismo_test`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aerolinea`
--

CREATE TABLE `aerolinea` (
  `Kod` varchar(4) NOT NULL,
  `Izena` varchar(60) NOT NULL,
  `Herrialdea` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `agentzia`
--

CREATE TABLE `agentzia` (
  `ID` int(10) UNSIGNED NOT NULL,
  `Izena` varchar(30) NOT NULL,
  `Logoa` varchar(100) NOT NULL,
  `Markaren_Kolore` varchar(6) NOT NULL,
  `Erabiltzailea` varchar(30) NOT NULL,
  `Pasahitza` varchar(30) NOT NULL,
  `Kod_Mota` varchar(2) NOT NULL,
  `Langile_Kop` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `agentzia_mota`
--

CREATE TABLE `agentzia_mota` (
  `Kod` varchar(2) NOT NULL,
  `Mota` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aireportuak`
--

CREATE TABLE `aireportuak` (
  `Aireportu` varchar(3) NOT NULL,
  `Hiria` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `beste_batzuk`
--

CREATE TABLE `beste_batzuk` (
  `ID` int(10) UNSIGNED NOT NULL,
  `Izena` varchar(30) NOT NULL,
  `Eguna` date NOT NULL,
  `Deskribapena` varchar(200) DEFAULT NULL,
  `Prezioa` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bidaiak`
--

CREATE TABLE `bidaiak` (
  `ID` int(10) UNSIGNED NOT NULL,
  `Izena` varchar(30) NOT NULL,
  `Deskribapena` varchar(200) NOT NULL,
  `Data_Hasiera` date NOT NULL,
  `Data_Amaiera` date NOT NULL,
  `ID_Agentzia_Bidaia` int(10) UNSIGNED NOT NULL,
  `ID_Herrialdeak` varchar(2) NOT NULL,
  `Kod_Mota` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bidaia_mota`
--

CREATE TABLE `bidaia_mota` (
  `Kod` varchar(2) NOT NULL,
  `Mota` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hegaldia`
--

CREATE TABLE `hegaldia` (
  `ID` int(10) UNSIGNED NOT NULL,
  `izena` varchar(50) NOT NULL,
  `Jatorrizko` varchar(3) NOT NULL,
  `Helmuga` varchar(3) NOT NULL,
  `Hegaldi_Kod` varchar(6) NOT NULL,
  `Aerolinea` varchar(4) NOT NULL,
  `Prezioa` double NOT NULL,
  `Irteera_Data` date NOT NULL,
  `Irteera_Ordua` time NOT NULL,
  `Iraupena` varchar(10) NOT NULL,
  `ID_buelta` int(10) UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `herrialdea`
--

CREATE TABLE `herrialdea` (
  `ID` varchar(2) NOT NULL,
  `Izena` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `langile_kop`
--

CREATE TABLE `langile_kop` (
  `Kod` varchar(2) NOT NULL,
  `Kopurua` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `logela_mota`
--

CREATE TABLE `logela_mota` (
  `Kod` varchar(3) NOT NULL,
  `Mota` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ostatua`
--

CREATE TABLE `ostatua` (
  `ID` int(10) UNSIGNED NOT NULL,
  `Hotelaren_Izena` varchar(30) NOT NULL,
  `Hiria` varchar(60) NOT NULL,
  `Prezioa` double NOT NULL,
  `Sarrera_Eguna` date NOT NULL,
  `Irteera_Eguna` date NOT NULL,
  `Logela_Mota` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `zerbitzuak`
--

CREATE TABLE `zerbitzuak` (
  `ID` int(10) UNSIGNED NOT NULL,
  `ID_Bidaiak` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `aerolinea`
--
ALTER TABLE `aerolinea`
  ADD PRIMARY KEY (`Kod`);

--
-- Indices de la tabla `agentzia`
--
ALTER TABLE `agentzia`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `Erabiltzailea` (`Erabiltzailea`),
  ADD KEY `Kod_Mota` (`Kod_Mota`),
  ADD KEY `Langile_Kop` (`Langile_Kop`);

--
-- Indices de la tabla `agentzia_mota`
--
ALTER TABLE `agentzia_mota`
  ADD PRIMARY KEY (`Kod`);

--
-- Indices de la tabla `aireportuak`
--
ALTER TABLE `aireportuak`
  ADD PRIMARY KEY (`Aireportu`);

--
-- Indices de la tabla `beste_batzuk`
--
ALTER TABLE `beste_batzuk`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `bidaiak`
--
ALTER TABLE `bidaiak`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `Kod_Mota` (`Kod_Mota`),
  ADD KEY `ID_Agentzia_Bidaia` (`ID_Agentzia_Bidaia`),
  ADD KEY `ID_Herrialdeak` (`ID_Herrialdeak`);

--
-- Indices de la tabla `bidaia_mota`
--
ALTER TABLE `bidaia_mota`
  ADD PRIMARY KEY (`Kod`);

--
-- Indices de la tabla `hegaldia`
--
ALTER TABLE `hegaldia`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `Jatorrizko` (`Jatorrizko`),
  ADD KEY `Helmuga` (`Helmuga`),
  ADD KEY `Aerolinea` (`Aerolinea`),
  ADD KEY `ID_buelta` (`ID_buelta`);

--
-- Indices de la tabla `herrialdea`
--
ALTER TABLE `herrialdea`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `langile_kop`
--
ALTER TABLE `langile_kop`
  ADD PRIMARY KEY (`Kod`);

--
-- Indices de la tabla `logela_mota`
--
ALTER TABLE `logela_mota`
  ADD PRIMARY KEY (`Kod`);

--
-- Indices de la tabla `ostatua`
--
ALTER TABLE `ostatua`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `Logela_Mota` (`Logela_Mota`);

--
-- Indices de la tabla `zerbitzuak`
--
ALTER TABLE `zerbitzuak`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_Bidaiak` (`ID_Bidaiak`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `agentzia`
--
ALTER TABLE `agentzia`
  MODIFY `ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `beste_batzuk`
--
ALTER TABLE `beste_batzuk`
  MODIFY `ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `bidaiak`
--
ALTER TABLE `bidaiak`
  MODIFY `ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de la tabla `hegaldia`
--
ALTER TABLE `hegaldia`
  MODIFY `ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `ostatua`
--
ALTER TABLE `ostatua`
  MODIFY `ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `zerbitzuak`
--
ALTER TABLE `zerbitzuak`
  MODIFY `ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `agentzia`
--
ALTER TABLE `agentzia`
  ADD CONSTRAINT `agentzia_ibfk_1` FOREIGN KEY (`Kod_Mota`) REFERENCES `agentzia_mota` (`Kod`),
  ADD CONSTRAINT `agentzia_ibfk_2` FOREIGN KEY (`Langile_Kop`) REFERENCES `langile_kop` (`Kod`);

--
-- Filtros para la tabla `beste_batzuk`
--
ALTER TABLE `beste_batzuk`
  ADD CONSTRAINT `beste_batzuk_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `zerbitzuak` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `bidaiak`
--
ALTER TABLE `bidaiak`
  ADD CONSTRAINT `bidaiak_ibfk_1` FOREIGN KEY (`Kod_Mota`) REFERENCES `bidaia_mota` (`Kod`),
  ADD CONSTRAINT `bidaiak_ibfk_2` FOREIGN KEY (`ID_Agentzia_Bidaia`) REFERENCES `agentzia` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `bidaiak_ibfk_3` FOREIGN KEY (`ID_Herrialdeak`) REFERENCES `herrialdea` (`ID`);

--
-- Filtros para la tabla `hegaldia`
--
ALTER TABLE `hegaldia`
  ADD CONSTRAINT `hegaldia_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `zerbitzuak` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `hegaldia_ibfk_2` FOREIGN KEY (`Jatorrizko`) REFERENCES `aireportuak` (`Aireportu`),
  ADD CONSTRAINT `hegaldia_ibfk_3` FOREIGN KEY (`Helmuga`) REFERENCES `aireportuak` (`Aireportu`),
  ADD CONSTRAINT `hegaldia_ibfk_4` FOREIGN KEY (`Aerolinea`) REFERENCES `aerolinea` (`Kod`),
  ADD CONSTRAINT `hegaldia_ibfk_5` FOREIGN KEY (`ID_buelta`) REFERENCES `hegaldia` (`ID`);

--
-- Filtros para la tabla `ostatua`
--
ALTER TABLE `ostatua`
  ADD CONSTRAINT `ostatua_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `zerbitzuak` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ostatua_ibfk_2` FOREIGN KEY (`Logela_Mota`) REFERENCES `logela_mota` (`Kod`);

--
-- Filtros para la tabla `zerbitzuak`
--
ALTER TABLE `zerbitzuak`
  ADD CONSTRAINT `zerbitzuak_ibfk_1` FOREIGN KEY (`ID_Bidaiak`) REFERENCES `bidaiak` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
