# Contoh Aplikasi RESTFull menggunakan Spring 4, dan Hibernate 5

### Kebutuhan Aplikasi
* Deployment server (tomcat or jetty)
* IDE (eclipse, etc)
* MySQL

### Tabel
CREATE TABLE `book` (
  `id` varchar(32) COLLATE latin1_general_ci NOT NULL,
  `nama` text COLLATE latin1_general_ci NOT NULL,
  `deskripsi` text COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;
ALTER TABLE `book`
  ADD PRIMARY KEY (`id`);
COMMIT;

### Petunjuk menjalankan aplikasi
* clean and build project
* deploy
* path = /book/all, /book?id={id}