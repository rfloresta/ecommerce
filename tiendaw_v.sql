-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-08-2020 a las 00:48:44
-- Versión del servidor: 10.4.13-MariaDB
-- Versión de PHP: 7.2.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tiendaw_v`
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
  `privilegio` char(1) DEFAULT NULL,
  `codigo_generado` char(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `administrador`
--

INSERT INTO `administrador` (`dni`, `nombres`, `apellidos`, `password`, `email`, `privilegio`, `codigo_generado`) VALUES
('48887174', 'Romario', 'Flores Taipe', 'EfrkOriAHudSiGwRC51kkg==', 'romariojulerft@gmail.com', 'A', '24726'),
('73184116', 'Bryan David', 'Estrada Gomez', '19Oq6s30bkDltr82xGql9g==', 'bestradag05@gmail.com', 'A', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `idCategoria` int(11) NOT NULL,
  `nombre` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`idCategoria`, `nombre`) VALUES
(1, 'Maquillaje'),
(2, 'Piel'),
(3, 'Perfume'),
(5, 'Cuidado Personal');

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
  `password` varchar(100) DEFAULT NULL,
  `codigo_generado` char(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `nombres`, `apellidos`, `dni`, `numCelular`, `direccion`, `email`, `password`, `codigo_generado`) VALUES
(4, 'Fernanda', 'Castillo', '45963256', '996555254', '', '', '222', NULL),
(5, 'Romario', 'Flores', '48887174', '1111', NULL, 'rfloresta@autonoma.edu.pe', '2222', '57757'),
(12, 'Mariana', 'Bellido', '12345678', '3331111', 'HÃ©roes del pacÃ­fico', 'mariana@gmail.com', 'cT5laPhj4RI=', NULL),
(14, '1', '1', NULL, NULL, NULL, 'sd', 'EfrkOriAHucSY5R4zTRSGg==', NULL),
(15, 'Bryan', 'Estrada', '73184116', '977834697', 'Av.Revolucion', 'bestradag05@gmail.com', '19Oq6s30bkDltr82xGql9g==', NULL);

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
(3, 100.00, 0.00, 3, 3),
(2, 100.00, 0.00, 3, 6),
(2, 100.00, 0.00, 3, 7),
(1, 60.00, 0.00, 4, 7),
(1, 45.00, 0.00, 6, 6),
(2, 45.00, 0.00, 6, 8);

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
(1, '20100148162', 'W&V Negocios y Servicios S.A.C', 'Calle...', 'nego.png');

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
  `numero` varchar(20) DEFAULT NULL,
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
(1, 'A00001', '14/06/2020', 100.00, 0.18, 500.00, 'Tarjeta', '0', 4),
(2, 'A00002', '14/06/2020', 200.00, 0.18, 200.00, 'Tarjeta', '0', 4),
(3, 'A00003', '15/06/2020', 300.00, 0.18, 300.00, 'Tarjeta', '0', 4),
(6, 'A00004', '18/08/2020', 245.00, 44.10, 245.00, 'Tarjeta', '1', 15),
(7, 'A00005', '18/08/2020', 260.00, 46.80, 260.00, 'Tarjeta', '1', 15),
(8, 'A00006', '19/08/2020', 90.00, 16.20, 90.00, 'Tarjeta', '1', 15);

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
  `imagen` text DEFAULT NULL,
  `idCategoria` int(11) DEFAULT NULL,
  `idMarca` int(11) DEFAULT NULL,
  `idSubCategoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombre`, `descripcion`, `stock`, `precioCompra`, `precioVenta`, `descuento`, `imagen`, `idCategoria`, `idMarca`, `idSubCategoria`) VALUES
(3, 'Magnat ', 'Perfume super fuerte', 280, 80.00, 100.00, 0.00, 'Magnat.jpg', 3, 2, 21),
(4, 'KromoBlack', 'Aroma para conquistar', 97, 50.00, 60.00, 0.00, 'KromoBlack.jpg', 3, 3, 30),
(5, 'Corrector de ojos', 'Mucho mas belleza', 12, 11.00, 15.00, NULL, 'Otros_Productos_Corrector_OjosOS.jpg', 1, 3, 27),
(6, 'Crema Facial', 'Para un rostro mucho mas limpio', 17, 30.00, 45.00, NULL, 'Otros_Productos_Crema_Facila_Restauradora_Oxygen_Supreme.jpg', 1, 2, 21),
(7, 'Desodorante RollStock', 'Una mejor fragancia', 50, 18.00, 22.00, NULL, 'Otros_Productos_Desodorante_ROll-On.jpg', 5, 1, 23),
(8, 'Labial', 'Color fuerte', 12, 15.00, 18.00, NULL, 'Otros_Productos_Labial_HD_Longwear.jpg', 1, 2, 21),
(9, 'Perfume Devos', 'Para hombres conquistadores', 100, 27.00, 35.00, NULL, 'perfume_devos.jpg', 3, 3, 30);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `subcategoria`
--

CREATE TABLE `subcategoria` (
  `idSubcategoria` int(11) NOT NULL,
  `nombre` varchar(60) DEFAULT NULL,
  `idCategoria` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `subcategoria`
--

INSERT INTO `subcategoria` (`idSubcategoria`, `nombre`, `idCategoria`) VALUES
(21, 'Rostro', 1),
(23, 'Cuerpo', 5),
(24, 'Cabello', 5),
(25, 'Hidratantes', 2),
(26, 'Cuidado de ojos', 2),
(27, 'Ojos', 1),
(28, 'Labios', 1),
(29, 'Mujer', 3),
(30, 'Hombre', 3);

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
  ADD KEY `idCliente` (`idCliente`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`),
  ADD KEY `producto_ibfk_1` (`idCategoria`),
  ADD KEY `producto_ibfk_2` (`idMarca`),
  ADD KEY `producto_ibfk_3` (`idSubCategoria`);

--
-- Indices de la tabla `subcategoria`
--
ALTER TABLE `subcategoria`
  ADD PRIMARY KEY (`idSubcategoria`),
  ADD KEY `idCategoria` (`idCategoria`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `empresa`
--
ALTER TABLE `empresa`
  MODIFY `idEmpresa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `marca`
--
ALTER TABLE `marca`
  MODIFY `idMarca` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `subcategoria`
--
ALTER TABLE `subcategoria`
  MODIFY `idSubcategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_pedido`
--
ALTER TABLE `detalle_pedido`
  ADD CONSTRAINT `detalle_pedido_ibfk_1` FOREIGN KEY (`idPedido`) REFERENCES `pedido` (`idPedido`),
  ADD CONSTRAINT `detallepedido_ibfk_1` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);

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
  ADD CONSTRAINT `producto_ibfk_2` FOREIGN KEY (`idMarca`) REFERENCES `marca` (`idMarca`),
  ADD CONSTRAINT `producto_ibfk_3` FOREIGN KEY (`idSubCategoria`) REFERENCES `subcategoria` (`idSubcategoria`);

--
-- Filtros para la tabla `subcategoria`
--
ALTER TABLE `subcategoria`
  ADD CONSTRAINT `subcategoria_ibfk_1` FOREIGN KEY (`idCategoria`) REFERENCES `categoria` (`idCategoria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
