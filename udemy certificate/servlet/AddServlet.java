

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String num1=request.getParameter("num1");
		String num2=request.getParameter("num2");
		
		int number1= Integer.parseInt(num1);
		int number2= Integer.parseInt(num1);
		int sum=number1+number2;
		
		RequestDispatcher rd=request.getRequestDispatcher("DisplayOutput.jsp");
		request.setAttribute("number1", num1);
		request.setAttribute("number2", num2);
		request.setAttribute("result", sum);
		rd.forward(request,response);
		//response.sendRedirect("OutputServlet");
	}

	

	

}
