/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tuibes;

/**
 *
 * @author りおん塩田
 */
public class Tuibes {

    public static void main(String[] args) {
        Pembelian pembelian = new Pembelian();
        pembelian.setIDPembelian("OGHU112");
        String tanggalPembelian = "2020-10-20";
        pembelian.showStruk();
        int totalHarga = pembelian.totalHarga();
        System.out.println("Total harga dari buku: " + totalHarga);

        BacaBuku bacaBuku = new BacaBuku();
        bacaBuku.bacaBuku();
        bacaBuku.searchBuku();
        bacaBuku.setTerakhirBaca("15 Januari 2021");
        String terakhirBacca = bacaBuku.getTanggalTerakhirBaca();
        System.out.println("Tanggal terakhir baca buku. . . :" + bacaBuku);
        
    }
}
