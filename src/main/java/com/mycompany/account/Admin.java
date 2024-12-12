/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.account;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author りおん塩田
 */
public class Admin implements IAccount {
    private ArrayList<Account> adminList;
    Scanner S = new Scanner(System.in);
    
    public Admin(){
        adminList = new ArrayList<>();
        adminList.add(new Account("Admin123", "Admin"));
        adminList.add(new Account("EdselSpth", "Edsel@S3pta"));
        adminList.add(new Account("Kobo1212", "Kobo123"));
    }

    @Override
    public void loginValidation() {
        boolean passwordValidation = false;
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
    
    public void menuInside(){
        
    }
    
    
}

