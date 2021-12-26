import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawRainbow extends JPanel{
	
	
	private final  Color VIOLET = new Color(128,0,128);
	private final  Color INDIGO = new Color(75,0,130);
	
	private Color[] rainbowColors = 
		{Color.RED,Color.ORANGE,Color.BLUE,VIOLET,Color.YELLOW,Color.GREEN,
				INDIGO};
	
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		
		int radius = 20;
		int centerX = getWidth()/2;
		int centerY = getHeight() - 10;
		
		
		for (int counter = rainbowColors.length; counter > 0; counter--)
		{
			g.setColor(rainbowColors[7-counter]);
			
			g.fillArc(centerX - counter * radius, centerY - counter * radius, 
					 counter * radius *2 , counter * radius *2, 0, 180);
			
			
		}
		
		
	}

}
