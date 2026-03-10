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
##### 1.explorasi perintah dasar

did@Yedid:~/Desktop$ cd
did@Yedid:~$ pwd
/home/did
did@Yedid:~$ ls -al
total 92
drwxr-x--- 18 did  did  4096 Mar 10 20:54 .
drwxr-xr-x  3 root root 4096 Mar  5 04:36 ..
drwxrwxr-x  4 did  did  4096 Mar 10 20:53 A
-rw-rw-r--  1 did  did     0 Mar  5 10:38 backup_error.log
-rw-rw-r--  1 did  did    45 Mar  5 10:41 BACKUP_FILE
-rw-------  1 did  did   664 Mar 10 21:13 .bash_history
-rw-r--r--  1 did  did   220 Mar 31  2024 .bash_logout
-rw-r--r--  1 did  did  3771 Mar 31  2024 .bashrc
drwxrwxr-x  2 did  did  4096 Mar 10 20:53 C
drwx------ 14 did  did  4096 Mar 10 19:35 .cache
drwx------ 14 did  did  4096 Mar  7 13:38 .config
drwxrwxr-x  2 did  did  4096 Mar 10 20:53 D
drwxr-xr-x  5 did  did  4096 Mar 10 19:31 Desktop
drwxr-xr-x  2 did  did  4096 Mar  5 05:39 Documents
drwxr-xr-x  2 did  did  4096 Mar  5 05:39 Downloads
drwx------  4 did  did  4096 Mar  5 05:39 .local
drwxr-xr-x  2 did  did  4096 Mar  5 05:39 Music
drwxr-xr-x  3 did  did  4096 Mar 10 19:34 Pictures
-rw-r--r--  1 did  did   807 Mar 31  2024 .profile
drwxr-xr-x  2 did  did  4096 Mar  5 05:39 Public
drwx------  5 did  did  4096 Mar  5 09:12 snap
drwx------  2 did  did  4096 Mar  5 04:37 .ssh
-rw-r--r--  1 did  did     0 Mar  7 13:34 .sudo_as_admin_successful
drwxr-xr-x  2 did  did  4096 Mar  5 05:39 Templates
drwxr-xr-x  2 did  did  4096 Mar  5 05:39 Videos
did@Yedid:~$ cd .
did@Yedid:~$ pwd
/home/did
did@Yedid:~$ cd ..
did@Yedid:/home$ pwd
/home
did@Yedid:/home$ ls -al
total 12
drwxr-xr-x  3 root root 4096 Mar  5 04:36 .
drwxr-xr-x 23 root root 4096 Mar  5 04:17 ..
drwxr-x--- 18 did  did  4096 Mar 10 20:54 did
did@Yedid:/home$ cd /etc
did@Yedid:/etc$ ls -al | more
total 1144
drwxr-xr-x 138 root                 root                 12288 Mar  5 04:37 .
drwxr-xr-x  23 root                 root                  4096 Mar  5 04:17 ..
-rw-r--r--   1 root                 root                  3444 Jul  5  2023 addu
ser.conf
drwxr-xr-x   3 root                 root                  4096 Feb 10 00:28 alsa
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:31 alte
rnatives
-rw-r--r--   1 root                 root                   335 Apr  8  2024 anac
rontab
-rw-r--r--   1 root                 root                   433 Apr  8  2024 apg.
conf
drwxr-xr-x   5 root                 root                  4096 Feb 10 00:27 apm
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:27 appa
rmor
drwxr-xr-x   9 root                 root                  4096 Feb 10 00:31 appa
rmor.d
drwxr-xr-x   3 root                 root                  4096 Feb 10 00:29 appo
rt
drwxr-xr-x   9 root                 root                  4096 Mar  5 04:17 apt
drwxr-xr-x   3 root                 root                  4096 Feb 10 00:29 avah
i
-rw-r--r--   1 root                 root                  2319 Mar 31  2024 bash
.bashrc
-rw-r--r--   1 root                 root                    45 Jan 24  2020 bash
_completion
-rw-r--r--   1 root                 root                   367 Aug  2  2022 bind
resvport.blacklist
drwxr-xr-x   2 root                 root                  4096 Apr 19  2024 binf
mt.d
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 blue
tooth
-rw-r-----   1 root                 root                    33 Feb 10 00:31 brla
pi.key
drwxr-xr-x   7 root                 root                  4096 Feb 10 00:28 brlt
ty
-rw-r--r--   1 root                 root                 30571 Mar 31  2024 brlt
ty.conf
drwxr-xr-x   3 root                 root                  4096 Feb 10 00:19 ca-c
ertificates
-rw-r--r--   1 root                 root                  6288 Feb 10 00:20 ca-c
ertificates.conf
drwxr-s---   2 root                 dip                   4096 Feb 10 00:29 chat
scripts
drwxr-xr-x   5 root                 root                  4096 Mar  5 04:37 clou
d
drwxr-xr-x   2 colord               colord                4096 Mar  5 04:37 colo
rd
drwxr-xr-x   2 root                 root                  4096 Mar  5 04:29 cons
ole-setup
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 crac
klib
drwx------   2 root                 root                  4096 Apr 19  2024 cred
store
drwx------   2 root                 root                  4096 Apr 19  2024 cred
store.encrypted
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 cron
.d
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 cron
.daily
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:19 cron
.hourly
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:28 cron
.monthly
-rw-r--r--   1 root                 root                  1136 Mar 31  2024 cron
tab
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 cron
.weekly
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:19 cron
.yearly
drwxr-xr-x   5 root                 lp                    4096 Mar 10 21:08 cups
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 cups
helpers
drwxr-xr-x   4 root                 root                  4096 Feb 10 00:19 dbus
-1
drwxr-xr-x   4 root                 root                  4096 Feb 10 00:28 dcon
f
-rw-r--r--   1 root                 root                  2967 Apr 12  2024 debc
onf.conf
-rw-r--r--   1 root                 root                    11 Apr 22  2024 debi
an_version
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:28 debu
ginfod
drwxr-xr-x   3 root                 root                  4096 Mar  5 04:32 defa
ult
-rw-r--r--   1 root                 root                  1706 Jul  5  2023 delu
ser.conf
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:21 depm
od.d
drwxr-xr-x   3 root                 root                  4096 Feb 10 00:20 dhcp
-rw-r--r--   1 root                 root                  1429 Mar 31  2024 dhcp
cd.conf
drwxr-xr-x   2 root                 root                  4096 Mar  5 04:33 dict
ionaries-common
drwxr-xr-x   4 root                 root                  4096 Feb 10 00:21 dpkg
-rw-r--r--   1 root                 root                   685 Apr  8  2024 e2sc
rub.conf
drwxr-xr-x   3 root                 root                  4096 Feb 10 00:27 emac
s
-rw-r--r--   1 root                 root                   106 Feb 10 00:19 envi
ronment
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:31 envi
ronment.d
-rw-r--r--   1 root                 root                  1853 Oct 17  2022 ethe
rtypes
drwxr-xr-x   5 root                 root                  4096 Feb 10 00:29 font
s
-rw-r--r--   1 root                 root                    20 Apr  4  2024 fpri
ntd.conf
-rw-r--r--   1 root                 root                   446 Mar  5 04:32 fsta
b
-rw-r--r--   1 root                 root                   694 Apr  8  2024 fuse
.conf
drwxr-xr-x   4 root                 root                  4096 Feb 10 00:29 fwup
d
-rw-r--r--   1 root                 root                  2584 Jan 31  2024 gai.
conf
drwxr-xr-x   3 root                 root                  4096 Feb 10 00:29 gdb
drwxr-xr-x   8 root                 root                  4096 Feb 10 00:31 gdm3
drwxr-xr-x   3 root                 root                  4096 Feb 10 00:31 geoc
lue
drwxr-xr-x   4 root                 root                  4096 Feb 10 00:27 ghos
tscript
drwxr-xr-x   3 root                 root                  4096 Feb 10 00:27 glvn
d
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:28 gnom
e
drwxr-xr-x   2 gnome-remote-desktop gnome-remote-desktop  4096 Feb 10 00:31 gnom
e-remote-desktop
drwxr-xr-x   2 root                 root                  4096 Mar  5 04:34 gnut
ls
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 grof
f
-rw-r--r--   1 root                 root                  1067 Mar  5 04:36 grou
p
-rw-r--r--   1 root                 root                  1064 Mar  5 04:36 grou
p-
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:33 grub
.d
-rw-r-----   1 root                 shadow                 894 Mar  5 04:36 gsha
dow
-rw-r-----   1 root                 shadow                 891 Mar  5 04:36 gsha
dow-
drwxr-xr-x   3 root                 root                  4096 Feb 10 00:19 gss
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 gtk-
2.0
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:31 gtk-
3.0
-rw-r--r--   1 root                 root                  4436 Oct  6  2022 hdpa
rm.conf
-rw-r--r--   1 root                 root                    92 Apr 22  2024 host
.conf
-rw-r--r--   1 root                 root                     6 Mar  5 04:36 host
name
-rw-r--r--   1 root                 root                   273 Feb  4  2025 host
s
-rw-r--r--   1 root                 root                   411 Feb 10 00:28 host
s.allow
-rw-r--r--   1 root                 root                   711 Feb 10 00:28 host
s.deny
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:31 hp
drwxr-xr-x   3 root                 root                  4096 Feb 10 00:28 ifpl
ugd
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 init
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:31 init
.d
drwxr-xr-x   5 root                 root                  4096 Feb 10 00:29 init
ramfs-tools
-rw-r--r--   1 root                 root                  1875 Mar 31  2024 inpu
trc
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:31 inss
erv.conf.d
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 ipp-
usb
drwxr-xr-x   4 root                 root                  4096 Feb 10 00:21 ipro
ute2
-rw-r--r--   1 root                 root                    26 Feb  6 07:23 issu
e
-rw-r--r--   1 root                 root                    19 Feb  6 07:23 issu
e.net
drwxr-xr-x   6 root                 root                  4096 Mar  5 04:31 kern
el
-rw-r--r--   1 root                 root                  1308 Mar 31  2024 kern
eloops.conf
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 krb5
.conf.d
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:28 ldap
-rw-r--r--   1 root                 root                 55283 Mar  5 04:36 ld.s
o.cache
-rw-r--r--   1 root                 root                    34 Aug  2  2022 ld.s
o.conf
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:21 ld.s
o.conf.d
-rw-r--r--   1 root                 root                   267 Apr 22  2024 lega
l
-rw-r--r--   1 root                 root                    27 Apr  8  2024 liba
o.conf
-rw-r--r--   1 root                 root                   191 Mar 31  2024 liba
udit.conf
drwxr-xr-x   3 root                 root                  4096 Feb 10 00:28 libb
lockdev
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 libi
bverbs.d
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 libn
l-3
drwxr-xr-x   2 root                 root                  4096 Apr  8  2024 libp
aper.d
-rw-r--r--   1 root                 root                  2996 Mar 30  2024 loca
le.alias
-rw-r--r--   1 root                 root                    17 Mar  5 04:37 loca
le.conf
-rw-r--r--   1 root                 root                  9563 Mar  5 04:36 loca
le.gen
lrwxrwxrwx   1 root                 root                    27 Mar  5 04:37 loca
ltime -> /usr/share/zoneinfo/Etc/UTC
drwxr-xr-x   4 root                 root                  4096 Feb 10 00:27 logc
heck
-rw-r--r--   1 root                 root                 12345 Feb 22  2024 logi
n.defs
-rw-r--r--   1 root                 root                   586 Apr  8  2024 logr
otate.conf
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:31 logr
otate.d
-rw-r--r--   1 root                 root                   104 Feb  6 07:22 lsb-
release
-r--r--r--   1 root                 root                    33 Mar  5 04:29 mach
ine-id
-rw-r--r--   1 root                 root                   111 Mar 31  2024 magi
c
-rw-r--r--   1 root                 root                   111 Mar 31  2024 magi
c.mime
-rw-r--r--   1 root                 root                  5230 Apr  8  2024 manp
ath.config
-rw-r--r--   1 root                 root                 75113 Jul 12  2023 mime
.types
-rw-r--r--   1 root                 root                   744 Apr  8  2024 mke2
fs.conf
drwxr-xr-x   4 root                 root                  4096 Feb 10 00:28 Mode
mManager
drwxr-xr-x   2 root                 root                  4096 Mar  5 04:32 modp
robe.d
-rw-r--r--   1 root                 root                   212 Feb 10 00:20 modu
les
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 modu
les-load.d
lrwxrwxrwx   1 root                 root                    19 Feb 10 00:19 mtab
 -> ../proc/self/mounts
-rw-r--r--   1 root                 root                 11424 May 23  2023 nano
rc
-rw-r--r--   1 root                 root                   767 Mar 31  2024 netc
onfig
drwxr-xr-x   2 root                 root                  4096 Mar  5 09:28 netp
lan
drwxr-xr-x   6 root                 root                  4096 Feb 10 00:28 netw
ork
drwxr-xr-x   8 root                 root                  4096 Feb 10 00:20 netw
orkd-dispatcher
drwxr-xr-x   8 root                 root                  4096 Feb 10 00:31 Netw
orkManager
-rw-r--r--   1 root                 root                    91 Apr 22  2024 netw
orks
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:20 newt
-rwxr-xr-x   1 root                 root                   243 Oct 19  2023 nfta
bles.conf
-rw-r--r--   1 root                 root                   594 Feb 10 00:29 nssw
itch.conf
drwxr-xr-x   4 root                 root                  4096 Feb 10 00:29 open
vpn
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:19 opt
lrwxrwxrwx   1 root                 root                    21 Feb  6 07:23 os-r
elease -> ../usr/lib/os-release
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:31 Pack
ageKit
-rw-r--r--   1 root                 root                   552 Oct 13  2022 pam.
conf
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:31 pam.
d
-rw-r--r--   1 root                 root                     3 Feb 10 00:28 pape
rsize
-rw-r--r--   1 root                 root                  2855 Mar  5 04:36 pass
wd
-rw-r--r--   1 root                 root                  2815 Feb 10 00:31 pass
wd-
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 pcmc
ia
drwxr-xr-x   3 root                 root                  4096 Feb 10 00:27 perl
drwxr-xr-x   4 root                 root                  4096 Feb 10 00:28 pki
drwxr-xr-x   2 root                 root                  4096 Feb 25  2025 plym
outh
drwxr-xr-x   3 root                 root                  4096 Feb 10 00:28 pm
-rw-r--r--   1 root                 root                  7649 Feb 10 00:29 pnm2
ppa.conf
drwxr-xr-x   4 root                 root                  4096 Feb 10 00:28 polk
it-1
drwxr-xr-x   8 root                 dip                   4096 Feb 10 00:29 ppp
-rw-r--r--   1 root                 root                   582 Apr 22  2024 prof
ile
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 prof
ile.d
-rw-r--r--   1 root                 root                  3144 Oct 17  2022 prot
ocols
drwxr-xr-x   3 root                 root                  4096 Feb 10 00:29 puls
e
-rw-------   1 root                 root                     0 Feb 10 00:19 .pwd
.lock
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:20 pyth
on3
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:21 pyth
on3.12
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:31 rc0.
d
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:31 rc1.
d
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:31 rc2.
d
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:31 rc3.
d
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:31 rc4.
d
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:31 rc5.
d
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:31 rc6.
d
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 rcS.
d
lrwxrwxrwx   1 root                 root                    39 Feb 10 00:20 reso
lv.conf -> ../run/systemd/resolve/stub-resolv.conf
-rw-r--r--   1 root                 root                   862 Feb 10 00:19 .res
olv.conf.systemd-resolved.bak
lrwxrwxrwx   1 root                 root                    13 Apr  8  2024 rmt 
-> /usr/sbin/rmt
-rw-r--r--   1 root                 root                   911 Oct 17  2022 rpc
-rw-r--r--   1 root                 root                  1213 Mar 22  2024 rsys
log.conf
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 rsys
log.d
-rw-r--r--   1 root                 root                  5772 Jan  6  2024 ryge
l.conf
drwxr-xr-x   3 root                 root                  4096 Feb 10 00:31 sane
.d
drwxr-xr-x   4 root                 root                  4096 Feb 10 00:28 secu
rity
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:19 seli
nux
-rw-r--r--   1 root                 root                 10593 Mar 31  2024 sens
ors3.conf
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:28 sens
ors.d
-rw-r--r--   1 root                 root                 12813 Mar 27  2021 serv
ices
drwxr-xr-x   3 root                 root                  4096 Feb 10 00:31 sgml
-rw-r-----   1 root                 shadow                1336 Mar  5 04:36 shad
ow
-rw-r-----   1 root                 shadow                1336 Mar  5 04:36 shad
ow-
-rw-r--r--   1 root                 root                   118 Feb 10 00:19 shel
ls
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:19 skel
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:28 snmp
drwxr-xr-x   4 root                 root                  4096 Feb 10 00:29 spee
ch-dispatcher
drwxr-xr-x   3 root                 root                  4096 Mar  5 04:36 ssh
drwxr-xr-x   4 root                 root                  4096 Feb 10 00:21 ssl
drwx--x--x   3 root                 root                  4096 Feb 10 00:28 sssd
-rw-r--r--   1 root                 root                    17 Mar  5 04:36 subg
id
-rw-r--r--   1 root                 root                     0 Feb 10 00:19 subg
id-
-rw-r--r--   1 root                 root                    17 Mar  5 04:36 subu
id
-rw-r--r--   1 root                 root                     0 Feb 10 00:19 subu
id-
-rw-r--r--   1 root                 root                  4343 Apr  8  2024 sudo
.conf
-r--r-----   1 root                 root                  1800 Jan 29  2024 sudo
ers
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:21 sudo
ers.d
-rw-r--r--   1 root                 root                  9804 Apr  8  2024 sudo
_logsrvd.conf
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:20 supe
rcat
-rw-r--r--   1 root                 root                  2209 Mar 24  2024 sysc
tl.conf
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:21 sysc
tl.d
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 syss
tat
drwxr-xr-x   7 root                 root                  4096 Mar  5 04:37 syst
emd
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:19 term
info
drwxr-xr-x   2 root                 root                  4096 Mar  5 04:32 ther
mald
-rw-r--r--   1 root                 root                     8 Mar  5 04:37 time
zone
drwxr-xr-x   2 root                 root                  4096 Apr 19  2024 tmpf
iles.d
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:21 ubun
tu-advantage
-rw-r--r--   1 root                 root                  1260 Jan 27  2023 ucf.
conf
drwxr-xr-x   4 root                 root                  4096 Feb 10 00:21 udev
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 udis
ks2
drwxr-xr-x   3 root                 root                  4096 Feb 10 00:29 ufw
-rw-r--r--   1 root                 root                   208 Feb 10 00:19 .upd
ated
drwxr-xr-x   3 root                 root                  4096 Feb 10 00:30 upda
te-manager
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:31 upda
te-motd.d
drwxr-xr-x   2 root                 root                  4096 Apr  2  2025 upda
te-notifier
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 UPow
er
-rw-r--r--   1 root                 root                  1523 Apr  8  2024 usb_
modeswitch.conf
drwxr-xr-x   2 root                 root                  4096 Dec 16  2023 usb_
modeswitch.d
lrwxrwxrwx   1 root                 root                    16 Feb 10 00:19 vcon
sole.conf -> default/keyboard
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:21 vim
lrwxrwxrwx   1 root                 root                    23 Feb 26  2024 vtrg
b -> /etc/alternatives/vtrgb
drwxr-xr-x   5 root                 root                  4096 Feb 10 00:27 vulk
an
-rw-r--r--   1 root                 root                  4942 Jun 19  2024 wget
rc
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:29 wpa_
supplicant
drwxr-xr-x  12 root                 root                  4096 Feb 10 00:31 X11
-rw-r--r--   1 root                 root                   681 Apr  8  2024 xatt
r.conf
drwxr-xr-x   6 root                 root                  4096 Feb 10 00:28 xdg
drwxr-xr-x   2 root                 root                  4096 Feb 10 00:31 xml
-rw-r--r--   1 root                 root                   460 Jan 20  2023 zsh_
command_not_found
did@Yedid:/etc$ cd -
/home
did@Yedid:/home$ pwd
/home

---

Eksplorasi Perintah Dasar (Latihan 1): Pada bagian awal, kita difokuskan untuk terbiasa menavigasi terminal. Perintah cd . membuktikan posisi kita tetap di tempat, sedangkan cd .. dipakai untuk naik satu folder. Kita juga menggunakan ls -al untuk mengecek semua file, termasuk yang disembunyikan (hidden). Waktu masuk ke /etc, ada trik ls -al | more supaya daftar file yang panjang banget tidak langsung bergulir habis, tapi bisa dibaca per halaman. Ada juga perintah cd - yang sangat praktis untuk melompat balik ke folder yang baru saja ditinggalkan.

---

##### 2.Menelusuri direktori sistem dasar

id@Yedid:/proc$ cd /bin
did@Yedid:/bin$ ls
'['                                   nano
 aa-enabled                           nautilus
 aa-exec                              nautilus-autorun-software
 aa-features-abi                      nautilus-sendto
 aconnect                             nawk
 acpidbg                              nc
 add-apt-repository                   nc.openbsd
 addpart                              neqn
 airscan-discover                     netaddr
 alsabat                              netcat
 alsaloop                             networkctl
 alsamixer                            networkd-dispatcher
 alsatplg                             newgrp
 alsaucm                              ngettext
 amidi                                nice
 amixer                               nisdomainname
 apg                                  nl
 apgbfm                               nm-applet
 aplay                                nmcli
 aplaymidi                            nm-connection-editor
 apport-bug                           nm-online
 apport-cli                           nmtui
 apport-collect                       nmtui-connect
 apport-unpack                        nmtui-edit
 appres                               nmtui-hostname
 appstreamcli                         nohup
 apropos                              notify-send
 apt                                  nproc
 apt-add-repository                   nroff
 apt-cache                            nsenter
 apt-cdrom                            nslookup
 apt-config                           nstat
 aptdcon                              nsupdate
 apt-extracttemplates                 ntfs-3g
 apt-ftparchive                       ntfs-3g.probe
 apt-get                              ntfscat
 apt-key                              ntfscluster
 apt-mark                             ntfscmp
 apt-sortpkgs                         ntfsdecrypt
 arch                                 ntfsfallocate
 arecord                              ntfsfix
 arecordmidi                          ntfsinfo
 arm2hpdl                             ntfsls
 aseqdump                             ntfsmove
 aseqnet                              ntfsrecover
 aspell                               ntfssecaudit
 aspell-import                        ntfstruncate
 atobm                                ntfsusermap
 awk                                  ntfswipe
 axfer                                numactl
 b2sum                                numastat
 baobab                               numfmt
 base32                               nvidia-detector
 base64                               oakdecode
 basename                             obexctl
 basenc                               oclock
 bash                                 od
 bashbug                              oem-getlogs
 bc                                   on_ac_power
 bdftopcf                             oomctl
 bdftruncate                          open
 bitmap                               openssl
 bluemoon                             openvt
 bluetoothctl                         opldecode
 bluetooth-sendto                     orca
 bmtoa                                orca-dm-wrapper
 boltctl                              os-prober
 bpftrace                             p11-kit
 bpftrace-aotrt                       pager
 brltty                               paperconf
 brltty-atb                           partx
 brltty-clip                          passwd
 brltty-ctb                           paste
 brltty-hid                           patch
 brltty-ktb                           pathchk
 brltty-lscmds                        pdb3
 brltty-morse                         pdb3.12
 brltty-trtxt                         pdf2dsc
 brltty-ttb                           pdf2ps
 brltty-tune                          pdfattach
 broadwayd                            pdfdetach
 browse                               pdffonts
 btattach                             pdfimages
 btmgmt                               pdfinfo
 btmon                                pdfseparate
 busctl                               pdfsig
 busybox                              pdftocairo
 bwrap                                pdftohtml
 calibrate_ppa                        pdftoppm
 canberra-gtk-play                    pdftops
 cancel                               pdftotext
 captoinfo                            pdfunite
 cat                                  peekfd
 catman                               perf
 cd-create-profile                    perl
 cd-fix-profile                       perl5.38.2
 cd-iccdump                           perl5.38-x86_64-linux-gnu
 cd-it8                               perlbug
 chacl                                perldoc
 chage                                perli11ndoc
 chardet                              perlivp
 chardetect                           perlthanks
 chattr                               pf2afm
 chcon                                pfbtopfa
 check-language-support               pgrep
 chfn                                 pic
 chgrp                                pico
 chmod                                piconv
 choom                                pidof
 chown                                pidstat
 chrt                                 pidwait
 chsh                                 pinentry
 chvt                                 pinentry-curses
 cifsiostat                           pinentry-gnome3
 ciptool                              pinentry-x11
 ckbcomp                              ping
 cksum                                ping4
 clear                                ping6
 clear_console                        pinky
 cloud-id                             pipewire
 cloud-init                           pipewire-aes67
 cloud-init-per                       pipewire-avb
 cmp                                  pipewire-pulse
 codepage                             pkaction
 col                                  pkcheck
 colcrt                               pkcon
 colormgr                             pkexec
 colrm                                pkill
 column                               pkmon
 comm                                 pkttyagent
 corelist                             pl2pm
 cp                                   pldd
 cpan                                 plog
 cpan5.38-x86_64-linux-gnu            plymouth
 cpio                                 pmap
 cpp                                  pnm2ppa
 cpp-13                               pod2html
 cpupower                             pod2man
 c_rehash                             pod2text
 crontab                              pod2usage
 csplit                               podchecker
 ctstat                               poff
 cupstestppd                          pon
 cut                                  POST
 cvt                                  powerprofilesctl
 cvtsudoers                           ppdc
 dash                                 ppdhtml
 date                                 ppdi
 dbus-cleanup-sockets                 ppdmerge
 dbus-daemon                          ppdpo
 dbus-monitor                         pphs
 dbus-run-session                     pr
 dbus-send                            precat
 dbus-update-activation-environment   preconv
 dbus-uuidgen                         preunzip
 dbxtool                              prezip
 dc                                   prezip-bin
 dconf                                printafm
 dd                                   printenv
 ddstdecode                           printer-profile
 deallocvt                            printf
 debconf                              prlimit
 debconf-apt-progress                 pro
 debconf-communicate                  prove
 debconf-copydb                       prtstat
 debconf-escape                       ps
 debconf-set-selections               ps2ascii
 debconf-show                         ps2epsi
 debian-distro-info                   ps2pdf
 deb-systemd-helper                   ps2pdf12
 deb-systemd-invoke                   ps2pdf13
 delpart                              ps2pdf14
 delv                                 ps2pdfwr
 desktop-file-edit                    ps2ps
 desktop-file-install                 ps2ps2
 desktop-file-validate                ps2txt
 df                                   psfaddtable
 dh_bash-completion                   psfgettable
 dh_installxmlcatalogs                psfstriptable
 dh_perl_openssl                      psfxtable
 diff                                 psicc
 diff3                                pslog
 dig                                  pstree
 dir                                  pstree.x11
 dircolors                            ptar
 dirmngr                              ptardiff
 dirmngr-client                       ptargrep
 dirname                              ptx
 distro-info                          pw-cat
 dmesg                                pw-cli
 dnsdomainname                        pw-config
 domainname                           pwd
 do-release-upgrade                   pw-dot
 dpkg                                 pw-dsdplay
 dpkg-deb                             pw-dump
 dpkg-divert                          pwdx
 dpkg-maintscript-helper              pw-encplay
 dpkg-query                           pw-link
 dpkg-realpath                        pw-loopback
 dpkg-split                           pw-metadata
 dpkg-statoverride                    pw-mididump
 dpkg-trigger                         pw-midiplay
 driverless                           pw-midirecord
 driverless-fax                       pw-mon
 du                                   pw-play
 dumpkeys                             pw-profiler
 dvipdf                               pw-record
 eatmydata                            pw-reserve
 ec2metadata                          pw-top
 echo                                 py3clean
 ed                                   py3compile
 editor                               py3versions
 editres                              pybabel
 egrep                                pybabel-python3
 eject                                pydoc3
 enc2xs                               pydoc3.12
 encguess                             pygettext3
 enchant-2                            pygettext3.12
 enchant-lsmod-2                      pygmentize
 env                                  pyserial-miniterm
 envsubst                             pyserial-ports
 eog                                  python3
 eps2eps                              python3.12
 eqn                                  pzstd
 esc-m                                qmicli
 eutp                                 qmi-firmware-update
 evince                               qmi-network
 evince-previewer                     qpdldecode
 evince-thumbnailer                   quirks-handler
 ex                                   rbash
 expand                               rctest
 expiry                               rdma
 expr                                 readlink
 factor                               realpath
 faillog                              red
 fallocate                            rename.ul
 false                                rendercheck
 fc-cache                             renice
 fc-cat                               reset
 fc-conflist                          resizecons
 fc-list                              resizepart
 fc-match                             resolvectl
 fc-pattern                           rev
 fc-query                             rfcomm
 fc-scan                              rgrep
 fc-validate                          rm
 fgconsole                            rmdir
 fgrep                                rnano
 file                                 routel
 file2brl                             rpcgen
 find                                 rrsync
 findmnt                              rstart
 firefox                              rstartd
 flock                                rsync
 fmt                                  rsync-ssl
 fold                                 rtla
 fonttosfnt                           rtstat
 foo2ddst                             runcon
 foo2ddst-wrapper                     run-parts
 foo2hbpl2                            run-with-aspell
 foo2hbpl2-wrapper                    rview
 foo2hiperc                           rygel
 foo2hiperc-wrapper                   sadf
 foo2hp                               sane-find-scanner
 foo2hp2600-wrapper                   sar
 foo2lava                             sar.sysstat
 foo2lava-wrapper                     savelog
 foo2oak                              sbattach
 foo2oak-wrapper                      sbkeysync
 foo2qpdl                             sbsiglist
 foo2qpdl-wrapper                     sbsign
 foo2slx                              sbvarsign
 foo2slx-wrapper                      sbverify
 foo2xqx                              scanimage
 foo2xqx-wrapper                      scp
 foo2zjs                              scp-dbus-service
 foo2zjs-icc2ps                       screendump
 foo2zjs-pstops                       script
 foo2zjs-wrapper                      scriptlive
 foomatic-rip                         scriptreplay
 fprintd-delete                       sdiff
 fprintd-enroll                       sdptool
 fprintd-list                         seahorse
 fprintd-verify                       sed
 free                                 select-default-iwrap
 ftp                                  select-editor
 funzip                               sensible-browser
 fuser                                sensible-editor
 fusermount                           sensible-pager
 fusermount3                          sensible-terminal
 fwupdmgr                             seq
 fwupdtool                            session-migration
 gamemoded                            sessreg
 gamma4scanimage                      setarch
 gapplication                         setfacl
 gatttool                             setfont
 gcalccmd                             setkeycodes
 gcore                                setleds
 gcr-viewer                           setlogcons
 gcr-viewer-gtk4                      setmetamode
 gdb                                  setpci
 gdb-add-index                        setpriv
 gdbtui                               setsid
 gdbus                                setterm
 gdk-pixbuf-csource                   setupcon
 gdk-pixbuf-pixdata                   setxkbmap
 gdk-pixbuf-thumbnailer               sftp
 gdm-config                           sg
 gdmflexiserver                       sh
 gdm-screenshot                       sha1sum
 gencat                               sha224sum
 geqn                                 sha256sum
 GET                                  sha384sum
 getconf                              sha512sum
 getent                               shasum
 getfacl                              showconsolefont
 getkeycodes                          showkey
 getopt                               showrgb
 gettext                              shred
 gettext.sh                           shuf
 ghostscript                          skill
 ginstall-info                        slabtop
 gio                                  sleep
 gio-querymodules                     slogin
 gipddecode                           slxdecode
 gjs                                  smproxy
 gjs-console                          snap
 gkbd-keyboard-display                snapctl
 glib-compile-schemas                 snapfuse
 gnome-calculator                     snice
 gnome-characters                     soelim
 gnome-clocks                         software-properties-gtk
 gnome-control-center                 sort
 gnome-disk-image-mounter             sotruss
 gnome-disks                          spa-acp-tool
 gnome-extensions                     spa-inspect
 gnome-font-viewer                    spa-json-dump
 gnome-help                           spa-monitor
 gnome-keyring                        spa-resample
 gnome-keyring-3                      spd-conf
 gnome-keyring-daemon                 spd-say
 gnome-language-selector              spdsend
 gnome-logs                           speaker-test
 gnome-power-statistics               speech-dispatcher
 gnome-session                        spice-vdagent
 gnome-session-inhibit                splain
 gnome-session-properties             split
 gnome-session-quit                   splitfont
 gnome-shell                          sprof
 gnome-shell-extension-tool           sqfscat
 gnome-shell-test-tool                sqfstar
 gnome-system-monitor                 ss
 gnome-terminal                       ssh
 gnome-terminal.real                  ssh-add
 gnome-terminal.wrapper               ssh-agent
 gnome-text-editor                    ssh-argv0
 gnome-thumbnail-font                 ssh-copy-id
 gnome-www-browser                    ssh-keygen
 gpasswd                              ssh-keyscan
 gpg                                  sss_ssh_authorizedkeys
 gpg-agent                            sss_ssh_knownhostsproxy
 gpgconf                              startx
 gpg-connect-agent                    stat
 gpgparsemail                         static-sh
 gpgsm                                stdbuf
 gpgsplit                             strace
 gpgtar                               strace-log-merge
 gpgv                                 streamzip
 gpg-wks-client                       stty
 gpic                                 su
 gpu-manager                          sudo
 grdctl                               sudoedit
 grep                                 sudoreplay
 gresource                            sum
 groff                                switcherooctl
 grog                                 sync
 grops                                systemctl
 grotty                               systemd
 groups                               systemd-ac-power
 growpart                             systemd-analyze
 grub-editenv                         systemd-ask-password
 grub-file                            systemd-cat
 grub-fstest                          systemd-cgls
 grub-glue-efi                        systemd-cgtop
 grub-kbdcomp                         systemd-confext
 grub-menulst2cfg                     systemd-creds
 grub-mkfont                          systemd-cryptenroll
 grub-mkimage                         systemd-cryptsetup
 grub-mklayout                        systemd-delta
 grub-mknetdir                        systemd-detect-virt
 grub-mkpasswd-pbkdf2                 systemd-escape
 grub-mkrelpath                       systemd-firstboot
 grub-mkrescue                        systemd-hwdb
 grub-mkstandalone                    systemd-id128
 grub-mount                           systemd-inhibit
 grub-ntldr-img                       systemd-machine-id-setup
 grub-render-label                    systemd-mount
 grub-script-check                    systemd-notify
 grub-syslinux2cfg                    systemd-path
 gs                                   systemd-repart
 gsbj                                 systemd-run
 gsdj                                 systemd-socket-activate
 gsdj500                              systemd-stdio-bridge
 gsettings                            systemd-sysext
 gslj                                 systemd-sysusers
 gslp                                 systemd-tmpfiles
 gsnd                                 systemd-tty-ask-password-agent
 gst-device-monitor-1.0               systemd-umount
 gst-discoverer-1.0                   tabs
 gst-inspect-1.0                      tac
 gst-launch-1.0                       tail
 gst-play-1.0                         tapestat
 gstreamer-codec-install              tar
 gst-stats-1.0                        taskset
 gst-tester-1.0                       tbl
 gst-typefind-1.0                     tclsh
 gtbl                                 tclsh8.6
 gted                                 tcpdump
 gtf                                  tecla
 gtk4-broadwayd                       tee
 gtk4-builder-tool                    telnet
 gtk4-encode-symbolic-svg             tempfile
 gtk4-launch                          test
 gtk4-path-tool                       tic
 gtk4-query-settings                  tificc
 gtk4-rendernode-tool                 time
 gtk4-update-icon-cache               timedatectl
 gtk-builder-tool                     timeout
 gtk-encode-symbolic-svg              tload
 gtk-launch                           tnftp
 gtk-query-settings                   toe
 gtk-update-icon-cache                top
 gunzip                               touch
 gzexe                                tput
 gzip                                 tr
 h2ph                                 trace-cmd
 h2xs                                 tracepath
 hardlink                             tracker3
 hbpldecode                           tracker3-daemon
 hciattach                            tracker3-endpoint
 hciconfig                            tracker3-export
 hcitool                              tracker3-extract
 hd                                   tracker3-help
 head                                 tracker3-import
 HEAD                                 tracker3-index
 heif-thumbnailer                     tracker3-info
 helpztags                            tracker3-reset
 hex2hcd                              tracker3-search
 hexdump                              tracker3-sparql
 hipercdecode                         tracker3-sql
 host                                 tracker3-status
 hostid                               tracker3-tag
 hostname                             transicc
 hostnamectl                          transset
 hp-align                             troff
 hp-check                             true
 hp-clean                             truncate
 hp-colorcal                          trust
 hp-config_usb_printer                tset
 hp-doctor                            tsort
 hp-firmware                          tty
 hp-info                              turbostat
 hp-levels                            tzselect
 hp-logcapture                        ua
 hp-makeuri                           ubuntu-advantage
 hp-pkservice                         ubuntu-bug
 hp-plugin                            ubuntu-distro-info
 hp-plugin-ubuntu                     ubuntu-drivers
 hp-probe                             ubuntu-report
 hp-query                             ubuntu-security-status
 hp-scan                              ucf
 hp-setup                             ucfq
 hp-testpage                          ucfr
 hp-timedate                          uclampset
 hwe-support-status                   ucs2any
 i386                                 udevadm
 ibus                                 udisksctl
 ibus-daemon                          ul
 ibus-setup                           umax_pp
 ibus-table-createdb                  umount
 iceauth                              uname
 ico                                  unattended-upgrade
 iconv                                unattended-upgrades
 id                                   uncompress
 iecset                               unexpand
 ijs_pxljr                            unicode_start
 im-config                            unicode_stop
 im-launch                            uniq
 inetutils-telnet                     unity-scope-loader
 info                                 unlink
 infobrowser                          unlzma
 infocmp                              unmkinitramfs
 infotocap                            unshare
 inputattach                          unsquashfs
 install                              unxz
 install-info                         unzip
 instmodsh                            unzipsfx
 intel-virtual-output                 unzstd
 ionice                               update-alternatives
 iostat                               update-desktop-database
 ip                                   update-manager
 ipcmk                                update-mime-database
 ipcrm                                update-notifier
 ipcs                                 upower
 ippfind                              uptime
 ipptool                              usb-devices
 iptables-xml                         usbhid-dump
 ischroot                             usbip
 isdv4-serial-debugger                usbipd
 isdv4-serial-inputattach             usb_printerid
 ispell-wrapper                       usbreset
 join                                 users
 journalctl                           utmpdump
 jpgicc                               uuidgen
 jq                                   uuidparse
 jsondiff                             varlinkctl
 jsonpatch                            vcs-run
 json-patch-jsondiff                  vdir
 jsonpointer                          vi
 json_pp                              view
 jsonschema                           viewres
 kbdinfo                              vim.tiny
 kbd_mode                             vmstat
 kbxutil                              vmwarectrl
 kernel-install                       vstp
 kerneloops-submit                    w
 kill                                 wall
 killall                              watch
 kmod                                 watchgnupg
 kmodsign                             wc
 l2ping                               wdctl
 l2test                               wget
 laptop-detect                        whatis
 last                                 whereis
 lastb                                which
 lastlog                              which.debianutils
 lavadecode                           whiptail
 lcf                                  who
 ldapadd                              whoami
 ldapcompare                          whoopsie
 ldapdelete                           whoopsie-preferences
 ldapexop                             wireplumber
 ldapmodify                           word-list-compress
 ldapmodrdn                           wpa_passphrase
 ldappasswd                           wpctl
 ldapsearch                           wpexec
 ldapurl                              write
 ldapwhoami                           X
 ldd                                  X11
 ld.so                                x11perf
 less                                 x11perfcomp
 lessecho                             x86_64
 lessfile                             x86_64-linux-gnu-cpp
 lesskey                              x86_64-linux-gnu-cpp-13
 lesspipe                             x86_energy_perf_policy
 lexgrog                              xargs
 libnetcfg                            xauth
 link                                 xbiff
 linkicc                              xbrlapi
 linux32                              xcalc
 linux64                              xclipboard
 linux-boot-prober                    xclock
 linux-check-removal                  xcmsdb
 linux-update-symlinks                xconsole
 linux-version                        xcursorgen
 listres                              xcutsel
 ln                                   xdg-dbus-proxy
 lnstat                               xdg-desktop-icon
 loadkeys                             xdg-desktop-menu
 loadunimap                           xdg-email
 locale                               xdg-icon-resource
 locale-check                         xdg-mime
 localectl                            xdg-open
 localedef                            xdg-screensaver
 logger                               xdg-settings
 login                                xdg-user-dir
 loginctl                             xdg-user-dirs-gtk-update
 logname                              xdg-user-dirs-update
 look                                 xditview
 lowntfs-3g                           xdpyinfo
 lp                                   xdriinfo
 lpoptions                            xedit
 lpq                                  Xephyr
 lpr                                  xev
 lprm                                 xeyes
 lpstat                               xfd
 ls                                   xfontsel
 lsattr                               xgamma
 lsblk                                xgc
 lsb_release                          xhost
 lscpu                                xinit
 lshw                                 xinput
 lsinitramfs                          xkbbell
 lsipc                                xkbcomp
 lslocks                              xkbevd
 lslogins                             xkbprint
 lsmem                                xkbvleds
 lsmod                                xkbwatch
 lsns                                 xkeystone
 lsof                                 xkill
 lspci                                xload
 lspgpot                              xlogo
 lspower                              xlsatoms
 lsusb                                xlsclients
 lwp-download                         xlsfonts
 lwp-dump                             xmag
 lwp-mirror                           xman
 lwp-request                          xmessage
 lzcat                                xmodmap
 lzcmp                                xmore
 lzdiff                               Xorg
 lzegrep                              xprop
 lzfgrep                              xqxdecode
 lzgrep                               xrandr
 lzless                               xrdb
 lzma                                 xrefresh
 lzmainfo                             x-session-manager
 lzmore                               xset
 m17n-db                              xsetmode
 m2300w                               xsetpointer
 m2300w-wrapper                       xsetroot
 m2400w                               xsetwacom
 man                                  xsm
 mandb                                xstdcmap
 manpath                              xsubpp
 man-recode                           x-terminal-emulator
 mapscrn                              xvidtune
 markdown-it                          xvinfo
 mawk                                 Xwayland
 mbimcli                              xwd
 mbim-network                         xwininfo
 mcookie                              xwud
 md5sum                               x-www-browser
 md5sum.textutils                     xxd
 mdig                                 xz
 memhog                               xzcat
 memusage                             xzcmp
 memusagestat                         xzdiff
 mesa-overlay-control.py              xzegrep
 mesg                                 xzfgrep
 migratepages                         xzgrep
 migrate-pubring-from-classic-gpg     xzless
 migspeed                             xzmore
 mimeopen                             yelp
 mimetype                             yes
 min12xxw                             ypdomainname
 mkdir                                zcat
 mkfifo                               zcmp
 mkfontdir                            zdiff
 mkfontscale                          zdump
 mk_modmap                            zegrep
 mknod                                zenity
 mksquashfs                           zfgrep
 mktemp                               zforce
 mmcli                                zgrep
 monitor-sensor                       zip
 more                                 zipcloak
 mount                                zipdetails
 mountpoint                           zipgrep
 mousetweaks                          zipinfo
 mpris-proxy                          zipnote
 mpstat                               zipsplit
 mscompress                           zjsdecode
 msexpand                             zless
 mt                                   zmore
 mt-gnu                               znew
 mtr                                  zstd
 mtrace                               zstdcat
 mtr-packet                           zstdgrep
 mv                                   zstdless
 namei                                zstdmt
did@Yedid:/bin$ pwd
/bin
did@Yedid:/bin$ cd /usr/bin
did@Yedid:/usr/bin$ ls
'['                                   nano
 aa-enabled                           nautilus
 aa-exec                              nautilus-autorun-software
 aa-features-abi                      nautilus-sendto
 aconnect                             nawk
 acpidbg                              nc
 add-apt-repository                   nc.openbsd
 addpart                              neqn
 airscan-discover                     netaddr
 alsabat                              netcat
 alsaloop                             networkctl
 alsamixer                            networkd-dispatcher
 alsatplg                             newgrp
 alsaucm                              ngettext
 amidi                                nice
 amixer                               nisdomainname
 apg                                  nl
 apgbfm                               nm-applet
 aplay                                nmcli
 aplaymidi                            nm-connection-editor
 apport-bug                           nm-online
 apport-cli                           nmtui
 apport-collect                       nmtui-connect
 apport-unpack                        nmtui-edit
 appres                               nmtui-hostname
 appstreamcli                         nohup
 apropos                              notify-send
 apt                                  nproc
 apt-add-repository                   nroff
 apt-cache                            nsenter
 apt-cdrom                            nslookup
 apt-config                           nstat
 aptdcon                              nsupdate
 apt-extracttemplates                 ntfs-3g
 apt-ftparchive                       ntfs-3g.probe
 apt-get                              ntfscat
 apt-key                              ntfscluster
 apt-mark                             ntfscmp
 apt-sortpkgs                         ntfsdecrypt
 arch                                 ntfsfallocate
 arecord                              ntfsfix
 arecordmidi                          ntfsinfo
 arm2hpdl                             ntfsls
 aseqdump                             ntfsmove
 aseqnet                              ntfsrecover
 aspell                               ntfssecaudit
 aspell-import                        ntfstruncate
 atobm                                ntfsusermap
 awk                                  ntfswipe
 axfer                                numactl
 b2sum                                numastat
 baobab                               numfmt
 base32                               nvidia-detector
 base64                               oakdecode
 basename                             obexctl
 basenc                               oclock
 bash                                 od
 bashbug                              oem-getlogs
 bc                                   on_ac_power
 bdftopcf                             oomctl
 bdftruncate                          open
 bitmap                               openssl
 bluemoon                             openvt
 bluetoothctl                         opldecode
 bluetooth-sendto                     orca
 bmtoa                                orca-dm-wrapper
 boltctl                              os-prober
 bpftrace                             p11-kit
 bpftrace-aotrt                       pager
 brltty                               paperconf
 brltty-atb                           partx
 brltty-clip                          passwd
 brltty-ctb                           paste
 brltty-hid                           patch
 brltty-ktb                           pathchk
 brltty-lscmds                        pdb3
 brltty-morse                         pdb3.12
 brltty-trtxt                         pdf2dsc
 brltty-ttb                           pdf2ps
 brltty-tune                          pdfattach
 broadwayd                            pdfdetach
 browse                               pdffonts
 btattach                             pdfimages
 btmgmt                               pdfinfo
 btmon                                pdfseparate
 busctl                               pdfsig
 busybox                              pdftocairo
 bwrap                                pdftohtml
 calibrate_ppa                        pdftoppm
 canberra-gtk-play                    pdftops
 cancel                               pdftotext
 captoinfo                            pdfunite
 cat                                  peekfd
 catman                               perf
 cd-create-profile                    perl
 cd-fix-profile                       perl5.38.2
 cd-iccdump                           perl5.38-x86_64-linux-gnu
 cd-it8                               perlbug
 chacl                                perldoc
 chage                                perli11ndoc
 chardet                              perlivp
 chardetect                           perlthanks
 chattr                               pf2afm
 chcon                                pfbtopfa
 check-language-support               pgrep
 chfn                                 pic
 chgrp                                pico
 chmod                                piconv
 choom                                pidof
 chown                                pidstat
 chrt                                 pidwait
 chsh                                 pinentry
 chvt                                 pinentry-curses
 cifsiostat                           pinentry-gnome3
 ciptool                              pinentry-x11
 ckbcomp                              ping
 cksum                                ping4
 clear                                ping6
 clear_console                        pinky
 cloud-id                             pipewire
 cloud-init                           pipewire-aes67
 cloud-init-per                       pipewire-avb
 cmp                                  pipewire-pulse
 codepage                             pkaction
 col                                  pkcheck
 colcrt                               pkcon
 colormgr                             pkexec
 colrm                                pkill
 column                               pkmon
 comm                                 pkttyagent
 corelist                             pl2pm
 cp                                   pldd
 cpan                                 plog
 cpan5.38-x86_64-linux-gnu            plymouth
 cpio                                 pmap
 cpp                                  pnm2ppa
 cpp-13                               pod2html
 cpupower                             pod2man
 c_rehash                             pod2text
 crontab                              pod2usage
 csplit                               podchecker
 ctstat                               poff
 cupstestppd                          pon
 cut                                  POST
 cvt                                  powerprofilesctl
 cvtsudoers                           ppdc
 dash                                 ppdhtml
 date                                 ppdi
 dbus-cleanup-sockets                 ppdmerge
 dbus-daemon                          ppdpo
 dbus-monitor                         pphs
 dbus-run-session                     pr
 dbus-send                            precat
 dbus-update-activation-environment   preconv
 dbus-uuidgen                         preunzip
 dbxtool                              prezip
 dc                                   prezip-bin
 dconf                                printafm
 dd                                   printenv
 ddstdecode                           printer-profile
 deallocvt                            printf
 debconf                              prlimit
 debconf-apt-progress                 pro
 debconf-communicate                  prove
 debconf-copydb                       prtstat
 debconf-escape                       ps
 debconf-set-selections               ps2ascii
 debconf-show                         ps2epsi
 debian-distro-info                   ps2pdf
 deb-systemd-helper                   ps2pdf12
 deb-systemd-invoke                   ps2pdf13
 delpart                              ps2pdf14
 delv                                 ps2pdfwr
 desktop-file-edit                    ps2ps
 desktop-file-install                 ps2ps2
 desktop-file-validate                ps2txt
 df                                   psfaddtable
 dh_bash-completion                   psfgettable
 dh_installxmlcatalogs                psfstriptable
 dh_perl_openssl                      psfxtable
 diff                                 psicc
 diff3                                pslog
 dig                                  pstree
 dir                                  pstree.x11
 dircolors                            ptar
 dirmngr                              ptardiff
 dirmngr-client                       ptargrep
 dirname                              ptx
 distro-info                          pw-cat
 dmesg                                pw-cli
 dnsdomainname                        pw-config
 domainname                           pwd
 do-release-upgrade                   pw-dot
 dpkg                                 pw-dsdplay
 dpkg-deb                             pw-dump
 dpkg-divert                          pwdx
 dpkg-maintscript-helper              pw-encplay
 dpkg-query                           pw-link
 dpkg-realpath                        pw-loopback
 dpkg-split                           pw-metadata
 dpkg-statoverride                    pw-mididump
 dpkg-trigger                         pw-midiplay
 driverless                           pw-midirecord
 driverless-fax                       pw-mon
 du                                   pw-play
 dumpkeys                             pw-profiler
 dvipdf                               pw-record
 eatmydata                            pw-reserve
 ec2metadata                          pw-top
 echo                                 py3clean
 ed                                   py3compile
 editor                               py3versions
 editres                              pybabel
 egrep                                pybabel-python3
 eject                                pydoc3
 enc2xs                               pydoc3.12
 encguess                             pygettext3
 enchant-2                            pygettext3.12
 enchant-lsmod-2                      pygmentize
 env                                  pyserial-miniterm
 envsubst                             pyserial-ports
 eog                                  python3
 eps2eps                              python3.12
 eqn                                  pzstd
 esc-m                                qmicli
 eutp                                 qmi-firmware-update
 evince                               qmi-network
 evince-previewer                     qpdldecode
 evince-thumbnailer                   quirks-handler
 ex                                   rbash
 expand                               rctest
 expiry                               rdma
 expr                                 readlink
 factor                               realpath
 faillog                              red
 fallocate                            rename.ul
 false                                rendercheck
 fc-cache                             renice
 fc-cat                               reset
 fc-conflist                          resizecons
 fc-list                              resizepart
 fc-match                             resolvectl
 fc-pattern                           rev
 fc-query                             rfcomm
 fc-scan                              rgrep
 fc-validate                          rm
 fgconsole                            rmdir
 fgrep                                rnano
 file                                 routel
 file2brl                             rpcgen
 find                                 rrsync
 findmnt                              rstart
 firefox                              rstartd
 flock                                rsync
 fmt                                  rsync-ssl
 fold                                 rtla
 fonttosfnt                           rtstat
 foo2ddst                             runcon
 foo2ddst-wrapper                     run-parts
 foo2hbpl2                            run-with-aspell
 foo2hbpl2-wrapper                    rview
 foo2hiperc                           rygel
 foo2hiperc-wrapper                   sadf
 foo2hp                               sane-find-scanner
 foo2hp2600-wrapper                   sar
 foo2lava                             sar.sysstat
 foo2lava-wrapper                     savelog
 foo2oak                              sbattach
 foo2oak-wrapper                      sbkeysync
 foo2qpdl                             sbsiglist
 foo2qpdl-wrapper                     sbsign
 foo2slx                              sbvarsign
 foo2slx-wrapper                      sbverify
 foo2xqx                              scanimage
 foo2xqx-wrapper                      scp
 foo2zjs                              scp-dbus-service
 foo2zjs-icc2ps                       screendump
 foo2zjs-pstops                       script
 foo2zjs-wrapper                      scriptlive
 foomatic-rip                         scriptreplay
 fprintd-delete                       sdiff
 fprintd-enroll                       sdptool
 fprintd-list                         seahorse
 fprintd-verify                       sed
 free                                 select-default-iwrap
 ftp                                  select-editor
 funzip                               sensible-browser
 fuser                                sensible-editor
 fusermount                           sensible-pager
 fusermount3                          sensible-terminal
 fwupdmgr                             seq
 fwupdtool                            session-migration
 gamemoded                            sessreg
 gamma4scanimage                      setarch
 gapplication                         setfacl
 gatttool                             setfont
 gcalccmd                             setkeycodes
 gcore                                setleds
 gcr-viewer                           setlogcons
 gcr-viewer-gtk4                      setmetamode
 gdb                                  setpci
 gdb-add-index                        setpriv
 gdbtui                               setsid
 gdbus                                setterm
 gdk-pixbuf-csource                   setupcon
 gdk-pixbuf-pixdata                   setxkbmap
 gdk-pixbuf-thumbnailer               sftp
 gdm-config                           sg
 gdmflexiserver                       sh
 gdm-screenshot                       sha1sum
 gencat                               sha224sum
 geqn                                 sha256sum
 GET                                  sha384sum
 getconf                              sha512sum
 getent                               shasum
 getfacl                              showconsolefont
 getkeycodes                          showkey
 getopt                               showrgb
 gettext                              shred
 gettext.sh                           shuf
 ghostscript                          skill
 ginstall-info                        slabtop
 gio                                  sleep
 gio-querymodules                     slogin
 gipddecode                           slxdecode
 gjs                                  smproxy
 gjs-console                          snap
 gkbd-keyboard-display                snapctl
 glib-compile-schemas                 snapfuse
 gnome-calculator                     snice
 gnome-characters                     soelim
 gnome-clocks                         software-properties-gtk
 gnome-control-center                 sort
 gnome-disk-image-mounter             sotruss
 gnome-disks                          spa-acp-tool
 gnome-extensions                     spa-inspect
 gnome-font-viewer                    spa-json-dump
 gnome-help                           spa-monitor
 gnome-keyring                        spa-resample
 gnome-keyring-3                      spd-conf
 gnome-keyring-daemon                 spd-say
 gnome-language-selector              spdsend
 gnome-logs                           speaker-test
 gnome-power-statistics               speech-dispatcher
 gnome-session                        spice-vdagent
 gnome-session-inhibit                splain
 gnome-session-properties             split
 gnome-session-quit                   splitfont
 gnome-shell                          sprof
 gnome-shell-extension-tool           sqfscat
 gnome-shell-test-tool                sqfstar
 gnome-system-monitor                 ss
 gnome-terminal                       ssh
 gnome-terminal.real                  ssh-add
 gnome-terminal.wrapper               ssh-agent
 gnome-text-editor                    ssh-argv0
 gnome-thumbnail-font                 ssh-copy-id
 gnome-www-browser                    ssh-keygen
 gpasswd                              ssh-keyscan
 gpg                                  sss_ssh_authorizedkeys
 gpg-agent                            sss_ssh_knownhostsproxy
 gpgconf                              startx
 gpg-connect-agent                    stat
 gpgparsemail                         static-sh
 gpgsm                                stdbuf
 gpgsplit                             strace
 gpgtar                               strace-log-merge
 gpgv                                 streamzip
 gpg-wks-client                       stty
 gpic                                 su
 gpu-manager                          sudo
 grdctl                               sudoedit
 grep                                 sudoreplay
 gresource                            sum
 groff                                switcherooctl
 grog                                 sync
 grops                                systemctl
 grotty                               systemd
 groups                               systemd-ac-power
 growpart                             systemd-analyze
 grub-editenv                         systemd-ask-password
 grub-file                            systemd-cat
 grub-fstest                          systemd-cgls
 grub-glue-efi                        systemd-cgtop
 grub-kbdcomp                         systemd-confext
 grub-menulst2cfg                     systemd-creds
 grub-mkfont                          systemd-cryptenroll
 grub-mkimage                         systemd-cryptsetup
 grub-mklayout                        systemd-delta
 grub-mknetdir                        systemd-detect-virt
 grub-mkpasswd-pbkdf2                 systemd-escape
 grub-mkrelpath                       systemd-firstboot
 grub-mkrescue                        systemd-hwdb
 grub-mkstandalone                    systemd-id128
 grub-mount                           systemd-inhibit
 grub-ntldr-img                       systemd-machine-id-setup
 grub-render-label                    systemd-mount
 grub-script-check                    systemd-notify
 grub-syslinux2cfg                    systemd-path
 gs                                   systemd-repart
 gsbj                                 systemd-run
 gsdj                                 systemd-socket-activate
 gsdj500                              systemd-stdio-bridge
 gsettings                            systemd-sysext
 gslj                                 systemd-sysusers
 gslp                                 systemd-tmpfiles
 gsnd                                 systemd-tty-ask-password-agent
 gst-device-monitor-1.0               systemd-umount
 gst-discoverer-1.0                   tabs
 gst-inspect-1.0                      tac
 gst-launch-1.0                       tail
 gst-play-1.0                         tapestat
 gstreamer-codec-install              tar
 gst-stats-1.0                        taskset
 gst-tester-1.0                       tbl
 gst-typefind-1.0                     tclsh
 gtbl                                 tclsh8.6
 gted                                 tcpdump
 gtf                                  tecla
 gtk4-broadwayd                       tee
 gtk4-builder-tool                    telnet
 gtk4-encode-symbolic-svg             tempfile
 gtk4-launch                          test
 gtk4-path-tool                       tic
 gtk4-query-settings                  tificc
 gtk4-rendernode-tool                 time
 gtk4-update-icon-cache               timedatectl
 gtk-builder-tool                     timeout
 gtk-encode-symbolic-svg              tload
 gtk-launch                           tnftp
 gtk-query-settings                   toe
 gtk-update-icon-cache                top
 gunzip                               touch
 gzexe                                tput
 gzip                                 tr
 h2ph                                 trace-cmd
 h2xs                                 tracepath
 hardlink                             tracker3
 hbpldecode                           tracker3-daemon
 hciattach                            tracker3-endpoint
 hciconfig                            tracker3-export
 hcitool                              tracker3-extract
 hd                                   tracker3-help
 head                                 tracker3-import
 HEAD                                 tracker3-index
 heif-thumbnailer                     tracker3-info
 helpztags                            tracker3-reset
 hex2hcd                              tracker3-search
 hexdump                              tracker3-sparql
 hipercdecode                         tracker3-sql
 host                                 tracker3-status
 hostid                               tracker3-tag
 hostname                             transicc
 hostnamectl                          transset
 hp-align                             troff
 hp-check                             true
 hp-clean                             truncate
 hp-colorcal                          trust
 hp-config_usb_printer                tset
 hp-doctor                            tsort
 hp-firmware                          tty
 hp-info                              turbostat
 hp-levels                            tzselect
 hp-logcapture                        ua
 hp-makeuri                           ubuntu-advantage
 hp-pkservice                         ubuntu-bug
 hp-plugin                            ubuntu-distro-info
 hp-plugin-ubuntu                     ubuntu-drivers
 hp-probe                             ubuntu-report
 hp-query                             ubuntu-security-status
 hp-scan                              ucf
 hp-setup                             ucfq
 hp-testpage                          ucfr
 hp-timedate                          uclampset
 hwe-support-status                   ucs2any
 i386                                 udevadm
 ibus                                 udisksctl
 ibus-daemon                          ul
 ibus-setup                           umax_pp
 ibus-table-createdb                  umount
 iceauth                              uname
 ico                                  unattended-upgrade
 iconv                                unattended-upgrades
 id                                   uncompress
 iecset                               unexpand
 ijs_pxljr                            unicode_start
 im-config                            unicode_stop
 im-launch                            uniq
 inetutils-telnet                     unity-scope-loader
 info                                 unlink
 infobrowser                          unlzma
 infocmp                              unmkinitramfs
 infotocap                            unshare
 inputattach                          unsquashfs
 install                              unxz
 install-info                         unzip
 instmodsh                            unzipsfx
 intel-virtual-output                 unzstd
 ionice                               update-alternatives
 iostat                               update-desktop-database
 ip                                   update-manager
 ipcmk                                update-mime-database
 ipcrm                                update-notifier
 ipcs                                 upower
 ippfind                              uptime
 ipptool                              usb-devices
 iptables-xml                         usbhid-dump
 ischroot                             usbip
 isdv4-serial-debugger                usbipd
 isdv4-serial-inputattach             usb_printerid
 ispell-wrapper                       usbreset
 join                                 users
 journalctl                           utmpdump
 jpgicc                               uuidgen
 jq                                   uuidparse
 jsondiff                             varlinkctl
 jsonpatch                            vcs-run
 json-patch-jsondiff                  vdir
 jsonpointer                          vi
 json_pp                              view
 jsonschema                           viewres
 kbdinfo                              vim.tiny
 kbd_mode                             vmstat
 kbxutil                              vmwarectrl
 kernel-install                       vstp
 kerneloops-submit                    w
 kill                                 wall
 killall                              watch
 kmod                                 watchgnupg
 kmodsign                             wc
 l2ping                               wdctl
 l2test                               wget
 laptop-detect                        whatis
 last                                 whereis
 lastb                                which
 lastlog                              which.debianutils
 lavadecode                           whiptail
 lcf                                  who
 ldapadd                              whoami
 ldapcompare                          whoopsie
 ldapdelete                           whoopsie-preferences
 ldapexop                             wireplumber
 ldapmodify                           word-list-compress
 ldapmodrdn                           wpa_passphrase
 ldappasswd                           wpctl
 ldapsearch                           wpexec
 ldapurl                              write
 ldapwhoami                           X
 ldd                                  X11
 ld.so                                x11perf
 less                                 x11perfcomp
 lessecho                             x86_64
 lessfile                             x86_64-linux-gnu-cpp
 lesskey                              x86_64-linux-gnu-cpp-13
 lesspipe                             x86_energy_perf_policy
 lexgrog                              xargs
 libnetcfg                            xauth
 link                                 xbiff
 linkicc                              xbrlapi
 linux32                              xcalc
 linux64                              xclipboard
 linux-boot-prober                    xclock
 linux-check-removal                  xcmsdb
 linux-update-symlinks                xconsole
 linux-version                        xcursorgen
 listres                              xcutsel
 ln                                   xdg-dbus-proxy
 lnstat                               xdg-desktop-icon
 loadkeys                             xdg-desktop-menu
 loadunimap                           xdg-email
 locale                               xdg-icon-resource
 locale-check                         xdg-mime
 localectl                            xdg-open
 localedef                            xdg-screensaver
 logger                               xdg-settings
 login                                xdg-user-dir
 loginctl                             xdg-user-dirs-gtk-update
 logname                              xdg-user-dirs-update
 look                                 xditview
 lowntfs-3g                           xdpyinfo
 lp                                   xdriinfo
 lpoptions                            xedit
 lpq                                  Xephyr
 lpr                                  xev
 lprm                                 xeyes
 lpstat                               xfd
 ls                                   xfontsel
 lsattr                               xgamma
 lsblk                                xgc
 lsb_release                          xhost
 lscpu                                xinit
 lshw                                 xinput
 lsinitramfs                          xkbbell
 lsipc                                xkbcomp
 lslocks                              xkbevd
 lslogins                             xkbprint
 lsmem                                xkbvleds
 lsmod                                xkbwatch
 lsns                                 xkeystone
 lsof                                 xkill
 lspci                                xload
 lspgpot                              xlogo
 lspower                              xlsatoms
 lsusb                                xlsclients
 lwp-download                         xlsfonts
 lwp-dump                             xmag
 lwp-mirror                           xman
 lwp-request                          xmessage
 lzcat                                xmodmap
 lzcmp                                xmore
 lzdiff                               Xorg
 lzegrep                              xprop
 lzfgrep                              xqxdecode
 lzgrep                               xrandr
 lzless                               xrdb
 lzma                                 xrefresh
 lzmainfo                             x-session-manager
 lzmore                               xset
 m17n-db                              xsetmode
 m2300w                               xsetpointer
 m2300w-wrapper                       xsetroot
 m2400w                               xsetwacom
 man                                  xsm
 mandb                                xstdcmap
 manpath                              xsubpp
 man-recode                           x-terminal-emulator
 mapscrn                              xvidtune
 markdown-it                          xvinfo
 mawk                                 Xwayland
 mbimcli                              xwd
 mbim-network                         xwininfo
 mcookie                              xwud
 md5sum                               x-www-browser
 md5sum.textutils                     xxd
 mdig                                 xz
 memhog                               xzcat
 memusage                             xzcmp
 memusagestat                         xzdiff
 mesa-overlay-control.py              xzegrep
 mesg                                 xzfgrep
 migratepages                         xzgrep
 migrate-pubring-from-classic-gpg     xzless
 migspeed                             xzmore
 mimeopen                             yelp
 mimetype                             yes
 min12xxw                             ypdomainname
 mkdir                                zcat
 mkfifo                               zcmp
 mkfontdir                            zdiff
 mkfontscale                          zdump
 mk_modmap                            zegrep
 mknod                                zenity
 mksquashfs                           zfgrep
 mktemp                               zforce
 mmcli                                zgrep
 monitor-sensor                       zip
 more                                 zipcloak
 mount                                zipdetails
 mountpoint                           zipgrep
 mousetweaks                          zipinfo
 mpris-proxy                          zipnote
 mpstat                               zipsplit
 mscompress                           zjsdecode
 msexpand                             zless
 mt                                   zmore
 mt-gnu                               znew
 mtr                                  zstd
 mtrace                               zstdcat
 mtr-packet                           zstdgrep
 mv                                   zstdless
 namei                                zstdmt
did@Yedid:/usr/bin$ cd /sbin
did@Yedid:/sbin$ ls
aa-load                grpck                        pythongc-bpfcc
aa-remove-unknown      grpconv                      pythonstat-bpfcc
aa-status              grpunconv                    rdmaucma-bpfcc
aa-teardown            grub-bios-setup              readahead-bpfcc
accessdb               grub-install                 readprofile
addgnupghome           grub-macbless                reboot
addgroup               grub-mkconfig                remove-default-ispell
add-shell              grub-mkdevicemap             remove-default-wordlist
adduser                grub-probe                   remove-shell
agetty                 grub-reboot                  reset-trace-bpfcc
alsa                   grub-set-default             resize2fs
alsabat-test           halt                         resolvconf
alsactl                hardirqs-bpfcc               rfkill
alsa-info              hdparm                       rmmod
anacron                iconvconfig                  rmt
apparmor_parser        init                         rmt-tar
apparmor_status        inject-bpfcc                 rsyslogd
applygnupgdefaults     insmod                       rtacct
aptd                   installkernel                rtcwake
argdist-bpfcc          install-sgmlcatalog          rtkitctl
arpd                   invoke-rc.d                  rtmon
arptables              ip                           rubycalls-bpfcc
arptables-nft          ip6tables                    rubyflow-bpfcc
arptables-nft-restore  ip6tables-apply              rubygc-bpfcc
arptables-nft-save     ip6tables-legacy             rubyobjnew-bpfcc
arptables-restore      ip6tables-legacy-restore     rubystat-bpfcc
arptables-save         ip6tables-legacy-save        runlevel
aspell-autobuildhash   ip6tables-nft                runqlat-bpfcc
avahi-daemon           ip6tables-nft-restore        runqlat.bt
badblocks              ip6tables-nft-save           runqlen-bpfcc
bashreadline-bpfcc     ip6tables-restore            runqlen.bt
bashreadline.bt        ip6tables-restore-translate  runqslower-bpfcc
bindsnoop-bpfcc        ip6tables-save               runuser
biolatency-bpfcc       ip6tables-translate          saned
biolatency.bt          ippevepcl                    select-default-ispell
biolatency-kp.bt       ippeveprinter                select-default-wordlist
biolatpcts-bpfcc       ippeveps                     service
biopattern-bpfcc       ipp-usb                      setcap
biosdecode             iptables                     setuids.bt
biosnoop-bpfcc         iptables-apply               setvesablank
biosnoop.bt            iptables-legacy              setvtrgb
biostacks.bt           iptables-legacy-restore      sfdisk
biotop-bpfcc           iptables-legacy-save         sgdisk
bitesize-bpfcc         iptables-nft                 shadowconfig
bitesize.bt            iptables-nft-restore         shmsnoop-bpfcc
blkdeactivate          iptables-nft-save            shutdown
blkdiscard             iptables-restore             slabratetop-bpfcc
blkid                  iptables-restore-translate   sofdsnoop-bpfcc
blkzone                iptables-save                softirqs-bpfcc
blockdev               iptables-translate           solisten-bpfcc
bluetoothd             isosize                      spice-vdagentd
bpflist-bpfcc          ispell-autobuildhash         ssllatency.bt
bpftool                iucode-tool                  sslsniff-bpfcc
bridge                 iucode_tool                  sslsnoop.bt
brltty                 iwconfig                     sssd
brltty-setup           iwevent                      stackcount-bpfcc
btrfsdist-bpfcc        iwgetid                      start-stop-daemon
btrfsslower-bpfcc      iwlist                       statsnoop-bpfcc
cachestat-bpfcc        iwpriv                       statsnoop.bt
cachetop-bpfcc         iwspy                        sudo_logsrvd
capable-bpfcc          javacalls-bpfcc              sudo_sendlog
capable.bt             javaflow-bpfcc               sulogin
capsh                  javagc-bpfcc                 swapin.bt
cfdisk                 javaobjnew-bpfcc             swaplabel
cgdisk                 javastat-bpfcc               swapoff
chat                   javathreads-bpfcc            swapon
chcpu                  kbdrate                      switch_root
chgpasswd              kerneloops                   syncsnoop-bpfcc
chmem                  killall5                     syncsnoop.bt
chpasswd               killsnoop-bpfcc              syscount-bpfcc
chroot                 killsnoop.bt                 syscount.bt
cobjnew-bpfcc          klockstat-bpfcc              sysctl
compactsnoop-bpfcc     kvmexit-bpfcc                tarcat
cpgr                   ldattach                     tc
cppw                   ldconfig                     tclcalls-bpfcc
cpudist-bpfcc          ldconfig.real                tclflow-bpfcc
cpuunclaimed-bpfcc     llcstat-bpfcc                tclobjnew-bpfcc
cpuwalk.bt             loads.bt                     tclstat-bpfcc
cracklib-check         locale-gen                   tcpaccept-bpfcc
cracklib-format        logrotate                    tcpaccept.bt
cracklib-packer        logsave                      tcpcong-bpfcc
cracklib-unpacker      losetup                      tcpconnect-bpfcc
create-cracklib-dict   lpadmin                      tcpconnect.bt
criticalstat-bpfcc     lpc                          tcpconnlat-bpfcc
cron                   lpinfo                       tcpdrop-bpfcc
ctrlaltdel             lpmove                       tcpdrop.bt
cupsaccept             lsmod                        tcplife-bpfcc
cups-browsed           lspcmcia                     tcplife.bt
cupsctl                make-ssl-cert                tcpretrans-bpfcc
cupsd                  mdflush-bpfcc                tcpretrans.bt
cupsdisable            mdflush.bt                   tcprtt-bpfcc
cupsenable             memleak-bpfcc                tcpstates-bpfcc
cupsfilter             mkdosfs                      tcpsubnet-bpfcc
cupsreject             mke2fs                       tcpsynbl-bpfcc
dbslower-bpfcc         mkfs                         tcpsynbl.bt
dbstat-bpfcc           mkfs.bfs                     tcptop-bpfcc
dcb                    mkfs.cramfs                  tcptracer-bpfcc
dcsnoop-bpfcc          mkfs.ext2                    telinit
dcsnoop.bt             mkfs.ext3                    thermald
dcstat-bpfcc           mkfs.ext4                    threadsnoop-bpfcc
deadlock-bpfcc         mkfs.fat                     threadsnoop.bt
debugfs                mkfs.minix                   tipc
delgroup               mkfs.msdos                   tplist-bpfcc
deluser                mkfs.ntfs                    trace-bpfcc
depmod                 mkfs.vfat                    ttysnoop-bpfcc
devlink                mkhomedir_helper             tune2fs
dhcpcd                 mkinitramfs                  ucalls
dirtop-bpfcc           mklost+found                 u-d-c-print-pci-ids
dmidecode              mkntfs                       uflow
dmsetup                mkswap                       ufw
dmstats                ModemManager                 ugc
dnsmasq                modinfo                      umount.udisks2
dosfsck                modprobe                     undump.bt
dosfslabel             mount.fuse                   unix_chkpwd
dpkg-preconfigure      mount.fuse3                  unix_update
dpkg-reconfigure       mount.lowntfs-3g             uobjnew
drsnoop-bpfcc          mount.ntfs                   update-ca-certificates
dumpe2fs               mount.ntfs-3g                update-catalog
e2freefrag             mountsnoop-bpfcc             update-cracklib
e2fsck                 mysqld_qslower-bpfcc         update-default-aspell
e2image                naptime.bt                   update-default-ispell
e2label                netplan                      update-default-wordlist
e2mmpstatus            netqtop-bpfcc                update-dictcommon-aspell
e2scrub                NetworkManager               update-dictcommon-hunspell
e2scrub_all            newusers                     update-fonts-alias
e2undo                 nfnl_osf                     update-fonts-dir
e4crypt                nfsdist-bpfcc                update-fonts-scale
e4defrag               nfsslower-bpfcc              update-grub
ebtables               nft                          update-grub2
ebtables-nft           nodegc-bpfcc                 update-grub-gfxpayload
ebtables-nft-restore   nodestat-bpfcc               update-gsfontmap
ebtables-nft-save      nologin                      update-icon-caches
ebtables-restore       ntfsclone                    update-ieee-data
ebtables-save          ntfscp                       update-inetd
ebtables-translate     ntfslabel                    update-info-dir
ethtool                ntfsresize                   update-initramfs
execsnoop-bpfcc        ntfsundelete                 update-locale
execsnoop.bt           offcputime-bpfcc             update-passwd
exitsnoop-bpfcc        offwaketime-bpfcc            update-pciids
ext4dist-bpfcc         on_ac_power                  update-rc.d
ext4slower-bpfcc       oomkill-bpfcc                update-shells
faillock               oomkill.bt                   update-xmlcatalog
fatlabel               opensnoop-bpfcc              upgrade-from-grub-legacy
fdisk                  opensnoop.bt                 usb_modeswitch
filefrag               openvpn                      usb_modeswitch_dispatcher
filegone-bpfcc         ownership                    usbmuxd
filelife-bpfcc         pam-auth-update              useradd
fileslower-bpfcc       pam_extrausers_chkpwd        userdel
filetop-bpfcc          pam_extrausers_update        usermod
findfs                 pam_getenv                   ustat
fixparts               pam_namespace_helper         uthreads
fsck                   pam_timestamp_check          uuidd
fsck.cramfs            paperconfig                  validlocale
fsck.ext2              parted                       vcstime
fsck.ext3              partprobe                    vdpa
fsck.ext4              pccardctl                    vfscount-bpfcc
fsck.fat               perlcalls-bpfcc              vfscount.bt
fsck.minix             perlflow-bpfcc               vfsstat-bpfcc
fsck.msdos             perlstat-bpfcc               vfsstat.bt
fsck.vfat              phpcalls-bpfcc               vigr
fsfreeze               phpflow-bpfcc                vipw
fstab-decode           phpstat-bpfcc                virtiostat-bpfcc
fstrim                 pidpersec-bpfcc              visudo
funccount-bpfcc        pidpersec.bt                 vpddecode
funcinterval-bpfcc     pivot_root                   wakeuptime-bpfcc
funclatency-bpfcc      plymouthd                    wipefs
funcslower-bpfcc       poweroff                     wpa_action
gdisk                  ppchcalls-bpfcc              wpa_cli
gdm3                   pppd                         wpa_supplicant
genl                   pppdump                      writeback.bt
getcap                 pppoe-discovery              xfsdist-bpfcc
gethostlatency-bpfcc   pppstats                     xfsdist.bt
gethostlatency.bt      pptp                         xfsslower-bpfcc
getpcaps               pptpsetup                    xtables-legacy-multi
getty                  profile-bpfcc                xtables-monitor
getweb                 pwck                         xtables-nft-multi
gnome-menus-blacklist  pwconv                       zfsdist-bpfcc
groupadd               pwhistory_helper             zfsslower-bpfcc
groupdel               pwunconv                     zic
groupmems              pythoncalls-bpfcc            zramctl
groupmod               pythonflow-bpfcc
did@Yedid:/sbin$ cd /tmp
did@Yedid:/tmp$ ls
snap-private-tmp
systemd-private-47323ef1fc094ad7b3be4767e28d5bbb-colord.service-u3NsFu
systemd-private-47323ef1fc094ad7b3be4767e28d5bbb-fwupd.service-j5S0G3
systemd-private-47323ef1fc094ad7b3be4767e28d5bbb-ModemManager.service-N7jYIb
systemd-private-47323ef1fc094ad7b3be4767e28d5bbb-polkit.service-cpm4hQ
systemd-private-47323ef1fc094ad7b3be4767e28d5bbb-power-profiles-daemon.service-G15JSd
systemd-private-47323ef1fc094ad7b3be4767e28d5bbb-switcheroo-control.service-80FC93
systemd-private-47323ef1fc094ad7b3be4767e28d5bbb-systemd-logind.service-D4Yxh3
systemd-private-47323ef1fc094ad7b3be4767e28d5bbb-systemd-oomd.service-bLKX2F
systemd-private-47323ef1fc094ad7b3be4767e28d5bbb-systemd-resolved.service-JjibAU
systemd-private-47323ef1fc094ad7b3be4767e28d5bbb-systemd-timesyncd.service-1YtsQ0
systemd-private-47323ef1fc094ad7b3be4767e28d5bbb-upower.service-SMc4Wk
did@Yedid:/tmp$ cd /boot
did@Yedid:/boot$ ls
config-6.17.0-14-generic      memtest86+x64.bin
grub                          memtest86+x64.efi
initrd.img                    System.map-6.17.0-14-generic
initrd.img-6.17.0-14-generic  vmlinuz
initrd.img.old                vmlinuz-6.17.0-14-generic
memtest86+ia32.bin            vmlinuz.old
memtest86+ia32.efi
did@Yedid:/boot$ 

---

##### 3.Menelusuri /dev dan mengecek identitas terminal (tty)

id@Yedid:/boot$ cd /dev
did@Yedid:/dev$ ls
autofs           loop3         stdin   tty37      ttyS0    uinput
block            loop4         stdout  tty38      ttyS1    urandom
bsg              loop5         tty     tty39      ttyS10   userfaultfd
btrfs-control    loop6         tty0    tty4       ttyS11   userio
bus              loop7         tty1    tty40      ttyS12   vboxguest
cdrom            loop8         tty10   tty41      ttyS13   vboxuser
char             loop9         tty11   tty42      ttyS14   vcs
console          loop-control  tty12   tty43      ttyS15   vcs1
core             mapper        tty13   tty44      ttyS16   vcs2
cpu              mcelog        tty14   tty45      ttyS17   vcs3
cpu_dma_latency  mem           tty15   tty46      ttyS18   vcs4
cuse             mqueue        tty16   tty47      ttyS19   vcs5
disk             net           tty17   tty48      ttyS2    vcs6
dma_heap         null          tty18   tty49      ttyS20   vcsa
dri              nvram         tty19   tty5       ttyS21   vcsa1
ecryptfs         port          tty2    tty50      ttyS22   vcsa2
fb0              ppp           tty20   tty51      ttyS23   vcsa3
fd               psaux         tty21   tty52      ttyS24   vcsa4
full             ptmx          tty22   tty53      ttyS25   vcsa5
fuse             pts           tty23   tty54      ttyS26   vcsa6
hidraw0          random        tty24   tty55      ttyS27   vcsu
hpet             rfkill        tty25   tty56      ttyS28   vcsu1
hugepages        rtc           tty26   tty57      ttyS29   vcsu2
hwrng            rtc0          tty27   tty58      ttyS3    vcsu3
i2c-0            sda           tty28   tty59      ttyS30   vcsu4
initctl          sda1          tty29   tty6       ttyS31   vcsu5
input            sda2          tty3    tty60      ttyS4    vcsu6
kmsg             sg0           tty30   tty61      ttyS5    vfio
log              sg1           tty31   tty62      ttyS6    vga_arbiter
loop0            shm           tty32   tty63      ttyS7    vhci
loop1            snapshot      tty33   tty7       ttyS8    vhost-net
loop10           snd           tty34   tty8       ttyS9    vhost-vsock
loop11           sr0           tty35   tty9       udmabuf  zero
loop2            stderr        tty36   ttyprintk  uhid     zfs
did@Yedid:/dev$ who am i
did@Yedid:/dev$ ls -l /dev/tty1
crw--w---- 1 root tty 4, 1 Mar 10 19:09 /dev/tty1
did@Yedid:/dev$ 

---

##### 4.Menelusuri /proc dan meliha informasi sistem

did@Yedid:/dev$ cd /proc
did@Yedid:/proc$ cat interrupts
           CPU0       
  0:        140  IO-APIC   2-edge      timer
  1:       4974  IO-APIC   1-edge      i8042
  8:          0  IO-APIC   8-edge      rtc0
  9:          0  IO-APIC   9-fasteoi   acpi
 12:      21084  IO-APIC  12-edge      i8042
 14:       9574  IO-APIC  14-edge      ata_piix
 15:          0  IO-APIC  15-edge      ata_piix
 18:         14  IO-APIC  18-fasteoi   vmwgfx
 19:      41896  IO-APIC  19-fasteoi   ehci_hcd:usb1, enp0s3
 20:      52053  IO-APIC  20-fasteoi   vboxguest
 21:     936952  IO-APIC  21-fasteoi   ahci[0000:00:0d.0], snd_intel8x0
 22:         26  IO-APIC  22-fasteoi   ohci_hcd:usb2
NMI:          0   Non-maskable interrupts
LOC:   19357009   Local timer interrupts
SPU:          0   Spurious interrupts
PMI:          0   Performance monitoring interrupts
IWI:          0   IRQ work interrupts
RTR:          0   APIC ICR read retries
RES:          0   Rescheduling interrupts
CAL:          0   Function call interrupts
TLB:          0   TLB shootdowns
TRM:          0   Thermal event interrupts
THR:          0   Threshold APIC interrupts
DFR:          0   Deferred Error APIC interrupts
MCE:          0   Machine check exceptions
MCP:         30   Machine check polls
ERR:          0
MIS:          0
PIN:          0   Posted-interrupt notification event
NPI:          0   Nested posted-interrupt event
PIW:          0   Posted-interrupt wakeup event
did@Yedid:/proc$ cat devices
Character devices:
  1 mem
  4 /dev/vc/0
  4 tty
  4 ttyS
  5 /dev/tty
  5 /dev/console
  5 /dev/ptmx
  5 ttyprintk
  6 lp
  7 vcs
 10 misc
 13 input
 21 sg
 29 fb
 89 i2c
 99 ppdev
108 ppp
116 alsa
128 ptm
136 pts
180 usb
189 usb_device
202 cpu/msr
204 ttyMAX
226 drm
240 hidraw
241 ttyDBC
242 bsg
243 watchdog
244 remoteproc
245 ptp
246 pps
247 rtc
248 dma_heap
249 dax
250 dimmctl
251 ndctl
252 tpm
253 pwm
254 gpiochip
261 accel

Block devices:
  7 loop
  8 sd
  9 md
 11 sr
 65 sd
 66 sd
 67 sd
 68 sd
 69 sd
 70 sd
 71 sd
128 sd
129 sd
130 sd
131 sd
132 sd
133 sd
134 sd
135 sd
252 device-mapper
253 virtblk
254 mdp
259 blkext
did@Yedid:/proc$ cpu info
Command 'cpu' not found, but can be installed with:
sudo apt install cpu
did@Yedid:/proc$ cat cpuinfo
processor	: 0
vendor_id	: GenuineIntel
cpu family	: 6
model		: 142
model name	: Intel(R) Core(TM) i5-8365U CPU @ 1.60GHz
stepping	: 12
microcode	: 0xde
cpu MHz		: 1896.000
cache size	: 6144 KB
physical id	: 0
siblings	: 1
core id		: 0
cpu cores	: 1
apicid		: 0
initial apicid	: 0
fpu		: yes
fpu_exception	: yes
cpuid level	: 22
wp		: yes
flags		: fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ht syscall nx rdtscp lm constant_tsc rep_good nopl xtopology nonstop_tsc cpuid tsc_known_freq pni pclmulqdq monitor ssse3 fma cx16 pcid sse4_1 sse4_2 x2apic movbe popcnt aes xsave avx f16c rdrand hypervisor lahf_lm abm 3dnowprefetch fsgsbase bmi1 avx2 bmi2 invpcid rdseed adx clflushopt arat md_clear flush_l1d arch_capabilities
bugs		: spectre_v1 spectre_v2 spec_store_bypass swapgs taa itlb_multihit srbds mmio_stale_data retbleed gds bhi spectre_v2_user its
bogomips	: 3792.00
clflush size	: 64
cache_alignment	: 64
address sizes	: 39 bits physical, 48 bits virtual
power management:

did@Yedid:/proc$ cat meminfo
MemTotal:        2014096 kB
MemFree:           76724 kB
MemAvailable:     292928 kB
Buffers:            1596 kB
Cached:           390192 kB
SwapCached:            0 kB
Active:           927444 kB
Inactive:         766688 kB
Active(anon):     837612 kB
Inactive(anon):   522212 kB
Active(file):      89832 kB
Inactive(file):   244476 kB
Unevictable:          16 kB
Mlocked:              16 kB
SwapTotal:             0 kB
SwapFree:              0 kB
Zswap:                 0 kB
Zswapped:              0 kB
Dirty:                16 kB
Writeback:             0 kB
AnonPages:       1302404 kB
Mapped:           146940 kB
Shmem:             79564 kB
KReclaimable:      27420 kB
Slab:             150448 kB
SReclaimable:      27420 kB
SUnreclaim:       123028 kB
KernelStack:       12076 kB
PageTables:        28960 kB
SecPageTables:         0 kB
NFS_Unstable:          0 kB
Bounce:                0 kB
WritebackTmp:          0 kB
CommitLimit:     1007048 kB
Committed_AS:    6473616 kB
VmallocTotal:   34359738367 kB
VmallocUsed:       31500 kB
VmallocChunk:          0 kB
Percpu:              696 kB
HardwareCorrupted:     0 kB
AnonHugePages:         0 kB
ShmemHugePages:        0 kB
ShmemPmdMapped:        0 kB
FileHugePages:      4096 kB
FilePmdMapped:         0 kB
CmaTotal:              0 kB
CmaFree:               0 kB
Unaccepted:            0 kB
Balloon:               0 kB
HugePages_Total:       0
HugePages_Free:        0
HugePages_Rsvd:        0
HugePages_Surp:        0
Hugepagesize:       2048 kB
Hugetlb:               0 kB
DirectMap4k:       75712 kB
DirectMap2M:     2021376 kB
did@Yedid:/proc$ cat uptime
9747.05 7142.56

---

Menelusuri Sistem & Pseudo-Filesystem (Latihan 2-4): Langkah selanjutnya adalah mengecek folder bawaan sistem Linux seperti /bin, /sbin, dan /boot yang menyimpan aplikasi inti dan file booting. Di dalam folder /dev, kita mengecek antarmuka terminal (tty) yang sedang kita pakai lewat perintah who am i. Bagian yang paling unik ada di folder /proc. Direktori ini disebut pseudo-filesystem karena sebenarnya tidak menyimpan file fisik di hardisk. Folder ini berfungsi sebagai jembatan virtual dari RAM untuk menampilkan informasi hardware dan proses yang sedang berjalan secara langsung, contohnya mengecek spesifikasi prosesor lewat cpuinfo.

---

##### 5 & 6. Berpindah antar home direktori

did@Yedid:~$ cd ~root
bash: cd: /root: Permission denied
did@Yedid:~$ cd

---

##### 7 & 8. Membuat dan menghapus subdirektori

did@Yedid:~$ mkdir work play
did@Yedid:~$ rmdir work

---
##### 9 & 10. Mengopi dan memindahkan file

did@Yedid:~$ cp /etc/passwd ~/
did@Yedid:~$ mv passwd play/
did@Yedid:~$ 

---

##### 11.Membuat symbolic link ke perangkat terminal

did@Yedid:~$ cd play
did@Yedid:~/play$ ln -s /dev/tty terminal
did@Yedid:~/play$ ln /dev/tty terminal_hard
ln: failed to create hard link 'terminal_hard' => '/dev/tty': Invalid cross-device link

---

##### 12 & 13.Membuat file teks dan mengirimkannya ke terminal

did@Yedid:~/play$ echo "hello word" > hello.txt
did@Yedid:~/play$ cp hello.txt terminal
hello word

---

##### 14 & 15.Membuat symbolic link direktori dan menghapus paksa

did@Yedid:~/play$ cd ..
did@Yedid:~$ ln -s play work
did@Yedid:~$ rm -rf work
did@Yedid:~$ 

---

Manajemen File dan Konsep Link (Latihan 5-15): Di bagian ini, kita mencoba masuk ke home directory user lain dengan cd ~username dan berlatih membuat serta menghapus folder (mkdir dan rmdir). Setelah menyalin file /etc/passwd ke folder pribadi, kita masuk ke materi link. Kita membuat symbolic link yang mengarah ke perangkat terminal (tty). Perlu dicatat, kalau kita memaksa membuat hard link ke perangkat tty, sistem akan menolak karena aturan keamanan Linux melarang hard link pada file perangkat. Efek menarik terjadi saat kita mengopi teks ke shortcut terminal tersebut; tulisannya langsung muncul di layar kita sendiri. Praktikum ditutup dengan menduplikasi folder menggunakan symbolic link dan membersihkan semua sisa file percobaan menggunakan perintah rm -rf.

---

### 3.Berikan Kesimpulan dari praktikum ini 

Secara keseluruhan, praktikum ini memberikan pemahaman dasar yang komprehensif mengenai manajemen file dan struktur hierarki direktori pada sistem operasi Linux melalui command line interface (CLI). Dari serangkaian percobaan yang dilakukan, dapat disimpulkan bahwa Linux memiliki sistem manajemen yang sangat terstruktur dan berpusat pada direktori root. Melalui praktikum ini, kita telah berhasil mempraktikkan navigasi direktori (cd, pwd), pembuatan dan penghapusan folder (mkdir, rmdir), serta manipulasi data dasar (cp, mv, rm). Praktikum ini juga membuktikan perbedaan fungsi antara hard link sebagai pengikat data fisik dan symbolic link sebagai shortcut, serta memperlihatkan keandalan utilitas pencarian Linux seperti find dan grep. Terakhir, eksplorasi pada pseudo-filesystem seperti /proc dan /dev menunjukkan bagaimana terminal memberikan akses dan kendali penuh kepada pengguna terhadap status perangkat keras dan proses sistem secara langsung.

---
