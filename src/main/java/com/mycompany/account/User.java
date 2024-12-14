/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.account;

import java.util.ArrayList;
import java.util.Scanner;
import com.mycompany.sistem.Menu;
import com.mycompany.sistem.BookManagement;
import com.mycompany.sistem.Pembelian;
import com.mycompany.sistem.Perpustakaan;
/**
 *
 * @author りおん塩田
 */
public class User implements IAccount {
    private ArrayList<Account> userList;
    Scanner S = new Scanner(System.in);
    Menu menu = new Menu();
    boolean passwordValidation = false;
    BookManagement BM = new BookManagement();
    Pembelian P = new Pembelian();
    Perpustakaan perpus = new Perpustakaan();
    
    public User(){
        userList = new ArrayList<>();
        userList.add(new Account("User123", "User123"));
        userList.add(new Account("Rinitial", "RintialPassword"));
        userList.add(new Account("ZetaZeta", "VestiaZeta"));
    }

    @Override
    public void loginValidation() {
        System.out.print("> Username : ");
        String username = S.nextLine();
        System.out.print("> Password : ");
        String password = S.nextLine();
        for (int i = 0; i < userList.size(); i++){
            if (username.equals(userList.get(i).getUsername()) && password.equals(userList.get(i).getPassword())){
                passwordValidation = true;
            }
        }
    }

    @Override
    public void menuInside(){
        try {
            if (passwordValidation){
                int pilihan = 999;
                int i;
                while(pilihan != 0){
                    menu.menuUser();
                    System.out.print("Pilih Menu : ");
                    pilihan = S.nextInt();
                    switch(pilihan){
                        case 1:
                            menu.FormatBukuPrint();
                            System.out.println("Daftar Buku");
                            for(i = 0; i < BM.books.size(); i++){
                                System.out.println(BM.books.toString());
                            }
                            System.out.print("Pilih Buku : ");
                            int milihBuku = S.nextInt();
                            menu.menuBeliBuku();
                            System.out.print("Pilih :");
                            int pilihanSistem = S.nextInt();
                            int index = milihBuku - 1;;
                            switch(pilihanSistem){
                                case 1:
                                    if(index < 0 || index > BM.books.size()){
                                        System.out.println("Pilihan buku tidak ada");
                                    } else {
                                        BM.books.get(index).printInfoBuku();
                                    }
                                case 2:
                                    P.beliBuku(index);
                                default:
                                    System.out.println("Pilihan Menu Tidak terssedia");
                            }
                        case 2:
                            System.out.print("Masukkan nama buku yang dicari : ");
                            int indexc2 = 0;
                            String dicari = S.nextLine();
                            for (i = 0; i < BM.books.size(); i++){
                                if(BM.books.get(i).getJudulBuku().equalsIgnoreCase(dicari)){
                                    indexc2 = i;
                                } else{
                                    System.out.println("Buku" + dicari + "tidak tersedia");
                                }
                            }
                            menu.menuPilihBuku();
                            pilihanSistem = S.nextInt();
                            switch(pilihanSistem){
                                case 1:
                                    if(indexc2 < 0 || indexc2 > BM.books.size()){
                                        System.out.println("Pilihan buku tidak ada");
                                    } else {
                                        BM.books.get(indexc2).printInfoBuku();
                                    }
                                case 2:
                                    P.beliBuku(indexc2);
                                default:
                                    System.out.println("Pilihan Tidak ada");
                            }
                        case 3:
                            perpus.showBuku();
                            System.out.print("Pilih Buku : ");
                            int milihBuku2 = S.nextInt();
                            menu.menuPilihBuku();
                            int pilihanc3 = S.nextInt();
                        default:
                            System.out.println("Pilihan Menu Tidak Ada");
                    }
                }
            } else {
                throw new Exception("Username atau Password Salah");
            }
            
        } catch (Exception ex) {
            ex.getMessage();
        }
        
    }
}