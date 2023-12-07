package Soal7;
import java.util.List;


public class Perpustakaan {
    // ? gunakan private agar data tetap original
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private Status_peminjaman status_peminjaman; 

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public String getStatus_peminjaman() {
        return status_peminjaman.name(); 
    }
    public void setStatus_peminjaman(Status_peminjaman status_peminjaman) {
        this.status_peminjaman = status_peminjaman;
    }
    Perpustakaan(String judul, String penulis, int tahunTerbit, Status_peminjaman status_peminjaman){ 
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.status_peminjaman = status_peminjaman;
    }
    public void tampilkanInfoBuku(){
        System.out.println("=====Data Buku Perpustakaan=====");
        System.out.println("Judul Buku: " + this.judul);
        System.out.println("Penulis Buku: " + this.penulis);
        System.out.println("Tahun Terbit Buku: " + this.tahunTerbit);
        System.out.println("Status Peminjaman Buku: " + this.status_peminjaman.name());
       System.out.println("=================================="); 
    }
    
}
