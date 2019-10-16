package com.phoenix.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
public String un ="";
public String pw ="";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	 	 un = request.getParameter("username");
         pw = request.getParameter("password");

        if (un.equals("admin") && pw.equals("admin")) {
            response.sendRedirect("Success.html");
            return;
        } else {
            response.sendRedirect("error.html");
            return;
}

}

	public String Test(String username, String password) {
		if (un.equals(username) && pw.equals(password)) {
			return "success";
		}
		else {
			return "failure";
		}
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}
}

