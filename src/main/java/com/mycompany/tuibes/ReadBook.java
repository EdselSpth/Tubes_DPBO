/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuibes;

/**
 *
 * @author りおん塩田
 */
public class ReadBook {
    private String tanggalTerakhirBaca;
    
    public void bacaBuku() {
        System.out.println("Membaca buku...");
    }

    public void searchBuku() {
        System.out.println("Mencari buku...");
    }

    public void setTerakhirBaca(String tanggal) {
        this.tanggalTerakhirBaca = tanggal;
    }

    public String getTanggalTerakhirBaca() {
        return this.tanggalTerakhirBaca;
    }
}
