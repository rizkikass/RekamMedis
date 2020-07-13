-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 13, 2020 at 11:18 AM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rumahsakit`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(11) NOT NULL,
  `nama_admin` varchar(50) NOT NULL,
  `gender_admin` enum('P','L') NOT NULL,
  `notlp_admin` varchar(13) NOT NULL,
  `email_admin` varchar(30) NOT NULL,
  `pass_admin` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `nama_admin`, `gender_admin`, `notlp_admin`, `email_admin`, `pass_admin`) VALUES
(1, 'Rizkika Siti Syifa', 'P', '08582136482', 'rizkikasyf35@gmail.com', 'admin123'),
(2, 'Siti Asy Syifa', 'P', '08632154621', 'cipaa@gmail.com', 'admin123');

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE `dokter` (
  `id_dokter` int(11) NOT NULL,
  `nama_dokter` varchar(30) NOT NULL,
  `spesialis` varchar(25) NOT NULL DEFAULT '',
  `gender_dokter` enum('P','L') NOT NULL,
  `notlp_dokter` varchar(13) NOT NULL,
  `hari_shift` varchar(10) NOT NULL,
  `mulai_shift` time NOT NULL DEFAULT '00:00:00',
  `akhir_shift` time NOT NULL DEFAULT '00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`id_dokter`, `nama_dokter`, `spesialis`, `gender_dokter`, `notlp_dokter`, `hari_shift`, `mulai_shift`, `akhir_shift`) VALUES
(1, 'Dr. Ayu Rezki', 'Dokter Umum', 'P', '081221345423', 'Senin', '08:00:00', '13:30:00'),
(2, 'Dr. Selvi Saswita', 'Dokter Umum', 'P', '0813846359263', 'Selasa', '08:00:00', '13:30:00'),
(3, 'Dr. Guntur Suseno', 'Dokter Umum', 'L', '0858746592734', 'Kamis', '14:00:00', '17:00:00'),
(4, 'Dr. Ira Camelia', 'Dokter Umum', 'P', '083678455345', 'Jumat', '14:00:00', '17:00:00'),
(5, 'Dr. Luki Indrawan', 'Dokter Umum', 'L', '081231455678', 'Sabtu', '18:30:00', '21:00:00'),
(6, 'Dr. Marcella Dian', 'Dokter Umum', 'P', '085766543213\r', 'Minggu', '18:30:00', '21:00:00'),
(8, 'Dr. Ellen Gunawan Sp.KK', 'Kulit', 'P', '087456788902\r', 'Senin', '14:00:00', '17:00:00'),
(9, 'Dr. Epi Panjaitan Sp.KK', 'Kulit', 'L', '082788900678\r', 'Rabu', '14:00:00', '17:00:00'),
(10, 'Dr. Hendra Minarto Sp.KK', 'Kulit', 'L', '083233123453\r', 'Kamis', '18:30:00', '21:00:00'),
(11, 'Dr. Junia Kirana Sp.KK', 'Kulit', 'P', '085566478908\r', 'Sabtu', '18:30:00', '21:00:00'),
(12, 'Dr. Arauna Catalia Sp. A', 'Anak', 'P', '081243543234\r', 'Selasa', '08:00:00', '13:30:00'),
(13, 'Dr. Nurul Handayani Sp. A', 'Anak', 'P', '088655476890\r', 'Rabu', '08:00:00', '13:30:00'),
(14, 'Dr. Valencia Junita Sp. A', 'Anak', 'P', '087654344521\r', 'Sabtu', '14:00:00', '17:00:00'),
(15, 'Dr. Herlina Sp. A', 'Anak', 'P', '081490754321\r', 'Minggu', '14:00:00', '17:00:00'),
(16, 'Dr. Maya Esther Sp.OG', 'Kandungan', 'P', '082097654890\r', 'Sabtu', '08:00:00', '13:30:00'),
(17, 'Dr. Eric Tjahyadi Sp.OG', 'Kandungan', 'L', '085789034567\r', 'Jumat', '08:00:00', '13:30:00'),
(18, 'Dr. Effendy Gunawan Sp.OG', 'Kandungan', 'L', '088288430304\r', 'Kamis', '18:30:00', '21:00:00'),
(19, 'Dr. Stella Kawilarang Sp.OG', 'Kandungan', 'P', '081345675435\r', 'Selasa', '18:30:00', '21:00:00'),
(21, 'Dr. Wibowo Mustoko Sp.PD', 'Penyakit Dalam', 'L', '082312456786\r', 'Senin', '18:30:00', '21:00:00'),
(22, 'Dr. Putri Farissa Sp.PD', 'Penyakit Dalam', 'P', '085432178908\r', 'Rabu', '08:00:00', '13:30:00'),
(23, 'Dr. Friska Yulenta Sp.PD', 'Penyakit Dalam', 'P', '087654322456\r', 'Jumat', '14:00:00', '17:00:00'),
(24, 'Dr. Andalia Fitri Sp.PD', 'Penyakit Dalam', 'P', '083766879087\r', 'Sabtu', '14:00:00', '17:00:00'),
(25, 'Drg. Felice Kin Lie', 'Gigi', 'P', '081367589067\r', 'Senin', '08:00:00', '13:30:00'),
(26, 'Drg. Mervi Chandra', 'Gigi', 'L', '082345564776\r', 'Rabu', '18:30:00', '21:00:00'),
(27, 'Drg. Derry Haryono', 'Gigi', 'L', '081556899809\r', 'Kamis', '18:30:00', '21:00:00'),
(28, 'Drg. Teguh Wibowo', 'Gigi', 'L', '085325468904\r', 'Minggu', '14:00:00', '17:00:00'),
(30, 'Dr. Wahid Gufron Sp.B', 'Bedah', 'L', '085326786543\r', 'Selasa', '14:00:00', '17:00:00'),
(31, 'Dr. Angling Yunarto Sp.U', 'Bedah', 'L', '087568763217\r', 'Rabu', '08:00:00', '13:30:00'),
(32, 'Dr. Hasroni Fathurrahman Sp.U', 'Bedah', 'L', '082655476890\r', 'Sabtu', '18:30:00', '21:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `id_pasien` int(11) NOT NULL,
  `nama_pasien` varchar(30) NOT NULL,
  `dob_pasien` date NOT NULL,
  `gender_pasien` enum('L','P') NOT NULL,
  `agama_pasien` varchar(50) NOT NULL,
  `kewarganegaraan_pasien` enum('WNI','WNA') NOT NULL,
  `alamat_pasien` varchar(50) NOT NULL,
  `pekerjaan_pasien` varchar(25) NOT NULL,
  `notlp_pasien` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`id_pasien`, `nama_pasien`, `dob_pasien`, `gender_pasien`, `agama_pasien`, `kewarganegaraan_pasien`, `alamat_pasien`, `pekerjaan_pasien`, `notlp_pasien`) VALUES
(1, 'Erviana Salsabil', '2000-07-13', 'P', 'Islam', 'WNI', 'Bandung', 'Pelajar', '0812346721');

-- --------------------------------------------------------

--
-- Table structure for table `registrasi`
--

CREATE TABLE `registrasi` (
  `id_registrasi` int(11) NOT NULL,
  `id_pasien` int(11) NOT NULL,
  `id_admin` int(11) NOT NULL,
  `id_dokter` int(11) NOT NULL,
  `tgl_regis` date NOT NULL,
  `cara_pembayaran` varchar(20) NOT NULL,
  `cara_masuk` varchar(20) NOT NULL,
  `poliklinik` varchar(20) NOT NULL,
  `triase` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registrasi`
--

INSERT INTO `registrasi` (`id_registrasi`, `id_pasien`, `id_admin`, `id_dokter`, `tgl_regis`, `cara_pembayaran`, `cara_masuk`, `poliklinik`, `triase`) VALUES
(2, 1, 1, 26, '2020-07-12', 'Tunai', 'Datang Sendiri', 'Gigi', '-');

-- --------------------------------------------------------

--
-- Table structure for table `rekam_medis`
--

CREATE TABLE `rekam_medis` (
  `id_rm` int(11) NOT NULL,
  `id_registrasi` int(11) NOT NULL,
  `tgl_masuk` date NOT NULL,
  `tgl_keluar` date NOT NULL,
  `ruang` varchar(50) NOT NULL,
  `poliklinik` varchar(50) NOT NULL,
  `anamnesa` varchar(50) NOT NULL,
  `diagnosa` varchar(50) NOT NULL,
  `terapi` varchar(50) NOT NULL,
  `cara_keluar` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rekam_medis`
--

INSERT INTO `rekam_medis` (`id_rm`, `id_registrasi`, `tgl_masuk`, `tgl_keluar`, `ruang`, `poliklinik`, `anamnesa`, `diagnosa`, `terapi`, `cara_keluar`) VALUES
(1, 2, '2020-07-13', '2020-07-13', '1234', 'Gigi', 'aaaa', 'ddddd', '-', '-');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `dokter`
--
ALTER TABLE `dokter`
  ADD PRIMARY KEY (`id_dokter`);

--
-- Indexes for table `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`id_pasien`);

--
-- Indexes for table `registrasi`
--
ALTER TABLE `registrasi`
  ADD PRIMARY KEY (`id_registrasi`),
  ADD KEY `FK_registrasi_pasien` (`id_pasien`),
  ADD KEY `FK_registrasi_admin` (`id_admin`),
  ADD KEY `FK_registrasi_dokter` (`id_dokter`);

--
-- Indexes for table `rekam_medis`
--
ALTER TABLE `rekam_medis`
  ADD PRIMARY KEY (`id_rm`),
  ADD KEY `FK_rekam_medis_registrasi` (`id_registrasi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `dokter`
--
ALTER TABLE `dokter`
  MODIFY `id_dokter` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `pasien`
--
ALTER TABLE `pasien`
  MODIFY `id_pasien` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `registrasi`
--
ALTER TABLE `registrasi`
  MODIFY `id_registrasi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `rekam_medis`
--
ALTER TABLE `rekam_medis`
  MODIFY `id_rm` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `registrasi`
--
ALTER TABLE `registrasi`
  ADD CONSTRAINT `FK_registrasi_admin` FOREIGN KEY (`id_admin`) REFERENCES `admin` (`id_admin`),
  ADD CONSTRAINT `FK_registrasi_dokter` FOREIGN KEY (`id_dokter`) REFERENCES `dokter` (`id_dokter`),
  ADD CONSTRAINT `FK_registrasi_pasien` FOREIGN KEY (`id_pasien`) REFERENCES `pasien` (`id_pasien`);

--
-- Constraints for table `rekam_medis`
--
ALTER TABLE `rekam_medis`
  ADD CONSTRAINT `FK_rekam_medis_registrasi` FOREIGN KEY (`id_registrasi`) REFERENCES `registrasi` (`id_registrasi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
