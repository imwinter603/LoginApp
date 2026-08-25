<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    // ពិនិត្យមើលថា User បាន Login ហើយឬនៅ (Security Check)
    String username = (String) session.getAttribute("user");
    if (username == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
</head>
<body>
    <div align="center">
        <h2>Welcome to Admin Dashboard, <%= username %>!</h2>
        <p>អ្នកបានចូលប្រព័ន្ធដោយជោគជ័យ។</p>
        <br>
        <a href="LogoutServlet"><button type="button">Logout</button></a>
    </div>
</body>
</html>