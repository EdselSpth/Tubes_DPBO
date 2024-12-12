/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem;

/**
 *
 * @author りおん塩田
 */
public class Menu {
    public void LoginMenu(){
        System.out.println("Pilih Menu Pengguna");
        System.out.println("1. Admin");
        System.out.println("2. Pengguna");
    }
    
    public void AplicationName(){
        System.out.println("BukaBuku");
        System.out.println("E-Book Platform");
    }
    
    public void headerFooter(){
        System.out.println("========================================");
    }
    
    public void menuAdmin(){
        headerFooter();
        System.out.println("1. Tambah Data Buku"); 
        System.out.println("2. Hapus Data Buku");
        System.out.println("3. Cek Riwayat Transaksi");
        System.out.println("4. Edit Data Bukuk");
    }
    
    public void FormatBukuPrint(){
        System.out.println("No" +  "   Judul Buku" +  "\t\t" +  "Penulis Buku" + "\t\t" + "Penerbit" + "\t\t" +  "Kategori" + "\t" + "Harga" + "\t" + "Rating");
    }
}
