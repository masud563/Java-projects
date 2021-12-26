import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawCircularSpiral extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		int radius = 10;
		int upperX = getWidth()/2;
		int upperY = getHeight()/2;
		
		for(int i = 1; i <= 10; i++) {
			
				g.drawArc(upperX, upperY , radius, radius, 0, 180);
				g.drawArc(upperX - radius, upperY, 2*radius,  radius, 0, -180);
				upperX -=  radius;
				upperY -=  radius;
				radius = 3 * radius;
			}
		
		
		
		
	}

}
