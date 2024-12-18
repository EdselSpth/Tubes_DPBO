/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.account;

import com.mycompany.sistem.BookManagement;
import java.util.ArrayList;
import java.util.Scanner;
import com.mycompany.sistem.Menu;
import java.util.HashMap;

/**
 *
 * @author りおん塩田
 */
public class Admin implements IAccount {

    Menu menu = new Menu();
    private ArrayList<Account> adminList;
    Scanner S = new Scanner(System.in);
    boolean passwordValidation = false;
    BookManagement BM = new BookManagement();

    public Admin() {
        adminList = new ArrayList<>();
        adminList.add(new Account("Admin", "admin123"));
        adminList.add(new Account("////", "////"));
        adminList.add(new Account("Kobo1212", "Kobo123"));

    }

    @Override
    public boolean loginValidation() {
        System.out.print("> Username : ");
        String username = S.nextLine();
        System.out.print("> Password : ");
        String password = S.nextLine();

        for (int i = 0; i < adminList.size(); i++) {
            if (username.equals(adminList.get(i).getUsername()) && password.equals(adminList.get(i).getPassword())) {
                passwordValidation = true;
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param passwordValidation
     * @throws Exception
     */
    @Override
    public void menuInside(boolean passwordValidation) throws Exception {
        if (passwordValidation) {
            int pilihan = 0;
            boolean exit = false;
            while (!exit) {
                menu.menuAdmin();
                System.out.print("Pilih Menu : ");
                pilihan = S.nextInt();
                switch (pilihan) {
                    case 1:
                        System.out.println("Menu Tambah Buku");
                        BM.tambahDataBuku();
                        break;
                    case 2:
                        System.out.println("Menu Hapus Buku");
                        BM.hapusDataBuku();
                        break;
                    case 3:
                        System.out.println("Menu Edit Buku");
                        BM.editDataBuku();
                        break;
                    case 4:
                        exit = true;
                        break;
                    default:
                        System.out.println("Masukkan tidak valid");
                }
            }
        } else {
            throw new Exception("Username atau Password Salah");
        }

    }

}
