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
    protected String IDPembelian;
    protected String tanggalPembelian;

    public void showStruk() {
        System.out.println("ID Pembelian: " + IDPembelian);
        System.out.println("Tanggal Pembelian: " + tanggalPembelian);
    }

    public void setIDPembelian(String IDPembelian) {
        this.IDPembelian = IDPembelian;
    }

    public int totalHarga() {
        return 0;
    }
}
