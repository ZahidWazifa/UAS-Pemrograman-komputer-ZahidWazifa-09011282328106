package Soal8;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
// *soal */
/**
 * Buat kelas Java untuk mengelola akun pengguna. 
 * Setiap akun memiliki atribut username, password, dan status aktif/nonaktif. 
 * Implementasikan metode untuk mengaktifkan atau menonaktifkan akun.
 */
public class main {
    public static void main(String[] args) {
        String username ;
        String password ;
        short choose;
        List<Login> login = new LinkedList<>();
        Scanner input = new Scanner(System.in);
       
        
        do {
            System.out.println("====Selamat datang di aplikasi login=======");
            System.out.println("1.Buat akun baru");
            System.out.println("2.Cek status akun");
            System.out.println("3.keluar dari aplikasi");
            System.out.print("Masukkan pilihan anda:");
            choose = input.nextShort();
            input.nextLine();
            if (choose ==1) {
                System.out.print("masukkan username anda:");
                 username = input.nextLine();
                System.out.print("masukkan password anda:");
                password = input.nextLine();
                
                login.add(new Login(username, password,Status.NONAKTIF));
                System.out.println("Akun anda telah dibuat"); 
            }else if(choose ==2){
                System.out.print("masukkan username anda:");
                 username = input.nextLine();
                System.out.print("masukkan password anda:");
                 password = input.nextLine();
                for (Login log : login) {
                    if (log.getUsername().equals(username) && log.getPassword().equals(password)) {
                        System.out.println("Username: " + log.getUsername());
                        System.out.println("Status akun anda: " + log.getStatus());
                        System.out.print("Apakah anda ingin mengubah status akun anda ke AKTIF? (iya/tidak):");
                        String changeStatus = input.nextLine();
//                        TODO:SET STATUS AKUN
                        if (changeStatus.equalsIgnoreCase("iya")) {
                        log.setStatus(Status.AKTIF);
                            System.out.println("Status akun anda telah diubah ke: " + log.getStatus());
                        }
                    }
                }
            }
        } while (choose != 3);

        
    }
}
