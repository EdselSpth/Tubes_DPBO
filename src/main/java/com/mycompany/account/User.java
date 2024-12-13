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
public class User implements IAccount {
    private ArrayList<Account> userList;
    Scanner S = new Scanner(System.in);
    Menu menu = new Menu();
    boolean passwordValidation = false;
    
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
                menu.menuUser();
                System.out.print("Pilih Menu : ");
                int pilihan = S.nextInt();
                switch(pilihan){
                    case 1:
                        menu.FormatBukuPrint();
                        
                    case 2:
                    
                    case 3:
                    
                    default:
                }
            } else {
                throw new Exception("Username atau Password Salah");
            }
            
        } catch (Exception ex) {
            ex.getMessage();
        }
        
    }
}