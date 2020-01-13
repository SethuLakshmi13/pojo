package model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SignUpFormHandlerServlet")
public class SignUpFormHandlerServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PersonalInfo user=new PersonalInfo("","",false);
		HttpSession session=request.getSession();
		session.setAttribute("user",user);
		RequestDispatcher rd=request.getRequestDispatcher("personal-info.jsp");
		rd.forward(request, response);
	}
	

}
