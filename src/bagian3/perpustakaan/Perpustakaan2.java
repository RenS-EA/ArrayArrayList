package bagian3.perpustakaan;
import java.util.ArrayList;

public class Perpustakaan2 {
    private ArrayList<Buku2> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku2 buku) {
        daftarBuku.add(buku);
    }

    public void pinjamBuku(String judul) {
        for (Buku2 b : daftarBuku) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                b.setDipinjam(true);
                return;
            }
        }
    }

    public void kembalikanBuku(String judul) {
        for (Buku2 b : daftarBuku) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                b.setDipinjam(false);
                System.out.println("Berhasil mengembalikan buku: " + judul);
                return;
            }
        }
    }

    public void cariPenulis(String penulis) {
        System.out.println("\nHasil pencarian karya " + penulis + ":");
        for (Buku2 b : daftarBuku) {
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                b.info();
            }
        }
    }

    public void tampilkanSemuaBuku() {
        for (Buku2 b : daftarBuku) {
            b.info();
        }
    }
}