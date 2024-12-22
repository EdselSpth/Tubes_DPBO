/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.book;

/**
 *
 * @author りおん塩田
 */
public class Majalah extends Book {
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

    @Override
    public String toStringAdmin() {
        return String.format("%-10s %-30s %-20s %-20s %-15s %-10.2f %-10.1f", super.getIdBuku(), super.getJudulBuku(), super.getNamaPenulis(), super.getNamaPenerbit(), super.getKategori(), harga(), super.getRating());
    }
    
    @Override
    public String toString() {
        return String.format("%-30s %-20s %-20s %-15s %-10.2f %-10.1f",
                super.getJudulBuku(), super.getNamaPenulis(), super.getNamaPenerbit(), super.getKategori(), harga(), super.getHarga());
    }
}
