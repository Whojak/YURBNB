-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 14-10-2023 a las 14:59:39
-- Versión del servidor: 8.0.31
-- Versión de PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `airbnb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alquiler`
--

DROP TABLE IF EXISTS `alquiler`;
CREATE TABLE IF NOT EXISTS `alquiler` (
  `id_alquiler` int NOT NULL AUTO_INCREMENT,
  `id_usuario` int NOT NULL,
  `id_oferta` int NOT NULL,
  `estado` varchar(30) NOT NULL,
  `fecha_inicio_alquiler` date NOT NULL,
  `fecha_fin_alquiler` date NOT NULL,
  `contrato` varchar(1000) DEFAULT NULL,
  `fecha_registro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_alquiler`),
  KEY `fk_alquiler_usuario` (`id_usuario`),
  KEY `fk_alquiler_oferta` (`id_oferta`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `alquiler`
--

INSERT INTO `alquiler` (`id_alquiler`, `id_usuario`, `id_oferta`, `estado`, `fecha_inicio_alquiler`, `fecha_fin_alquiler`, `contrato`, `fecha_registro`) VALUES
(1, 1, 1, 'Aceptada', '2023-10-16', '2023-10-23', '%PDF-1.3\n%', '2023-10-09 02:39:07');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `favoritos`
--

DROP TABLE IF EXISTS `favoritos`;
CREATE TABLE IF NOT EXISTS `favoritos` (
  `id_favorito` int NOT NULL AUTO_INCREMENT,
  `id_oferta` int NOT NULL,
  PRIMARY KEY (`id_favorito`),
  KEY `fk_favoritos_oferta` (`id_oferta`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `favoritos`
--

INSERT INTO `favoritos` (`id_favorito`, `id_oferta`) VALUES
(1, 1),
(2, 2),
(3, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `img`
--

DROP TABLE IF EXISTS `img`;
CREATE TABLE IF NOT EXISTS `img` (
  `id_img` int NOT NULL AUTO_INCREMENT,
  `id_oferta` int NOT NULL,
  `img1` varchar(1000) DEFAULT NULL,
  `img2` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id_img`),
  KEY `fk_img_oferta` (`id_oferta`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `oferta`
--

DROP TABLE IF EXISTS `oferta`;
CREATE TABLE IF NOT EXISTS `oferta` (
  `id_oferta` int NOT NULL AUTO_INCREMENT,
  `id_usuario` int NOT NULL,
  `costo` double NOT NULL,
  `costo_comision` double NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `descripcion` varchar(300) NOT NULL,
  `observaciones` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `direccion` varchar(150) NOT NULL,
  `deparamento` varchar(30) NOT NULL,
  `contrato` varchar(1000) DEFAULT NULL,
  `estado` varchar(30) NOT NULL,
  `fecha_registro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_oferta`),
  KEY `fk_oferta_usuario` (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `oferta`
--

INSERT INTO `oferta` (`id_oferta`, `id_usuario`, `costo`, `costo_comision`, `titulo`, `descripcion`, `observaciones`, `direccion`, `deparamento`, `contrato`, `estado`, `fecha_registro`) VALUES
(1, 1, 100, 15, 'Salinitas', 'Chivo', NULL, 'Ahi por la playa', 'San Salvador', NULL, 'activa', '2023-10-09 02:34:42'),
(2, 1, 234, 256, 'Nuevo caso', 'Nuevo airbnb', 'buen airbnb', 'ahi por el pital', 'Chalatenango', NULL, 'Aceptado', '2023-10-14 14:55:39'),
(3, 1, 150, 200, 'Costa del solo casa', 'Nuevo airbnb', 'buen airbnb', 'ahi por la costa del sol', 'Chalatenango', NULL, 'Esperando aprobación', '2023-10-14 14:57:57');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipousuario`
--

DROP TABLE IF EXISTS `tipousuario`;
CREATE TABLE IF NOT EXISTS `tipousuario` (
  `id_tipo` int NOT NULL AUTO_INCREMENT,
  `tipo` varchar(20) NOT NULL,
  PRIMARY KEY (`id_tipo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `tipousuario`
--

INSERT INTO `tipousuario` (`id_tipo`, `tipo`) VALUES
(1, 'Ofertante'),
(2, 'Cliente'),
(3, 'Administrador_oferta');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `id_tipo` int NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `token` varchar(30) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `contrasena` varchar(30) NOT NULL,
  `dui` varchar(10) NOT NULL,
  `estado` varchar(30) NOT NULL,
  `fecha_registro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_usuario`),
  KEY `fk_usuario_tipousuario` (`id_tipo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `id_tipo`, `nombre`, `apellido`, `token`, `telefono`, `correo`, `contrasena`, `dui`, `estado`, `fecha_registro`) VALUES
(1, 1, 'jose', 'ramirez', 'RJ210252', '2222-2222', 'jose.ramirez@gmail.com', 'jose123', '22222222', 'activo', '2023-10-09 02:28:22'),
(2, 3, 'Rodrigo', 'Rodriguez', 'RG220673', '22222222', '2021rodrigo.rodriguez@gmail.com', 'raul123', '123456789', 'activo', '2023-10-14 14:50:57'),
(3, 2, 'David', 'Moises ', 'DO202456', '22222222', 'david.moises@gmail.com', 'david123', '123456789', 'activo', '2023-10-14 14:52:01');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alquiler`
--
ALTER TABLE `alquiler`
  ADD CONSTRAINT `fk_alquiler_oferta` FOREIGN KEY (`id_oferta`) REFERENCES `oferta` (`id_oferta`),
  ADD CONSTRAINT `fk_alquiler_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`);

--
-- Filtros para la tabla `favoritos`
--
ALTER TABLE `favoritos`
  ADD CONSTRAINT `fk_favoritos_oferta` FOREIGN KEY (`id_oferta`) REFERENCES `oferta` (`id_oferta`);

--
-- Filtros para la tabla `img`
--
ALTER TABLE `img`
  ADD CONSTRAINT `fk_img_oferta` FOREIGN KEY (`id_oferta`) REFERENCES `oferta` (`id_oferta`);

--
-- Filtros para la tabla `oferta`
--
ALTER TABLE `oferta`
  ADD CONSTRAINT `fk_oferta_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `fk_usuario_tipousuario` FOREIGN KEY (`id_tipo`) REFERENCES `tipousuario` (`id_tipo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
