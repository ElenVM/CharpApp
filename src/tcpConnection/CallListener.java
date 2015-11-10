package tcpConnection;

import commands.Command;
import commands.NickCommand;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Anna on 09.11.2015.
 */
public class CallListener {
    String nick;
    int port;
    private Connection connection;

    public CallListener(String nick,  int port){
        this.nick=nick;
        this.port=port;

    }
    public Connection getConnection(){
        try {
            ServerSocket ss = new ServerSocket(port);
            Socket socket = ss.accept();
            Connection connection = new Connection(socket);
            connection.sendNickHello(nick);
            Command comand= connection.receive();
            if(comand.getCmdStatus()!=true)
                connection = null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(connection!=null)
            return connection;
        return null;
    }


}
