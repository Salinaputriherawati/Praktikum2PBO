public class LaguBingo {

    // Metode untuk menampilkan satu baris lirik dengan jumlah clap yang bervariasi
    public static void tampilkanLirik(int jumlahClap) {
        String[] bingo = {"B-", "I-", "N-", "G-", "O"};
  
        // Mencetak lirik
        for (int i = 0; i < bingo.length; i++) {
            if (i < jumlahClap) {
                System.out.print("(clap)");
                if (i < bingo.length - 1) { // Add hyphen only if it's not the last element
                    System.out.print("-");
                }
            } else {
                System.out.print(bingo[i]);
            }
        }
        System.out.println();
    }
  
    // Metode utama (main) untuk menjalankan program
    public static void main(String[] args) {
        String lirik1 = "There was a farmer who had a dog,";
        String lirik2 = "And Bingo was his name-o.";
  
        // Loop untuk menampilkan lirik lagu dari awal hingga akhir
        for (int i = 0; i <= 5; i++) {
            // Menampilkan bait pertama
            System.out.println(lirik1);
            System.out.println(lirik2);
  
            // Menampilkan baris B-I-N-G-O dengan clap
            tampilkanLirik(i);
            tampilkanLirik(i);
            tampilkanLirik(i);
  
            // Menampilkan baris terakhir
            System.out.println(lirik2);
            System.out.println();
        }
    }
  }