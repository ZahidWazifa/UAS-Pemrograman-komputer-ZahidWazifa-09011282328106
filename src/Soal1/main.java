package  Soal1;

import java.util.List;
import java.util.Scanner;

public class main {
    //*Soal 
    /**
     * Seorang pelanggan sedang berbelanja di sebuah toko online. 
     * Terdapat sebuah barang dengan harga tertentu dan diskon berdasarkan jumlah pembelian. 
     * Implementasikan program Java untuk menghitung total harga yang harus dibayar oleh pelanggan. 
     * Jika pelanggan membeli barang dengan jumlah kurang dari 5, tidak ada diskon.
     * Jika pelanggan membeli barang antara 5 hingga 10, berikan diskon 5%.
     * Jika pelanggan membeli barang antara 11 hingga 20, berikan diskon 10%.
     * Jika pelanggan membeli barang lebih dari 20, berikan diskon 20%.
     * Tampilkan total harga setelah diskon.
     * @param args
     */
    public static void main(String[] args) {
        List<Database> list = List.of(
            new Database("Book", 10000,10),
            new Database("pencil", 5000,16),
            new Database("sword", 2000,10),
            new Database("cat food", 3000,23),
            new Database(" Ruler ", 15000,7),
            new Database("flag  ", 3000,20),
            new Database("Umbrella ", 3000,24),
            new Database("pencilcase ", 3000,16)
        );
        Scanner input  = new Scanner(System.in);
        
        //*tampilan dari menu */
        for(var database:list){
            System.out.println("Nama Barang:"+database.getBarang());
            System.out.println("Harga Barang:"+database.getHarga_barang());
            System.out.println("Stock Barang:"+database.getStock_Barang());
            System.out.println("====================================");
        }
    
        //?  untuk menyimpan data barang yang ada
        do {
            System.out.println("1.pilih produk");
            System.out.println("2.keluar dari menu");
            System.out.print("masukkan pilihan anda:");
            byte in = input.nextByte();
        
            if (in == 1) {
                System.out.print("Masukkan nama barang yang anda inginkan:");
                String nama = input.next();
        
                //? mencari produk dalam database
                Database selectedProduct = null;
                for (Database product : list) {
                    if (product.getBarang().trim().equalsIgnoreCase(nama)) { //*Trim digunakan untuk remove whitespace dari database */
                        selectedProduct = product;
                        break;
                    }
                }
                
                //! jika produk ditemukan dalam database
                if (selectedProduct != null) {
                    System.out.print("Masukkan jumlah item yang anda inginkan:");
                    int item = input.nextInt();
                
                    //? mengecek apakah stock barang cukup
                    if (item <= selectedProduct.getStock_Barang()) {
                        double harga = item * selectedProduct.getHarga_barang();
                
                        // mengecek apakah item memenuhi syarat diskon
                        if (item < 5) {
                            //? Diskon 5%
                            System.out.println("Anda tidak mendapatkan diskon");
                            
                        }else if (item >= 5  && item <=10) {
                            harga = harga * 0.95;
                        }else if (item >= 11 && item <= 20) {
                            harga = harga * 0.9;
                             //? diskon 10%
                             
                        }else if(item >= 20){
                            harga = harga * 0.8;
                            
                        }
                        System.out.println("Harga dari jumlah item yang anda input:" + harga + "");
                        //! mengurangi stock barang
                        selectedProduct.setStock_Barang(selectedProduct.getStock_Barang() - item);
                    } else {
                        System.out.println("Stock tidak cukup");
                    }
                } else {
                    System.out.println("Barang tidak ditemukan");
                }

        
            } else if (in == 2) {
                break;
            }
        } while (true);
        }
}
