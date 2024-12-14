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
    BookManagement BM = new BookManagement();
    
    public Perpustakaan() {
        
    }
    
    public void showBuku(){
        if (BM.books.isEmpty()) {
            System.out.println("Tidak Ada Buku di perpustakaan");
        }else {
            menu.FormatBukuPrint();
            for (int i = 0; i < BM.books.size(); i++) {
                if (BM.books.get(i).getLicense()){
                     System.out.println(BM.books.get(i).toString());
                }
                System.out.println("-----------------------");
            }
        }
    }
    
    
    public void refundBuku(String idBuku){
        boolean ditemukan = false;
        for (int i = 0; i < BM.books.size(); i++) {
            if (BM.books.get(i).getIdBuku().equals(idBuku)) {
                listBuku.remove(BM.books.get(i));
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
