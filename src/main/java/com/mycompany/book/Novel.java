/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.book;

/**
 *
 * @author りおん塩田
 */
public class Novel extends Book{
    private String genre;

    public Novel(String idBuku, String judulBuku, String genre, String namaPenulis, String namaPenerbit, int harga, int tahunTerbit, double rating) {
        super(judulBuku, idBuku, namaPenulis, namaPenerbit, harga, tahunTerbit, rating, "Novel");
        this.genre = genre;
    }
    
    @Override
    public void printInfoBuku(){
        System.out.println("Judul Buku : " + super.getJudulBuku());
        System.out.println("Nama Penulis : " + super.getNamaPenulis());
        System.out.println("Penerbit : " + super.getNamaPenerbit());
        System.out.println("Kategori : " + super.getKategori());
        System.out.println("Genre : " + this.genre);
        System.out.println("Rating : " + super.getKategori());
        System.out.println("Tahun Terbit : " + super.getTahunTerbit());
        System.out.println("Harga : " + super.getHarga());
    }

    public String getGenre() {
        return genre;
    }
    
}
