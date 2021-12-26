import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ShapesTest {
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Enter 1 to draw Rectangle"+
		                                           "Enter 2 to draw Oval");
		int choice = Integer.parseInt(input);
		
		JFrame application = new JFrame();
		
		Shapes panel = new Shapes(choice);
		
		application.add(panel);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(500,500);
		application.setVisible(true);
	}

}
