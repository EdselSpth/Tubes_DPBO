/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.book;

/**
 *
 * @author りおん塩田
 */
public class Sejarah extends Book implements IBook {
    private String periodeSejarah;
    private String lokasiSejarah;
    private double discountRate = 0.02;

    public Sejarah(String idBuku, String judulBuku, String periodeSejarah, String lokasiSejarah, String namaPenulis, String namaPenerbit, int harga, int tahunTerbit, double rating) {
        super(idBuku, judulBuku, namaPenulis, namaPenerbit, harga, tahunTerbit, rating, "Sejarah");
        this.periodeSejarah = periodeSejarah;
        this.lokasiSejarah = lokasiSejarah;
    }

    
    
    @Override
    public double harga(){
        return super.getHarga() - (this.discountRate * super.getHarga());
    }
    
    @Override
    public void printInfoBuku(){
        System.out.println("Judul Buku : " + super.getJudulBuku());
        System.out.println("Nama Penulis : " + super.getNamaPenulis());
        System.out.println("Penerbit : " + super.getNamaPenerbit());
        System.out.println("Kategori : " + super.getKategori());
        System.out.println("Periode Sejarah : " + this.periodeSejarah);
        System.out.println("Wilayah Sejarah : " + this.lokasiSejarah);
        System.out.println("Rating : " + super.getRating());
        System.out.println("Tahun Terbit : " + super.getTahunTerbit());
        System.out.println("Harga : " + harga());
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
