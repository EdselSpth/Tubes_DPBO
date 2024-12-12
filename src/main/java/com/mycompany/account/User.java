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
public class User implements IAccount {
    private ArrayList<Account> userList;
    Scanner S = new Scanner(System.in);
    
    public User(){
        userList = new ArrayList<>();
        userList.add(new Account("User123", "User123"));
        userList.add(new Account("Rinitial", "RintialPassword"));
        userList.add(new Account("ZetaZeta", "VestiaZeta"));
    }

    @Override
    public void loginValidation() {
        boolean passwordValidation = false;
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
    public void insideMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}