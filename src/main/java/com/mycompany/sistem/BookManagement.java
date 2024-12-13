/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem;

import com.mycompany.book.Book;
import com.mycompany.book.Komik;
import com.mycompany.book.Majalah;
import com.mycompany.book.Novel;
import com.mycompany.book.Pendidikan;
import com.mycompany.book.Sejarah;
import java.util.ArrayList;

/**
 *
 * @author りおん塩田
 */
public class BookManagement {
    public ArrayList<Book> books;
    
    public BookManagement(){
        books = new ArrayList<>();
        books.add(new Novel("001" , "Bungo Stray Dogs", "Fantasy", "Kafka Asagiri", "Kadokawa", 45000, 2020, 10));
        books.add(new Pendidikan());
        books.add(new Sejarah());
        books.add(new Komik());
        books.add(new Majalah());
    }
}
