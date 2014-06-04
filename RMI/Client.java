package RMI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author kalpak44
 */
public class Client {
    public static void main(String[] args) throws IOException, RemoteException, NotBoundException {
        Registry reg = LocateRegistry.getRegistry("localhost", 3128);
        RMIClient tRem = (RMIClient)reg.lookup("RMI_ID");
        System.out.println(tRem.isRegValid("ku"));
        System.out.println(tRem.isRegValid("test"));
        
       
   }
}