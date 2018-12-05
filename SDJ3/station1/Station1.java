package station1;
import java.rmi.RemoteException;

public class Station1 implements IStation1 {

	// this function will allow us to register and weight the car and add it in the database
	@Override
	public void RegisterCarANDWeight(String ChassisNbr, String Model, double CarWeight) throws RemoteException { 
		Car car = new Car(ChassisNbr, Model, CarWeight);
		// do something between CarDB and the database to store it
		
	}

}
