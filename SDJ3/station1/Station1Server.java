package station1;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Station1Server extends Station1{

	public Station1Server() {};
	public static void main(String[] args) {
		try { 
	         // Instantiating the implementation class 
	         Station1 obj = new Station1(); 
	    
	         // Exporting the object of implementation class  
	         // (here we are exporting the remote object to the stub) 
	         IStation1 stub = (IStation1) UnicastRemoteObject.exportObject(obj, 0);  
	         
	         // Binding the remote object (stub) in the registry 
	         Registry registry = LocateRegistry.getRegistry(); 
	         
	         registry.bind("Station1", stub);  
	         System.err.println("Server ready"); 
	      } catch (Exception e) { 
	         System.err.println("Server exception: " + e.toString()); 
	         e.printStackTrace(); 
	      } 
	   } 

	}
