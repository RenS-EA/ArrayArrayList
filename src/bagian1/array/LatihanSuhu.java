
package bagian1.array;

public class LatihanSuhu {
    public static void main(String[] args) {
        double[] suhuHarian = {32.5, 30.0, 34.2, 29.8, 31.5, 33.1};
        
        double tertinggi = suhuHarian[0];
        double terendah = suhuHarian[0];
        
        for (int i = 1; i < suhuHarian.length; i++) {
            if (suhuHarian[i] > tertinggi) {
                tertinggi = suhuHarian[i];
            }
            if (suhuHarian[i] < terendah) {
                terendah = suhuHarian[i];
            }
        }
        
        System.out.println("Suhu Tertinggi: " + tertinggi);
        System.out.println("Suhu Terendah: " + terendah);
    }
}