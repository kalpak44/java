package RMI;
import java.rmi.*;
public interface RMIClient extends Remote{
    public boolean isRegValid(String login) throws RemoteException;
    
}
