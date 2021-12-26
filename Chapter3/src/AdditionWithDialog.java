import javax.swing.JOptionPane;

public class AdditionWithDialog {
	public static void main(String[] args) {
		
		
		int number1;
		int number2;
		int sum;
		
		number1 = Integer.parseInt(JOptionPane.showInputDialog("Please give the first number"));
		number2 = Integer.parseInt(JOptionPane.showInputDialog("Please give the second number"));
		sum = number1 + number2;
		String message = String.format("The sum of the two numbers are:%d",sum);
		JOptionPane.showMessageDialog(null,message);
		
	
		
	}
}
