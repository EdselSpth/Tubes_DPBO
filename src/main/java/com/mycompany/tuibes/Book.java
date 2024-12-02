/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuibes;

/**
 *
 * @author りおん塩田
 */
public abstract class Book {
    private String judulBuku;
    private String idBuku;
    protected String namaPenulis;
    protected String namaPenerbit;
    private int harga;
    protected String Kategori;
    protected int tahunTerbit;
    protected double rating;
    protected boolean license = false;

    public Book(String judulBuku, String idBuku, String namaPenulis, String namaPenerbit, int harga, String Kategori, int tahunTerbit, double rating) {
        this.judulBuku = judulBuku;
        this.idBuku = idBuku;
        this.namaPenulis = namaPenulis;
        this.namaPenerbit = namaPenerbit;
        this.harga = harga;
        this.Kategori = Kategori;
        this.tahunTerbit = tahunTerbit;
        this.rating = rating;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public int getHarga() {
        return harga;
    }

    public abstract void printInfoBuku();
    
    
}
