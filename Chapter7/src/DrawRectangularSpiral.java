import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawRectangularSpiral extends JPanel {
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		int line = 100;
		int centerX = getWidth()/2;
		int centerY = getHeight()/2;
		
		
		for (int counter = 0; counter < 50; counter++) {
			
			if (counter % 2 == 0) {
				g.drawLine(centerX,centerY,centerX,centerY+line);
				g.drawLine(centerX,centerY+line,centerX - line, centerY + line);
				centerX -=line;
				centerY +=line;
				line =(int)(1.01 * line);
			}
			else {
				g.drawLine(centerX, centerY, centerX, centerY - line);
				g.drawLine(centerX, centerY - line, centerX + line, centerY - line);
				centerX += line;
				centerY -= line;
				line = (int)(1.01 * line);
			}
		}
	}
	
	
	

}
