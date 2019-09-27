package gov.hhs.ie.nv.exception.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import gov.hhs.ie.nv.exception.CrudException;
import gov.hhs.ie.nv.exception.DataNotFoundException;
import gov.hhs.ie.nv.exception.DuplicateRecordException;
import gov.hhs.ie.nv.exception.GenericException;
import gov.hhs.ie.nv.exception.InvalidInputException;

@ControllerAdvice
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	private final static Logger LOGGER = LoggerFactory.getLogger(CustomResponseEntityExceptionHandler.class);

	@ExceptionHandler(value = { DataNotFoundException.class })
	protected ResponseEntity<?> handleDataNotFound(DataNotFoundException ex, WebRequest request) {
		LOGGER.error(ex.getMessage(), ex);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@ExceptionHandler(value = { InvalidInputException.class })
	protected ResponseEntity<?> handleInvalidInput(InvalidInputException ex, WebRequest request) {
		LOGGER.error(ex.getMessage(), ex);
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = { DuplicateRecordException.class })
	protected ResponseEntity<?> handleDuplicateRecordException(DuplicateRecordException ex, WebRequest request) {
		LOGGER.error(ex.getMessage(), ex);
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
	}

	@ExceptionHandler(value = { CrudException.class })
	protected ResponseEntity<?> handleCrudException(CrudException ex, WebRequest request) {
		LOGGER.error(ex.getMessage(), ex);
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = { GenericException.class })
	protected ResponseEntity<?> handleGenericException(GenericException ex, WebRequest request) {
		LOGGER.error(ex.getMessage(), ex);
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
