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
        System.out.println("4. Edit Data Buku");
    }
    
    public void menuUser(){
        headerFooter();
        System.out.println("1. Tampilkan E-Book");
        System.out.println("2. Cari E-Book");
        System.out.println("3. Perpustakaan");
    }
    
    public void menuBacaBuku(){
        System.out.println("1. Komentar");
        System.out.println("2. Kembali ke menu");
    }
    
    public void FormatBukuPrint(){
        System.out.println("No" +  "   Judul Buku" +  "\t\t" +  "Penulis Buku" + "\t\t" + "Penerbit" + "\t\t" +  "Kategori" + "\t" + "Harga" + "\t" + "Rating");
    }
    
    public void menuKategoriBuku(){
        System.out.println("1. Pendidikan"); 
        System.out.println("2. Novel");
        System.out.println("3. Sejarah");
        System.out.println("4. Komik");
        System.out.println("5. Majalah");
        System.out.println("6. Koran");
    }
}
