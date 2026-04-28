<h1 align="center">JOBSHEET 6 - SISTEM OPERASI</h1>


**Nama**       : Yedid Worembai
**NIM**        : 254107020254  
**Kelas**      : TI 1-G  
**No. Absen**  : 28 

---
<h1 align="center">BASH SHELL dan SHELL BASIC</h2>

### Praktikum 6.1 — Mengenali Bash dan Menyiapkan Workspace
#### 1. Lihat shell login dan shell aktif saat ini
Perintah:
```bash
echo " Shell login : $SHELL "
echo " Shell aktif : $0"
bash --version | head -n 1
```
Output:
```bash
did@Yedid:~/praktikum-os/week07$ echo " Sheel login : $SHELL"
 Sheel login : /bin/bash

did@Yedid:~/praktikum-os/week07$ echo " Shell aktif : $0"
 Shell aktif : bash

did@Yedid:~/praktikum-os/week07$ bash --version | head -n 1
GNU bash, version 5.2.21(1)-release (x86_64-pc-linux-gnu)
```
#### 2. Lihat proses shell yang sedang berjalan
Perintah:
```bash
echo $$
ps -p $$ -o pid,ppid,args=
```
Outputnya
```bash
did@Yedid:~/praktikum-os/week07$ echo $$
2836

did@Yedid:~/praktikum-os/week07$ ps -p $$ -o pid,ppid,args=
    PID    PPID 
   2836    2822 bash
```
#### 3. Buat workspace praktikum 
Perintah:
```bash
mkdir -p ~/praktikum-os/week07-bash/{bin,backup,logs,sampel,ruang-nama}
cd ~/praktikum-os/week07-bash
pwd
```
Outputnya
```bash
did@Yedid:~/praktikum-os/week07$ mkdir -p ~/praktikum-os/week07-bash/{bin,backup,logs,sampel,ruang-nama}

did@Yedid:~/praktikum-os/week07$ cd ~/praktikum-os/week07-bash

did@Yedid:~/praktikum-os/week07-bash$ pwd
/home/did/praktikum-os/week07-bash

```
#### 4. Buat beberapa file contoh yang akan dipakai pada praktikum berikutnya:
Perintah:
```bash
touch sample-app.conf
touch logs/app-01.log logs/app-02.log logs/app-03.log
touch sampel/catatan-a.txt sampel/catatan-b.txt
touch sampel/backup-01.tar sampel/backup-02.tar
touch sampel/laporan-harian.log sampel/laporan-mingguan.log sampel/laporan-bulanan. log
touch "ruang-nama/laporan server april.txt"
touch "ruang-nama/backup [mingguan] server.conf"
ls -R
```
Outputnya
```bash
did@Yedid:~/praktikum-os/week07-bash$ touch sample-app.conf
did@Yedid:~/praktikum-os/week07-bash$ touch logs/app-01.log logs/app-02.log logs/app-03.log
did@Yedid:~/praktikum-os/week07-bash$ touch sampel/catatan-a.txt sampel/catatan-b.txt
did@Yedid:~/praktikum-os/week07-bash$ touch sampel/backup-01.tar sampel/backup-02.tar
did@Yedid:~/praktikum-os/week07-bash$ touch sampel/laporan-harian.log sampel/laporan-mingguan.log sampel/laporan-bulanan. log
did@Yedid:~/praktikum-os/week07-bash$ touch "ruang-nama/laporan server april.txt"
did@Yedid:~/praktikum-os/week07-bash$ touch "ruang-nama/backup [mingguan] server.conf"
did@Yedid:~/praktikum-os/week07-bash$ ls -R
.:
backup  bin  log  logs  ruang-nama  sampel  sample-app.conf

./backup:

./bin:

./logs:
app-01.log  app-02.log  app-03.log

./ruang-nama:
'backup [mingguan] server.conf'  'laporan server april.txt'

./sampel:
backup-01.tar  catatan-a.txt  laporan-bulanan.    laporan-mingguan.log
backup-02.tar  catatan-b.txt  laporan-harian.log
  
```
---

### Praktikum 6.2 — Membuat Ringkasan Sesi Terminal
#### 1. Masuk ke workspace praktikum:
Perintah:
```bash
cd ~/praktikum-os/week07-bash
```
Outputnya
```bash
cd ~/praktikum-os/week07-bash
vier@UBUNTU:~/praktikum-os/week07-bash$
```
#### 2. Simpan informasi sesi terminal ke file laporan:
Perintah:
```bash
{
echo "=== RINGKASAN SESI BASH ==="
date
echo "User : $(whoami)"
echo "Hostname : $(hostname)"
echo "Shell login : $SHELL"
echo "Shell aktif : $0"
echo "PID shell : $$"
echo "Direktori : $(pwd)"
} | tee session-info.txt
```
Outputnya
```bash
id@Yedid:~/praktikum-os/week07-bash$ {
echo "=== RINGKASAN SESI BASH ==="
> date
echo "User : $(whoami)"
echo "Hostname : $(hostname)"
echo "Shell login : $SHELL"
echo "Shell aktif : $0"
echo "PID shell : $$"
echo "Direktori : $(pwd)"
} | tee session-info.txt
=== RINGKASAN SESI BASH ===
Tue Apr 28 06:09:44 PM UTC 2026
User : did
Hostname : Yedid
Shell login : /bin/bash
Shell aktif : bash
PID shell : 2836
Direktori : /home/did/praktikum-os/week07-bash

```
#### 3. Verifikasi isi file laporan:
Perintah:
```bash
cat session-info.txt

```
Outputnya
```bash
did@Yedid:~/praktikum-os/week07-bash$ cat session-info.txt
=== RINGKASAN SESI BASH ===
Tue Apr 28 06:09:44 PM UTC 2026
User : did
Hostname : Yedid
Shell login : /bin/bash
Shell aktif : bash
PID shell : 2836
Direktori : /home/did/praktikum-os/week07-bash
```
---

### Praktikum 6.3 — Menambahkan Konfigurasi Aman pada .bashrc
#### 1. Lihat file konfigurasi Bash pada home directory:
Perintah:
```bash
ls -la ~ | grep -E 'bashrc|bash_profile|profile'
```
Outputnya
```bash
did@Yedid:~/praktikum-os/week07-bash$ ls -la ~ | grep -E 'bashrc|bash_profile|profile'
-rw-r--r--  1 did  did  3771 Mar 31  2024 .bashrc
-rw-r--r--  1 did  did   807 Mar 31  2024 .profile
```
#### 2. Lihat file konfigurasi Bash pada home directory:
Perintah:
```bash
cp ~/.bashrc ~/.bashrc.bak-praktikum
```
Outputnya
```bash
vier@UBUNTU:~/praktikum-os/week07-bash$ cp ~/.bashrc ~/.bashrc.bak-praktikum
```
#### 3. Tambahkan blok konfigurasi praktikum:
Perintah:
```bash
cat <<'EOF' >> ~/.bashrc
# --- Praktikum Bash Shell ---
export PRAKTIKUM_BASH_DIR="$HOME/praktikum-os/week04-bash"
export EDITOR = nano
# --- End Praktikum Bash Shell ---
EOF
```
Outputnya
```bash
id@Yedid:~/praktikum-os/week07-bash$ cat <<'EOF' >> ~/.bashrc
> # --- Praktikum Bash Shell ---
export PRAKTIKUM_BASH_DIR="$HOME/praktikum-os/week04-bash"
export EDITOR = nano
# --- End Praktikum Bash Shell ---
EOF
```
#### 4. Terapkan konfigurasi tanpa logout:
Perintah:
```bash
source ~/.bashrc
echo "$PRAKTIKUM_BASH_DIR"
echo "$EDITOR"
```
Outputnya
```bash
did@Yedid:~/praktikum-os/week07-bash$ source ~/.bashrc
bash: export: `=': not a valid identifier
bash: export: `=': not a valid identifier

did@Yedid:~/praktikum-os/week07-bash$ echo "$PRAKTIKUM_BASH_DIR"
/home/did/praktikum-os/week04-bash

did@Yedid:~/praktikum-os/week07-bash$ echo "$EDITOR"
nano
```
---

### Praktikum 6.4 — Menyiapkan .bash_profile untuk Shell Login
#### 1. Backup .bash_profile jika sudah ada:
Perintah:
```bash
[ -f ~/.bash_profile ] && cp ~/.bash_profile ~/.bach_profile.bak-praktikum
```
Outputnya
```bash
did@Yedid:~/praktikum-os/week07-bash$ [ -f ~/.bash_profile ] && cp ~/.bash_profile ~/.bach_profile.bak-praktikum

```
#### 2. Tambahkan konfigurasi login shell:
Perintah:
```bash
cat <<'EOF' >> ~/.bash_profile
# --- Praktikum Bash Login Shell ---
if [ -f ~/.bashrc ]; then
. ~/.bashrc
fi
echo "Login Bash pada $(date '+%F %T' )" >> "$HOME/praktikum-os/week07-bash/login-audit.log"
# --- End Praktikum Bash Login Shell ---
EOF
```
Outputnya
```bash
did@Yedid:~/praktikum-os/week07-bash$ cat <<'EOF' >> ~/.bash_profile
> # --- Praktikum Bash Login Shell ---
> if [ -f ~/.bashrc ]; then
. ~/.bashrc
> fi
> echo "Login Bash pada $(date '+%F %T' )" >> "$HOME/praktikum-os/week07-bash/login-audit.log"
> # --- End Praktikum Bash Login Shell ---
> EOF
```
#### 3. Uji dengan membuka login shell baru:
Perintah:
```bash
bash -l
tail -n 3 ~/praktikum-os/week07-bash/login-audit.log
exit
```
Outputnya
```bash
did@Yedid:~/praktikum-os/week07-bash$ bash -l
bash: export: `=': not a valid identifier
bash: export: `=': not a valid identifier
bash: export: `=': not a valid identifie

did@Yedid:~/praktikum-os/week07-bash$ tail -n 3 ~/praktikum-os/week07-bash/login-audit.log
Login Bash pada 2026-04-28 18:29:06
Login Bash pada 2026-04-28 18:29:37

did@Yedid:~/praktikum-os/week07-bash$ exit
logout

```
---

### Praktikum 6.5 — Membedakan Variabel Shell dan Environment Variable
#### 1. Buat variabel lokal:
Perintah:
```bash
KELAS_OS="Sistem Operasi A"
echo "$KELAS_OS"
```
Outputnya
```bash
did@Yedid:~/praktikum-os/week07-bash$ KELAS_OS="Sistem Operasi A"

did@Yedid:~/praktikum-os/week07-bash$ echo "$KELAS_OS"
Sistem Operasi A
```
#### 2. Buka subshell dan cek apakah variabel masih ada:
Perintah:
```bash
bash
echo "$KELAS_OS"
exit
```
Outputnya
```bash
did@Yedid:~/praktikum-os/week07-bash$ bash
bash: export: `=': not a valid identifier
bash: export: `=': not a valid identifier
bash: export: `=': not a valid identifier
bash: export: `=': not a valid identifier

did@Yedid:~/praktikum-os/week07-bash$ echo "$KELAS_OS"

did@Yedid:~/praktikum-os/week07-bash$ exit
exit
```
#### 3. Sekarang ubah menjadi environment variable:
Perintah:
```bash
export KELAS_OS="Sistem Operasi A"
bash
echo "$KELAS_OS"
exit
```
Outputnya
```bash
did@Yedid:~/praktikum-os/week07-bash$ export KELAS_OS="Sistem Operasi A"

did@Yedid:~/praktikum-os/week07-bash$ bash
bash: export: `=': not a valid identifier
bash: export: `=': not a valid identifier
bash: export: `=': not a valid identifier
bash: export: `=': not a valid identifier

did@Yedid:~/praktikum-os/week07-bash$ echo "$KELAS_OS"
Sistem Operasi A

did@Yedid:~/praktikum-os/week07-bash$ exit
exit
```
#### 4. Lihat isi PATH dan lokasi beberapa perintah:
Perintah:
```bash
echo "$PATH"
which bash
type ls
```
Outputnya
```bash
did@Yedid:~/praktikum-os/week07-bash$ echo "$PATH"
/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin:/snap/bin

did@Yedid:~/praktikum-os/week07-bash$ which bash
/usr/bin/bash

did@Yedid:~/praktikum-os/week07-bash$ type ls
ls is aliased to `ls --color=auto
```
---

### Praktikum 6.6 — Menambahkan Direktori Script Pribadi ke PATH
#### 1. Pastikan direktori bin praktikum tersedia:
Perintah:
```bash
mkdir -p ~/ praktikum - os / week07 - bash / bin
```
Outputnya
```bash
```
#### 2. Tambahkan direktori tersebut ke PATH melalui .bashrc:
Perintah:
```bash
cat <<'EOF ' >> ~/. bashrc
# --- Praktikum PATH ---
export PATH =" $HOME / praktikum -os/week07 - bash /bin : $PATH "
# --- End Praktikum PATH ---
EOF
source ~/. bashrc
echo " $PATH "
```
Outputnya
```bash
```
#### 3. Buat script ringkasan sistem:
Perintah:
```bash
cat <<'EOF ' > ~/ praktikum - os / week07 - bash / bin / ringkas -
sistem
#!/ usr/bin/env bash
echo " Hostname : $( hostname )"
echo " User : $( whoami )"
echo " Uptime : $( uptime -p)"
echo " Disk / :"
df -h /
EOF
chmod + x ~/ praktikum - os / week07 - bash / bin / ringkas - sistem
```
Outputnya
```bash
```
#### 4. Jalankan script dari direktori yang berbeda:
Perintah:
```bash
cd ~
ringkas - sistem
```
Outputnya
```bash
```
---

### Praktikum 6.7 — Membuat Alias Produktivitas Dasar
#### 1. Tambahkan alias ke .bashrc:
Perintah:
```bash
cat <<'EOF ' >> ~/. bashrc
# --- Praktikum Alias ---
alias ll ='ls -lah --color = auto '
alias hist10 ='history | tail -n 10 '
alias cdbashlab ='cd $HOME / praktikum -os/week04 - bash '
# --- End Praktikum Alias ---
EOF
source ~/. bashrc
```
Outputnya
```bash
```
#### 2. Uji alias:
Perintah:
```bash
ll
hist10
cdbashlab
pwd
type ll
```
Outputnya
```bash
```
---

### Praktikum 6.8 — Membuat Fungsi Backup Konfigurasi
#### 1. Siapkan file konfigurasi contoh:
Perintah:
```bash
echo " PORT =8080 " > ~/ praktikum - os / week07 - bash / sample -
app . conf
cat ~/ praktikum - os / week07 - bash / sample - app . conf
```
Outputnya
```bash
```
#### 2. Tambahkan fungsi ke .bashrc:
Perintah:
```bash
cat <<'EOF ' >> ~/. bashrc
# --- Praktikum Fungsi Shell ---
backup_conf () {
if [ $# -ne 1 ]; then
echo " Usage : backup_conf <file >"
return 1
fi
local src ="$1"
local dst =" $HOME / praktikum -os/week07 - bash / backup "
if [ ! -f " $src " ]; then
echo " File tidak ditemukan : $src "
return 2
fi
mkdir -p " $dst "
cp -- " $src " " $dst /$( basename " $src ").$( date +%F -%H%
M%S).bak"
echo " Backup selesai di $dst "
}
# --- End Praktikum Fungsi Shell ---
EOF
source ~/. bashrc
```
Outputnya
```bash
```
#### 3. Uji fungsi:
Perintah:
```bash
backup_conf ~/ praktikum - os / week07 - bash / sample - app . conf
ls - lah ~/ praktikum - os / week07 - bash / backup
type backup_conf
```
Outputnya
```bash
```
---

### Praktikum 6.9 — Menggunakan Completion Dasar dan Melihat History
#### 1. Pastikan file contoh tersedia:
Perintah:
```bash
cd ~/ praktikum - os / week07 - bash / sampel
touch laporan - harian . log laporan - mingguan . log laporan -
bulanan . log
ls
```
Outputnya
```bash
```
#### 2. Uji completion file:
Perintah:
```bash
a) Ketik cat lap lalu tekan Tab dua kali.
b) Amati daftar file yang memiliki prefix lap.
c) Ketik lebih spesifik, misalnya cat laporan-h lalu tekan Tab.
```
Outputnya
```bash
```
#### 3. Jalankan beberapa perintah sederhana:
Perintah:
```bash
pwd
ls - lah
date
whoami
history | tail -n 10
```
Outputnya
```bash
```
---

### Praktikum 6.10 — Menelusuri Perintah Diagnostik dengan History
#### 1. Jalankan beberapa perintah diagnostik:
Perintah:
```bash
df -h
free -h
uptime
ps aux | head
```
Outputnya
```bash
```
#### 2. Cari ulang perintah diagnostik dari history:
Perintah:
```bash
history | grep -E 'df -h| free -h| uptime |ps aux '
```
Outputnya
```bash
```
#### 3. Jalankan ulang salah satu perintah berdasarkan nomor history:
Perintah:
```bash
! < NOMOR_HISTORY_ANDA >
```
Outputnya
```bash
```
#### 4. Simpan potongan history ke file dokumentasi:
Perintah:
```bash
history | tail -n 20 > ~/ praktikum - os / week07 - bash / diag
- history . txt
cat ~/ praktikum - os / week07 - bash / diag - history . txt
```
Outputnya
```bash
```
--- 

### Praktikum 6.11 — Mencoba Wildcard Dasar
#### 1. Masuk ke direktori sampel:
Perintah:
```bash
cd ~/ praktikum - os / week07 - bash / sampel
ls
```
Outputnya
```bash
```
#### 2. Coba beberapa pola wildcard:
Perintah:
```bash
ls *. log
ls catatan -?. txt
ls backup -0[12]. tar
```
Outputnya
```bash
```
#### 3. Coba beberapa ekspansi lain:
Perintah:
```bash
echo log -{ pagi , siang , malam }. txt
echo ~
echo ~/ praktikum - os / week04 - bash
```
Outputnya
```bash
```
---

### Praktikum 6.12 — Mengarsipkan Banyak Log Sekaligus
#### 1. Siapkan file log tambahan:
Perintah:
```bash
cd ~/ praktikum - os / week07 - bash / logs
touch access -01. log access -02. log access -03. log
ls
```
Outputnya
```bash
```
#### 2. Preview file yang akan diproses:
Perintah:
```bash
echo *. log
echo access -0?. log
```
Outputnya
```bash
```
#### 3. Pindahkan semua file log ke folder arsip:
Perintah:
```bash
mkdir -p arsip - log
mv *. log arsip - log /
ls arsip - log
```
Outputnya
```bash
```
#### 4. Kompres folder arsip:
Perintah:
```bash
tar - czf arsip - log - $ ( date +% F ) . tar . gz arsip - log
ls - la
```
Outputnya
```bash
```
---

### Praktikum 6.13 — Membedakan Single Quote, Double Quote, dan Escape
#### 1. Uji single quote dan double quote:
Perintah:
```bash
echo '$USER bekerja di $HOME '
echo " $USER bekerja di $HOME "
```
Outputnya
```bash
```
#### 2. Uji escape karakter spasi:
Perintah:
```bash
cd ~/ praktikum - os / week07 - bash / ruang - nama
ls laporan \ server \ april . txt
```
Outputnya
```bash
```
#### 3. Uji akses file yang sama dengan double quote:
Perintah:
```bash
cat " laporan server april .txt"
```
Outputnya
```bash
```
---

### Praktikum 6.14 — Menangani File dengan Nama Sulit Secara Aman
#### 1. Pastikan file target tersedia:
Perintah:
```bash
cd ~/ praktikum - os / week07 - bash / ruang - nama
ls - lah
```
Outputnya
```bash
```
#### 2. Salin file dengan nama kompleks ke folder backup:
Perintah:
```bash
cp -- " backup [ mingguan ] server . conf " \
" $HOME / praktikum -os/week07 - bash / backup /backup -
mingguan - server . conf "
```
Outputnya
```bash
```
#### 3. Gunakan variabel untuk memproses path dengan aman:
Perintah:
```bash
file_asli =" $HOME / praktikum -os/week07 - bash /ruang - nama /
backup [ mingguan ] server . conf "
file_salinan =" $HOME / praktikum -os/week07 - bash / backup /
backup - mingguan -server -v2. conf "
cp -- " $file_asli " " $file_salinan "
ls - lah " $HOME / praktikum -os/week07 - bash / backup "
```
Outputnya
```bash
```
#### 4. Tampilkan daftar file hasil backup
Perintah:
```bash
for file in " $HOME "/ praktikum - os / week07 - bash / backup /*;
do
printf 'Hasil backup : %s\n' " $file "
done
```
Outputnya
```bash
```

