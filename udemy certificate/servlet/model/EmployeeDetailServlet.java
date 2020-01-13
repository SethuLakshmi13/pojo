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

@WebServlet("/EmployeeDetailServlet")
public class EmployeeDetailServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String id=request.getParameter("id");
		String name=request.getParameter("firstname");
		String gender=request.getParameter("gender");
		String dob=request.getParameter("dob");
		String fullTime=request.getParameter("fulltime");
		String department=request.getParameter("dept");
		String salary=request.getParameter("salary");
		long employeeId=Long.parseLong(id);
		long employeeSalary=Long.parseLong(salary);
		Employee emp=null;
		SimpleDateFormat formater=new SimpleDateFormat(" MMM dd, yyyy");
		try {
			 emp=new Employee(employeeId,name,gender,formater.parse(dob),fullTime,department,employeeSalary);
		} catch (ParseException exp) {
			// TODO Auto-generated catch block
			exp.printStackTrace();
		}
		RequestDispatcher rd=request.getRequestDispatcher("display-details.jsp");
		request.setAttribute("emp", emp);
		rd.forward(request,response);
	}

	

}
