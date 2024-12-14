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
    private int harga;
    private int tahunTerbit;
    private double rating;
    private String kategori;
    private boolean license = false;

    public Book(String idBuku, String judulBuku, String namaPenulis, String namaPenerbit, int harga, int tahunTerbit, double rating, String kategori) {
        this.judulBuku = judulBuku;
        this.idBuku = idBuku;
        this.namaPenulis = namaPenulis;
        this.namaPenerbit = namaPenerbit;
        this.harga = harga;
        this.tahunTerbit = tahunTerbit;
        this.rating = rating;
        this.kategori = kategori;
    }

    @Override
    public String getJudulBuku() {
        return judulBuku;
    }

    public void setLicense() {
        this.license = true;
    }
    
    public boolean getLicense() {
        return license;
    }
    
    public String getIdBuku() {
        return idBuku;
    }

    @Override
    public int getHarga() {
        return harga;
    }

    @Override
    public void printInfoBuku(){
        System.out.println("Judul: " + judulBuku);
        System.out.println("Penulis: " + namaPenulis);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Penerbit: " + namaPenerbit);
        System.out.println("Rating: " + rating);
    }

    @Override
    public String getKategori() {
        return kategori;
    }
    
    public void setValidFalse(){
        this.license = false;
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

    public boolean isLicense() {
        return license;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }
    
    
    
    
    @Override
    public String toString() {
        return "   " + judulBuku + "\t\t" + namaPenulis + "\t\t" + namaPenerbit + "\t\t" + kategori + "\t" + harga + "\t" + rating;
    }
    
    
    
}
