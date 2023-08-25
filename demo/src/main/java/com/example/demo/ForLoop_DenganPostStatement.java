package com.example.demo;  // Deklarasi package

public class ForLoop_DenganPostStatement {  // Deklarasi class "ForLoop_DenganPostStatement"
    public static void main(String[] args) {  // Metode utama (main)
        for (var counter = 1; counter <= 10; ) {  // Memulai perulangan dengan inisialisasi variabel counter dan kondisi, tanpa pernyataan iterasi
            System.out.println("Perulangan ke-" + counter);  // Cetak pesan perulangan dengan nomor iterasi
            counter++;  // Tambahkan 1 ke nilai counter (pernyataan iterasi)
        }
    }
}
