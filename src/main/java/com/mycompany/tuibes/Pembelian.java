/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuibes;

/**
 *
 * @author りおん塩田
 */
public class Pembelian {
    protected String idPembelian;
    protected String tanggalPembelian;

   
    public void showStruk() {
        System.out.println("ID Pembelian: " + idPembelian);
        System.out.println("Tanggal Pembelian: " + tanggalPembelian);
    }

    public void setIdPembelian(String idPembelian) {
        this.idPembelian = idPembelian;
    }

    public int totalHarga() {
        return 0; 
    }
}