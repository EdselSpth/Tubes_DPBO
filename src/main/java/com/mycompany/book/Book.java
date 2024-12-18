/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.book;

/**
 *
 * @author りおん塩田
 */
public class Book implements IBook{
    private String judulBuku;
    private String idBuku;
    private String namaPenulis;
    private String namaPenerbit;
    private double harga;
    private int tahunTerbit;
    private double rating;
    private String kategori;
    private boolean license;

    public Book(String idBuku, String judulBuku, String namaPenulis, String namaPenerbit, int harga, int tahunTerbit, double rating, String kategori, boolean license) {
        this.judulBuku = judulBuku;
        this.idBuku = idBuku;
        this.namaPenulis = namaPenulis;
        this.namaPenerbit = namaPenerbit;
        this.harga = harga;
        this.tahunTerbit = tahunTerbit;
        this.rating = rating;
        this.kategori = kategori;
        this.license = license;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getNamaPenulis() {
        return namaPenulis;
    }

    public void setNamaPenulis(String namaPenulis) {
        this.namaPenulis = namaPenulis;
    }

    public String getNamaPenerbit() {
        return namaPenerbit;
    }

    public void setNamaPenerbit(String namaPenerbit) {
        this.namaPenerbit = namaPenerbit;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public boolean isLicense() {
        return license;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }
    
    @Override
    public String toString() {
        return String.format("%-30s %-20s %-20s %-15s %-10.2f %-10.1f",
                             this.judulBuku, this.namaPenulis, this.namaPenerbit, this.kategori, this.harga, this.rating);
}


    @Override
    public void printInfoBuku() {
    }

    @Override
    public double harga() {
        return 0;
    }
    
    
    
}
