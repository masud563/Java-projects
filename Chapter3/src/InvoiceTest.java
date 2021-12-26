import java.util.Scanner;
public class InvoiceTest {
	Invoice cpu =new Invoice("C2019","made in japan",5,100);
	Invoice motherboard =new Invoice("M2019","made in China",5,20);
	
	public static void main(String[] args) {
		Invoice cpu =new Invoice("C2019","made in japan",5,100);
		Invoice motherboard =new Invoice("M2019","made in China",5,20);
		Scanner input = new Scanner(System.in);
		System.out.printf("The number of cpu sold is %d ,It is %s, part number is %s, the price per unit is %f\n\n\n",
				cpu.getPurchasedQuantity(),cpu.getPartDescription(),cpu.getPartNumber(),cpu.getPrice());
		
		System.out.printf("The number of motherboard sold is %d ,It is %s, part number is %s, the price per unit is %f\n",
				motherboard.getPurchasedQuantity(),motherboard.getPartDescription(),motherboard.getPartNumber(),motherboard.getPrice());
		
		System.out.print("Give the number of cpu sold recently:");
		int purchasedQuantity = input.nextInt();
		cpu.setPurchasedQuantity(purchasedQuantity);
		System.out.printf("Total amount of purchased quantity is:%d",cpu.getPurchasedQuantity());
		
		
		
		
		
	}
}
