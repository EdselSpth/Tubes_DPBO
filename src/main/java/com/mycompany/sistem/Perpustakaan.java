/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem;

/**
 *
 * @author りおん塩田
 */
import com.mycompany.book.Book;
import java.util.ArrayList;


public class Perpustakaan {
    private ArrayList<Book> listBuku;
    Menu menu = new Menu();
     
    
    public Perpustakaan() {
        this.listBuku = new ArrayList
    }
    
    public void showBuku(){
        if (listBuku.isEmpty()) {
            System.out.println("Tidak Ada Buku di perpustakaan");
        }else {
            for (Book buku : listBuku) {
                menu.FormatBukuPrint();
                buku.toString();
                System.out.println("-----------------------");
            }
        }
    }
    
    public void tambahBuku(Book bukuBaru){
        listBuku.add(bukuBaru);
    }
    
    public void refundBuku(String idBuku){
        boolean ditemukan = false;
        for (Book buku : listBuku) {
            if (buku.getIdBuku().equals(idBuku)) {
                listBuku.remove(buku);
                System.out.println("Buku dengan ID \"" + idBuku + "\" berhasil dihapus.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Buku dengan ID \"" + idBuku + "\" tidak ditemukan.");
        }
    }
    
}
