### Nama   : Yedid Worembai ###
### Kelas  : 1G ###
### Absen  : 28 ###
### Prodi  : Teknik Informatika ###
---

# Laporan Praktikum Sistem Operasi
### 1. Analisa hasil percobaan yang Anda lakukan.

#### a. Analisa setiap hasil tampilannya.
Percobaan 1 (Direktori): Pada bagian ini, praktik difokuskan pada cara mengelola dan menavigasi folder di Linux. Kita menggunakan pwd untuk mengecek lokasi kerja saat ini dan cd untuk berpindah antar direktori. Selain itu, dilakukan juga pembuatan struktur folder bertingkat menggunakan mkdir. Dari percobaan penghapusan, terbukti bahwa perintah rmdir akan menghasilkan error jika folder target belum kosong. Error navigasi juga sengaja dipicu untuk menunjukkan bahwa penulisan absolute path yang tidak lengkap (melewatkan /home) akan membuat sistem gagal menemukan direktori tujuan.

---

Percobaan 2 (Manipulasi File): Percobaan kedua menguji perintah dasar untuk manajemen file. Pembuatan file teks dilakukan melalui perintah cat >. Setelah itu, file digandakan ke berbagai lokasi menggunakan perintah cp. Praktik ini juga menunjukkan bahwa perintah mv memiliki fungsi ganda, yaitu untuk mengubah nama file (rename) dan memindahkan file ke direktori lain (cut). Untuk proses penghapusan, digunakan perintah rm, termasuk penggunaan parameter -rf untuk menghapus paksa sebuah folder beserta seluruh isinya secara rekursif.

---

Percobaan 3 (Symbolic Link): Fokus percobaan terakhir adalah membedakan pembuatan hard link dan soft link. Dengan mengeksekusi perintah ln, kita membuat hard link di mana file baru benar-benar terikat secara fisik dengan data aslinya. Sebaliknya, penambahan parameter -s (menjadi ln -s) digunakan untuk membuat soft link. Saat dicek dengan ls -l, soft link ini tampil sebagai shortcut yang hanya memiliki tanda panah penunjuk arah ke file aslinya, bukan berupa salinan data fisik.

---

Percobaan 4 (Melihat Isi File): Percobaan ini ditujukan untuk mengidentifikasi jenis atau tipe dari suatu file menggunakan perintah file. Berbeda dengan perintah cat yang menampilkan isi teks, eksekusi file halo.txt dan file bye.txt berfungsi untuk memastikan format asli file tersebut, misalnya mendeteksi apakah file itu berupa plain text (teks ASCII biasa) atau ternyata merupakan sebuah symbolic link (shortcut).

---

Percobaan 5 (Mencari File): Pada bagian ini, dipraktikkan tiga utilitas pencarian file di Linux. Pertama, perintah find digunakan untuk melacak file berekstensi .txt secara real-time. Hasil pencariannya kemudian dialihkan (di-redirect) ke dalam file myerror.txt, dan pada baris selanjutnya dikombinasikan dengan perintah wc -l via argumen -exec untuk menghitung jumlah barisnya. Kedua, perintah which ls digunakan untuk mengetahui letak path atau lokasi direktori executable dari program ls itu sendiri. Ketiga, perintah locate diuji sebagai alternatif pencarian file yang bekerja lebih cepat karena mengandalkan indeks database internal sistem.

---

Percobaan 6 (Mencari Teks pada File): Percobaan terakhir berfokus pada pencarian string atau teks spesifik di dalam isi sebuah file, bukan mencari nama filenya. Penggunaan perintah grep Hallo *.txt bertujuan untuk memfilter dan memunculkan baris kalimat yang secara spesifik mengandung kata "Hallo" dari dalam seluruh file berekstensi .txt yang ada di direktori aktif.

---

#### b. Pada Percobaan 1 point 3 buatlah pohon dari struktur file dan direktori
<img width="540" height="402" alt="image" src="https://github.com/user-attachments/assets/985bf1aa-c862-4d2f-9026-9784dee99e92" />

Perintah: pwd (Print Working Directory) berfungsi untuk mengecek lokasi direktori tempat kamu berada saat ini.

Hasil Tampilan: /home/did/Desktop menunjukkan bahwa posisi terminalmu sedang aktif di dalam folder Desktop milik user bernama did.

---

Perintah: mkdir (Make Directory) digunakan untuk membuat folder baru. Pada baris ini, kamu mengeksekusi pembuatan struktur folder bercabang sekaligus dalam satu kali jalan.

Hasil Tampilan: Tidak ada teks output yang muncul. Dalam sistem Linux, ini berarti perintah tersebut telah dieksekusi dan berhasil dibuat tanpa error. Struktur yang baru saja dibuat adalah:
Folder A, B, dan C di lokasi saat ini (Desktop).
Folder D dan E di dalam folder A.
Folder F di dalam folder B.
Folder A di dalam folder D (yang letaknya di dalam folder A utama).

---

Perintah: ls -l (List -long) digunakan untuk menampilkan isi dari direktori tempatmu berada saat ini (Desktop) dengan format detail.

Hasil Tampilan: Menampilkan tiga folder utama yang baru dibuat, yaitu A, B, dan C.
Huruf d pada awalan drwxrwxr-x menandakan bahwa item tersebut adalah sebuah directory (folder), bukan file biasa.
Tampilan ini juga menunjukkan hak akses (permissions), nama pemilik (did), grup (did), ukuran memori dasar (4096 bytes), dan stempel waktu pembuatannya.

---

Perintah: Menampilkan isi spesifik yang ada di dalam folder A dengan format detail.

Hasil Tampilan: Output memverifikasi bahwa di dalam folder A telah sukses dibuat dua folder tambahan, yaitu D dan E, persis seperti yang diinstruksikan pada perintah mkdir sebelumnya.

---
Perintah: Mengecek dan menampilkan detail isi dari folder D (yang rutenya berada di dalam folder A).

Hasil Tampilan: Menunjukkan adanya satu folder bernama A di dalamnya.

---

#### c. Bila terdapat pesan error, jelaskan penyebabnya
<img width="548" height="41" alt="image" src="https://github.com/user-attachments/assets/b5cd276b-53c5-460f-b996-c92a99116737" />

<img width="525" height="48" alt="image" src="https://github.com/user-attachments/assets/18a3402b-eddf-4f97-93c1-3fa5be6b55ed" />

pada percobaan 1, poin 4 terdapat pesan yang error dikarenakan 
Pesan error saat mengetikkan "rmdir B" muncul karena fungsi ini mengharuskan folder dalam keadaan kosong, sementara di dalam B masih terdapat folder F. Sedangkan error pada perintah 
"ls -l B" terjadi karena folder B sudah tidak eksis di dalam direktori. Direktori B beserta isinya (F) sudah terhapus secara berurutan oleh eksekusi perintah rmdir B/F B pada baris sebelumnya, sehingga sistem tidak bisa memunculkan data yang diminta.Dan juga pada percobaan 1 poin 5 ada yang terjadi error.

<img width="423" height="47" alt="image" src="https://github.com/user-attachments/assets/f6bd2f14-e6cc-4164-9bff-b6951305b3c9" />

Error saat menjalankan perintah cd /<user>/C terjadi akibat kesalahan penulisan lokasi direktori. Saat kita mengetikkan tanda / di awal, Linux akan mulai mencari dari direktori paling dasar (root). Karena kita lupa memasukkan /home sebelum nama user, sistem jadi gagal menemukan folder yang dimaksud karena jalurnya terpotong. Makanya, muncul pesan peringatan bahwa file atau direktori tidak ditemukan.

---

### 2. Kerjakan latihan di atas dan analias tampilannya

Eksplorasi Perintah Dasar (Latihan 1): Pada bagian awal, kita difokuskan untuk terbiasa menavigasi terminal. Perintah cd . membuktikan posisi kita tetap di tempat, sedangkan cd .. dipakai untuk naik satu folder. Kita juga menggunakan ls -al untuk mengecek semua file, termasuk yang disembunyikan (hidden). Waktu masuk ke /etc, ada trik ls -al | more supaya daftar file yang panjang banget tidak langsung bergulir habis, tapi bisa dibaca per halaman. Ada juga perintah cd - yang sangat praktis untuk melompat balik ke folder yang baru saja ditinggalkan.

---

Menelusuri Sistem & Pseudo-Filesystem (Latihan 2-4): Langkah selanjutnya adalah mengecek folder bawaan sistem Linux seperti /bin, /sbin, dan /boot yang menyimpan aplikasi inti dan file booting. Di dalam folder /dev, kita mengecek antarmuka terminal (tty) yang sedang kita pakai lewat perintah who am i. Bagian yang paling unik ada di folder /proc. Direktori ini disebut pseudo-filesystem karena sebenarnya tidak menyimpan file fisik di hardisk. Folder ini berfungsi sebagai jembatan virtual dari RAM untuk menampilkan informasi hardware dan proses yang sedang berjalan secara langsung, contohnya mengecek spesifikasi prosesor lewat cpuinfo.

---

Manajemen File dan Konsep Link (Latihan 5-15): Di bagian ini, kita mencoba masuk ke home directory user lain dengan cd ~username dan berlatih membuat serta menghapus folder (mkdir dan rmdir). Setelah menyalin file /etc/passwd ke folder pribadi, kita masuk ke materi link. Kita membuat symbolic link yang mengarah ke perangkat terminal (tty). Perlu dicatat, kalau kita memaksa membuat hard link ke perangkat tty, sistem akan menolak karena aturan keamanan Linux melarang hard link pada file perangkat. Efek menarik terjadi saat kita mengopi teks ke shortcut terminal tersebut; tulisannya langsung muncul di layar kita sendiri. Praktikum ditutup dengan menduplikasi folder menggunakan symbolic link dan membersihkan semua sisa file percobaan menggunakan perintah rm -rf.

---

