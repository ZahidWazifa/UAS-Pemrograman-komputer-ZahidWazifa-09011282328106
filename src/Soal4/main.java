package Soal4;

import java.util.Scanner;
//*Soal
/**
 * Buat program Java untuk memfaktorisasi suatu bilangan bulat positif menjadi faktor-faktornya.
 * Misalnya, jika input adalah 12, hasilnya harus menampilkan "Faktorisasi 12: 2 * 2 * 3".
 */

public class main {
    public static void main(String[]args){

        int number =0;
        int result =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin anda hitung:");
        number =input.nextInt();
        result = factorial(number);
        System.out.println("Hasil dari perhitungannya:"+result);

    }
//        TODO:Perhitungan untuk faktorial
    public  static int  factorial(int number){
        if(number ==1){
            return 1;
        }else{
            return  number *factorial(number-1);
        }
    }


}




