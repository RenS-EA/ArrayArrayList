package bagian3.perpustakaan;

public class Buku2 {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean isDipinjam;

    public Buku2(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.isDipinjam = false;
    }

    public String getJudul() { return judul; }
    public String getPenulis() { return penulis; }
    public int getTahunTerbit() { return tahunTerbit; }
    public boolean isDipinjam() { return isDipinjam; }
    
    public void setDipinjam(boolean status) { this.isDipinjam = status; }

    public void info() {
        String status = isDipinjam ? "Sedang Dipinjam" : "Tersedia";
        System.out.println("- " + judul + " (" + tahunTerbit + ") karya " + penulis + " [" + status + "]");
    }
}