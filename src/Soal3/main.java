package Soal3;

import java.util.Scanner;
//*Soal */
/**
 * Buat program Java untuk menampilkan deret Fibonacci hingga suku ke-n.
 * Deret Fibonacci adalah deret bilangan yang setiap suku setelah dua
 * suku pertama adalah penjumlahan dari kedua suku sebelumnya.
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan yang anda inginkan:");
        int num =input.nextInt();
        fibonanci_class sum = new fibonanci_class();
        System.out.println("Hasil dari perhitungannya:");
        sum.fibonanci(num);
    }
}
