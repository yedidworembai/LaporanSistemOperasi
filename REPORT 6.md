### Nama   : Yedid Worembai ###
### Kelas  : 1G ###
### Absen  : 28 ###
### Prodi  : Teknik Informatika ###
---

##### Latihan 6.1
Jalankan ps aux dan amati outputnya:
1. Berapa total proses yang berjalan? Proses apa yang memiliki PID
terkecil?
proses yang berjalan 1 yaitu ps aux
<img width="657" height="27" alt="image" src="https://github.com/user-attachments/assets/26506168-d4b5-46fe-b597-85617f801b6c" />

dan yang memiliki PID terkecil yaitu PID 1 (sbin/init)
<img width="697" height="42" alt="image" src="https://github.com/user-attachments/assets/a1812f94-d195-4920-9ecd-62856aae537d" />

---

2. Jalankan pstree -p dan temukan proses bash Anda. Proses apa yang
menjadi induk (PPID) dari bash tersebut?
Berdasarkan output `pstree -p`, proses `bash` (PID 2548) berada di bawah `gnome-terminal` (PID 2538). Dalam struktur pohon proses, posisi di sebelah kiri menunjukkan proses induk. Dengan demikian, induk (PPID) dari `bash` adalah `gnome-terminal`, karena `bash` dijalankan melalui terminal tersebut.
<img width="573" height="147" alt="image" src="https://github.com/user-attachments/assets/c5d6b973-81db-4d1b-94f0-2d1363baac24" />

3. Bandingkan output ps aux dan ps aux -L. Apa perbedaan yang Anda
lihat? perbedaannya yaitu ps aux hanya menampilkan prosesnya saja tetapi ps aux -L dapat menampilkan proses nya secara detail.

##### Latihan 6.2
1. Jalankan sleep 120 & dan amati kolom STAT pada ps aux. Kondisi apa yang ditampilkan? Mengapa proses sleep berada di kondisi tersebut?
   Proses sleep berada pada kondisi sleeping (S) karena tugasnya hanya menunggu waktu selesai, sehingga tidak aktif menggunakan CPU.
   
   <img width="398" height="47" alt="image" src="https://github.com/user-attachments/assets/27d8319c-878b-462a-b1a9-629a5d2b22c3" />


2. Jalankan beberapa perintah yang berhasil dan yang gagal, lalu catat exit
code masing-masing. Pola apa yang Anda temukan?
Nilai exit code 0 menunjukkan bahwa perintah berhasil dijalankan, sedangkan nilai selain 0 menandakan terjadinya kesalahan, di mana angka yang berbeda merepresentasikan jenis error tertentu.
<img width="648" height="475" alt="image" src="https://github.com/user-attachments/assets/0130100e-7f58-4897-8a1e-ef2942b76295" />

---

##### Latihan 6.3
1. Jalankan nice -n 5 sleep 200 & dan verifikasi nilai NI-nya dengan
ps.
<img width="778" height="161" alt="image" src="https://github.com/user-attachments/assets/924e8fd5-f6f1-4693-bfe5-4cc591690aa6" />

2. Ubah nilai nice menjadi 10 menggunakan renice, lalu verifikasi kembali.
   <img width="806" height="263" alt="image" src="https://github.com/user-attachments/assets/9d469d23-25d3-450e-9602-3608cdcf6957" />

3. Coba ubah nilai nice menjadi -5 tanpa sudo. Apa yang terjadi? Mengapa
Linux membatasi hal ini untuk user biasa?
<img width="573" height="117" alt="image" src="https://github.com/user-attachments/assets/7a96964e-1c1d-4783-80a4-22e834d7a71d" />
Dalam Linux, user biasa dilarang menggunakan nilai nice negatif (prioritas tinggi) untuk mencegah program mereka memonopoli kinerja CPU. Jika sembarang pengguna bisa merebut prioritas prosesor, program inti sistem dapat kekurangan sumber daya sehingga server berisiko menjadi lambat atau hang. Oleh karena itu, demi menjaga stabilitas sistem, pengguna biasa hanya diizinkan untuk menurunkan prioritas programnya sendiri (menggunakan nilai positif), sementara hak untuk menaikkan prioritas dipegang secara eksklusif oleh administrator (root/sudo).

---

##### Latihan 6.4
1. Jalankan sleep 400 &, kirim SIGSTOP, dan amati perubahan kolom
STAT. Kondisi apa yang muncul?
<img width="560" height="192" alt="image" src="https://github.com/user-attachments/assets/d1c5038f-f6cb-4439-ad74-6309d9341d43" />

Status pada kolom STAT akan berganti menjadi huruf T (Stopped). Kondisi ini menunjukkan bahwa sistem sedang membekukan proses sementara waktu, sehingga program benar-benar berhenti beroperasi dan tidak mengonsumsi daya CPU sampai ada instruksi untuk melanjutkannya.

2. Kirim SIGCONT dan verifikasi proses kembali berjalan.
<img width="606" height="132" alt="image" src="https://github.com/user-attachments/assets/177bf37a-392d-4e6b-8e7f-bb0e51e4dbed" />

3. Hentikan proses dengan SIGTERM lalu verifikasi sudah tidak ada. Kapan
Anda memilih SIGKILL daripada SIGTERM?
<img width="437" height="121" alt="image" src="https://github.com/user-attachments/assets/a166cf77-557d-465d-bcb5-0764cec63c09" />
Dalam mematikan proses, SIGTERM selalu menjadi pilihan utama karena menghentikan program secara aman dan teratur, memberikan waktu bagi sistem untuk menyimpan data dan membersihkan memori. Sebaliknya, SIGKILL baru digunakan sebagai jalan terakhir khusus untuk program yang hang atau menolak ditutup dengan SIGTERM. Karena SIGKILL mematikan proses secara paksa dan instan oleh sistem operasi, metode ini berisiko menyebabkan kehilangan atau kerusakan data yang belum tersimpan.

---

##### Latihan 6.5
1. Jalankan top di foreground. Apa yang terjadi di terminal?
   <img width="997" height="722" alt="image" src="https://github.com/user-attachments/assets/46f17cf4-3ed4-4683-9330-5de0fd916442" />
   Eksekusi perintah top akan mengubah terminal menjadi antarmuka pemantauan sistem secara real-time. Layar akan terus memperbarui informasi terkait penggunaan CPU, memori (RAM dan swap), serta proses yang aktif. Karena beroperasi di foreground, program ini mendominasi layar terminal sehingga memblokir input untuk perintah lain.

2. Tekan Ctrl+Z dan cek statusnya dengan jobs. Kondisi apa yang
ditampilkan?
<img width="988" height="645" alt="image" src="https://github.com/user-attachments/assets/1a09a503-3c06-42d5-99b8-35cfd1528f1f" />
Menekan Ctrl+Z akan mengirimkan sinyal SIGTSTP ke proses tersebut. Saat kamu mengeceknya dengan perintah jobs, layar akan menampilkan kondisi Stopped (misalnya: [1]+  Stopped  top). Artinya, program top telah dibekukan sementara dan dikirim ke background, sehingga kamu bisa kembali menggunakan terminal (command prompt) untuk mengetik perintah lain.

3. Pindahkan ke background dengan bg. Apakah top dapat berjalan dengan
baik di background? Mengapa?
<img width="998" height="681" alt="image" src="https://github.com/user-attachments/assets/c84f6e75-1c55-4a33-94cc-3bc620cc4a51" />
Karena membutuhkan akses langsung ke layar untuk menampilkan data, top tidak dapat beroperasi di background. Jika dipaksa, sistem Linux akan otomatis menghentikan sementara proses tersebut agar output-nya tidak bertabrakan dengan input terminal yang sedang digunakan.
4. Kembalikan ke foreground dengan fg, lalu keluar dengan q .
<img width="992" height="685" alt="image" src="https://github.com/user-attachments/assets/6a1527a0-ce5e-4801-ac6e-df5ecc281c0a" />
Menjalankan perintah fg (atau fg %1) akan menarik kembali proses top yang tadinya tertidur di background untuk kembali tampil dan aktif di foreground (layar utama terminal). Setelah antarmuka pemantauan top kembali berjalan, menekan tombol q (berasal dari kata quit) akan menutup program tersebut secara normal dan mengembalikanmu ke prompt terminal awal.

---

##### Latihan 6.6
1. Gunakan ps aux –sort=%mem untuk menemukan proses yang menggunakan memori paling banyak di VM Anda. Proses apa itu?
<img width="1200" height="687" alt="image" src="https://github.com/user-attachments/assets/82d84ac5-68ac-4e19-ae84-fd3917416bc0" />
Sebagai pengelola antarmuka grafis (GUI) Linux, gnome-shell memang wajar membutuhkan alokasi RAM yang besar untuk menampilkan elemen visual. Namun, dalam lingkungan operasional riil berskala industri seperti server PT Freeport, antarmuka visual ini umumnya tidak diinstal. Pengelolaan server murni menggunakan mode teks (CLI) sebagai bentuk efisiensi, sehingga seluruh kapasitas memori tidak terbuang untuk tampilan layar, melainkan difokuskan secara maksimal untuk menangani kinerja inti seperti lalu lintas jaringan dan basis data.

2. Di dalam top, tekan 1 . Apa yang berubah pada tampilan? Mengapa
informasi ini berguna?
<img width="1193" height="548" alt="image" src="https://github.com/user-attachments/assets/5433c928-c231-4449-9c68-573712dada71" />
Tampilan rincian beban per-core sangat penting bagi administrator jaringan untuk mengevaluasi performa mesin. Fitur ini berfungsi untuk mendeteksi ketidakseimbangan kinerja, seperti memastikan apakah beban kerja server sudah terdistribusi merata ke seluruh inti prosesor, atau justru ada anomali di mana satu aplikasi berat memonopoli satu core hingga penuh sementara core lainnya menganggur.

3. Di dalam htop, navigasikan ke proses sshd menggunakan tombol panah.
Tekan F9 dan amati opsi sinyal yang tersedia
<img width="1213" height="577" alt="image" src="https://github.com/user-attachments/assets/ee593faf-627b-4999-ac8a-25c9a95c29b5" />

---

### 1.8 Latihan

##### Latihan 6.A
Eksplorasi Proses Sistem
1. Jalankan ps aux –forest dan temukan proses dengan PID 1. Apa
nama dan fungsi proses tersebut dalam sistem Linux modern?
Nama Proses: systemd (pada beberapa sistem Linux yang lebih lama menggunakan init).

Fungsi: Ini adalah "induk dari segala proses" di Linux. Saat mesin dihidupkan, kernel Linux akan memanggil systemd sebagai proses pertama (PID 1). Tugas utamanya adalah menjalankan dan mengelola seluruh layanan sistem (daemons), mengatur urutan booting, serta memastikan layanan penting seperti jaringan dan basis data berjalan di latar belakang. Jika PID 1 mati, sistem operasi akan crash (kernel panic).

2. Hitung berapa proses yang dimiliki oleh user root dan berapa yang
dimiliki oleh user Anda. Mengapa root memiliki lebih banyak proses?
<img width="640" height="317" alt="image" src="https://github.com/user-attachments/assets/e537efdc-6da0-4e71-8c75-10a2c2d0515d" />
Akun root bertanggung jawab menjalankan fondasi sistem operasi. Semua perangkat keras, pengelolaan memori, modul keamanan, dan layanan jaringan tingkat rendah berjalan di bawah kendali root sejak komputer menyala. Sebaliknya, akun user biasa hanya menjalankan proses yang terkait dengan sesi mereka sendiri (seperti terminal, bash, dan program yang sedang dibuka).

3. Temukan semua proses yang berada dalam kondisi S. Mengapa sebagian
besar proses di sistem berada dalam kondisi ini?
Huruf S berarti proses sedang "tertidur" karena sedang menunggu suatu event untuk terjadi (misalnya menunggu input dari keyboard, balasan paket jaringan, atau siklus waktu tertentu). Sistem yang sehat memang seharusnya didominasi oleh status 'S'. Jika semua proses berstatus 'R' (Running / meminta jatah CPU di saat yang bersamaan), maka prosesor akan overload dan server menjadi hang
---

##### Latihan 6.B
Simulasi Manajemen Job
1. Jalankan tiga perintah sleep dengan durasi 100, 200, dan 300 detik di
background. Verifikasi ketiganya dengan jobs.
<img width="448" height="236" alt="image" src="https://github.com/user-attachments/assets/fda74ecd-21c1-488f-bb8f-c0b7a28ef6bb" />
Output jobs akan menampilkan ketiga perintah tersebut sedang berjalan (Running) di background dengan nomor [1], [2], dan [3].

2. Bawa job kedua ke foreground, jeda dengan Ctrl+Z , lalu kembalikan
ke background dengan bg.
<img width="507" height="196" alt="image" src="https://github.com/user-attachments/assets/39406f66-bc7b-412a-b75b-63e136ee9856" />

3. Hentikan job pertama dengan kill %1. Tampilkan kembali daftar job.
Berapa job yang tersisa?
Tersisa 2 job, yaitu job nomor [2] (sleep 200) dan job nomor [3] (sleep 300).
<img width="486" height="156" alt="image" src="https://github.com/user-attachments/assets/9afdcdcb-af63-45cc-adbe-d0f22dd8221b" />
 

---

##### Latihan 6.C
Prioritas dan Sinyal
1. Jalankan dua proses sleep: satu dengan nice +5 dan satu dengan nice
+15. Verifikasi nilai NI keduanya dengan ps.
<img width="815" height="218" alt="image" src="https://github.com/user-attachments/assets/22365cde-3ef5-4c75-baf6-283d5c953e1c" />

2. Gunakan renice untuk mengubah nice proses pertama menjadi +10.
Proses mana yang kini lebih diprioritaskan scheduler?
<img width="575" height="111" alt="image" src="https://github.com/user-attachments/assets/b86e63f0-ed16-4529-b9b2-887317f13e7f" />
Proses yang kini lebih diprioritaskan oleh scheduler CPU adalah Proses Pertama.

3. Kirim SIGSTOP ke salah satu proses, verifikasi kondisi T-nya, lalu kirim
SIGCONT. Akhiri semua proses percobaan dengan pkill sleep
Perintah SIGSTOP berfungsi membekukan proses sementara (menjadi status T/Stopped) dengan mencabut kendalinya dari CPU tanpa menghapusnya dari memori. Untuk melanjutkannya, SIGCONT digunakan untuk membangunkan proses tersebut agar kembali mendapat alokasi CPU dan meneruskan pekerjaannya yang tertunda. Sementara itu, pkill sleep adalah perintah efisien untuk menghentikan seluruh proses bernama "sleep" sekaligus secara serentak. Berbeda dengan perintah kill yang mengharuskan input nomor PID satu per satu, pkill bekerja jauh lebih cepat dengan langsung menargetkan nama prosesnya.


