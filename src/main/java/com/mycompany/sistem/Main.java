/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sistem;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.mycompany.account.*;

/**
 *
 * @author りおん塩田
 */
public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        BookManagement bm = new BookManagement();
        Admin admin = new Admin();
        User user = new User();
        Scanner s = new Scanner(System.in);
        menu.AplicationName();
        boolean valid = false;
        boolean exit = false;
        
        while(!exit) {
            menu.LoginMenu();
            System.out.print("Pilih opsi: ");
            int opsi = s.nextInt();
            switch(opsi) {
                case 1:
                    valid = admin.loginValidation();
                    if (valid) {
                        admin.menuInside();
                    }
                    break;
                case 2:
                    valid = user.loginValidation();
                    if (valid) {
                        user.menuInside();
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini!");
                    s.close();
                    exit = true;
                    break;
                default:
                    System.out.println("Opsi tidak valid!");
                }
        }
    }
}
