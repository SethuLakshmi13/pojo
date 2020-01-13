package advanced_handson;

public class LambdaMain {

	public static void main(String[] args) {
		
		LambdaDemo lamda=(double farenhit)->((farenhit-32)*5/9);
		double farenhits=lamda.toCelsius(98.4);
		System.out.println(farenhits);
		
		double res=LambdaClass.toCelsius(100.00);
		System.out.println(res);
		
		
		Vote lambda=(int age)->(age>18);
		boolean tovote=lambda.toVote(70);
		if(tovote==true) {
			System.out.println("can vote");
		}
		else {
			System.out.println("not eligible");
		}
		
	}
}
