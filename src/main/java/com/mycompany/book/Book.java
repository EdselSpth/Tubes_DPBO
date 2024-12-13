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
    protected String namaPenulis;
    protected String namaPenerbit;
    private int harga;
    protected int tahunTerbit;
    protected double rating;
    protected String kategori;
    protected boolean license = false;

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
        System.out.println("ISBN: " + idBuku);
        System.out.println("Rating: " + rating);
    }

    @Override
    public String getKategori() {
        return kategori;
    }

    @Override
    public String toString() {
        return "   " + judulBuku + "\t\t" + namaPenulis + "\t\t" + namaPenerbit + "\t\t" + kategori + "\t" + harga + "\t" + rating;
    }
    
    
    
}
