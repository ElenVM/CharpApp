package commands;

public class AcceptRejectCommand implements AbstractCommand {
	String type;

	public AcceptRejectCommand(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
