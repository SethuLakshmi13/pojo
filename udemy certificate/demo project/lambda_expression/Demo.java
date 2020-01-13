package lambda_expression;

public class Demo {

	public static void main(String[] args) {
	
		Operation add=new Operation() {
			public int test(int a, int b) {
				
				return a+b;
			}
			
		};
		int result = add.test(3,4);
		System.out.println(result);
		
		Operation subLambda=(int a,int b)->a-b;
		int res=subLambda.test(9, 7);
		System.out.println(res);
	}

}
