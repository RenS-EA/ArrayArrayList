
package bagian3.perpustakaan;

public class MainPerpustakaan2 {
    public static void main(String[] args) {
        Perpustakaan2 perpus = new Perpustakaan2();

        // Menguji Soal 2: Pembuatan objek Buku dengan parameter tahunTerbit
        Buku2 b1 = new Buku2("Struktur Data Java", "Riyadh Najahi", 2019);
        Buku2 b2 = new Buku2("Algoritma Pemrograman", "Rinaldi Munir", 2021);
        Buku2 b3 = new Buku2("Pemrograman Berorientasi Objek", "Erico Darmawan", 2022);

        perpus.tambahBuku(b1);
        perpus.tambahBuku(b2);
        perpus.tambahBuku(b3);

        // Tampilkan data awal (Menguji method info() dengan tahun terbit)
        perpus.tampilkanSemuaBuku();

        // Kondisi awal: kita simulasikan buku pertama sedang dipinjam
        perpus.pinjamBuku("Struktur Data Java");
        System.out.println("\n--- Status Setelah 'Struktur Data Java' Dipinjam ---");
        perpus.tampilkanSemuaBuku();

        // Menguji Soal 1: Mengembalikan buku
        System.out.println("\n--- Memproses Pengembalian Buku ---");
        perpus.kembalikanBuku("Struktur Data Java");
        
        // Cek status setelah dikembalikan
        perpus.tampilkanSemuaBuku();

        // Menguji Soal 3: Pencarian berdasarkan nama penulis
        perpus.cariPenulis("Rinaldi Munir");
        perpus.cariPenulis("Tere Liye"); // Uji jika penulis tidak ada
    }
}