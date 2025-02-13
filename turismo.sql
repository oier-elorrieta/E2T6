-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-02-2025 a las 12:36:31
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
-- Base de datos: `turismo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aerolinea`
--

CREATE TABLE `aerolinea` (
  `Kod` varchar(2) NOT NULL,
  `Izena` varchar(60) NOT NULL,
  `Herrialdea` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `aerolinea`
--

INSERT INTO `aerolinea` (`Kod`, `Izena`, `Herrialdea`) VALUES
('2K', 'AVIANCA-Ecuador dba AVIANCA', 'EC'),
('3P', 'World 2 Fly PT, S.A.', 'PT'),
('6B', 'TUIfly Nordic AB', 'CN'),
('A.', 'Air France ', 'FR'),
('A0', 'BA Euroflyer Limited dba British Airways', 'GB'),
('AA', 'American Airlines', 'USA'),
('AM', 'Aerovias de Mexico SA de CV dba AeroMexico', 'MX'),
('AR', 'Aerolineas Argentinas S.A.', 'AR'),
('AV', 'Aerovias del Continente Americano S.A. AVIANCA', 'CO'),
('AY', 'Finnair ', 'FI'),
('AZ', 'Alitalia', 'IT'),
('BA', 'British Airways PLC', 'GB'),
('CL', 'Lufthansa CityLine GmbH', 'DE'),
('DE', 'Condor Flugdienst GmbH', 'DE'),
('DL', 'Delta Air Lines Inc', 'USA'),
('DS', 'Easyjet CH S.A', 'CH'),
('GL', 'Air GRL', 'GRL'),
('JJ', 'Tam Linhas Aereas SA dba Latam Airlines Brasil', 'BR'),
('KL', 'KLM', 'NL'),
('KN', 'CN United Airlines', 'CN'),
('KO', 'IZENA', 'HER'),
('LH', 'Lufthansa', 'DE'),
('LX', 'SWISS Internation Air Lines Ltd', 'CH'),
('M3', 'BSA - Aerolinhas Brasileiras S.A dba LATAM Cargo Br', 'BR'),
('MS', 'Egyptair', 'EG'),
('MT', 'MT Air Travel Ltd dba MT MedAir', 'MT'),
('N0', 'Norse Atlantic Airways AS', 'NO'),
('OU', 'HR Airlines d.d.', 'HR'),
('PC', 'Pegasus Airlines', 'TR'),
('QR', 'QA Airways Group Q.C.S.C dba QA Airways', 'QA'),
('RJ', 'Alia - The Royal JOn Airlines dba Royal JOn', 'JO'),
('RK', 'RYNAIR', 'GB'),
('S4', 'SATA Internacional - Azores Airlines, S.A.', 'PT'),
('SN', 'Brussels Airlines', 'BE'),
('SP', 'SATA (Air Acores)', 'PT'),
('TK', 'Turkish Airlines Inc', 'TR'),
('TP', 'TAP PT', 'PT'),
('TS', 'Air Transat', 'CA'),
('U2', 'EASYJET UK LIMITED', 'GB'),
('UA', 'United Airlines Inc', 'USA'),
('UX', 'Air Europa Lineas Aereas, S.A.', 'ES'),
('VO', 'Aerolínea Vueling SA', 'ES'),
('VS', 'Virgin Atlantic Airways Ltd', 'GB'),
('WA', 'KLM Cityhopper', 'NL'),
('WF', 'World2Fly', 'ES'),
('WK', 'Edelweiss Air AG', 'CH'),
('X3', 'TUIfly Gmbh', 'DE'),
('X7', 'Challenge Airlines (BE) S.A.', 'BE'),
('YW', 'Air Nostrum, Lineas aereas del Mediterra neo SA', 'ES');

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

--
-- Volcado de datos para la tabla `agentzia`
--

INSERT INTO `agentzia` (`ID`, `Izena`, `Logoa`, `Markaren_Kolore`, `Erabiltzailea`, `Pasahitza`, `Kod_Mota`, `Langile_Kop`) VALUES
(1, 'Elorrieta', 'logo.png', 'FFFFFF', '', '', 'A1', 'L1'),
(11, 'kk', 'kk', 'kk', 'kk', 'kk', 'A1', 'L1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `agentzia_mota`
--

CREATE TABLE `agentzia_mota` (
  `Kod` varchar(2) NOT NULL,
  `Mota` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `agentzia_mota`
--

INSERT INTO `agentzia_mota` (`Kod`, `Mota`) VALUES
('A1', 'Mayorista'),
('A2', 'Minorista'),
('A3', 'Mayorista-minorista');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aireportuak`
--

CREATE TABLE `aireportuak` (
  `Aireportu` varchar(3) NOT NULL,
  `Hiria` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `aireportuak`
--

INSERT INTO `aireportuak` (`Aireportu`, `Hiria`) VALUES
('ACA', 'MÉXICO (ACAPULCO)'),
('ACE', 'Lanzarote '),
('AGP', 'MALAGA'),
('ALC', 'Alicante '),
('AMM', 'JO (Ammán ) AMM'),
('AMS', 'HOLANDA Amsterdam '),
('ATH', 'GRECIA ( Atenas)'),
('BCN', 'barcelona'),
('BER', 'ALEMANIA (Berlín )'),
('BIO', 'Bilbao'),
('BJZ', 'Badajoz '),
('BKK', 'TAILANDIA Bagkok '),
('BOG', 'COLOMBIA Bogotá '),
('BOS', 'Boston '),
('BRU', 'BELGICA (Bruselas )'),
('BSB', 'BRASIL (brasilia)'),
('BUE', 'Buenos Aires '),
('CAI', ' EG El Cairo '),
('CAS', ' MARRUECOS (Casablanca) '),
('CCS', 'VENEZUELA ( CARACAS)'),
('CDG', 'FRANCIA,París (aeropuerto Charles de Gaulle)'),
('CPH', 'DINAMARCA '),
('DTT', 'DETROIT'),
('DUB', 'IRLANDA (DUBLIN)'),
('DUS', 'ALEMANIA (Dusseldorf )'),
('EAS', 'SAN SEBASTIAN'),
('FRA', 'ALEMANIA (Frankfurt )'),
('FUE', 'FUERTEVENTURA'),
('GMZ', 'LA GOMERA'),
('GRO', 'Gerona '),
('GRX', 'Granada '),
('GVA', 'SUIZA (Ginebra )'),
('HAM', 'ALEMANIA (hamburgo)'),
('HEL', 'FINLANDIA (Helsinki )'),
('HOU', 'Houston '),
('IBZ', 'Ibiza '),
('IST', 'TR (ESTAMBUL)'),
('JFK', 'Nueva York '),
('KIN', 'JAMAICA (kingston)'),
('LAX', 'LOS ANGELES'),
('LBG', 'FRANCIA ,Le Bourget,'),
('LCG', 'La Coruña LCG'),
('LGH', 'LONDRES (GATWICK)'),
('LHR', 'LONDRES Heathrow'),
('LIM', 'PERU ( Lima)'),
('LIS', 'PT (lisboa)'),
('LPA', 'GRAN CANARIA '),
('LYS', 'FRANCIA (lyon)'),
('MAD', 'Madrid'),
('MAH', 'MAHON'),
('MEL', ' AUSTRALIA Melbourne '),
('MEX', ' México D.F.'),
('MIA', 'Miami'),
('MIL', ' ITALIA (Milán )'),
('MJV', 'Murcia '),
('MOW', ' RUSIA (Moscú ) MOW '),
('MRS', 'FRANCIA (Marsella)'),
('MUC', 'ALEMANIA (Munich )'),
('NBO', 'KENIA ( Nairobi)'),
('ODB', 'Córdoba '),
('ORY', 'FRANCIA (ORLY)'),
('OSL', 'NORUEGA (oslo)'),
('OVD', 'Asturias '),
('PHL', 'Philadelphia PHL '),
('PMI', 'PALMA DE MALLORCA'),
('PNA', 'Pamplona '),
('PRG', 'REPUBLICA CHECA (Praga )'),
('RAK', 'MARRUECOS (Marrakech)'),
('REU', 'REUS'),
('RIO', 'BRASIL (Rio de Janeiro )'),
('SAO', ' BRASIL (Sao Paulo )'),
('SCQ', 'Santiago de Compostela '),
('SDQ', ' REPUBLICA DOMINICANA (Santo Domingo) '),
('SDR', 'SANTANDER'),
('SEA', 'Seattle '),
('SFO', 'SAN FRANCISCO'),
('SLM', 'Salamanca '),
('SPC', 'Santa Cruz de la Palma '),
('STN', 'LONDRES ( Stanted)'),
('STO', 'SUECIA (Estocolmo)'),
('STR', 'ALEMANIA (Stuttgart) '),
('SYD', 'AUSTRALIA (SIYNEY)'),
('TFN', 'Tenerife Norte '),
('TFS', 'Tenerife Sur '),
('TUN', 'Túnez '),
('VDE', 'HIERRO '),
('VGO', 'Vigo '),
('VIE', 'AUSTRIA (Viena )'),
('VIT', 'VITORIA'),
('VLC', 'Valencia '),
('WAS', 'WASHINGTON'),
('WAW', 'POLONIA (Varsovia ) WAW '),
('XRY', 'JEREZ DE LA FRONTERA'),
('YMQ', 'Montreal, Québec '),
('YOW', ' CA Ottawa, Ontario YOW'),
('YTO', 'CA Toronto, Ontario YTO'),
('YVR', 'CA VANCOUVER  '),
('ZAZ', 'Zaragoza'),
('ZRH', 'SUIZA (Zurich)');

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

--
-- Volcado de datos para la tabla `beste_batzuk`
--

INSERT INTO `beste_batzuk` (`ID`, `Izena`, `Eguna`, `Deskribapena`, `Prezioa`) VALUES
(3, 'Beste Batzuk', '2025-02-19', 'bla bla bla', 150),
(31, 'ww', '2025-02-08', 'blo bloa blo', 99);

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

--
-- Volcado de datos para la tabla `bidaiak`
--

INSERT INTO `bidaiak` (`ID`, `Izena`, `Deskribapena`, `Data_Hasiera`, `Data_Amaiera`, `ID_Agentzia_Bidaia`, `ID_Herrialdeak`, `Kod_Mota`) VALUES
(1, 'Lehen Bidaia', 'kuhk', '2025-01-01', '2025-01-24', 1, 'GB', 'B4'),
(2, 'Bigarren biadaia', 'egun on', '2025-02-17', '2025-02-27', 1, 'CH', 'B6'),
(3, 'Elorrieta', 'xgfkoìpo`,.b mcghtfu', '2025-04-01', '2025-07-25', 1, 'EG', 'B3'),
(9, 'Hirugarren Bidaia', 'bonjdrgfenjdhffd', '2025-02-20', '2025-02-27', 1, 'AT', 'B3'),
(53679, 'kk', 'kk', '2025-02-01', '2025-02-09', 1, 'AT', 'B5'),
(53680, 'kk', 'kk', '2025-02-02', '2025-02-14', 11, 'HU', 'B5'),
(53681, 'aa', 'aaa', '2025-02-01', '2025-02-28', 11, 'JP', 'B4'),
(53682, 'bidaia', 'deskribapena', '2025-02-01', '2025-02-02', 11, 'AR', 'B1'),
(53683, 'fggh', 'dgfhsvstgnjh', '2025-02-23', '2025-02-28', 11, 'CA', 'B2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bidaia_mota`
--

CREATE TABLE `bidaia_mota` (
  `Kod` varchar(2) NOT NULL,
  `Mota` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `bidaia_mota`
--

INSERT INTO `bidaia_mota` (`Kod`, `Mota`) VALUES
('B1', 'Ezkongaiak'),
('B2', 'Senior'),
('B3', 'Taldeak'),
('B4', 'Bidaia handiak (helmuga exotikoak + hegaldia + ostatua)'),
('B5', 'Eskapada'),
('B6', 'Familiak (haur txikiekin)');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hegaldia`
--

CREATE TABLE `hegaldia` (
  `ID` int(10) UNSIGNED NOT NULL,
  `Izena` varchar(50) NOT NULL,
  `Jatorrizko` varchar(3) NOT NULL,
  `Helmuga` varchar(3) NOT NULL,
  `Hegaldi_Kod` varchar(6) NOT NULL,
  `Aerolinea` varchar(2) NOT NULL,
  `Prezioa` double NOT NULL,
  `Irteera_Data` date NOT NULL,
  `Irteera_Ordua` time NOT NULL,
  `Iraupena` varchar(10) NOT NULL,
  `ID_buelta` int(10) UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `hegaldia`
--

INSERT INTO `hegaldia` (`ID`, `Izena`, `Jatorrizko`, `Helmuga`, `Hegaldi_Kod`, `Aerolinea`, `Prezioa`, `Irteera_Data`, `Irteera_Ordua`, `Iraupena`, `ID_buelta`) VALUES
(25, 'kk', 'ACE', 'BCN', '22', 'AM', 12, '2025-02-14', '00:00:22', '22', NULL),
(26, 'kk', 'ALC', 'AMM', '11', 'A0', 12, '2025-02-01', '00:00:11', '11', 25),
(27, 'bilbao', 'ACE', 'AMS', '1', 'A.', 4, '2025-02-01', '00:00:02', '3', NULL),
(30, 'bai', 'AMS', 'BER', '300A', 'A.', 321, '2025-02-09', '08:21:07', '4 ordu', NULL),
(33, 'fgygfjs', 'ACA', 'ACA', '243L', '2K', 456, '2025-04-01', '00:00:12', '30 minutu', NULL),
(34, 'utyks', 'ACA', 'ACA', '678P', '2K', 1, '2025-02-15', '00:00:45', 'dgfghfs', NULL),
(36, 'yjgfku', 'ACA', 'ACA', '900F', '2K', 6, '2025-02-23', '00:00:01', 'gfkj', NULL),
(39, 'fjdyfj', 'ACA', 'ACA', 'bb', '2K', 99, '2025-02-18', '00:00:03', '3', NULL),
(40, 'fjdyfj', 'ACA', 'ACA', 'aa', '2K', 99, '2025-02-09', '00:00:02', '2', 39),
(41, 'aaa', 'ACA', 'ACA', 'vvvv', '2K', 123, '2025-02-20', '00:00:09', '4', NULL),
(42, 'aaa', 'ACA', 'ACA', 'bbb', '2K', 123, '2025-02-15', '00:00:09', '4', 41),
(43, 'bbb', 'ACA', 'ACA', 'sss', '2K', 34, '2025-02-15', '00:00:06', '7', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `herrialdea`
--

CREATE TABLE `herrialdea` (
  `ID` varchar(2) NOT NULL,
  `Izena` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `herrialdea`
--

INSERT INTO `herrialdea` (`ID`, `Izena`) VALUES
('AR', 'ARGENTINA'),
('AT', 'AUSTRIA'),
('BE', ' BÉLGICA'),
('BR', 'BRASIL'),
('CA', 'CANADA'),
('CH', 'SUIZA'),
('CN', 'CHINA'),
('CU', 'CUBA'),
('CY', 'CHIPRE'),
('CZ', 'REPUBLICA CHECA'),
('DE', 'ALEMANIA'),
('DK', 'DINAMARCA'),
('EE', 'ESTONIA'),
('EG', 'EGIPTO'),
('ES', 'ESPAÑA'),
('FI', 'FINLANDIA'),
('FR', 'FRANCIA'),
('GB', 'REINO UNIDO'),
('GR', 'GRECIA'),
('GT', 'GUATEMALA'),
('HK', 'HONG-KONG'),
('HR', 'CROACIA'),
('HU', 'HUNGRIA'),
('ID', 'Izena'),
('IE', 'IRLANDA'),
('IL', 'ISRAEL'),
('IN', 'INDIA'),
('IS', 'ISLANDIA'),
('IT', 'ITALIA'),
('JM', 'JAMAICA'),
('JP', 'JAPÓN'),
('KE', 'KENIA'),
('LU', 'LUXEMBURGO'),
('MA', 'MARRUECOS'),
('MC', 'MÓNACO'),
('MT', 'MALTA'),
('MV', 'MALDIVAS'),
('MX', 'MEXICO'),
('NL', 'PAISES BAJOS'),
('NO', 'NORUEGA'),
('PA', 'PANAMÁ'),
('PE', 'PERÚ'),
('PL', 'POLONIA'),
('PR', 'PUERTO RICO'),
('PT', 'PORTUGAL'),
('QA', 'QATAR'),
('RO', 'RUMANIA'),
('RU', 'RUSIA'),
('SC', ' SEYCHELLES'),
('SE', 'SUECIA'),
('SG', 'SINGAPUR'),
('TH', 'TAILANDIA'),
('TN', 'TÚNEZ'),
('TR', 'TURQUIA'),
('TZ', 'TANZANIA (INCLUYE ZANZIBAR)'),
('US', 'ESTADOS UNIDOS'),
('VE', 'VENEZUELA'),
('VN', 'VIETNAM'),
('ZA', 'SUDÁFRICA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `langile_kop`
--

CREATE TABLE `langile_kop` (
  `Kod` varchar(2) NOT NULL,
  `Kopurua` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `langile_kop`
--

INSERT INTO `langile_kop` (`Kod`, `Kopurua`) VALUES
('L1', '5 gehienez ( 1 - 5 bitartean)'),
('L2', '10 gehienez (1 - 10 bitartean)'),
('L3', '20 gehienez (1 - 20 bitartean)');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `logela_mota`
--

CREATE TABLE `logela_mota` (
  `Kod` varchar(3) NOT NULL,
  `Mota` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `logela_mota`
--

INSERT INTO `logela_mota` (`Kod`, `Mota`) VALUES
('DB', 'Bikoitza'),
('DUI', 'Bikoitza, erabilpen indibiduala'),
('SIN', 'Indibiduala'),
('TPL', 'Hirukoitza');

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

--
-- Volcado de datos para la tabla `ostatua`
--

INSERT INTO `ostatua` (`ID`, `Hotelaren_Izena`, `Hiria`, `Prezioa`, `Sarrera_Eguna`, `Irteera_Eguna`, `Logela_Mota`) VALUES
(1, 'Lorem Ipsum Hotel', 'Sopela', 100, '2025-01-01', '2025-01-15', 'DB'),
(27, 'ww', 'ww', 100, '2025-02-01', '2025-02-02', 'DB'),
(28, 'jai', 'gorliz', 555, '2025-02-01', '2025-02-11', 'DB');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `zerbitzuak`
--

CREATE TABLE `zerbitzuak` (
  `ID` int(10) UNSIGNED NOT NULL,
  `ID_Bidaiak` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `zerbitzuak`
--

INSERT INTO `zerbitzuak` (`ID`, `ID_Bidaiak`) VALUES
(1, 1),
(2, 1),
(32, 1),
(33, 1),
(41, 1),
(42, 1),
(43, 1),
(3, 2),
(5, 3),
(34, 3),
(39, 3),
(40, 3),
(35, 9),
(36, 9),
(37, 9),
(38, 9),
(6, 53679),
(25, 53679),
(26, 53679),
(27, 53679),
(28, 53679),
(29, 53679),
(30, 53679),
(31, 53679);

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
  MODIFY `ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `beste_batzuk`
--
ALTER TABLE `beste_batzuk`
  MODIFY `ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `bidaiak`
--
ALTER TABLE `bidaiak`
  MODIFY `ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53684;

--
-- AUTO_INCREMENT de la tabla `hegaldia`
--
ALTER TABLE `hegaldia`
  MODIFY `ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- AUTO_INCREMENT de la tabla `ostatua`
--
ALTER TABLE `ostatua`
  MODIFY `ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT de la tabla `zerbitzuak`
--
ALTER TABLE `zerbitzuak`
  MODIFY `ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

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
