/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuibes;

/**
 *
 * @author りおん塩田
 */
public class Novel extends Book{
    private String genreNovel;

    public Novel(String judulBuku, String idBuku, String namaPenulis, String namaPenerbit, int harga, String Kategori, int tahunTerbit, double rating, String genreNovel) {
        super(judulBuku, idBuku, namaPenulis, namaPenerbit, harga, Kategori, tahunTerbit, rating);
        this.genreNovel = genreNovel;
    }
    
    @Override
    public void printInfoBuku(){
        System.out.println("ID Buku : " + super.getIdBuku());
        System.out.println("Judul Buku : " + super.getJudulBuku());
        System.out.println("Nama Penulis : " + super.namaPenulis);
        System.out.println("Penerbit : " + super.namaPenerbit);
        System.out.println("Kategori : " + super.Kategori);
        System.out.println("Genre Novel : " + this.genreNovel);
        System.out.println("Tahun Terbit : " + super.tahunTerbit);
        System.out.println("Rating : " + super.rating);
        System.out.println("Harga : " + super.getHarga());
    }
}
