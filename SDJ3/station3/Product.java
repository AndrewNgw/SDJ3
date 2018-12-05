package station3;

import java.io.Serializable;

public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 568124354192031792L;

	private int productId;
	private String typeOfProduct;
	private ArrayList<Pallet> palletList;
	
	public Product(int productId, String typeOfProduct)
	{
	   this.productId = productId;
	   this.typeOfProduct = typeOfProduct;
	   palletList = new ArrayList<Pallet>();
	}
	
	public void setProductId(int Id)
	{
	   this.productId = Id;
	}
	public int getproductId()
	{
	   return productId;
	}
	public void setTypeOfProduct(String tp)
	{
	   this.typeOfProduct = tp;
	}
	public String getTypeOfProduct()
	{
	   return typeOfProduct;
	}


}
