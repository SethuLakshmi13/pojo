package inter_face;

import java.util.Scanner;

public class PlayerMain {
	public static void main(String[] args) {

		int choice;
		String name;
		String teamName;
		int noOfMatches;
		int totalRunsScored;
		int noOfWicketsTaken;
		String position;
		int noOfGoals;

		Scanner scan = new Scanner(System.in);
		System.out.println("Menu\n1.Cricket Player Details\n2.Hockey Player Details");
		choice = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter player name");
		name = scan.next();
		System.out.println("Enter team name");
		teamName = scan.next();
		System.out.println("Enter no of matches played");
		noOfMatches = scan.nextInt();
		scan.nextLine();
		
		switch (choice) {
		case 1:
			System.out.println("Enter no of runs scored ");
			totalRunsScored = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter no of wickets taken");
			noOfWicketsTaken = scan.nextInt();
			scan.nextLine();
			CricketPlayer cp = new CricketPlayer(name, teamName, noOfMatches, totalRunsScored, noOfWicketsTaken);
			System.out.println("Player Details");
			System.out.println("Player Name: " + name);
			System.out.println("Team Name: " + teamName);
			System.out.println("Number of matches Played: " + noOfMatches);
			IPlayerStatistics icp = cp;
			icp.displayPlayerStatistics();
			break;
		case 2:
			System.out.println("Enter position");
			position = scan.next();
			scan.nextLine();
			System.out.println("Enter no of goals");
			noOfGoals = scan.nextInt();
			scan.nextLine();
			HockeyPlayer hp = new HockeyPlayer(name, teamName, noOfMatches, position, noOfGoals);
			System.out.println("Player Details");
			System.out.println("Player Name: " + name);
			System.out.println("Team Name: " + teamName);
			System.out.println("Number of matches Played: " + noOfMatches);
			IPlayerStatistics ihp = hp;
			ihp.displayPlayerStatistics();
			break;
		
		}

	}

}
