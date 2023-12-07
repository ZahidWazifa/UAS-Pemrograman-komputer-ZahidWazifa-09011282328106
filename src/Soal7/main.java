package Soal7;
//*soal */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Buatlah kelas Java untuk mengelola buku-buku dalam suatu perpustakaan. 
 * Setiap buku memiliki atribut judul, penulis, dan tahun terbit. 
 * Implementasikan metode untuk menampilkan informasi buku dan metode untuk meminjam buku. 
 * */ 
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose;
        List<Perpustakaan> perpustakaan = new LinkedList<>();
        perpustakaan.add(new Perpustakaan("Ikemono", "Rebecca Gonzalez",2023 , Status_peminjaman.TERSEDIA));
        perpustakaan.add(new Perpustakaan("Nanatsu no taizai ", "Sally Ramos", 2019, Status_peminjaman.TERSEDIA));
        perpustakaan.add(new Perpustakaan("Uso yakushoku ", "Mike Carter", 1988,Status_peminjaman.TERSEDIA));
        perpustakaan.add(new Perpustakaan("Shigatsu no yume ", "Owen Byrd",2006, Status_peminjaman.TERSEDIA));
        perpustakaan.add(new Perpustakaan("Ao no sora ", "Ora Bradley", 2007, Status_peminjaman.TERSEDIA));
        perpustakaan.add(new Perpustakaan("joy program ", "Estella Estrada", 2004, Status_peminjaman.TERSEDIA));
        // ? menampilkan data buku
        

        /**
         * menu untuk melihat database buku, meminjam buku atau melihat status peminjaman berdasarkan class status_peminjaman dan tanggal pengembalian
         */
        choose = 0;
        do {
            System.out.println("=====Menu Perpustakaan=====");
            System.out.println("1. Lihat data buku");
            System.out.println("2. Pinjam buku");
            System.out.println("3. Cek status peminjaman buku");
            System.out.println("4. Keluar");
            // !try catch digununakan untuk menangkap error jika input bukan integer
            try {
                System.out.print("Pilih opsi: ");
                choose = input.nextInt();
                input.nextLine(); // Consume newline left-over
                if (choose == 1) {
                    for (Perpustakaan buku : perpustakaan) {
                        buku.tampilkanInfoBuku();
                    }
                } else if (choose == 2) {
                    System.out.print("Masukkan judul buku yang ingin dipinjam: ");
                    String judul = input.nextLine();
                    pinjamBuku(judul, perpustakaan);
                } else if (choose == 3) {
                    System.out.print("Masukkan judul buku yang ingin dicek: ");
                    String judulCek = input.nextLine(); // Changed from input.next() to input.nextLine()
                    cekStatusPeminjaman(judulCek, perpustakaan);
                } else {
                    System.out.println("Opsi tidak valid");
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid");
                input.nextLine(); // Consume newline left-over
            }
        } while (choose != 4);
        


    }
    public static void pinjamBuku(String judul, List<Perpustakaan> perpustakaan) {
        for (Perpustakaan buku : perpustakaan) {
            if (buku.getJudul().trim().equalsIgnoreCase(judul.trim())) {
                buku.setStatus_peminjaman(Status_peminjaman.DIPINJAM);
                System.out.println("Buku berhasil dipinjam");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan");
    }
    
    public static void cekStatusPeminjaman(String judul, List<Perpustakaan> perpustakaan) {
        for (Perpustakaan buku : perpustakaan) {
            if (buku.getJudul().trim().equalsIgnoreCase(judul.trim())) {
                System.out.println("Status peminjaman buku: " + buku.getStatus_peminjaman());
                return;
            }
        }
        System.out.println("Buku tidak ditemukan");
    }
}
