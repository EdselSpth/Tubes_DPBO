/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuibes;

/**
 *
 * @author りおん塩田
 */
public class Sejarah extends Book {
    private String periodeSejarah;
    private String lokasiSejarah;
    private double discountRate = 0.2;

    public Sejarah(String periodeSejarah, String lokasiSejarah, String judulBuku, String idBuku, String namaPenulis, String namaPenerbit, int harga, int tahunTerbit, double rating) {
        super(judulBuku, idBuku, namaPenulis, namaPenerbit, harga, tahunTerbit, rating, "Sejarah");
        this.periodeSejarah = periodeSejarah;
        this.lokasiSejarah = lokasiSejarah;
    }

    
    
    public double hargaDiskon(){
        return super.getHarga() * this.discountRate;
    }
    
    @Override
    public void printInfoBuku(){
        System.out.println("ID Buku : " + super.getIdBuku());
        System.out.println("Judul Buku : " + super.getJudulBuku());
        System.out.println("Nama Penulis : " + super.namaPenulis);
        System.out.println("Penerbit : " + super.namaPenerbit);
        System.out.println("Kategori : " + super.kategori);
        System.out.println("Periode Sejarah : " + this.periodeSejarah);
        System.out.println("Wilayah Sejarah : " + this.lokasiSejarah);
        System.out.println("Rating : " + super.rating);
        System.out.println("Tahun Terbit : " + super.tahunTerbit);
        System.out.println("Harga : " + super.getHarga());
    }
    
    public double dapatHarga(){
        return hargaDiskon();
    }

    public String getPeriodeSejarah() {
        return periodeSejarah;
    }

    public String getLokasiSejarah() {
        return lokasiSejarah;
    }

    public double getDiscountRate() {
        return discountRate;
    }
    
    
    
}
