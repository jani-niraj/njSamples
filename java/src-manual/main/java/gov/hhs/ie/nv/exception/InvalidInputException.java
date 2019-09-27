package gov.hhs.ie.nv.exception;

@SuppressWarnings("serial")
public class InvalidInputException extends RuntimeException {

	public InvalidInputException() {
		super("Invalid Input Is Provided");
	}

	public InvalidInputException(Exception exception) {
		super(exception);
	}

	public InvalidInputException(String message, Exception exception) {
		super(message, exception);
	}

}
