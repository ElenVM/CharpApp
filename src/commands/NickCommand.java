package commands;

public class NickCommand implements Command {
	String nick;
	boolean busy;

	@Override
	public String getCmdText() {
		return nick;
	}

	@Override
	public void setCmdText(String text) {
		nick = text;
	}

	@Override
	public String getCmdClass() {
		return "NickCommand";
	}

	@Override
	public boolean getCmdStatus() {
		return busy;
	}

	@Override
	public void setCmdStatus(boolean status) {
		busy=status;
	}
}
