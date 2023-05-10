package com.servlet.web.servlet;

import com.servlet.domain.member.Member;
import com.servlet.domain.member.MemberRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "memberSaveServlet", urlPatterns = "/servlet/members/save")
public class MemberSaveServlet extends HttpServlet {
    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MemberSaveServlet.service");
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter writer = response.getWriter();

        writer.write("""
                <html>
                <head>
                <meta charset="UTF-8">
                </head>
                <body>
                성공
                <ul>
                <li>id="%s"</li>
                <li>username="%s"</li>
                <li>age="%s"</li>
                </ul>
                <a href="/index.html">메인</a>
                </body>
                </html>
                """.formatted(member.getId(), member.getUsername(), member.getAge()));
    }
}
