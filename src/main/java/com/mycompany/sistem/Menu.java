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
        headerFooter();
        System.out.println("Pilih Menu Pengguna");
        System.out.println("1. Admin");
        System.out.println("2. Pengguna");
    }
    
    public void AplicationName(){
        headerFooter();
        System.out.println("                  BukaBuku");
        System.out.println("               E-Book Platform");
        System.out.println("Made by Only Edsel Septa Haryanto [103022300016]");
    }
    
    public void headerFooter(){
        System.out.println("===================================================");
    }
    
    public void menuAdmin(){
        headerFooter();
        System.out.println("Menu Admin");
        System.out.println("1. Tambah Data Buku"); 
        System.out.println("2. Hapus Data Buku");
        System.out.println("3. Edit Data Buku");
        System.out.println("3. Keluar");
    }
    
    public void menuUser(){
        headerFooter();
        System.out.println("Menu User");
        System.out.println("1. Tampilkan E-Book");
        System.out.println("2. Cari E-Book");
        System.out.println("4. Tampilkan E-Book berdasarkan kategori");
        System.out.println("3. Perpustakaan Pengguna");
    }
    
    public void menuPilihBuku(){
        System.out.println("Pilih Opsi");
        System.out.println("1. Baca Buku");
        System.out.println("2. Refund Buku");
        System.out.println("3. Kembali ke menu");
    }
    
    public void menuBacaBuku(){
        System.out.println("Pilih Opsi");
        System.out.println("1. Kembali ke menu");
    }
    
    public void FormatBukuPrint(){
        System.out.println("No" +  "   Judul Buku" +  "\t\t" +  "Penulis Buku" + "\t\t" + "Penerbit" + "\t\t" +  "Kategori" + "\t" + "Harga" + "\t" + "Rating");
    }
    
    public void menuKategoriBuku(){
        System.out.println("1. Pendidikan"); 
        System.out.println("3. Sejarah");
        System.out.println("2. Novel");
        System.out.println("4. Komik");
        System.out.println("5. Majalah");
    }
    
    public void pilihanEditBukuPendidikan(){
        System.out.println("Pilih Opsi Edit");
        System.out.println("1. Judul");
        System.out.println("2. Penulis");
        System.out.println("3. Penerbit");
        System.out.println("4. Kategori");
        System.out.println("5. Bidang");
        System.out.println("5. Harga");
        System.out.println("6. Tahun Terbit");
        System.out.println("7. Rating");
    }
    
    public void menuBeliBuku(){
        System.out.println("1. Lihat Informasi Buku");
        System.out.println("2. Beli Buku");
    }
    
}
