
package bagian2.arraylist;

import java.util.ArrayList;

public class DaftarBelanja {
    public static void main(String[] args) {
        ArrayList<String> belanja = new ArrayList<>();
        
        // 1. Tambah 4 item
        belanja.add("Minyak Goreng");
        belanja.add("Beras");
        belanja.add("Telur");
        belanja.add("Gula");
        
        // 2. Hapus item ke-2 (indeks 1 karena indeks dimulai dari 0)
        belanja.remove(1); 
        
        // 3. Tampilkan isi list dan jumlah akhir
        System.out.println("Isi daftar belanja saat ini:");
        for (String item : belanja) {
            System.out.println("- " + item);
        }
        
        System.out.println("Jumlah akhir item: " + belanja.size());
    }
}