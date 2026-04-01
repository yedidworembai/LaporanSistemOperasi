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
