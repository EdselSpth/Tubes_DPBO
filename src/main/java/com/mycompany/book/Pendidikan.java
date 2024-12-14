/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.book;

/**
 *
 * @author りおん塩田
 */
public class Pendidikan extends Book implements IBook{
    private String namaBidang;
    private double discountRate = 0.35;

    public Pendidikan(String idBuku,  String judulBuku, String namaBidang, String namaPenulis, String namaPenerbit, int harga, int tahunTerbit, double rating) {
        super(judulBuku, idBuku, namaPenulis, namaPenerbit, harga, tahunTerbit, rating, "Pendidikan");
        this.namaBidang = namaBidang;
    }
    
    @Override
    public double harga(){
        return super.getHarga() - (discountRate * super.getHarga());
    }
    
    @Override
    public void printInfoBuku(){
        System.out.println("Judul Buku : " + super.getJudulBuku());
        System.out.println("Nama Penulis : " + super.getNamaPenulis());
        System.out.println("Penerbit : " + super.getNamaPenerbit());
        System.out.println("Kategori : " + super.getKategori());
        System.out.println("Bidang : " + this.namaBidang);
        System.out.println("Rating : " + super.getRating());
        System.out.println("Tahun Terbit : " + super.getTahunTerbit());
        System.out.println("Harga : " + harga());
    }

    public String getNamaBidang() {
        return namaBidang;
    }

    public void setNamaBidang(String namaBidang) {
        this.namaBidang = namaBidang;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
    
}
