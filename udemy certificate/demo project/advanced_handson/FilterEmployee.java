package advanced_handson;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEmployee {

	public static void main(String[] args) {
		List <Employee> employee =new ArrayList<Employee>();
		Employee employee1 = new Employee(1, "John", 25, 100000); 
		Employee employee2 = new Employee(2, "Jack", 22, 90000); 
		Employee employee3 = new Employee(3, "Laura", 38, 1200000); 
		Employee employee4 = new Employee(4, "Smith", 28, 90000); 
		employee.add(employee1);
		employee.add(employee2);
		employee.add(employee3);
		employee.add(employee4);
		
		List <Employee> filtered;
		
		long sum;
		
		filtered=employee.stream().filter(emp-> emp.getAge()<30).collect(Collectors.toList());
		filtered.stream().forEach(emp->System.out.println(emp));
		sum=employee.stream().mapToLong(Employee::getSalary).sum();
		System.out.println(sum);
		String date="28/08/2019";
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dateformat= LocalDate.parse(date,format);
		System.out.println(dateformat);
		
		LocalDateTime dateTime = LocalDateTime.of(2019, Month.AUGUST, 28, 18, 05, 0);
		LocalDateTime dateTime2 = LocalDateTime.now();
	   
	     Duration diffInSeconds = Duration.between(dateTime, dateTime2);
	     if(diffInSeconds.getSeconds() >60 &&diffInSeconds.toMinutes()<0 && diffInSeconds.toHours()<0) {
	    	 System.out.println("Duration of post : few seconds ago");
	     }else if(diffInSeconds.getSeconds() >60 &&diffInSeconds.toMinutes()>0 && diffInSeconds.toHours()<0) {
	    	 System.out.println("Duration of post : few minutes ago");
	     }else {
	    	 System.out.println("Duration of post : few hours ago");
	     }
	 
	}
}
