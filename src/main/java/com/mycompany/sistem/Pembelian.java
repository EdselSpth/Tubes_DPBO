/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem;

import com.mycompany.book.Book;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

/**
 *
 * @author りおん塩田
 */
public class Pembelian {

    protected String idPembelian;
    Perpustakaan perpus = new Perpustakaan();
    BookManagement BM = new BookManagement();
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm:ss");
    String tanggalPembelian = now.format(format);
    String randomID = UUID.randomUUID().toString().substring(0, 12);

    public void beliBuku(int index) {
        try {
            if (index < BM.books.size() && index >= 0) {
                BM.books.get(index).setLicense(true);
                perpus.tambahBuku(index, BM.getBook(index));
                System.out.println("Pembelian E-Book Berhasil");
                System.out.println("Tanggal Pembelian : " + tanggalPembelian);
                System.out.println("ID Pembelian : " + randomID);
                BM.books.get(index).printInfoBuku();
            } else {
                throw new Exception("Buku tidak ditemukan");
            }
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
    }

    public void refundBuku(int index) {
        try {
            perpus.hapusBuku(index);
            BM.books.get(index).setLicense(false);
            System.out.println("Refund E-Book Berhasil");
            System.out.println("Uang dikembalikan sebesar Rp." + BM.books.get(index).harga());
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }

    }
}
