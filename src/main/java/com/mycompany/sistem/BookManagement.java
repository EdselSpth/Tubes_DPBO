/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem;

import com.mycompany.book.Book;
import com.mycompany.book.Koran;
import java.util.ArrayList;

/**
 *
 * @author りおん塩田
 */
public class BookManagement {
    public ArrayList<Book> books;
    
    public BookManagement(){
        books = new ArrayList<>();
        books.add(new Koran("13-09-04", "Harian Kompas", "KOR001", "N/A", "Kompas Media", 3000, 2004, 5));
    }
}
