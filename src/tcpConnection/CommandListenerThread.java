package tcpConnection;

import commands.Command;

import java.util.Observer;

/**
 * Created by Anna on 09.11.2015.
 */
public class CommandListenerThread extends Thread{

    Connection connection;
    Command lastCommand;
    Observer observer;
    public  CommandListenerThread(Connection connection){
        this.connection = connection;
    }


    public void addCommandObserver(Observer observer){
        this.observer = observer;
    }
    public void removeCommandObserver(){
        this.observer = null;
    }

    public void run(){
        while(true){
            Command message = connection.receive();
            observer.update(null,message.getCmdText());//уведомл€ем пользоватнл€ о полученном письме
        }
    }

}
