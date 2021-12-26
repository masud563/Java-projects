import java.awt.*;
import javax.swing.*;
public class MyDrawPanel extends JPanel {
	
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		int red = (int)(Math.random()*255);
		int green = (int)(Math.random()*255);
		int blue = (int)(Math.random()*255);
		
		Color startColor = new Color(red, green, blue);
		
		red = (int)(Math.random()*255);
		green = (int)(Math.random()*255);
		blue = (int)(Math.random()*255);
		
		Color endColor = new Color(red, green, blue);
		
		GradientPaint gradient = new GradientPaint(50, 50, startColor, 250, 250, endColor);
		g2d.setPaint(gradient);
		g2d.fillOval(50, 50, 100, 100);
		}

}
