package custom_exceptions;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends Exception {
	public ResourceNotFoundException(String mesg) {
		super(mesg);
	}
}
