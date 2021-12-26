
public class ParkingAccount {
	private String name;
	private double charges;
	
	public  ParkingAccount(String name,double charges)
	{
		this.name = name;
		this.charges = charges;
	}
	
	public void setAccountName(String name)
	{
		this.name = name;
	}
	
	public String getAccountName()
	{
		return this.name;
	}
	
	public void setCharges(double charges)
	{
		this.charges += charges;
	}
	
	public double getCharges()
	{
		return this.charges;
	}
}
