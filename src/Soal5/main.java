package Soal5;
import  java.util.Scanner;
//*soal */

/**
 * Buatlah program Java untuk kalkulator sederhana yang dapat melakukan operasi penjumlahan, pengurangan, perkalian, dan pembagian.
 * Gunakan metode untuk setiap operasi.
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai pertama   yang akan anda masukkan:");
        int input1 = input.nextInt();
        System.out.print("Masukkan nilai kedua  yang akan anda masukkan:");
        int input2 = input.nextInt();
        System.out.print("Masukkan opsi kalkulasi yang anda ingin kan:");
        char choose = input.next().charAt(0);
        Calculator calculator = new Calculator();
        calculator.out(input1,input2,choose);
    }

}
