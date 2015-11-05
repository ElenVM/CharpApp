package commands;

public class NickCommand implements Command {
	String nick;
	boolean busy;
	
	
	
	public NickCommand(String nick, boolean busy) {
		super();
		this.nick = nick;
		this.busy = busy;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public boolean isBusy() {
		return busy;
	}
	public void setBusy(boolean busy) {
		this.busy = busy;
	}

}
