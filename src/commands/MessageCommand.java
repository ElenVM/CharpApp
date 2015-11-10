package commands;

public class MessageCommand implements Command {
	
	String message ;

	@Override
	public String getCmdText() {
		return message;
	}

	@Override
	public void setCmdText(String text) {
		message= text;
	}

	@Override
	public String getCmdClass() {
		return "MessageClass";
	}

	@Override
	public boolean getCmdStatus() {
		return false;
	}

	@Override
	public void setCmdStatus(boolean status) {

	}
}
