


## Nama  : Yedid Worembai 
## NIM   : 254107020254 
## Kelas : TI 1-G  
## Absen : 28  

---

# LAPORAN PRAKTIKUM SISTEM  OPERASI

---

### 1. File Descriptor
File Descriptor adalah angka (integer) yang merepresentasikan aliran input/output (I/O) pada sistem Linux.

- `0` → stdin (standard input)
- `1` → stdout (standard output)
- `2` → stderr (standard error)

---

### 2. I/O Redirection
I/O Redirection digunakan untuk mengalihkan input atau output dari suatu perintah.

Operator yang umum digunakan:

- `<`  → Mengalihkan input
- `>`  → Mengalihkan output (overwrite)
- `>>` → Mengalihkan output (append)
- `2>` → Mengalihkan error (stderr)

Contoh:
```bash
ls > hasil.txt
ls tidakada 2> error.txt

```
---

### 3. Pipe ( | )
Pipe digunakan untuk menghubungkan output (stdout) dari satu perintah ke input (stdin) perintah lain.

Contoh:
```bash
ls -l | grep ".txt"
```

Artinya output `ls -l` akan diproses oleh `grep`.

---

### 4. tee
Perintah `tee` digunakan untuk:

- Menampilkan output di terminal
- Sekaligus menyimpannya ke dalam file

Contoh:
```bash
ls | tee daftar.txt
```
---

### 5. /dev/null
`/dev/null` adalah null device yang digunakan untuk membuang output yang tidak diperlukan.

Contoh:
```bash
ls tidakada 2> /dev/null
```
---

### 6. Kombinasi Operator
Operator-operator dapat dikombinasikan untuk membuat workflow yang lebih kompleks.

Contoh:
```bash
command > output.txt 2> error.txt
command > all.txt 2>&1
```
---

# 1.2 Latihan

###  Latihan 1.1

Buatlah script yang:

1. Menampilkan daftar 10 file terbesar di direktori `/var/log/`
2. Menyimpan hasilnya ke file `large-logs.txt`
3. Menampilkan output juga di terminal menggunakan `tee`
4. Menangani error dengan redirect ke `error.log`

---

####  Perintah yang Digunakan

```bash
sudo find /var/log -type f -exec du -h {} + 2> error.log \
| sort -hr \
| head -n 10 \
| tee large-logs.txt
```

####  Penjelasan Perintah

- `sudo find /var/log -type f`  
  Mencari semua file dalam direktori `/var/log`.

- `-exec du -h {} +`  
  Menghitung ukuran masing-masing file (format human-readable).

- `2> error.log`  
  Mengalihkan pesan error (stderr) ke file `error.log`.

- `sort -hr`  
  Mengurutkan berdasarkan ukuran terbesar terlebih dahulu.

- `head -n 10`  
  Menampilkan 10 file terbesar.

- `tee large-logs.txt`  
  Menampilkan hasil di terminal sekaligus menyimpan ke file `large-logs.txt`.


####  Hasil Eksekusi

<img width="1000" height="388" alt="image" src="https://github.com/user-attachments/assets/74f6ab2a-3863-4a7e-a9f8-1b995dffb463" />


---

###  Latihan 1.2

Buat pipeline yang:

1. Membaca file `/etc/passwd`
2. Mengekstrak username (kolom pertama)
3. Mengurutkan secara alfabetis
4. Menyimpan hasil ke file `sorted-users.txt`

---

####  Perintah yang Digunakan

```bash
cut -d: -f1 /etc/passwd | sort > sorted-users.txt
```


####  Penjelasan Perintah

- `cut -d: -f1 /etc/passwd`  
  Mengambil kolom pertama dari file `/etc/passwd`  
  (`-d:` → delimiter tanda titik dua, `-f1` → field pertama / username)

- `| sort`  
  Mengurutkan hasil secara alfabetis.

- `> sorted-users.txt`  
  Menyimpan output ke file `sorted-users.txt`.


####  Hasil Eksekusi
<img width="605" height="642" alt="image" src="https://github.com/user-attachments/assets/004df14b-d085-46fb-82eb-46046c0f354e" />

---

###  Latihan 3.3

Tulis script monitoring yang:

1. Mencatat penggunaan CPU dan memory setiap 5 detik  
2. Menyimpan log dengan timestamp  
3. Berjalan selama 1 menit (12 iterasi)  
4. Output ditampilkan di terminal DAN disimpan ke file  

---

####  Script Monitoring

```bash
#!/bin/bash

LOGFILE="monitoring.log"

# Header
printf "%-20s %-15s %-20s\n" "Timestamp" "CPU(%)" "Memory(Used/Total)" | tee $LOGFILE
printf "%-20s %-15s %-20s\n" "-------------------" "-------" "-------------------" | tee -a $LOGFILE

for i in {1..12}
do
    TIMESTAMP=$(date '+%Y-%m-%d %H:%M:%S')

    CPU=$(top -bn1 | grep "Cpu(s)" | awk '{print 100 - $8}')

    MEM_USED=$(free -h | awk '/Mem:/ {print $3}')
    MEM_TOTAL=$(free -h | awk '/Mem:/ {print $2}')

    printf "%-20s %-15s %-20s\n" "$TIMESTAMP" "$CPU" "$MEM_USED/$MEM_TOTAL" | tee -a $LOGFILE

    sleep 5
done

echo "Monitoring selesai." | tee -a $LOGFILE
```

####  Penjelasan Script

- `date` → Mengambil timestamp saat ini.
- `top -bn1` → Mengambil snapshot penggunaan CPU.
- `free -h` → Mengambil informasi penggunaan memori.
- `tee` → Menampilkan output di terminal sekaligus menyimpan ke file.
- `sleep 5` → Delay 5 detik.
- Loop `{1..12}` → Berjalan 12 kali (12 × 5 detik = 60 detik).


####  Hasil Eksekusi

<img width="1353" height="615" alt="image" src="https://github.com/user-attachments/assets/3cfe6487-6c7f-4eb6-9d60-e0b782e21dc9" />


---

###  Latihan 3.4

Buat perintah yang:

1. Mencari semua file `.conf` di sistem  
2. Membuang pesan `"Permission denied"`  
3. Menghitung jumlah file yang ditemukan  
4. Menyimpan daftar path lengkap ke file  

---

####  Perintah yang Digunakan

```bash
sudo find / -type f -name "*.conf" 2>/dev/null | tee conf-files.txt | wc -l
```

Untuk melihat isi file:

```bash
cat conf-files.txt
```


####  Penjelasan Perintah

- `sudo find / -type f -name "*.conf"`  
  Mencari semua file dengan ekstensi `.conf` dari root directory.

- `2>/dev/null`  
  Mengalihkan error (seperti *Permission denied*) agar tidak ditampilkan.

- `tee conf-files.txt`  
  Menyimpan daftar path lengkap ke file `conf-files.txt`  
  sekaligus meneruskan output ke perintah berikutnya.

- `wc -l`  
  Menghitung jumlah baris (jumlah file yang ditemukan).


####  Hasil Eksekusi

<img width="1331" height="846" alt="image" src="https://github.com/user-attachments/assets/aa9a658b-227f-482f-9447-3208ed182770" />


---

###  Latihan 3.5

Implementasikan script backup yang:

1. Menggunakan `tar` untuk backup direktori  
2. Menampilkan progress dengan `tee`  
3. Mencatat stdout ke `backup-success.log`  
4. Mencatat stderr ke `backup-error.log`  
5. Menambahkan timestamp di setiap log entry  

---

####  Script Backup

```bash
#!/bin/bash

SOURCE="/home/vier/praktikum-os/week03"
BACKUP_FILE="backup-$(date '+%Y%m%d-%H%M%S').tar.gz"

SUCCESS_LOG="backup-success.log"
ERROR_LOG="backup-error.log"

echo "===== Backup Dimulai =====" | tee -a $SUCCESS_LOG
echo "Timestamp: $(date '+%Y-%m-%d %H:%M:%S')" | tee -a $SUCCESS_LOG

# Proses backup
tar -czvf "$BACKUP_FILE" "$SOURCE" \
2> >(while read line; do 
        echo "$(date '+%Y-%m-%d %H:%M:%S') [ERROR] $line"; 
    done | tee -a $ERROR_LOG) \
| while read line; do 
        echo "$(date '+%Y-%m-%d %H:%M:%S') [INFO] $line"; 
  done | tee -a $SUCCESS_LOG

echo "===== Backup Selesai =====" | tee -a $SUCCESS_LOG
echo "File backup: $BACKUP_FILE" | tee -a $SUCCESS_LOG
```


####  Penjelasan Script

- `tar -czvf`  
  Membuat file arsip `.tar.gz` dan menampilkan daftar file yang diproses (verbose).

- `2> >( ... )`  
  Mengalihkan stderr ke proses terpisah untuk:
  - Menambahkan timestamp  
  - Menambahkan label `[ERROR]`  
  - Menyimpan ke `backup-error.log`

- `| while read line`  
  Memproses stdout untuk:
  - Menambahkan timestamp  
  - Menambahkan label `[INFO]`  
  - Menyimpan ke `backup-success.log`

- `tee -a`  
  Menampilkan output di terminal sekaligus menyimpan ke file log.


####  Hasil Eksekusi

![Latihan 3.5](Foto/1.5.png)

---


