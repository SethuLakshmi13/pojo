package polymorphism;

public class MembershipCard extends Card {

	protected int integerRating;

	public MembershipCard(String holderName, String cardNumber, String expiryDate, int integerRating) {
		super(holderName, cardNumber, expiryDate);
		this.integerRating = integerRating;

	}

	public int getIntegerRating() {
		return integerRating;
	}

	public void setIntegerRating(int integerRating) {
		this.integerRating = integerRating;
	}

}
