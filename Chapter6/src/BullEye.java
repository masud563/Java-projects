import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;

public class BullEye extends JPanel {
	
	private static  SecureRandom randomNumber = new SecureRandom();
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		int r1 = randomNumber.nextInt(256);
		int r2 = randomNumber.nextInt(256);
		int g1 = randomNumber.nextInt(256);
		int g2 = randomNumber.nextInt(256);
		int b1 = randomNumber.nextInt(256);
		int b2 = randomNumber.nextInt(256);
		
		Color color1 = new Color(r1,g1,b1);
		Color color2 = new Color(r2,g2,b2);
		for (int i = 1; i <= 5; i++)
		{
			
			if(i%2 == 1)
			{
				g.setColor(color1);
				
			}
			
			else 
			{
				g.setColor(color2);
				
			}
			
			g.fillOval(200 + i*30, 200 + i*30, 300 - 2*i*30, 300 - 2*i*30);
			
		}
		
		
	}

}
