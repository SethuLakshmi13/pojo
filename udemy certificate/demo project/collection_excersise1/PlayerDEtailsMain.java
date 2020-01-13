package collection_excersise1;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayerDEtailsMain {

	public static void main(String[] args) {
		int count;
		int i;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of players");
		count=scan.nextInt();
		String[] name=new String[count];
		String[] country=new String[count];
		String[] skill=new String[count];
		List<Player> alist=new ArrayList<Player>();
		for(i=0;i<count;i++) {
			System.out.println("Enter the player name: ");
			name[i]=scan.next();
			System.out.println("Enter the country of the player: ");
			country[i]=scan.next();
			System.out.println("Enter the skil of the player: ");
			skill[i]=scan.next();
			alist.add(new Player(name[i],country[i],skill[i]));
		}
		PlayerBO pb=new PlayerBO();
		pb. diplayAllPlayerDetails(alist);
	

	}

}
