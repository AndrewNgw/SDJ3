package station1;
import java.io.Serializable;
import java.util.ArrayList;

public class Car implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8036720381704870307L;
	private String ChassisNumber; // chassis number
	private String Model; // model of the car
	private double CarWeight; // weight
	private ArrayList<Part> PartofCars; // contain the part of the car
	
	public Car() {
		
		
	}
	
	public Car(String ChassisNbr, String Model, double CarWeight) {
		this.ChassisNumber = ChassisNbr;
		this.Model = Model;
		this.CarWeight = CarWeight;
		PartofCars = new ArrayList<Part>();
	}

	public String getChassisNumber() {
		return ChassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		ChassisNumber = chassisNumber;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public double getCarWeight() {
		return CarWeight;
	}

	public void setCarWeight(double carWeight) {
		CarWeight = carWeight;
	}

	public ArrayList<Part> getPartofCars() {
		return PartofCars;
	}

	public void setPartofCars(ArrayList<Part> partofCars) {
		PartofCars = partofCars;
	}
	
	
}
