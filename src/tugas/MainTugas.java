// Nama: [Isi Nama Anda]
// NPM : [Isi NPM Anda]

package tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Soal 4: Menyimpan dan menampilkan daftar mata kuliah (Array String tetap)
        String[] mataKuliah = {"Pemrograman Berorientasi Objek", "Struktur Data", "Basis Data"};
        
        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        // Soal 3: Membuat objek KelasKuliah
        KelasKuliah kelas = new KelasKuliah();

        // Menambahkan minimal 5 objek Mahasiswa awal
        kelas.tambahMahasiswa(new Mahasiswa("Riyadh", "2410010441", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "24100102", 58.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "24100103", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Dedi", "24100104", 45.5));
        kelas.tambahMahasiswa(new Mahasiswa("Eka", "24100105", 72.3));

        // Menampilkan data awal mahasiswa
        System.out.println("=== DATA MAHASISWA AWAL ===");
        kelas.tampilkanSemua();

        // Soal 5: Menampilkan rata-rata nilai dan jumlah mahasiswa yang lulus
        System.out.println("Rata-rata Nilai Kelas : " + String.format("%.2f", kelas.hitungRataRata()));
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus());
        System.out.println();

        // Soal 6: Menambahkan satu objek Mahasiswa baru
        System.out.println("=== PENAMBAHAN DATA MAHASISWA BARU ===");
        Mahasiswa mhsBaru = new Mahasiswa("Fahmi", "23100106", 65.0);
        kelas.tambahMahasiswa(mhsBaru);
        System.out.println("Mahasiswa baru atas nama " + mhsBaru.getNama() + " berhasil ditambahkan.");
        
        // Menampilkan jumlah data terbaru
        System.out.println("Jumlah total mahasiswa sekarang: " + kelas.getJumlahMahasiswa() + " orang");
        System.out.println();
        
        // Opsional: Menampilkan kembali list akhir untuk memastikan data terupdate
        System.out.println("=== DATA MAHASISWA TERBARU ===");
        kelas.tampilkanSemua();
    }
}