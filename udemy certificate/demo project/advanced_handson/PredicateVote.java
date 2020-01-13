package advanced_handson;

import java.util.function.Predicate;

public class PredicateVote {

	public static void main(String[] args) {
		Predicate<Integer> predicate=age->age>=18;
		eval(predicate);
		
	}
	public static void eval (Predicate<Integer> predicate) {
		if(predicate.test(20)) {
			System.out.println("can vote");
			
		}
		else {
			System.out.println("not eligible");
		}
	}


}
