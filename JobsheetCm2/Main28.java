package JobsheetCm2;
import java.util.Scanner;

public class Main28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DoubleLinkedListAntrean28 antrean = new DoubleLinkedListAntrean28();
        DoubleLinkedListPesanan28 daftarPesanan = new DoubleLinkedListPesanan28();

        int pilih;

        do {
            System.out.println("===== SISTEM ANTREAN RESTO =====");
            System.out.println("1. Tambah Antrean");
            System.out.println("2. Cetak Antrean");
            System.out.println("3. Hapus Antrean dan Input Pesanan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP : ");
                    String hp = sc.nextLine();

                    Pembeli28 pembeli = new Pembeli28(nama, hp);
                    antrean.tambahAntrean(pembeli);
                    break;

                case 2:
                    antrean.cetakAntrean();
                    break;

                case 3:
                    NodeAntrean28 dipanggil = antrean.hapusAntrean();

                    if (dipanggil != null) {
                        System.out.println("Pembeli dipanggil:");
                        System.out.println("Nama : " + dipanggil.pembeli.namaPembeli);

                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();

                        System.out.print("Harga : ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        Pesanan28 pesanan = new Pesanan28(kode, namaPesanan, harga);

                        daftarPesanan.tambahPesanan(dipanggil.pembeli, pesanan);
                    }
                    break;

                case 4:
                    daftarPesanan.tampilPesanan();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilih != 5);

        sc.close();
    }
}
