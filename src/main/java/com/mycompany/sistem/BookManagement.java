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
    protected ArrayList<Book> books;
    
    public BookManagement(){
        books = new ArrayList<>();
        books.add(new Novel("Nov001" , "Bungo Stray Dogs", "Fantasy", "Kafka Asagiri", "Kadokawa", 45000, 2020, 10.0));
        books.add(new Pendidikan("Pen001", "Matematika : Aljabar", "Matematika", "Alisha Ravencroft", "MathGroup", 40000, 2015, 7.5));
        books.add(new Sejarah("Sej001", "World History", "Past-Present", "Dunia", "Adolf Hitler", "German Corpse", 80000, 1955, 10.0));
        books.add(new Komik("KMK001", "Doraemon", "Fantasy", "Fujiko F. Fujio", "JapanComics", 20000, 2005, 8.0));
        books.add(new Majalah("MJL001", "Chips", "Teknologi", "Dedy Irvan", "Chips Company", 120000, 2007, 9.5));
    }
}
