package station2;

import java.rmi.Remote;

import station1.Car;
import station1.Part;

public interface IStation2 extends Remote {

	
	 // maybe should return a Part but we will just create parts and add in the ArrayList of part in cars
	public void carParts(Car car);
	
	// next we will add them in the database
	public void registerParts(Part part);
	
	// create a new pallet and add the part on it, store it in the database
	public void loadPallet(Pallet pallet);
	
}
