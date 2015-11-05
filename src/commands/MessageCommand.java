package commands;

public class MessageCommand implements Command {
	
	String message ;

	
	
	public MessageCommand(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
