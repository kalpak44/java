package RMI;

import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String... args) throws RemoteException, AlreadyBoundException{
        RMIServer rmi = new RMIServer();
        Registry reg = LocateRegistry.createRegistry(3128);        
        reg.bind("RMI_ID", rmi);
        System.out.println("Start Server.");
        
    }
}
