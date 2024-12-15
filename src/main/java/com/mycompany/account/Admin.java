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
    private HashMap<String, Account> admin = new HashMap<>();
    Scanner S = new Scanner(System.in);
    boolean passwordValidation = false;
    BookManagement BM = new BookManagement();

    public Admin() {
        admin.put("admin", new Account("Admin", "admin123"));
        admin.put("edsel", new Account("EdselSpth", "Edsel@S3pta"));
        admin.put("kobo", new Account("Kobo1212", "Kobo123"));
    }

    @Override
    public void loginValidation() {
        System.out.print("> Username : ");
        String username = S.nextLine();
        System.out.print("> Password : ");
        String password = S.nextLine();

        Account account = admin.get(username);
        if (account != null && account.getPassword().equals(password)) {
            passwordValidation = true;
        }
    }

    @Override
    public void menuInside() {
        int pilihan = 999;
        try {
            if (passwordValidation) {
                while (pilihan != 0) {
                    menu.menuAdmin();
                    System.out.print("Pilih Menu : ");
                    pilihan = S.nextInt();
                    switch (pilihan) {
                        case 1:
                            BM.printBuku();
                            BM.tambahDataBuku();
                            break;
                        case 2:
                            BM.printBuku();
                            BM.hapusDataBuku();
                            break;
                        case 3:
                            BM.editDataBuku();
                            break;
                        case 4:
                            return;
                        default:
                            System.out.println("Masukkan tidak valid");
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
