package station1;
import java.io.Serializable;

public class Part implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7721362195563469935L;

   private int partId;
   private double weight;
   private String typeOfPart;
   private Car car;

   public Part(int partId, double weight, String typeOfPart, Car car)
   {
      this.partId = partId;
      this.weight = weight;
      this.typeOfPart = typeOfPart;
      this.car = car;
   }
   
   public void setPartId(int id)
   {
      this.partId = id;
   }
   public int getPartId()
   {
      return partId;
   }
   public void setWeight(double w)
   {
      this.weight = w;
   }
   public double getWeight()
   {
    return weight;  
   }
   public void setTypeOfPart(String typeOfPart)
   {
      this.typeOfPart = typeOfPart;
   }
   public String getTypeOfPart()
   {
      return typeOfPart;
   }
   public void setCar(Car c)
   {
      this.car = c;
   }
   public Car getCar()
   {
      return car;
   }


}
