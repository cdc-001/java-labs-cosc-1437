//FA2022_Person.java

public class FA2022_Person 
{
	protected String SSNumber;
	protected String lastName;
	protected String firstName;
	protected String phone;
	protected String address;
	
	public FA2022_Person()
	{
		SSNumber = "";
		lastName = "";
		firstName = "";
		phone    = "";
		address  = "";
	}
	public FA2022_Person(String num, String last, String first, String phoneN, String addr)
	{
		SSNumber = num;
		lastName = last;
		firstName = first;
		phone    = phoneN;
		address  = addr;	
	}
	//mutator methods
	public void setLastName(String lname)
	{
 		lastName = lname;
	}
	public void setFirstName(String fname)
	{
		firstName = fname;
	}
	public void setPhone(String newPhone)
	{
		phone = newPhone;
	}
	public void setAddress(String addr)
	{
		address = addr;
	}
	//assessor methods
	public String getLastName()
	{
		return lastName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getPhone()
	{
		return phone;
	}
	public String getAddress()
	{
		return address;
	}
	//method toString()
	public String toString()
	{
		return String.format("%-15s%32s\n", "SS Number: ", SSNumber) +
		       String.format("%-15s%32s\n", "Name: ", lastName + ", " + firstName) +
		       String.format("%-15s%32s\n", "Phone: ", phone) +
		       String.format("%-15s%32s\n", "Address: ", address);		  
	}
}
