package com.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import static java.lang.System.out;

/**
 * 1. Parameter transmission function
 * http://localhost:8080/request-param??username=hello&age=20
 */
@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        out.println("---Select All Parameter start---");

        request.getParameterNames().asIterator().forEachRemaining(
                parameterName -> out.printf("%s = %s%n", parameterName, request.getParameter(parameterName))
        );

        out.println("---Select All Parameter end---");
    }
}
