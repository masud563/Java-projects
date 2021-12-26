import java.awt.*;

import javax.swing.*;

public class Anime {
	int x, y;
	public static void main(String[] args) {
		Anime an = new Anime();
		an.start();
	}
	
	public void start() {
		JFrame frame = new JFrame();
		MyDraw panel = new MyDraw();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.setSize(1920,1080);
		frame.setVisible(true);
		
		for(int i = 0; i <= 1000; i++) {
			x += 10;
			y += 10;
			panel.repaint();
			
			try {
				Thread.sleep(50);
			}catch(Exception ex){}
		}
		
	}
	
//	public class MyDraw extends JPanel{
//		public void paintComponent(Graphics g) {
//			Color color = Color.red;
//			g.setColor(color);
//			g.fillOval(x, y, 100, 100);
//		}
//		
//	}
	
	 class MyDraw extends JPanel{
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
			g2d.fillOval(x, y, 100, 100);
		}
		
	}

}
