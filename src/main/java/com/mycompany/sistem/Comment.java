/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem;

/**
 *
 * @author りおん塩田
 */
public class Comment {
    private String Account;
    private String Comment;

    public Comment(String Account, String Comment) {
        this.Account = Account;
        this.Comment = Comment;
    }

    
    public String getAccount() {
        return Account;
    }

    public void setAccount(String Account) {
        this.Account = Account;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }
    
    
}
