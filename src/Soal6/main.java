package Soal6;
import java.util.Scanner;
public class main {
    //* Soal */
    /**
     * Buat program Java untuk mengecek apakah suatu kata atau frase adalah palindrom atau tidak.
     * Gunakan metode untuk melakukan pengecekan.
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();
        Palindrom palindrom = new Palindrom();
//!        menggunakan try catch untuk menangkap error jika kata bukan palindrom
        try {
            if (palindrom.ispalindrome(kata.toCharArray())) {
                System.out.println("Palindrom");
            } else {
                System.out.println("Bukan Palindrom");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
