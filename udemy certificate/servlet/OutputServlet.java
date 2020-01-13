

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OutputServlet
 */
@WebServlet("/OutputServlet")
public class OutputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String n1=(String)request.getAttribute("number1");
		String n2=(String)request.getAttribute("number2");
		Integer result=(Integer)request.getAttribute("result");
		pw.println("the sum of "+n1+" and "+n2+" is "+result);
	}

}
