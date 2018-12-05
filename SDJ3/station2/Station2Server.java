package station2;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


public class Station2Server extends Station2 {

	public Station2Server() {};
	public static void main(String[] args) {
		try { 
	         // Instantiating the implementation class 
	         Station2 obj = new Station2(); 
	    
	         // Exporting the object of implementation class  
	         // (here we are exporting the remote object to the stub) 
	         IStation2 stub = (IStation2) UnicastRemoteObject.exportObject(obj, 0);  
	         
	         // Binding the remote object (stub) in the registry 
	         Registry registry = LocateRegistry.getRegistry(); 
	         
	         registry.bind("Station2", stub);  
	         System.err.println("Server ready"); 
	      } catch (Exception e) { 
	         System.err.println("Server exception: " + e.toString()); 
	         e.printStackTrace(); 
	      } 
	}

}
