package commands;

public class AcceptRejectCommand implements Command {
	String type;

	@Override
	public String getCmdText() {
		return type;
	}

	@Override
	public void setCmdText(String text) {
		type = text;
	}

	@Override
	public String getCmdClass() {
		return "AcceptRejectCommand";
	}

	@Override
	public boolean getCmdStatus() {
		return false;
	}

	@Override
	public void setCmdStatus(boolean status) {

	}
}
