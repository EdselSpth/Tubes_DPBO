/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuibes;
import java.util.Scanner;

/**
 *
 * @author りおん塩田
 */
public class Admin  {
    Scanner s = new Scanner(System.in);
    public void menuAdmin(){
        System.out.println("===========================================================");
        System.out.println("1. Tambah Data Buku"); 
        System.out.println("2. Hapus Data Buku");
        System.out.println("3. Cek Riwayat Transaksi");
        System.out.println("4. Edit Data Bukuk");
        System.out.println("===========================================================");
    }
    
    public void adminMenuUsing(){
        System.out.print("Pilih Menu : ");
        int pilihan = s.nextInt();
        switch(pilihan){
            case 1:
                menuKategoriBuku();
                tambahBuku();
            case 2:
            
            case 3:
            
            case 4:
                
            default:
                System.out.println("Pilihan Menu Tidak Ada");
        }
        
    }
    
    public void tambahBuku(){
        System.out.println("");
        menuKategoriBuku();
        System.out.print("Pilih  Kategori Buku : ");
        int pilihan = s.nextInt();
        switch (pilihan) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                System.out.println("Pilihan Menu Tidak Tersedia");;
        }
        
    }
    
    public void menuKategoriBuku(){
        System.out.println("===========================================================");
        System.out.println("1. Pendidikan"); 
        System.out.println("2. Novel");
        System.out.println("3. Sejarah");
        System.out.println("4. Komik");
        System.out.println("5. Majalah");
        System.out.println("6. Koran");
        System.out.println("===========================================================");
    }
}

