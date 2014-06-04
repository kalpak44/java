package RMI;

import java.net.*;
import java.io.*;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer extends UnicastRemoteObject implements RMIClient{
    
    public RMIServer() throws RemoteException{
        super();
    }

    @Override
    public boolean isRegValid(String login) throws RemoteException {
        if(login.equals("test")){
            return true;
        }else{
            return false;
        }
    }
}
