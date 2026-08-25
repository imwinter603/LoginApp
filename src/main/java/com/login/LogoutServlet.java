package com.login;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // លុប Session ចោល
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        
        // ត្រឡប់ទៅទំព័រ Login វិញ
        response.sendRedirect("login.jsp");
    }
}
