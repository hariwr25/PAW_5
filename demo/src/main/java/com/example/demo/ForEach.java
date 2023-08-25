package com.example.demo;  // Deklarasi package

public class ForEach {  // Deklarasi class "ForEach"
    public static void main(String[] args) {  // Metode utama (main)
        String[] array = {  // Deklarasi dan inisialisasi array "array"
            "Eko", "Kurniawan", "Khannedy",
            "Programmer", "Zaman", "Now"
        };

        for (var value : array) {  // Melakukan perulangan for-each untuk setiap nilai dalam array
            System.out.println(value);  // Mencetak nilai saat ini dari array
        }
    }
}
