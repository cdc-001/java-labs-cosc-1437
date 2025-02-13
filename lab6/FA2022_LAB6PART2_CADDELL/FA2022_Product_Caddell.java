//FA2022_Product_Caddell.java

import java.text.SimpleDateFormat;
import java.util.Date;

public class FA2022_Product_Caddell 
{
	private final int SIZE = 3;
	
	private String productID;
	private String productName;
	private int[] productUnits = new int[SIZE];
	private float[] productUnitPrice = new float[SIZE];
	
	/** No-argument constructor */
	public FA2022_Product_Caddell()
	{		
		productID = "";
		productName = "";
	}
	
	/** Parameterized constructor excepting product ID, name, units, and unit price as arguments. */
	public FA2022_Product_Caddell(String id, String n, int[] u, float[] p)
	{
		productID = id;
		productName = n;
		
		for (int i = 0; i < u.length; i++)
		{
			productUnits[i] = u[i];
		}
		
		for (int i = 0; i < p.length; i++)
		{
			productUnitPrice[i] = p[i];
		}
	}
	
	/** Mutator method beginning with set */
	public void setProductID(String id)
	{
		productID = id;
	}
	public void setProductName(String n)
	{
		productName = n;
	}
	public void setProductUnits(int[] u)
	{
		for (int i = 0; i < u.length; i++)
		{
			productUnits[i] = u[i];
		}
	}
	public void setProductUnitPrice(float[] p)
	{
		for (int i = 0; i < p.length; i++)
		{
			productUnitPrice[i] = p[i];
		}
	}
	
	/** Accessor methods beginning with get */
	public String getProductID()
	{
		return productID;
	}
	public String getProductName()
	{
		return productName;
	}
	public int[] getProductUnits()
	{
		return productUnits;
	}
	public float[] getProductUnitPrice()
	{
		return productUnitPrice;
	}
	
	/** Method to calculate gross sales */
	public float calculateSaleMoney()
	{
		float totalGrossSales = 0.0f;
		for (int i = 0; i < SIZE; i++)
		{
			totalGrossSales += productUnits[i] * productUnitPrice[i];
		}
		
		return totalGrossSales;
	}
	
	/** Method to calculate sales tax */
	public double calculateSalesTax()
	{
		return calculateSaleMoney() * 0.0825;
	}
	
	/** Method to calculate total sales */
	public double calculateTotalSaleMoney()
	{
		return calculateSaleMoney() + calculateSalesTax();
	}
	
	/** Method to display object data to screen */
	public String toString()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		
		return "FA2022_SaleProduct_Caddell.java\n"
			  + "SALE PRODUCT REPORT – CORY CADDELL\n"
			  + "------------------------------------------------------------\n"
			  + String.format("Sale Day: %s\n", formatter.format(date))
			  + String.format("Product ID: %s\n", productID)
			  + "------------------------------------------------------------\n"
			  + String.format("%-15s%15s%15s%15s\n", "SIZE", "PRICE", "UNITS", "MONEY")
			  + String.format("%-15s%15.2f%15d%15.2f\n", "Product Small:", productUnitPrice[0], productUnits[0], productUnitPrice[0] * productUnits[0])
			  + String.format("%-15s%15.2f%15d%15.2f\n", "Product Medium:", productUnitPrice[1], productUnits[1], productUnitPrice[1] * productUnits[1])
			  + String.format("%-15s%15.2f%15d%15.2f\n", "Product Large:", productUnitPrice[2], productUnits[2], productUnitPrice[2] * productUnits[2])
			  + "------------------------------------------------------------\n"
			  + String.format("%-15s%45.2f\n", "Subtotal:", calculateSaleMoney())
			  + String.format("%-15s%45.2f\n", "Sales tax:", calculateSalesTax())
			  + String.format("%-15s%45.2f\n", "Total", calculateTotalSaleMoney());
	}
}
