import java.util.*;

public class ListEmployee {
	public static void main(String[] args) {

		String name;
		int id;

		List list = new ArrayList();
		Employee employee1 = new Employee(101, "raj");
		Employee employee2 = new Employee(102, "anu");
		list.add(employee1);
		list.add(employee2);
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Employee emp = (Employee) itr.next();
			System.out.println(emp.id);
			System.out.println(emp.name);
		}

	}
}
