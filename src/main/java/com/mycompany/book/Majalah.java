/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.book;

/**
 *
 * @author りおん塩田
 */
public class Majalah extends Book implements IBook{
    private String jenisMajalah;

    public Majalah(String idBuku, String judulBuku, String jenisMajalah,  String namaPenulis, String namaPenerbit, int harga, int tahunTerbit, double rating) {
        super(idBuku, judulBuku, namaPenulis, namaPenerbit, harga, tahunTerbit, rating, "Majalah", false);
        this.jenisMajalah = jenisMajalah;
    }
    
    @Override
    public double harga(){
        return super.getHarga();
    }
    
    @Override
    public void printInfoBuku(){
        System.out.println("Judul Buku : " + super.getJudulBuku());
        System.out.println("Nama Penulis : " + super.getNamaPenulis());
        System.out.println("Penerbit : " + super.getNamaPenerbit());
        System.out.println("Kategori : " + super.getKategori());
        System.out.println("Jenis Majalah : " + this.jenisMajalah);
        System.out.println("Rating : " + super.getRating());
        System.out.println("Tahun Terbit : " + super.getTahunTerbit());
        System.out.println("Harga : " + harga());
    }

    public String getJenisMajalah() {
        return jenisMajalah;
    }

    public void setJenisMajalah(String jenisMajalah) {
        this.jenisMajalah = jenisMajalah;
    }

    
}
