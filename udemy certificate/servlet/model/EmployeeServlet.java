package model;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
    	SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
    	Employee e = null;
		try {
			e = new Employee(800341L,"abi","male",format.parse("13/09/1997"),"fullTime","IT department",20000);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		String [] arr= {"Information Technology","ECE","EEE","Bio-Tech"};
    	RequestDispatcher rd=request.getRequestDispatcher("edit-employee.jsp");
    	request.setAttribute("e", e);
    	request.setAttribute("arr", arr);
    	rd.forward(request,response);
	}

}
