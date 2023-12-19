package com.web_app_5.contoller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web_app_5.model.DAOServiceImp;

@WebServlet("/loginVerification")
public class LoginVerification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginVerification() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("email");
		String password = request.getParameter("password");
		
		DAOServiceImp dao=new DAOServiceImp();
		boolean con = dao.connection();
		
		boolean loginVerify = dao.loginVerify(username, password);
		
		request.setAttribute("connection", String.valueOf(con));
		request.setAttribute("verify", String.valueOf(loginVerify));
		
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		rd.forward(request, response);
	}

}
