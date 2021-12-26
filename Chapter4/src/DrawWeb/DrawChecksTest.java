package DrawWeb;
import javax.swing.JFrame;

public class DrawChecksTest {
	public static void main(String[] args) {
		
		DrawChecks panel = new DrawChecks();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(500,500);
		application.setVisible(true);
		
		
	}
}
