package com.song.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: songlijun
 * @Date: 2020/6/5
 * @Description: ${PACKAGE_NAME}
 * @version: 1.0
 */
//@WebServlet(name = "SecondServlet",urlPatterns = "/second")
public class SecondServletServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("secondServlet -----get ");
    }
}
