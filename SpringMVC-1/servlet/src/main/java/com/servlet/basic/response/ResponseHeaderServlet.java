package com.servlet.basic.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;

import java.io.IOException;

@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //status-line
        response.setStatus(HttpServletResponse.SC_OK); //-> 200

        //response-header
        response.setHeader("Content-Type", "text/plain;charset=utf-8");
        //conveniently
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");

        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("my-header","hello");

        response.setContentLength(2); //Automatically created if omitted

        //cookie
        Cookie cookie = new Cookie("createCookie", "cookieValueExample");
        cookie.setMaxAge(600);
        response.addCookie(cookie);

        //redirect - code: 302 / url: /basic/hello-form.html
        response.setStatus(HttpServletResponse.SC_FOUND);
        response.setHeader("Location", "/basic/hello-form.html");
        //in one line ->
        response.sendRedirect("/basic/hello-form.html");

        response.getWriter().write("ok");
    }
}
