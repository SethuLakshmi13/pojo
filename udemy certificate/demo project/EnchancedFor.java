
public class EnchancedFor {

	public static void main(String[] args) {
		int[][] a= {{1,3},{5,7},{8,9}};
		for(int[] m:a) {
			for(int b:m) {
				System.out.println(b);
			}
		}

	}

}
