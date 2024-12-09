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
    Scanner s = new Scanner(System.in);
    Admin A = new Admin();
    public void LoginMenu(){
        System.out.println("===========================================================");
        System.out.println("\t Pilih Menu Pengguna");
        System.out.println("\t 1. Admin");
        System.out.println("\t 2. Pengguna");
        System.out.println("===========================================================");
    }
    
    public void Login(){
        String username;
        String password;
       
        LoginMenu();
        int pilihan = s.nextInt();
        switch (pilihan){
            case 1:
                String usernameBenar = "Admin123";
                String passwordBenar = "AyamGorengEnak1309";
                System.out.print("Username : ");
                username = s.nextLine();
                System.out.println("Password : ");
                password = s.nextLine();
                if (username.equalsIgnoreCase(usernameBenar) && password.equalsIgnoreCase(passwordBenar)){
                    A.menuAdmin();
                    
                } else if (username.equalsIgnoreCase(usernameBenar) && !(password.equalsIgnoreCase(passwordBenar))){
                    System.out.println("Password yang dimasukkan salah");
                } else if (!(username.equalsIgnoreCase(usernameBenar)) && username.equalsIgnoreCase(passwordBenar)){
                    System.out.println("Username yang dimasukkan tidak terdaftar");
                } else {
                    System.out.println("Username dan password tidak terdaftar");
                }
            case 2 :
                String usernameUserBenar = "EdselSpth";
                String passwordUserBenar = "Edsel@S3pta";
                username = s.nextLine();
                password = s.nextLine();
                if (username.equalsIgnoreCase(usernameUserBenar) && password.equalsIgnoreCase(passwordUserBenar)){
                    A.menuAdmin();
                    A.adminMenuUsing();
                } else if (username.equalsIgnoreCase(usernameUserBenar) && !(password.equalsIgnoreCase(passwordUserBenar))){
                    System.out.println("Password yang dimasukkan salah");
                } else if (!(username.equalsIgnoreCase(usernameUserBenar)) && username.equalsIgnoreCase(passwordUserBenar)){
                    System.out.println("Username yang dimasukkan tidak terdaftar");
                } else {
                    System.out.println("Username dan password tidak terdaftar");
                }
            default :
                System.out.println("Pilihan menu tidak ada");
        }
    }
}
