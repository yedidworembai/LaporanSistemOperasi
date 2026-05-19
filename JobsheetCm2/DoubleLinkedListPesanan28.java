package JobsheetCm2;

public class DoubleLinkedListPesanan28 {
    NodePesanan28 head;
    NodePesanan28 tail;

    // tambah pesanan
    public void tambahPesanan(Pembeli28 pembeli, Pesanan28 pesanan) {
        NodePesanan28 baru = new NodePesanan28(pembeli, pesanan);

        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }

        System.out.println("Pesanan berhasil disimpan!");
    }

    // sorting manual bubble sort
    public void sortingPesanan() {
        if (head == null) {
            return;
        }

        boolean tukar;

        do {
            tukar = false;
            NodePesanan28 current = head;

            while (current.next != null) {
                if (current.pesanan.namaPesanan.compareToIgnoreCase(current.next.pesanan.namaPesanan) > 0) {

                    Pembeli28 tempPembeli = current.pembeli;
                    current.pembeli = current.next.pembeli;
                    current.next.pembeli = tempPembeli;

                    Pesanan28 tempPesanan = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = tempPesanan;

                    tukar = true;
                }

                current = current.next;
            }

        } while (tukar);
    }

    // tampil laporan pesanan
    public void tampilPesanan() {
        if (head == null) {
            System.out.println("Belum ada pesanan!");
            return;
        }

        sortingPesanan();

        NodePesanan28 current = head;
        int totalPendapatan = 0;

        System.out.println("===== LAPORAN PESANAN =====");

        while (current != null) {
            System.out.println(
                "Nama Pembeli : " + current.pembeli.namaPembeli +
                " | Pesanan : " + current.pesanan.namaPesanan +
                " | Harga : Rp" + current.pesanan.harga
            );

            totalPendapatan += current.pesanan.harga;
            current = current.next;
        }

        System.out.println("============================");
        System.out.println("Total Pendapatan : Rp" + totalPendapatan);
    }
}






















































































































































































