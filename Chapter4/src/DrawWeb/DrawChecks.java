package DrawWeb;
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawChecks extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		int height = getHeight();
		int width = getWidth();
		int x = 0;
		int y = 0;
		int counter = 0;
		
		while(counter<=15) {
		g.drawLine(0,0,(width/2)+x,(height/2)-y);
		g.drawLine(0,0,(width/2)-x,(height/2)+y);
		g.drawLine(width, height,(width/2)+x , (height/2)-y);
		g.drawLine(width, height,(width/2)-x , (height/2)+y);
		
		g.drawLine(width,0,(width/2)-x,(height/2)-y);
		g.drawLine(width,0,(width/2)+x,(height/2)+y);
		g.drawLine(0, height,(width/2)-x , (height/2)-y);
		g.drawLine(0, height,(width/2)+x , (height/2)+y);
		
		x = x + (width/15);
		y = y + (height/15);
		counter++;
		}
	}
}
