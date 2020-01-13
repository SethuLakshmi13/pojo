package inter_face;

public class HockeyPlayer extends Player implements IPlayerStatistics {

	private String position;
	private int noOfGoals;

	public HockeyPlayer(String name, String teamName, int noOfMatches, String position, int noOfGoals) {
		super(name, teamName, noOfMatches);
		this.position = position;
		this.noOfGoals = noOfGoals;

	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getNoOfGoals() {
		return noOfGoals;
	}

	public void setNoOfGoals(int noOfGoals) {
		this.noOfGoals = noOfGoals;
	}

	public void displayPlayerStatistics() {
		System.out.println("Total Runs Scored " + getPosition());
		System.out.println("No of Goals " + getNoOfGoals());

	}

}
