package station3;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;



public class Station3Server extends Station3 {
	public Station3Server() {};
	public static void main(String[] args) {
		try { 
	         // Instantiating the implementation class 
	         Station3 obj = new Station3(); 
	    
	         // Exporting the object of implementation class  
	         // (here we are exporting the remote object to the stub) 
	         IStation3 stub = (IStation3) UnicastRemoteObject.exportObject(obj, 0);  
	         
	         // Binding the remote object (stub) in the registry 
	         Registry registry = LocateRegistry.getRegistry(); 
	         
	         registry.bind("Station3", stub);  
	         System.err.println("Server ready"); 
	      } catch (Exception e) { 
	         System.err.println("Server exception: " + e.toString()); 
	         e.printStackTrace(); 
	      } 
	}
}
