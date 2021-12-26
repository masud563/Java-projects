package DrawCross;
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawPanel extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		int width = getWidth();
		int height = getHeight();
		
		super.paintComponent(g);
		g.drawLine(0,0,width/2-height/15,height/2+width/15);
		g.drawLine(0, height, width,0);
		
		
	}
	
	
}
