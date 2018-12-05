package station3;

import java.rmi.Remote;


public interface IStation3 extends Remote {

	void registerProduct(Product product);
	
}
