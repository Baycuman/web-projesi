/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter(dispatcherTypes = {
 DispatcherType.REQUEST,
 DispatcherType.FORWARD,
 DispatcherType.INCLUDE
 }
 , urlPatterns = { "/admin/*" })
public class LoginFilter implements Filter {
 
/**
 * Default constructor.
 */
 public LoginFilter() {
 // TODO Auto-generated constructor stub
 }
 
/**
 * @see Filter#destroy()
 */
 public void destroy() {
 // TODO Auto-generated method stub
 }
 
/**
 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
 */
 public void doFilter(ServletRequest request, ServletResponse response,
 FilterChain chain) throws IOException, ServletException {
 if (((HttpServletRequest) request).getSession().getAttribute(
 "username") == null) {
 ((HttpServletResponse) response).sendRedirect("login.jsp");
 }
 chain.doFilter(request, response);
 }
 
/**
 * @see Filter#init(FilterConfig)
 */
 public void init(FilterConfig fConfig) throws ServletException {
 // TODO Auto-generated method stub
 }
 
}