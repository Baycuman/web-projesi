package com.servlet;

public class Kullanicilar {
    private String username;
    private String password;
public Kullanicilar( String username, String password) {
 
 this.username = username;
 this.password = password;
 
 }
    
    public String getKullanici() {
        return username;
    }

    public void setKullanici(String username) {
        this.username = username;
    }


    public String getSifre() {
        return password;
    }

    public void setSifre(String password) {
        this.password = password;
    }
}
