

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	
	@Override
	public void destroy() {
		System.out.println("This is destroy method");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("This is init");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		pw.println("<h2>Hello Servlets !</h2><br>");
		
		Date date=new Date();
		pw.println("date and time is :"+date);
	}

}


