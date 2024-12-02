/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuibes;

/**
 *
 * @author りおん塩田
 */
public class Koran extends Book {
    private String tanggalCetak;

    public Koran(String judulBuku, String idBuku, String namaPenulis, String namaPenerbit, int harga, String Kategori, int tahunTerbit, double rating, String tanggalCetak) {
        super(judulBuku, idBuku, namaPenulis, namaPenerbit, harga, Kategori, 0, rating);
        this.tanggalCetak = tanggalCetak;
    }
    
    @Override
    public void printInfoBuku(){
        System.out.println("ID Buku : " + super.getIdBuku());
        System.out.println("Judul Buku : " + super.getJudulBuku());
        System.out.println("Nama Penulis : " + super.namaPenulis);
        System.out.println("Penerbit : " + super.namaPenerbit);
        System.out.println("Kategori : " + super.Kategori);
        System.out.println("Tanggal terbit : " + this.tanggalCetak);
        System.out.println("Rating : " + super.rating);
        System.out.println("Harga : " + super.getHarga());
        System.out.println("test");
    }
    
}
