package collection_excersise1;

public class Player {

	private String name;
	private String country;
	private String skill;

	public Player(String name, String country, String skill) {
		this.name = name;
		this.country = country;
		this.skill = skill;
	}

	public String toString() {
		return String.format("%-15s%-15s%-15s", name, country, skill);
	}

}
