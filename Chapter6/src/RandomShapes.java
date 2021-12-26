import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;


public class RandomShapes extends JPanel {
	
	private static SecureRandom randomNumber = new SecureRandom();
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		for (int i =1; i <= 10; i++)
		{
			int r1 = randomNumber.nextInt(256);
			int g1 = randomNumber.nextInt(256);
			int b1 = randomNumber.nextInt(256);
			Color color = new Color(r1,g1,b1);
			g.setColor(color);
			
			
			int x = randomNumber.nextInt(250);
			int y = randomNumber.nextInt(250);
			
			
			int length = randomNumber.nextInt(250);
			int height = randomNumber.nextInt(250);
			
			int choice = 1 + randomNumber.nextInt(2);
			
			if (choice == 1)
			{
				g.fillOval(x,y,height,length);
			}
			
			if (choice == 2)
			{
				g.fillRect(x,y,height,length);
			}
		}
		
		
	}

}
