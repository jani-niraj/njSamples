package gov.hhs.ie.nv.exception;

public class GenericException extends RuntimeException {

	private static final long serialVersionUID = -7631703049779296845L;

	public GenericException(final Exception exception) {
		super(exception);
	}

	public GenericException(final String message, final Exception exception) {
		super(message, exception);
	}

	public GenericException(final Throwable t) {
		super(t);
	}

}
