// Kelas untuk mengeksekusi operasi matematika
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika mat = new Matematika();
        
        // Eksekusi dan cetak hasil operasi matematika
        System.out.println("Pertambahan : 20 + 10 = " + mat.pertambahan(20, 10));
        System.out.println("Pengurangan : 10 - 5  = " + mat.pengurangan(10, 5));
        System.out.println("Perkalian   : 10 * 3  = " + mat.perkalian(10, 3));
        System.out.println("Pembagian   : 21 / 2  = " + mat.pembagian(21, 2));
    }
  }