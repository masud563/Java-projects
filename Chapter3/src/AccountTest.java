import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args) {
		
        Account account1 = new Account("Jane Green",500.0);
        Account account2 = new Account("John Blue",-7.53);
        
        System.out.printf("%s balance is:%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance is:%.2f%n%n",account2.getName(),account2.getBalance());
        
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter deposit amount for account1:");
        double depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to account1 balance",depositAmount);
        account1.deposit(depositAmount);
        
        System.out.printf("%n %s %n balance:%.2f",account1.getName(),account1.getBalance());
        System.out.printf("%n %s %n balance:%.2f%n",account2.getName(),account2.getBalance());
        
        System.out.print("Enter deposit amount for account2:");
        depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to account2 balance",depositAmount);
        account2.deposit(depositAmount);
        
        System.out.printf("%n %s %n balance:%.2f",account1.getName(),account1.getBalance());
        System.out.printf("%n %s %n balance:%.2f",account2.getName(),account2.getBalance());
        
      	account1.withDraw(6000);	
		
	}
	
	
	
	
}
