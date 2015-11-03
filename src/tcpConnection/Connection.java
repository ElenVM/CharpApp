package tcpConnection;

import javax.swing.AbstractCellEditor;

import commands.AbstractCommand;

public class Connection {

	private CallListener listener;
	private CommandListener clistener;
	
	
	public void sendNickHello(String nick){
		//Ч отослать УChatApp 2015 user uuuuФ;
	}

	public void sendNickBusy(String nick){
		// Ч отослать УChatApp 2015 user uuuu busyФ;
	}

	public void accept(){ 
		//Ч отослать УAccptedФ;
	}

	public void reject(){
		// Ч и т.д. согласно протоколу. 5. sendMessage(Message)
	}

	public void disconnect(){
		
	}

	public AbstractCommand receive(){
		// Ч блокирующее получение вход€щей команды (т.е. с ожиданием)
		return null;
	}

	
}
