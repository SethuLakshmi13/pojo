package inter_face;

public class CricketPlayer extends Player implements IPlayerStatistics {

	private int totalRunsScored;
	private int noOfWicketsTaken;

	public CricketPlayer(String name, String teamName, int noOfMatches, int totalRunsScored, int noOfWicketsTaken) {
		super(name, teamName, noOfMatches);
		this.totalRunsScored = totalRunsScored;
		this.noOfWicketsTaken = noOfWicketsTaken;
	}

	public int getNoOfWicketsTaken() {
		return noOfWicketsTaken;
	}

	public void setNoOfWicketsTaken(int noOfWicketsTaken) {
		this.noOfWicketsTaken = noOfWicketsTaken;
	}

	public int getTotalRunsScored() {
		return totalRunsScored;
	}

	public void setTotalRunsScored(int totalRunsScored) {
		this.totalRunsScored = totalRunsScored;
	}

	public void displayPlayerStatistics() {
		System.out.println("Total Runs Scored " + getTotalRunsScored());
		System.out.println("No of Wickets Taken" + getNoOfWicketsTaken());

	}

}
