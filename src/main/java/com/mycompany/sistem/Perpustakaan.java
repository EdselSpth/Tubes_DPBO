/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem;

/**
 *
 * @author りおん塩田
 */


public class Perpustakaan {
    Menu menu = new Menu();
    BookManagement BM = new BookManagement();
    
    
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
    
}
