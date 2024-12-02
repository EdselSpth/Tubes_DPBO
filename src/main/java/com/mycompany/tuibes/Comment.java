/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuibes;

/**
 *
 * @author りおん塩田
 */
public class Comment {
    private String comment;
    private String tanggalComment;

    public Comment(String comment, String tanggalComment) {
        this.comment = comment;
        this.tanggalComment = tanggalComment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTanggalComment() {
        return tanggalComment;
    }

    public void setTanggalComment(String tanggalComment) {
        this.tanggalComment = tanggalComment;
    }
    
    
}
