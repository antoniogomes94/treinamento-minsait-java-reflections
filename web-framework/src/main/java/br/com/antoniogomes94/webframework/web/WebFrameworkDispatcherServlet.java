package br.com.antoniogomes94.webframework.web;

import br.com.antoniogomes94.webframework.util.WebFrameworkLogger;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class WebFrameworkDispatcherServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //ignorar o favIcon:
        if(req.getRequestURL().toString().endsWith("/favicon.ico"))
            return;

        String url = req.getRequestURL().toString();
        String httpMethod = req.getMethod().toUpperCase(); //GET POST

        WebFrameworkLogger.log("WebFrameworkDispatcherServlet", "URL: " + url + "(" + httpMethod + ")");
    }
}
