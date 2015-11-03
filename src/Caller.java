
import java.lang.annotation.Retention;

import tcpConnection.Connection;

public class Caller {
	String mynick;//Ник локального юзера.

	String ipadress;//Адрес и 
	int port; //порт удаленного юзера.

	String nickToCall;//Ник удаленного юзера.

	String error; //Тип последней произошедшей ошибки (“не дозвонился”, “занято”

	public Caller(String mynick, String ipadress, int port, String nickToCall) {
		super();
		this.mynick = mynick;
		this.ipadress = ipadress;
		this.port = port;
		this.nickToCall = nickToCall;
		
	}

	public String getMynick() {
		return mynick;
	}

	public void setMynick(String mynick) {
		this.mynick = mynick;
	}

	public String getIpadress() {
		return ipadress;
	}

	public void setIpadress(String ipadress) {
		this.ipadress = ipadress;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getNickToCall() {
		return nickToCall;
	}

	public void setNickToCall(String nickToCall) {
		this.nickToCall = nickToCall;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Connection call(){
		return null;
		
	}
}
