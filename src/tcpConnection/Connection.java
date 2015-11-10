package tcpConnection;

import commands.Command;
import commands.NickCommand;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Connection {

	Socket socket;
	public Connection(){
		socket = new Socket();
	}
	public Connection(String ip, int port){
		try {
			socket = new Socket(ip,port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public Connection(Socket socket){
		this.socket = socket;
	}

	public void sendNickHello(String nick){
		try {
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			out.writeUTF("ChatApp 2015 user " + nick);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sendNickBusy(String nick){
		try {
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			out.writeUTF("ChatApp 2015 user " + nick + " busy");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Ч отослать УChatApp 2015 user uuuu busyФ;
	}

	public void accept(){
		try {
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			out.writeUTF("Accepted");
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Ч отослать УAccptedФ;
	}

	public void reject(){
		try {
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			out.writeUTF("Reject");
		} catch (IOException e) {
			e.printStackTrace();
		}
		disconnect();
		// Ч и т.д. согласно протоколу. 5. sendMessage(Message)
	}

	public void disconnect(){
		try {
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			out.writeUTF("Disconnect");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Command receive(){
	//	Command command;
		try{
			DataInputStream in = new DataInputStream(socket.getInputStream());
			String string = in.readUTF();
	//		command = new NickCommand(string,true);
		}catch (IOException e){
			e.printStackTrace();
		}
		return null;
	}

	
}
