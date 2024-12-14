/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem;

import com.mycompany.book.Book;
import java.util.ArrayList;

/**
 *
 * @author りおん塩田
 */
public class Pembelian {
    protected String idPembelian;
    protected String tanggalPembelian;
    private ArrayList<String> riwayatPembelian;
    BookManagement BM = new BookManagement();

    public Pembelian() {
        this.riwayatPembelian = new ArrayList<>();
    }
    
    public void showStruk() {
        System.out.println("ID Pembelian: " + idPembelian);
        System.out.println("Tanggal Pembelian: " + tanggalPembelian);
    }
    
    public void beliBuku(Perpustakaan perpustakaan, Book bukuDibeli, String idPembelian, String tanggalPembelian) {
        this.idPembelian = idPembelian;
        this.tanggalPembelian = tanggalPembelian;

        
        if (!bukuDibeli.getLicense()) { 
            for (int i = 0; i < BM.books.size(); i++) {
                if (BM.books.get(i).getJudulBuku().equals(bukuDibeli.getJudulBuku())){
                    BM.books.get(i).setLicense(true);
                    System.out.println("Buku \"" + bukuDibeli.getJudulBuku() + "\" berhasil dibeli dan ditambahkan ke perpustakaan.");
                }
            } 
        } else {
            System.out.println("Buku \"" + bukuDibeli.getJudulBuku() + "\" sudah berlisensi dan ada di perpustakaan.");
        }
        
        riwayatPembelian.add("ID: " + idPembelian + ", Tanggal: " + tanggalPembelian + ", Buku: " + bukuDibeli.getJudulBuku());
        
        System.out.println("\n=== Struk Pembelian ===");
        System.out.println("ID Pembelian: " + idPembelian);
        System.out.println("Tanggal Pembelian: " + tanggalPembelian);

        
        System.out.println("\n=== Buku di Perpustakaan ===");
        perpustakaan.showBuku();
    }
    
    public void showRiwayatPembelian() {
        System.out.println("\n=== Riwayat Pembelian ===");
        for (String transaksi : riwayatPembelian) {
            System.out.println(transaksi);
        }
    }
}