package model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/PreferenceHandlerServlet")
public class PreferenceHandlerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		PersonalInfo user=(PersonalInfo)session.getAttribute("user");
		String preference=request.getParameter("preference");
		if(preference==null) {
			user.setPreference(false);
		}
		else {
			user.setPreference(true);
		}
		session.setAttribute("user", user);
		RequestDispatcher rd=request.getRequestDispatcher("personal-info.jsp");
		rd.forward(request,response);
	}

}
