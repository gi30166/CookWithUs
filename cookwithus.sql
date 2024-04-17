 -- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 17, 2024 at 05:14 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cookwithus`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `booking_nr` varchar(200) NOT NULL,
  `booking_date` date DEFAULT NULL,
  `booking_time` time DEFAULT NULL,
  `booking_seat_nr` int(20) DEFAULT NULL,
  `b_lesson_name` varchar(100) DEFAULT NULL,
  `b_client_name` varchar(30) DEFAULT NULL,
  `b_gift_products` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`booking_nr`, `booking_date`, `booking_time`, `booking_seat_nr`, `b_lesson_name`, `b_client_name`, `b_gift_products`) VALUES
('2', '2024-04-20', '16:56:54', 13, 'French Toast', 'Max', 'French Toast'),
('46e5250e96f748a49411a14616c34d16', NULL, NULL, NULL, NULL, NULL, NULL),
('89cf838a7ccb454483836f65af5cdfe6', '2024-04-20', '17:56:54', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE `client` (
  `client_name` varchar(100) NOT NULL,
  `client_surname` varchar(100) DEFAULT NULL,
  `client_email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`client_name`, `client_surname`, `client_email`) VALUES
('Gzim', 'Ismaili', 'gzimismaili@gmail.com'),
('Gzims', NULL, NULL),
('Ilir', 'Ismaili', 'ilirismaili@gmail.com'),
('Max', 'Van der Stoel', 'maxking@gmail.com'),
('Tringa', 'Shatmani', 'tringashat@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `gift`
--

CREATE TABLE `gift` (
  `products` varchar(100) NOT NULL,
  `g_client_name` varchar(30) DEFAULT NULL,
  `g_lesson_name` varchar(100) DEFAULT NULL,
  `g_booking_nr` varchar(20) DEFAULT NULL,
  `g_seat_nr` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `gift`
--

INSERT INTO `gift` (`products`, `g_client_name`, `g_lesson_name`, `g_booking_nr`, `g_seat_nr`) VALUES
('10% Discount Coupon!', 'Max', 'French Toast', '2', 1),
('20% Discount Coupon!', 'Gzim', 'Mixed Greek Salad', '1', 2),
('Salads', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `lesson`
--

CREATE TABLE `lesson` (
  `lesson_name` varchar(100) NOT NULL,
  `lesson_category` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `lesson`
--

INSERT INTO `lesson` (`lesson_name`, `lesson_category`) VALUES
('French Toast', 'Short Courses'),
('Gzims', NULL),
('Medium-Rare T-Bone', 'Professional Courses'),
('Mixed Greek Salad', 'Short Courses'),
('Pasta with Pesto', 'Intermediate Course');

-- --------------------------------------------------------

--
-- Table structure for table `realization`
--

CREATE TABLE `realization` (
  `r_room_nr` int(11) NOT NULL,
  `r_lesson_name` varchar(30) NOT NULL,
  `realization_date` date NOT NULL,
  `realization_time` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `realization`
--

INSERT INTO `realization` (`r_room_nr`, `r_lesson_name`, `realization_date`, `realization_time`) VALUES
(1, 'Medium-Rare T-Bone', '2024-04-19', '23:57:41'),
(2, 'French Toast', '2024-04-19', '13:57:41');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `room_number` int(11) NOT NULL,
  `room_capacity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`room_number`, `room_capacity`) VALUES
(1, 20),
(2, 10);

-- --------------------------------------------------------

--
-- Table structure for table `seat`
--

CREATE TABLE `seat` (
  `seat_number` int(20) NOT NULL,
  `room_number` int(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `seat`
--

INSERT INTO `seat` (`seat_number`, `room_number`) VALUES
(15, 1),
(21, 1),
(5, 2),
(13, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`booking_nr`),
  ADD KEY `BookingSeat_FK` (`booking_seat_nr`),
  ADD KEY `BookingLesson_FK` (`b_lesson_name`),
  ADD KEY `BookingName_FK` (`b_client_name`);

--
-- Indexes for table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`client_name`);

--
-- Indexes for table `gift`
--
ALTER TABLE `gift`
  ADD PRIMARY KEY (`products`),
  ADD KEY `GClient_FK` (`g_client_name`),
  ADD KEY `GLesson_FK` (`g_lesson_name`),
  ADD KEY `GBookingNr_FK` (`g_booking_nr`);

--
-- Indexes for table `lesson`
--
ALTER TABLE `lesson`
  ADD PRIMARY KEY (`lesson_name`);

--
-- Indexes for table `realization`
--
ALTER TABLE `realization`
  ADD PRIMARY KEY (`r_room_nr`,`r_lesson_name`,`realization_date`),
  ADD KEY `RLessonName_FK` (`r_lesson_name`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`room_number`);

--
-- Indexes for table `seat`
--
ALTER TABLE `seat`
  ADD PRIMARY KEY (`seat_number`),
  ADD KEY `roomNr_FK` (`room_number`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `realization`
--
ALTER TABLE `realization`
  ADD CONSTRAINT `RLessonName_FK` FOREIGN KEY (`r_lesson_name`) REFERENCES `lesson` (`lesson_name`),
  ADD CONSTRAINT `RRoomNr_FK` FOREIGN KEY (`r_room_nr`) REFERENCES `room` (`room_number`);

--
-- Constraints for table `seat`
--
ALTER TABLE `seat`
  ADD CONSTRAINT `roomNr_FK` FOREIGN KEY (`room_number`) REFERENCES `room` (`room_number`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
