
public class Invoice {
	private String partNumber;
	private String partDescription;
	private int purchasedQuantity;
	private float price;
	
	public Invoice(String partNumber,String partDescription,int purchasedQuantity,float price) {
		
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		if (purchasedQuantity > 0)
		this.purchasedQuantity = purchasedQuantity;
		if (price > 0.0)
		this.price = price;
		
	}
	
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	public String getPartNumber() {
		return this.partNumber;
	}
	
	public void setPartDescription(String PartDescription) {
		this.partDescription = PartDescription;
	}
	
	public String getPartDescription() {
		return this.partDescription;
	}
	
	public void setPurchasedQuantity(int purchasedQuantity) {
		this.purchasedQuantity += purchasedQuantity;
	}
	
	public int getPurchasedQuantity() {
		return this.purchasedQuantity;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public float totalInvoice() {
		return (this.purchasedQuantity*this.price);
	}
	
}
