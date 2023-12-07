package Soal2;
import java.util.LinkedList;
import java.util.Scanner;
//* Soal */
/**
 * Buatlah program Java untuk melakukan autentikasi pengguna berdasarkan username dan password.
 * Jika username dan password yang dimasukkan sesuai dengan nilai yang telah ditentukan, tampilkan pesan "Autentikasi Berhasil".
 * Jika tidak, tampilkan pesan "Autentikasi Gagal".
 */
public class main {

    public static void main(String[] args) {
        String Username;
        String Password;
        byte choose;
        Scanner  input = new Scanner(System.in);
        LinkedList<Login> list = new LinkedList<>();

        
// ?       Pemilihan menu

        do {
            System.out.println("1.buat akun baru ");
            System.out.println("2.login ke aplikasi ");
            System.out.println("3.tampilkan data username dan password ");
            System.out.println("4. Keluar ");
            System.out.print("masukkan pilihan anda:");
             choose =input.nextByte();
            if (choose ==1){
                System.out.print("Masukkan username anda:");
                Username =input.next();
                System.out.print("Masukkan Password anda:");
                Password =input.next();
                Login login = new Login(Username,Password);
//?add to list
             list.add(login);

            }else if (choose ==3){
                for (Login login:list){
                    System.out.println("Username:"+login.Username());
                    System.out.println("Password:"+login.password());
                    System.out.println("====================================");
                }
            }else if(choose ==2){
                System.out.print("Masukkan username anda:");
                Username =input.next();
                System.out.print("Masukkan Password anda:");
                Password =input.next();
                Login login = new Login(Username,Password);
                try {
                    if (list.contains(login)){
                        System.out.println("Autentikasi Berhasil");
                    }else{
                        throw new Exception("Autentikasi Gagal");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }while(choose !=3);
//        input dari users

    }
}
