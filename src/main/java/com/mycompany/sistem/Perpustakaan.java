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
        menu.headerFooter();
        System.out.println("Perpustakaan Pengguna");
        if (BM.books.isEmpty()) {
            System.out.println("Tidak Ada E-Book yang sudah anda beli");
        }else {
            menu.FormatBukuPrint();
            for (int i = 0; i < BM.books.size(); i++) {
                if (BM.books.get(i).isLicense()){
                     System.out.println(BM.books.get(i).toString());
                }
            }
        }
    }
    
}
