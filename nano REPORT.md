### Nama   : Yedid Worembai 
### Kelas  : 1G 
### Absen  : 28 
### Prodi  : Teknik Informatika 
---

# Laporan Praktikum Sistem Operasi
---
### Latihan 2.1
#### 1. jumlah CPU(s), core/thread
#### 2. total RAM 
#### 3. total swap. 
#### Jelaskan perbedaan RAM vs swap dalam 2–3 kalimat.
#### Jawaban :
1. jumlah CPU(s) 1 dan core/therad 1
2. total RAM 1.9Gi,
3. total swap 2.0Gi
   
RAM adalah memori utama berkecepatan tinggi yang digunakan untuk menjalankan program aktif. Swap merupakan ruang pada disk yang berfungsi sebagai memori virtual saat RAM tidak mencukupi, namun memiliki akses lebih lambat. Penggunaan swap berlebih dapat menurunkan kinerja sistem.
<img width="1292" height="807" alt="image" src="https://github.com/user-attachments/assets/17f151f8-fed0-4122-93f3-ff66d8bc8982" />

---

### Latihan 2.2
#### Temukan 1 perangkat PCI (misal NIC) dan tuliskan: Vendor:Device ID (angka heksadesimal), nama driver/modul kernel, dan deskripsi singkat fungsinya.
#### Jawaban :
1. vendor Device ID 8086:100e
2. Kernel Driver/Module: e1000
   
Perangkat ini merupakan komponen antarmuka fisik yang berfungsi memfasilitasi konektivitas antara sistem komputer dengan infrastruktur Jaringan Area Lokal (LAN). Sebagai instrumen krusial dalam mekanisme transmisi, perangkat tersebut mengelola proses pengiriman dan penerimaan paket data melalui media kabel Ethernet dengan efisiensi tinggi. Selain itu, sistem ini dirancang untuk mendukung kapasitas bandwidth pada standar kecepatan Gigabit, yang secara teoritis mampu mencapai laju transfer data hingga 1000 Mbps.
<img width="1282" height="790" alt="image" src="https://github.com/user-attachments/assets/bd66e3e6-cbc9-4596-9f45-ad88cd0c0143" />

---

### Latihan 2.3
#### Dari output ls -l, jelaskan perbedaan penanda file untuk block device dan character device. (Hint: karakter pertama pada permission string)
#### Jawaban :
Block Device (Identifikasi Karakter b)
Karakter b pada awal string perizinan mengidentifikasi perangkat sebagai block device, yaitu peranti penyimpanan yang memproses transmisi data dalam unit blok berukuran tetap (umumnya 512 atau 1024 bita). Mekanisme ini biasanya melibatkan penggunaan buffer untuk mengoptimalkan efisiensi akses pada media penyimpanan fisik, seperti hard drive (/dev/sda) maupun partisi disk (/dev/sda1).

Character Device (Identifikasi Karakter c)
Karakter c menandakan character device, yakni peranti yang memfasilitasi komunikasi data secara sekuensial karakter demi karakter dalam bentuk aliran data (stream). Berbeda dengan block device, tipe ini beroperasi tanpa mekanisme buffering blok dan umumnya merepresentasikan perangkat input/output real-time, seperti terminal (TTY), papan ketik (keyboard), atau tetikus (mouse).

<img width="591" height="282" alt="image" src="https://github.com/user-attachments/assets/b269e86a-0ad7-4563-8c32-9e9ff16d5276" />



---

### Latihan 2.4
#### Gunakan grep untuk menampilkan hanya baris yang mengandung INFO atau WARN dari data.log. (Hint: gunakan grep -E dengan pola alternatif)
#### Jawaban :
<img width="557" height="113" alt="image" src="https://github.com/user-attachments/assets/2c759c61-f58b-4046-ae9e-ba1666abce5c" />

---

### Latihan 2.5
#### Pilih satu port yang listening dari output ss -tulpn(misal port 22), lalu tuliskan service/proses yang membukanya. Jelaskan kegunaan port tersebut secara singkat.
#### Jawaban :
Komponen	Detail Informasi
Local Address:Port	*:10250
Service/Proses	kubelite (PID: 1201)
Deskripsi Fungsi	Port ini digunakan oleh layanan Kubelet (dalam konteks ini dijalankan oleh proses kubelite) pada node Kubernetes. Kegunaan utamanya adalah sebagai API endpoint bagi control plane untuk berkomunikasi dengan node, yang memungkinkan eksekusi perintah di dalam kontainer, pengambilan log, dan pemantauan status pod.
<img width="1262" height="345" alt="image" src="https://github.com/user-attachments/assets/0dd12751-8175-43ab-9d28-096893507d03" />

---

### Latihan 2.A
#### Jalankan lspci -nnk. Pilih 1 perangkat PCI dan tuliskan: nama perangkat,ID vendor:device, dan kernel driver in use.
#### Jawaban :
Komponen,Informasi Terdeteksi
Nama Perangkat,Intel Corporation 82540EM Gigabit Ethernet Controller
ID Vendor:Device,8086:100e
Kernel Driver in Use,e1000
<img width="1085" height="537" alt="image" src="https://github.com/user-attachments/assets/fa6e061d-856b-4ca6-8495-d93334cde21a" />

---

### Latihan 2.B
#### Tentukan device root filesystem dengan findmnt /. Lalu cocokkan dengan lsblk -f dan tuliskan tipe filesystem serta UUID-nya.
#### Jawaban :
1. Identifikasi melalui findmnt /
Berdasarkan gambar, perintah findmnt / menunjukkan bahwa TARGET / (root) terpasang pada:

SOURCE: /dev/mapper/ubuntu--vg-ubuntu--lv

FSTYPE: ext4

2. Pencocokan dengan lsblk -f
Data tersebut sesuai dengan baris terakhir pada pohon hirarki perangkat sda3 di output lsblk -f. Berikut adalah detail spesifiknya:

Device Node: ubuntu--vg-ubuntu--lv

Tipe Filesystem (FSTYPE): ext4

UUID: 8e0da1f4-ce1c-4458-81f3-358aa99c2961
<img width="1060" height="312" alt="image" src="https://github.com/user-attachments/assets/3612ccc3-9121-4ee7-a986-d541fb88b114" />

---

### Latihan 2.C
#### Buat file server.log berisi minimal 10 baris dengan variasi kata: INFO,WARN, ERROR. Gunakan grep untuk menampilkan hanya baris ERROR
#### Jawaban :
<img width="1322" height="162" alt="image" src="https://github.com/user-attachments/assets/e7aeb91b-d563-42af-a704-d809a22b4a64" />

---

### Latihan 2.D
#### Gunakan sed untuk mengganti semua kata server menjadi node pada file latihan. Tunjukkan sebelum dan sesudah.
#### Jawaban :
Output (Sebelum):

server-01 is online
Connecting to server-02
Check server status

Output (Sesudah):

node-01 is online
Connecting to node-02
Check node status


<img width="938" height="90" alt="image" src="https://github.com/user-attachments/assets/ec287e35-320d-4175-8aab-b969de1722c0" />

---

### Latihan 2.E
#### Gunakan df -h lalu awk untuk menampilkan filesystem yang penggunaan disk di atas 70%.
#### Jawaban :


<img width="1303" height="818" alt="image" src="https://github.com/user-attachments/assets/da2be49c-3210-40f9-812d-500341a2c298" />

---

### Latihan 2.F
#### Jalankan sleep 600 &. Temukan PID-nya dengan ps. Hentikan dengan SIGTERM. Jelaskan beda SIGTERM vs SIGKILL.
#### Jawaban :
### Perbandingan Sinyal Proses Linux: SIGTERM vs SIGKILL

| Fitur | SIGTERM (Sinyal 15) | SIGKILL (Sinyal 9) |
| :--- | :--- | :--- |
| **Sifat** | **Sopan/Halus**. Meminta proses untuk berhenti secara terjadwal. | **Memaksa/Keras**. Mematikan proses seketika tanpa kompromi. |
| **Mekanisme** | Memberi waktu bagi proses untuk menyimpan data, menutup file, dan membersihkan memori (*cleanup*). | Kernel langsung menghapus proses dari tabel proses tanpa memberikan peringatan. |
| **Penanganan** | Sinyal dapat ditangkap (*caught*) atau diabaikan oleh aplikasi agar bisa menutup diri dengan benar. | Tidak dapat ditangkap atau diabaikan oleh proses apa pun. Proses otomatis mati. |
| **Risiko** | **Sangat rendah**. Menjaga integritas file dan stabilitas data. | **Berisiko tinggi**. Dapat menyebabkan kerusakan data (*data corruption*) karena file ditutup secara paksa. |
| **Penggunaan** | `kill -15 [PID]` atau `kill [PID]`. | `kill -9 [PID]`. |

<img width="1321" height="822" alt="image" src="https://github.com/user-attachments/assets/8b196c49-089c-4c89-b0a8-b62d36d7344d" />

---

### Latihan 2.G
#### Gunakan systemctl –failed. Jika tidak ada yang gagal, pilih satu service aktif (misal ssh) dan tampilkan status serta 30 baris log terakhirnya.
#### Jawaban :
<img width="1276" height="362" alt="image" src="https://github.com/user-attachments/assets/651853d2-bdd9-485a-b074-f4778f18f920" />









