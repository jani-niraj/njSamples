package gov.hhs.ie.nv.exception;

@SuppressWarnings("serial")
public class DuplicateRecordException extends RuntimeException {

	public DuplicateRecordException() {
		super("Duplicate record found...");
	}

	public DuplicateRecordException(Exception exception) {
		super(exception);
	}

	public DuplicateRecordException(String message, Exception exception) {
		super(message, exception);
	}

}
