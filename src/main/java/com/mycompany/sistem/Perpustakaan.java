/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem;

import com.mycompany.book.Book;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author りおん塩田
 */


public class Perpustakaan {
    public List<Book> koleksiBuku = new ArrayList<>();
    Menu menu = new Menu();
    
    
    public void tambahBuku(int index, Book buku) {
       koleksiBuku.add(buku);
    }
    
    public void hapusBuku(int index) throws Exception {
        if (index >= 0 && index < koleksiBuku.size()) {
            koleksiBuku.remove(index);    
        } else {
            throw new Exception("Buku tidak ditemukan!");
        }
    }
    
    public void printBuku(){
        menu.headerFooter();
        System.out.println("Perpustakaan Pengguna");
        if (koleksiBuku.isEmpty()) {
            System.out.println("Tidak Ada E-Book yang sudah anda beli");
        }else {
            menu.FormatBukuPrint();
            for (Book book : koleksiBuku) {
                book.toString();
            }
        }
    }
    
}
