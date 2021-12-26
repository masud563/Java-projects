package DrawSurface;
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawSurface extends JPanel{
	
	
		
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
			int height = getHeight();
			int width = getWidth();
			int x = 0;
			int y = 0;
			int counter = 0;
			
			while(counter<=15) {
			g.drawLine(0,y,x,height);
			g.drawLine(x,height,width,height-y);
			g.drawLine(width, height-y,width-x , 0);
			g.drawLine(width-x, 0,0 , y);
			
			
			
			x = x + (width/15);
			y = y + (height/15);
			counter++;
			}
		}
	}

