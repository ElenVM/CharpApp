package tcpConnection;

import javax.swing.AbstractCellEditor;

import commands.AbstractCommand;

public class Connection {

	private CallListener listener;
	private CommandListener clistener;
	
	
	public void sendNickHello(String nick){
		//� �������� �ChatApp 2015 user uuuu�;
	}

	public void sendNickBusy(String nick){
		// � �������� �ChatApp 2015 user uuuu busy�;
	}

	public void accept(){ 
		//� �������� �Accpted�;
	}

	public void reject(){
		// � � �.�. �������� ���������. 5. sendMessage(Message)
	}

	public void disconnect(){
		
	}

	public AbstractCommand receive(){
		// � ����������� ��������� �������� ������� (�.�. � ���������)
		return null;
	}

	
}
