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
import java.util.Scanner;

/**
 *
 * @author りおん塩田
 */
public class BookManagement {
    protected ArrayList<Book> books = new ArrayList<>();;
    Scanner S = new Scanner(System.in);
    Menu menu = new Menu();
    String IDBuku, judul, penulis, penerbit, bidang, periodeSejarah, lokasiSejarah, genre, jenisMajalah;
    int harga, tahunTerbit;
    double rating;
    
    public BookManagement(){
        books.add(new Novel("Nov001" , "Bungo Stray Dogs", "Fantasy", "Kafka Asagiri", "Kadokawa", 45000, 2020, 10.0));
        books.add(new Pendidikan("Pen001", "Matematika : Aljabar", "Matematika", "Alisha Ravencroft", "MathGroup", 40000, 2015, 7.5));
        books.add(new Sejarah("Sej001", "World History", "Past-Present", "Dunia", "Adolf Hitler", "German Corpse", 80000, 1955, 10.0));
        books.add(new Komik("KMK001", "Doraemon", "Fantasy", "Fujiko F. Fujio", "JapanComics", 20000, 2005, 8.0));
        books.add(new Majalah("MJL001", "Chips", "Teknologi", "Dedy Irvan", "Chips Company", 120000, 2007, 9.5));
    }
    
    public void tambahDataBuku(){
        System.out.println("Pilih kategori buku");
        menu.menuKategoriBuku();
        int pilihan = S.nextInt();
        switch(pilihan){
            case 1 :
                System.out.println("Tambah Buku Pendidikan");
                System.out.print("ID Buku : ");
                IDBuku = S.nextLine();
                System.out.print("Judul Buku : ");
                judul = S.nextLine();
                System.out.print("Nama Bidang : ");
                bidang = S.nextLine();
                System.out.print("Nama Penulis : ");
                penulis = S.nextLine();
                System.out.print("Nama Penerbit : ");
                penerbit = S.nextLine();
                System.out.print("Harga : ");
                harga = S.nextInt();
                System.out.print("Tahun Terbit : ");
                tahunTerbit = S.nextInt();
                System.out.print("Rating : ");
                rating = S.nextDouble();
                books.add(new Pendidikan(IDBuku, judul, bidang, penulis, penerbit, harga, tahunTerbit, rating));
            case 2 :
                System.out.println("Tambah Buku Sejarah");
                System.out.print("ID Buku : ");
                IDBuku = S.nextLine();
                System.out.print("Judul Buku : ");
                judul = S.nextLine();
                System.out.print("Periode Sejarah : ");
                periodeSejarah = S.nextLine();
                System.out.print("Lokasi Sejarah : ");
                lokasiSejarah = S.nextLine();
                System.out.print("Nama Penulis : ");
                penulis = S.nextLine();
                System.out.print("Nama Penerbit : ");
                penerbit = S.nextLine();
                System.out.print("Harga : ");
                harga = S.nextInt();
                System.out.print("Tahun Terbit : ");
                tahunTerbit = S.nextInt();
                System.out.print("Rating : ");
                rating = S.nextDouble();
                books.add(new Sejarah(IDBuku, judul, periodeSejarah, lokasiSejarah, penulis, penerbit, harga, tahunTerbit, rating));
            case 3 :
                System.out.println("Tambah Buku Novel");
                System.out.print("ID Buku : ");
                IDBuku = S.nextLine();
                System.out.print("Judul Buku : ");
                judul = S.nextLine();
                System.out.print("Genre : ");
                genre = S.nextLine();
                System.out.print("Nama Penulis : ");
                penulis = S.nextLine();
                System.out.print("Nama Penerbit : ");
                penerbit = S.nextLine();
                System.out.print("Harga : ");
                harga = S.nextInt();
                System.out.print("Tahun Terbit : ");
                tahunTerbit = S.nextInt();
                System.out.print("Rating : ");
                rating = S.nextDouble();
                books.add(new Novel(IDBuku, judul, genre, penulis, penerbit, harga, tahunTerbit, rating));
            case 4 :
                System.out.println("Tambah Buku Novel");
                System.out.print("ID Buku : ");
                IDBuku = S.nextLine();
                System.out.print("Judul Buku : ");
                judul = S.nextLine();
                System.out.print("Genre : ");
                genre = S.nextLine();
                System.out.print("Nama Penulis : ");
                penulis = S.nextLine();
                System.out.print("Nama Penerbit : ");
                penerbit = S.nextLine();
                System.out.print("Harga : ");
                harga = S.nextInt();
                System.out.print("Tahun Terbit : ");
                tahunTerbit = S.nextInt();
                System.out.print("Rating : ");
                rating = S.nextDouble();
                books.add(new Komik(IDBuku, judul, genre, penulis, penerbit, harga, tahunTerbit, rating));
            case 5 :
                System.out.println("Tambah Buku Novel");
                System.out.print("ID Buku : ");
                IDBuku = S.nextLine();
                System.out.print("Judul Buku : ");
                judul = S.nextLine();
                System.out.print("Jenis Majalah : ");
                jenisMajalah = S.nextLine();
                System.out.print("Nama Penulis : ");
                penulis = S.nextLine();
                System.out.print("Nama Penerbit : ");
                penerbit = S.nextLine();
                System.out.print("Harga : ");
                harga = S.nextInt();
                System.out.print("Tahun Terbit : ");
                tahunTerbit = S.nextInt();
                System.out.print("Rating : ");
                rating = S.nextDouble();
                books.add(new Majalah(IDBuku, judul, jenisMajalah, penulis, penerbit, harga, tahunTerbit, rating));
            default :
                System.out.println("Masukkan Nomor Menu Yang Benar!!!");
        }
    }
    
    public void hapusDataBuku(){
        boolean ketemu = false;
        System.out.println("Hapus Data Buku");
        System.out.print("ID Buku: ");
        String idBukuHapus = S.nextLine();
        for(int i = 0; i < books.size(); i++){
            if (books.get(i).getIdBuku().equalsIgnoreCase(idBukuHapus)){
                books.remove(i);
                ketemu = true;  
            }
        }
        if (ketemu){
            System.out.println("Buku berhasil di hapus");
        } else {
            System.out.println("Buku tidak ada!!!");
        }
    }
    
    
}
