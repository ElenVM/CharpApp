package tcpConnection;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observer;

public class CallListenerThread extends Thread {
    String nick;
    boolean status;
    int port;
    String ip;
    public  Observer observer;

    public CallListenerThread(String nick, int port, String ip){
        this.nick=nick;
        this.ip=ip;
        this.port=port;

    }

    public void addConnectionObserver(Observer observer){
        this.observer = observer;
    }
    public void removeConnectionObserver(){
        this.observer = null;
    }

    public  void run(){
        while(true) {
            CallListener callListener = new CallListener(nick,port);
            Connection connection = callListener.getConnection();
            if(connection!=null)
                observer.update(null,connection);
        }
    }
}

