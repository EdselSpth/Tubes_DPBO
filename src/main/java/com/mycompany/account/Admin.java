/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.account;
import java.util.ArrayList;
import java.util.Scanner;

import com.mycompany.sistem.Menu;
/**
 *
 * @author りおん塩田
 */
public class Admin implements IAccount {
    Menu menu = new Menu();
    private ArrayList<Account> adminList;
    Scanner S = new Scanner(System.in);
    boolean passwordValidation = false;
    
    public Admin(){
        adminList = new ArrayList<>();
        adminList.add(new Account("Admin123", "Admin"));
        adminList.add(new Account("EdselSpth", "Edsel@S3pta"));
        adminList.add(new Account("Kobo1212", "Kobo123"));
    }

    @Override
    public void loginValidation() {
        System.out.print("> Username : ");
        String username = S.nextLine();
        System.out.print("> Password : ");
        String password = S.nextLine();
        for (int i = 0; i < adminList.size(); i++){
            if (username.equals(adminList.get(i).getUsername()) && password.equals(adminList.get(i).getPassword())){
                passwordValidation = true;
            }
        }
    }
    
    @Override
    public void menuInside(){
        int pilihan = 999;
        try {
            if (passwordValidation){
                while (pilihan != 0){
                    menu.menuAdmin();
                    System.out.print("Pilih Menu : ");
                    pilihan = S.nextInt();
                    switch(pilihan){
                        case 1:
                            
                        case 2:
                    
                        case 3:
                    
                        default:
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
