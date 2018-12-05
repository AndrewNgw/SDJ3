package station1;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface IStation1 extends Remote {

	// this function will allow us to register and weight the car and add it in the database
	public void RegisterCarANDWeight(String ChassisNbr, String Model, double CarWeight) throws RemoteException;
	
}
