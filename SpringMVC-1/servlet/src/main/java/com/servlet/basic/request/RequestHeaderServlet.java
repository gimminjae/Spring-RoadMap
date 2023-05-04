package com.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import static java.lang.System.out;

@WebServlet(name = "requestHeaderServlet", urlPatterns = "/request-header")
public class RequestHeaderServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        printStartLine(request); //startLine of request
        printHeader(request); //header of request
        printHeaderConveniently(request); //header of request conveniently
    }

    private void printHeaderConveniently(HttpServletRequest request) {
        out.println("-----Request Header conveniently start-----");

        out.printf("host : %s%n", request.getServerName());
        out.printf("port : %s%n", request.getServerPort());

        out.println("---Accept-Language---");
        request.getLocales().asIterator().forEachRemaining(
                locale -> out.println("locale = " +locale)
        );
        out.println("request.getLocale() = " + request.getLocale());

        out.println("---cookie---");
        if (request.getCookies() != null) {
            for (Cookie cookie : request.getCookies()) {
                out.println(cookie.getName() + ": " + cookie.getValue());
            }
        }

        out.println("---content---");
        out.printf("ContentType : %s%n", request.getContentType());
        out.printf("ContentLength : %s%n", request.getContentLength());
        out.printf("CharacterEncoding : %s%n", request.getCharacterEncoding());

        out.println("-----Request Header conveniently end-----");

        /**
         * -----Request Header conveniently start-----
         * host : localhost
         * port : 8080
         * ---Accept-Language---
         * locale = ko_KR
         * locale = ko
         * locale = en_US
         * locale = en
         * request.getLocale() = ko_KR
         * ---cookie---
         * ---content---
         * ContentType : null
         * ContentLength : -1
         * CharacterEncoding : UTF-8
         * -----Request Header conveniently end-----
         */
    }

    private void printHeader(HttpServletRequest request) {
        out.println("-----Request Header start-----");

        request.getHeaderNames().asIterator().forEachRemaining(
                headerName -> out.printf("%s : %s%n", headerName, request.getHeader(headerName))
        );

        out.println("-----Request Header end-----");

        /**
         * -----Request Header start-----
         * host : localhost:8080
         * connection : keep-alive
         * cache-control : max-age=0
         * sec-ch-ua : "Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99"
         * sec-ch-ua-mobile : ?0
         * sec-ch-ua-platform : "macOS"
         * upgrade-insecure-requests : 1
         * user-agent : Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36
         * sec-fetch-site : none
         * sec-fetch-mode : navigate
         * sec-fetch-user : ?1
         * sec-fetch-dest : document
         * accept-encoding : gzip, deflate, br
         * accept-language : ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7
         * -----Request Header end-----
         */
    }

    private void printStartLine(HttpServletRequest request) {
        out.println("-----Request StartLine start-----");

        out.printf("Method : %s%n", request.getMethod());
        out.printf("Protocol : %s%n", request.getProtocol());
        out.printf("Scheme : %s%n", request.getScheme());
        out.printf("RequestUrl : %s%n", request.getRequestURL());
        out.printf("QueryString : %s%n", request.getQueryString());
        out.printf("Secure : %s%n", request.isSecure());

        out.println("-----Request StartLine end -----");

        /**
         * input url : http://localhost:8080/request-header?username=kim
         *
         * -----Request StartLine start-----
         * Method : GET
         * Protocol : HTTP/1.1
         * Scheme : http
         * RequestUrl : http://localhost:8080/request-header
         * QueryString : username=kim
         * Secure : false
         * -----Request StartLine end -----
         */
    }
}
