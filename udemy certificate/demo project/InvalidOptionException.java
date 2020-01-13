
public class InvalidOptionException extends Exception {
	int option;
	public InvalidOptionException(int option) {
		this.option=option;
	}
	public String getMessage() {
		return(option+"is not valid");
	}
	
	
	
}
