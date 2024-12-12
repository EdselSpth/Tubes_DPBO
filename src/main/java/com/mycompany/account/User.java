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
    public void login() {
        System.out.print("> Username : ");
        String username = S.nextLine();
        System.out.print("> Password : ");
        String password = S.nextLine();
        for (int i = 0; i < userList.size(); i++){
            try {
                if (username.equals(userList.get(i).getUsername()) && password.equals(userList.get(i).getPassword())){
                    
                } else {
                    throw new Exception("Username atau Password yang anda masukkan salah");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}