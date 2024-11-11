/* Nama : Naufal Arya Caesar Ramadhan
    NIM : G41231712
    Gol.: C
  Matkul: Algoritma dan Pemograman
   Dosen: Bakhtiyar Hadi Prakoso,S.Kom, M.Kom
*/
package tugas_inhelen;

import java.util.Scanner;
public class Tugas_Inhelen {



    public static void main(String[] args) { 
        
        // Langkah awal memberikan scanner agar terbaca oleh system
        Scanner scanner = new Scanner(System.in);
        
        // Menambahkan penginputan masukan nama 
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine().trim(); // Menghapus whitespace di awal dan akhir
        
        // Menghitung jumlah karakternya tanpa memperhitungkan spasi
        int jumlahKarakter = 0;
        for (int i = 0; i < nama.length(); i++) {
            if (!Character.isWhitespace(nama.charAt(i))) {
                jumlahKarakter++;
            }
        }
        
        // Memunculkan program output 
        System.out.println("Nama \"" + nama + "\" memiliki " + jumlahKarakter + " karakter.");
    }
}

    
