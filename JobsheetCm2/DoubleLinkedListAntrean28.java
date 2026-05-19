package JobsheetCm2;

public class DoubleLinkedListAntrean28 {
    NodeAntrean28 head;
    NodeAntrean28 tail;
    int nomor = 1;

    // tambah antrean
    public void tambahAntrean(Pembeli28 pembeli) {
        NodeAntrean28 baru = new NodeAntrean28(nomor++, pembeli);

        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }

        System.out.println("Antrean berhasil ditambahkan!");
    }

    // cetak antrean
    public void cetakAntrean() {
        if (head == null) {
            System.out.println("Antrean masih kosong!");
            return;
        }

        NodeAntrean28 current = head;

        System.out.println("===== DAFTAR ANTREAN =====");

        while (current != null) {
            System.out.println(
                "No Antrean : " + current.nomorAntrean +
                " | Nama : " + current.pembeli.namaPembeli +
                " | No HP : " + current.pembeli.noHp
            );

            current = current.next;
        }
    }

    // hapus antrean
    public NodeAntrean28 hapusAntrean() {
        if (head == null) {
            System.out.println("Antrean kosong!");
            return null;
        }

        NodeAntrean28 hapus = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return hapus;
    }
}






















