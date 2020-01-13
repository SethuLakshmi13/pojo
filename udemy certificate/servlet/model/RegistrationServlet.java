
package model;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static List<Registration>datalist;
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
    	
    	String firstName=request.getParameter("firstname");
    	String lastName=request.getParameter("lastname");
    	String date=request.getParameter("date");
    	/*SimpleDateFormat format=new SimpleDateFormat();
    	try {
			Date birthdate=format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	String gender=request.getParameter("gender");
    	String age=request.getParameter("age");
    	String email=request.getParameter("mail");
    	String number=request.getParameter("phoneno");
    	String address=request.getParameter("address");
    	String country=request.getParameter("Country");
    	String[] hobbies=request.getParameterValues("hobby");
    	
    	StringBuilder  str = new StringBuilder();
    	for(int i=0;i<hobbies.length;i++ ){
    		str.append(hobbies[i]+" ");
    	}
    	String hobbys=str.toString();
    	int ages=Integer.parseInt(age);
    	datalist.add(new Registration (firstName,lastName,date,gender,ages,email,number,address,country,hobbys));
    	RequestDispatcher rd=request.getRequestDispatcher("Registration.jsp");
    	request.setAttribute("datalist", datalist);
    	rd.forward(request,response);
    	}

	@Override
	public void init() throws ServletException {
		datalist=new ArrayList<Registration>();
	}


	
}
