package Soal1;

public class Database {
    private String Barang;
    private double harga_barang;
    private double Diskon_Barang;
    private double Stock_Barang ;

    public String getBarang() {
        return Barang;
    }

    public void setBarang(String barang) {
        Barang = barang;
    }

    public double getHarga_barang() {
        return harga_barang;
    }

    public void setHarga_barang(double harga_barang) {
        this.harga_barang = harga_barang;
    }

    public double getDiskon_Barang() {
        return Diskon_Barang;
    }

    public void setDiskon_Barang(double diskon_Barang) {
        Diskon_Barang = diskon_Barang;
    }

    public double getStock_Barang() {
        return Stock_Barang;
    }

    public void setStock_Barang(double stock_Barang) {
        Stock_Barang = stock_Barang;
    }
    // ? Constructor untuk menambahkan data ke database

    Database(String Barang, double harga_barang, double Stock_Barang){
        this.Barang = Barang;
        this.harga_barang = harga_barang;
        this.Stock_Barang = Stock_Barang;

    }
}
