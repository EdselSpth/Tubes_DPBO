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
public class Account {
    private String username[];
   Scanner s = new Scanner(System.in);
    public void LoginMenu(){
        
        System.out.println("===========================================================");
        System.out.println("Pilih Menu Pengguna");
        System.out.println("1. Admin");
        System.out.println("1. Pengguna");
        System.out.println("===========================================================");
    }
    
    public void Login(){
        LoginMenu();
        int pilihan = s.nextInt();
        switch (pilihan){
            case 1:
                break;
            case 2 :
                break;
            default :
                System.out.println("Pilihan menu tidak ada");
        }
    }
}
