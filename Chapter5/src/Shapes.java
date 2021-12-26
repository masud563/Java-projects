import java.awt.Graphics;
import javax.swing.JPanel;
public class Shapes extends JPanel {
	private int choice;
	
	public Shapes(int userChoice) {
		this.choice = userChoice;
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(int i = 0; i <=100 ; i++){
			
			switch(choice) {
				
			case 1:
				g.drawRect(200-i*10,200-i*10,50+2*i*10,50+2*i*10);
				break;
			case 2:
				g.drawOval(200-i*10,200-i*10,50+2*i*10,50+2*i*10);
				break;
			}
			
		}
	}
	
	

}
