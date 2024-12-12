/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.account;
import java.util.ArrayList;

/**
 *
 * @author りおん塩田
 */
public class Admin implements IAccount {
    private ArrayList<Account> adminList;
    
    public Admin(){
        adminList = new ArrayList<>();
        adminList.add(new Account("Admin123", "Admin"));
        adminList.add(new Account("EdselSpth", "Edsel@S3pta"));
        adminList.add(new Account("Kobo1212", "Kobo123"));
    }

    @Override
    public void login() {
        
    }
    
    
}

