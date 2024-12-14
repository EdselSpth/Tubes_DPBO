/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sistem;

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
        menu.LoginMenu();

        System.out.print("Pilih opsi: ");
        int opsi = s.nextInt();
        s.nextLine();

        try {
            switch (opsi) {
                case 1:
                    admin.loginValidation();
                    admin.menuInside();
                    break;
                case 2:
                    user.loginValidation();
                    user.menuInside();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini!");
                    s.close();
                    return;
                default:
                    System.out.println("Opsi tidak valid!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
