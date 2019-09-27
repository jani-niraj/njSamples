package gov.hhs.ie.nv.exception;

@SuppressWarnings("serial")
public class DataNotFoundException extends RuntimeException {

	public DataNotFoundException(Exception exception) {
		super(exception);
	}

	public DataNotFoundException() {
		super("No data found...");
	}

	public DataNotFoundException(String message, Exception e) {
		super(message, e);
	}
}
