package gov.hhs.ie.nv.exception;

public class CrudException extends RuntimeException {

	private static final long serialVersionUID = -8330695550890279792L;

	public CrudException() {
		super("Unable to perform CRUD Operation");
	}
	
	public CrudException(final Exception exception) {
		super(exception.getMessage(), exception);
	}

	public CrudException(final String message, final Exception exception) {
		super(message, exception);
	}

}
