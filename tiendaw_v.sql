-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-06-2020 a las 02:21:12
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tiendaw_v`
--
--

DELIMITER $$
--
-- Procedimientos 
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_actualizarcantidadproducto` (IN `cantidad` INT, IN `precioVenta` DOUBLE(10,2), IN `idProducto` INT)  BEGIN

    update producto 
    set stock = stock + cantidad, 
    precioVenta= precioVenta 
    where producto.idProducto=idProducto;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_contarproductoMarca` (IN `marca` INT)  BEGIN
select count(*) as cantidad from producto where idMarca=marca;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listarcategoria` ()  BEGIN
	SELECT idCategoria, nombre from categoria
    where idCategoria=categoriaSuperior;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listarmarca` ()  BEGIN
	SELECT idMarca, nombre from marca;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listarproducto` ()  BEGIN
	SELECT idProducto, nombre, descripcion, stock, precioCompra, precioVenta, descuento, imagen, idCategoria, idMarca from producto;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listarproductoCategoria` (IN `categoria` INT)  BEGIN
	select p.* from producto p 
    inner join categoria c on c.idCategoria=p.idCategoria
    and p.idCategoria=categoria;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listarproductoMarca` (`marca` INT)  BEGIN
	select p.* from producto p 
    inner join marca m on m.idMarca=p.idMarca
    and p.idMarca=marca;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listarsubCategoria` (`csuperior` INT)  BEGIN
	select idCategoria,nombre from categoria
    where idCategoria<>categoriaSuperior and categoriaSuperior=csuperior;
end$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `dni` char(8) NOT NULL,
  `nombres` varchar(100) DEFAULT NULL,
  `apellidos` varchar(100) NOT NULL,
  `password` varchar(100) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `privilegio` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `administrador`
--

INSERT INTO `administrador` (`dni`, `nombres`, `apellidos`, `password`, `email`, `privilegio`) VALUES
('12345678', 'Juan', 'Perez', NULL, 'juan@gmail.com', NULL),
('48887174', 'Romario', 'Flores Taipe', 'b5mTWKsLlek=', NULL, 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `idCategoria` int(11) NOT NULL,
  `nombre` varchar(150) DEFAULT NULL,
  `categoriaSuperior` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`idCategoria`, `nombre`, `categoriaSuperior`) VALUES
(1, 'Perfumes', 1),
(2, 'Hombre', 1),
(3, 'Mujer', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `nombres` varchar(255) DEFAULT NULL,
  `apellidos` varchar(255) DEFAULT NULL,
  `dni` char(8) DEFAULT NULL,
  `numCelular` char(9) DEFAULT NULL,
  `direccion` varchar(200) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `nombres`, `apellidos`, `dni`, `numCelular`, `direccion`, `email`, `password`) VALUES
(1, 'maria', 'fernandez', '48568968', '948049745', 'VES', 'maria@gmail.com', '123');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_pedido`
--

CREATE TABLE `detalle_pedido` (
  `cantidad` int(3) DEFAULT NULL,
  `precio` double(10,2) DEFAULT NULL,
  `descuento` double(10,2) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `idPedido` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `detalle_pedido`
--

INSERT INTO `detalle_pedido` (`cantidad`, `precio`, `descuento`, `idProducto`, `idPedido`) VALUES
(1, 100.00, 0.00, 3, 1),
(2, 100.00, 0.00, 3, 2),
(3, 100.00, 0.00, 3, 3);

--
-- Disparadores `detalle_pedido`
--
DELIMITER $$
CREATE TRIGGER `actualizarstock` AFTER INSERT ON `detalle_pedido` FOR EACH ROW update producto
set producto.stock = producto.stock - new.cantidad
where producto.idProducto = new.idProducto
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `idEmpresa` int(11) NOT NULL,
  `ruc` char(11) DEFAULT NULL,
  `razonSocial` varchar(200) DEFAULT NULL,
  `direccion` text NOT NULL,
  `logo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empresa`
--

INSERT INTO `empresa` (`idEmpresa`, `ruc`, `razonSocial`, `direccion`, `logo`) VALUES
(1, '20100148162', 'W&V Negocios y Servicios S.A.C', 'Calle...', 'nego.png'),
(2, '20100148162', 'W&V Negocios y Servicios S.A.C', 'Calle Toribio', NULL),
(3, '20100148162', 'W&V Negocios y Servicios S.A.C', 'Calle...', 'aua.jpg'),
(4, '20100148162', 'W&V Negocios y Servicios S.A.C', 'B, Villa El Salvador', 'nego.png');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marca`
--

CREATE TABLE `marca` (
  `idMarca` int(11) NOT NULL,
  `nombre` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `marca`
--

INSERT INTO `marca` (`idMarca`, `nombre`) VALUES
(1, 'Esika'),
(2, 'Cyzone'),
(3, 'Unique');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `idPedido` int(11) NOT NULL,
  `numero` int(11) DEFAULT NULL,
  `fecha` varchar(50) DEFAULT NULL,
  `subtotal` double(10,2) DEFAULT NULL,
  `igv` double(10,2) DEFAULT NULL,
  `total` double(10,2) DEFAULT NULL,
  `pago` varchar(10) DEFAULT NULL,
  `estado` char(1) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`idPedido`, `numero`, `fecha`, `subtotal`, `igv`, `total`, `pago`, `estado`, `idCliente`) VALUES
(1, 1, '2020-06-14 22:28:01', 100.00, 0.18, 100.00, 'Tarjeta', '0', 1),
(2, 2, '2020-06-14 23:50:00', 200.00, 0.18, 200.00, 'Tarjeta', '0', 1),
(3, 3, '2020-06-15 00:24:03', 300.00, 0.18, 300.00, 'Tarjeta', '0', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `descripcion` text NOT NULL,
  `stock` int(11) DEFAULT NULL,
  `precioCompra` double(10,2) DEFAULT NULL,
  `precioVenta` double(10,2) DEFAULT NULL,
  `descuento` double(10,2) DEFAULT NULL,
  `imagen` text,
  `idCategoria` int(11) DEFAULT NULL,
  `idMarca` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombre`, `descripcion`, `stock`, `precioCompra`, `precioVenta`, `descuento`, `imagen`, `idCategoria`, `idMarca`) VALUES
(1, 'Altheus', 'perfume con aroma deportivo', 900, 50.00, 65.00, 0.00, 'blue.png', 2, 1),
(2, 'Cardigan', 'perfume con aroma seductor', 648, 70.00, 80.00, 0.00, 'inlove.jpg', 2, 1),
(3, 'Glamour', 'perfume con aroma seductor', 286, 80.00, 100.00, 0.00, 'vera.jpg', 3, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `detalle_pedido`
--
ALTER TABLE `detalle_pedido`
  ADD PRIMARY KEY (`idProducto`,`idPedido`),
  ADD KEY `idProducto` (`idProducto`),
  ADD KEY `idPedico` (`idPedido`);

--
-- Indices de la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`idEmpresa`);

--
-- Indices de la tabla `marca`
--
ALTER TABLE `marca`
  ADD PRIMARY KEY (`idMarca`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idPedido`),
  ADD KEY `pedido_ibfk_1` (`idCliente`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`),
  ADD KEY `producto_ibfk_1` (`idCategoria`),
  ADD KEY `producto_ibfk_2` (`idMarca`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `empresa`
--
ALTER TABLE `empresa`
  MODIFY `idEmpresa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `marca`
--
ALTER TABLE `marca`
  MODIFY `idMarca` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_pedido`
--
ALTER TABLE `detalle_pedido`
  ADD CONSTRAINT `detallepedido_ibfk_1` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`),
  ADD CONSTRAINT `detallepedido_ibfk_2` FOREIGN KEY (`idPedido`) REFERENCES `pedido` (`idPedido`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`idCategoria`) REFERENCES `categoria` (`idCategoria`),
  ADD CONSTRAINT `producto_ibfk_2` FOREIGN KEY (`idMarca`) REFERENCES `marca` (`idMarca`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
