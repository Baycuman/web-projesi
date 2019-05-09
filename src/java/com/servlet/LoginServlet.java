/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
 

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
 
 @Override
 protected void doGet(HttpServletRequest req, HttpServletResponse resp)
 throws ServletException, IOException {
 doPost(req, resp);
 }
 @Override
 protected void doPost(HttpServletRequest req, HttpServletResponse resp)
 throws ServletException, IOException {
 String username=req.getParameter("username");
 String password=req.getParameter("password");
 Kullanicilar k=new KullaniciDao().getirKullanici(username, password);
 
 if(k!=null){
 req.getSession().setAttribute("username", k);
 resp.sendRedirect("index.jsp");
 }
 else{
 req.getRequestDispatcher("login.jsp").forward(req, resp);
 
 }
 }
 
}