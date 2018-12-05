package station2;

import java.io.Serializable;

public class Pallet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1665141135554069240L;

	private int palletId;
	private String typeOfPart;
	private double maxWeightCapacity;
	private ArrayList<Part> listOfParts;
	
	public Pallet(int palletId,String typeOfPart,double maxWeightCapacity )
	{
	   this.palletId = palletId;
	   this.typeOfPart = typeOfPallet;
	   this.maxWeightCapacity = maxWeightCapacity;
	   listOfParts = new ArrayList<Part>();
	}
	
	public String getTypeOfPart()
	{
	   return typeOfPart;
	}
	public void set typeOfPart(String typeOfPart)
	{
	   this.typeOfPart = typeOfPart;
	}
	public void setId(int id)
	{
	   this.palletId = id;
	}
	public int getPalletId()
	{
	   return palletId;
	}
	public void setMaxWeightCapacity(double maxWeight)
	{
	   this.maxWeightCapacity = maxWeight;
	}
	public double getMaxWeightCapacity()
	{
	   return maxWeightCapacity;
	}


}
