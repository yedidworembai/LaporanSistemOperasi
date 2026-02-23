### Nama   : Yedid Worembai ###
### Kelas  : 1G ###
### Absen  : 28 ###
### Prodi  : Teknik Informatika ###
---

# Laporan Praktikum Sistem Operasi
---
### Jelaskan 5 fungsi utama sistem operasi dengan contoh konkret dari minimal 2 OS berbeda (Windows,macOS, atau Linux).

#### Fungsi Utama Sistem Operasi

Sistem operasi (Operating System/OS) merupakan perangkat lunak inti yang berfungsi mengatur seluruh sumber daya komputer serta menjadi perantara antara pengguna, aplikasi, dan perangkat keras. Setiap sistem operasi memiliki mekanisme kerja yang berbeda, namun secara umum memiliki fungsi dasar yang sama. Berikut adalah lima fungsi utama sistem operasi beserta contoh penerapannya pada Windows, Linux, dan macOS.



#### 1. Manajemen Proses (Process Management)

Manajemen proses adalah fungsi sistem operasi yang bertugas mengelola program yang sedang dijalankan, mulai dari pembuatan proses, pengaturan jadwal penggunaan CPU, hingga penghentian proses.

Contoh:
- Windows: Fitur Task Manager digunakan untuk melihat aplikasi yang aktif serta menghentikan program yang tidak merespons.
- Linux: Perintah `top` atau `htop` digunakan untuk memantau proses dan penggunaan CPU, sedangkan perintah `kill` digunakan untuk menghentikan proses tertentu.
- macOS: Fitur Activity Monitor berfungsi untuk memantau dan mengelola proses yang sedang berjalan.



#### 2. Manajemen Memori (Memory Management)

Manajemen memori merupakan fungsi sistem operasi dalam mengatur penggunaan memori utama (RAM) agar setiap program memperoleh alokasi memori secara optimal serta mencegah terjadinya konflik antar proses.

Contoh:
- Windows: Menggunakan virtual memory untuk membantu sistem tetap berjalan saat kapasitas RAM terbatas.
- Linux: Menggunakan swap memory untuk menyimpan sementara data dari RAM ke media penyimpanan.
- macOS: Menggunakan teknologi memory compression untuk meningkatkan efisiensi penggunaan RAM.



#### 3. Manajemen Sistem Berkas (File System Management)

Fungsi ini bertujuan untuk mengatur penyimpanan data dalam bentuk file dan direktori serta mengelola akses pengguna terhadap data tersebut.

Contoh:
- Windows: Menggunakan sistem file NTFS untuk pengelolaan struktur dan keamanan file.
- Linux: Umumnya menggunakan sistem file ext4 yang dikenal stabil dan efisien.
- macOS: Menggunakan sistem file APFS yang dirancang untuk performa penyimpanan modern.



#### 4. Manajemen Perangkat Keras (Device Management)

Manajemen perangkat keras adalah fungsi sistem operasi yang mengatur komunikasi antara sistem komputer dan perangkat keras melalui penggunaan device driver.

Contoh:
- Windows: Secara otomatis menginstal driver perangkat seperti printer atau kartu grafis melalui pembaruan sistem.
- Linux: Banyak driver telah terintegrasi dalam kernel sehingga perangkat dapat langsung digunakan tanpa instalasi tambahan.
- macOS: Integrasi perangkat keras dan perangkat lunak memungkinkan sebagian besar perangkat berjalan secara otomatis tanpa konfigurasi manual.



#### 5. Antarmuka Pengguna (User Interface)

Antarmuka pengguna merupakan sarana yang disediakan sistem operasi agar pengguna dapat berinteraksi dengan komputer melalui tampilan grafis (GUI) maupun melalui perintah teks (CLI).

Contoh:
- Windows: Menyediakan antarmuka grafis dengan Start Menu dan Taskbar.
- Linux: Menyediakan GUI seperti GNOME atau KDE serta antarmuka berbasis terminal.
- macOS: Menyediakan GUI melalui Finder dan Dock yang terintegrasi.



#### Kesimpulan

Sistem operasi memiliki peranan penting dalam mengelola seluruh komponen sistem komputer, mulai dari proses, memori, sistem berkas, perangkat keras, hingga interaksi pengguna. Meskipun Windows, Linux, dan macOS memiliki perbedaan dalam implementasi, kelima fungsi utama tersebut tetap menjadi dasar agar sistem komputer dapat beroperasi secara optimal dan efisien.

---
### Kapan sebaiknya menggunakan Windows vs Linux vs macOS? Analisis berdasarkan use case: gaming, development, server, creative work, dan enterprise.

#### Perbandingan Penggunaan Windows, Linux, dan macOS Berdasarkan Use Case

##### Analisis berikut menunjukkan kondisi kapan sebaiknya menggunakan Windows, Linux, atau macOS berdasarkan kebutuhan penggunaan (use case) seperti gaming, development, server, creative work, dan enterprise.

 | Use Case | Windows | Linux | macOS |
 |----------|---------|-------|-------|
 | Gaming | Sangat direkomendasikan karena memiliki dukungan game yang luas, teknologi grafis lengkap, serta kompatibilitas driver perangkat keras yang optimal. | Dukungan gaming terus berkembang melalui platform kompatibilitas tertentu, namun masih terbatas dibandingkan Windows. | Tidak berfokus pada gaming sehingga jumlah game yang tersedia relatif lebih sedikit. |
 | Development (Programming) | Cocok untuk pengembangan aplikasi umum seperti web, mobile, dan desktop, meskipun terkadang membutuhkan tambahan tools untuk lingkungan berbasis Unix. | Sangat optimal untuk pengembangan backend, DevOps, dan proyek open-source karena stabil dan fleksibel. | Sangat baik untuk pengembangan aplikasi dalam ekosistem Apple serta pengembangan web karena berbasis Unix. |
 | Server | Digunakan pada lingkungan server enterprise tertentu, khususnya berbasis teknologi Microsoft, namun memerlukan biaya lisensi relatif tinggi. | Paling dominan digunakan karena ringan, stabil, aman, dan mudah dikonfigurasi untuk server skala besar. | Jarang digunakan pada server produksi dan lebih sering dimanfaatkan sebagai lingkungan pengembangan. |
 | Creative Work | Mendukung berbagai perangkat lunak kreatif, namun performa sangat bergantung pada spesifikasi perangkat keras. | Kurang populer karena keterbatasan dukungan perangkat lunak industri kreatif. | Sangat direkomendasikan karena optimalisasi integrasi perangkat keras dan perangkat lunak untuk pekerjaan kreatif. |
 | Enterprise | Paling banyak digunakan karena kemudahan integrasi jaringan, manajemen pengguna, serta kompatibilitas aplikasi bisnis. | Umumnya digunakan pada infrastruktur server dan cloud enterprise. | Digunakan pada perusahaan kreatif atau teknologi, namun tidak seumum Windows. |



#### Kesimpulan

Pemilihan sistem operasi sebaiknya disesuaikan dengan kebutuhan penggunaan.  
- Windows unggul pada gaming dan lingkungan enterprise.  
- Linux sangat kuat pada server dan pengembangan sistem.  
- macOS optimal untuk pekerjaan kreatif serta development berbasis Unix dan ekosistem Apple.

---

### Install Ubuntu Server 22.04 LTS di VirtualBox dengan langkah berikut: 
#### 1. Download Ubuntu Server ISO dari website resmi 
<img width="1786" height="927" alt="Cuplikan layar 2026-02-23 022523" src="https://github.com/user-attachments/assets/5d3e108f-afea-4693-97ac-ab4a202b58e4" />



#### 2. Create VM baru di VirtualBox (RAM: 2GB, Disk: 25GB)
<img width="1491" height="1004" alt="Cuplikan layar 2026-02-23 022950" src="https://github.com/user-attachments/assets/6ee5b634-13d9-4fe2-8be4-033291e34707" />


#### 3. Install dengan automatic partitioning (guided) 
#### 4. Buat user account dengan password yang kuat
<img width="1097" height="519" alt="Cuplikan layar 2026-02-23 024749" src="https://github.com/user-attachments/assets/aa8c6df6-b5d6-4e0c-a174-2c3d2195c679" />



#### 5. Reboot dan login ke sistem 
<img width="1909" height="1029" alt="Cuplikan layar 2026-02-23 025352" src="https://github.com/user-attachments/assets/360b7357-3654-420e-9147-977721d2d778" />



#### 6. Dokumentasikan proses instalasi dengan screenshot key steps	



### Setelah instalasi Ubuntu Server, lakukan tasks berikut: 
#### 1. Update package list: sudo apt update 
<img width="682" height="342" alt="image" src="https://github.com/user-attachments/assets/1cfb768a-3ffc-45f0-825f-e7ecb30e4d49" />



#### 2. Upgrade packages: sudo apt upgrade
<img width="684" height="477" alt="image" src="https://github.com/user-attachments/assets/782c3db5-d7f7-47ba-af3a-07dd247ba1c9" />



#### 3. Install neofetch: sudo apt install neofetch 
<img width="658" height="603" alt="image" src="https://github.com/user-attachments/assets/2e5c22f8-3253-4479-86d4-42bd241c2b84" />


#### 4. Jalankan neofetch dan screenshot hasilnya 
<img width="845" height="435" alt="image" src="https://github.com/user-attachments/assets/754e311b-b61c-43e0-a6e2-d6d184656066" />


#### 5. Check disk usage dengan df -h 
<img width="1018" height="200" alt="image" src="https://github.com/user-attachments/assets/148fa4fb-8bc9-4687-a603-532b514e2f86" />



#### 6. Check memory dengan free -h 
<img width="850" height="100" alt="image" src="https://github.com/user-attachments/assets/54d77d06-ac67-4084-b0ee-7105f18a29a9" />


#### 7. Dokumentasikan output dari setiap command
---

### Eksplorasi sistem yang baru diinstall: 
#### 1. Tampilkan informasi OS: cat /etc/os-release 
#### 2. Tampilkan versi kernel: uname -r
#### 3. List partisi: lsblk 
#### 4. Check network connectivity: ping -c 4 google.com 
#### 5. Install dan jalankan htop untuk melihat resource usage 
#### 6. Buat laporan singkat tentang konfigurasi sistem Anda

##### Laporan Eksplorasi Sistem Linux
Informasi Sistem Operasi Sistem operasi yang digunakan pada perangkat ini adalah Ubuntu 22.04 LTS dengan identitas distribusi Ubuntu sebagaimana ditampilkan pada informasi sistem.
Versi Kernel Berdasarkan hasil pemeriksaan, sistem menggunakan kernel Linux versi 5.15.0-91-generic yang berperan sebagai inti pengelola komunikasi antara perangkat keras dan perangkat lunak.
Struktur Partisi Konfigurasi penyimpanan menunjukkan adanya satu media disk utama berkapasitas 256 GB yang terbagi menjadi dua partisi, yaitu partisi /boot untuk proses booting sistem serta partisi root (/) sebagai lokasi utama instalasi sistem operasi dan penyimpanan data sistem.
Koneksi Jaringan Pengujian konektivitas jaringan menggunakan perintah ping menunjukkan bahwa sistem telah terhubung dengan jaringan internet secara normal, yang ditandai dengan tidak adanya packet loss selama proses pengujian.
Monitoring Resource Usage Aplikasi htop berhasil diinstal dan dijalankan untuk memantau penggunaan sumber daya sistem, khususnya CPU dan RAM. Hasil pemantauan menunjukkan bahwa penggunaan sumber daya berada dalam kondisi stabil tanpa adanya proses dengan beban tinggi.
Secara keseluruhan, konfigurasi sistem yang diamati menunjukkan bahwa instalasi sistem operasi berjalan dengan baik serta siap digunakan untuk kebutuhan komputasi dasar maupun pengembangan lebih lanjut.

---

### Ceritakan pengalaman Anda dengan sistem operasi:
#### 1. Sistem operasi apa yang Anda gunakan sehari-hari? (Windows, macOS, Linux, atau lainnya) 
#### 2. Berapa lama Anda menggunakan sistem operasi tersebut? 
#### 3. Apa yang Anda sukai dari sistem operasi tersebut? 
#### 4. Apa tantangan atau masalah yang pernah Anda hadapi? 
#### 5. Apakah Anda pernah menggunakan sistem operasi lain? Bandingkan pengalaman Anda. 
#### 6. Setelah mempelajari bab ini, apakah ada sistem operasi lain yang ingin Anda coba? Mengapa?
#### Tulis refleksi Anda dalam 300-500 kata disertai dengan dokumentasi.

Dalam aktivitas sehari-hari sebagai mahasiswa, saya menggunakan sistem operasi **Windows** pada laptop pribadi untuk mendukung kegiatan akademik maupun aktivitas lainnya. Sistem operasi yang dikembangkan oleh Microsoft ini dipilih karena memiliki antarmuka yang mudah dipahami serta kompatibilitas yang luas dengan berbagai aplikasi yang dibutuhkan dalam proses perkuliahan. Saya telah menggunakan Windows selama kurang lebih 4–5 tahun, dimulai sejak masa sekolah hingga digunakan secara intensif dalam kegiatan perkuliahan saat ini.

Hal yang saya apresiasi dari sistem operasi Windows adalah kemudahan dalam proses instalasi aplikasi serta ketersediaan perangkat lunak yang beragam, seperti aplikasi perkantoran, aplikasi pemrograman, dan platform pembelajaran daring. Selain itu, fitur multitasking pada Windows memudahkan saya menjalankan beberapa aplikasi secara bersamaan, misalnya ketika mengerjakan tugas sambil mencari referensi melalui internet. Pengelolaan file yang sederhana juga membantu dalam penyimpanan dan pengorganisasian dokumen perkuliahan secara lebih terstruktur.

Meskipun demikian, terdapat beberapa kendala yang pernah saya alami saat menggunakan Windows. Salah satu permasalahan yang cukup sering terjadi adalah penurunan performa laptop ketika banyak aplikasi dijalankan secara bersamaan. Selain itu, proses instalasi aplikasi tertentu maupun pembaruan sistem terkadang memerlukan waktu yang cukup lama. Dalam beberapa situasi, saya juga perlu mencari referensi tambahan untuk mengatasi error yang berkaitan dengan konfigurasi perangkat lunak atau lingkungan pemrograman.

Selain menggunakan Windows, saya juga pernah mencoba sistem operasi **Linux** untuk keperluan praktikum dan pembelajaran terkait sistem operasi. Pengalaman tersebut memberikan wawasan baru karena Linux dikenal lebih ringan dan banyak digunakan dalam lingkungan server serta pengembangan perangkat lunak. Namun, saya masih perlu beradaptasi karena penggunaan terminal dan konfigurasi sistem pada Linux relatif lebih kompleks dibandingkan Windows. Saya juga mengetahui penggunaan **macOS** yang dikembangkan oleh Apple Inc., khususnya pada bidang desain dan pengembangan aplikasi, meskipun belum menggunakannya secara langsung dalam aktivitas sehari-hari.

Setelah mempelajari materi sistem operasi, saya tertarik untuk lebih mendalami Linux karena sifatnya yang open-source, fleksibel, serta banyak digunakan dalam dunia industri, terutama pada bidang server, cloud computing, dan DevOps. Dengan mempelajari lebih dari satu sistem operasi, saya dapat memahami karakteristik masing-masing sistem secara lebih komprehensif serta meningkatkan kemampuan teknis dalam penggunaan komputer secara optimal.

**Dokumentasi:**
#### Tangkapan layar tampilan desktop Windows

  <img width="1912" height="1075" alt="image" src="https://github.com/user-attachments/assets/ca702f0a-36c9-4e80-9eea-d0ace849ecb2" />



#### Tangkapan layar Task Manager atau aplikasi pemantauan sistem

  <img width="1918" height="1076" alt="image" src="https://github.com/user-attachments/assets/6560e023-c387-4cdf-a024-ba6b578e5876" />

---




