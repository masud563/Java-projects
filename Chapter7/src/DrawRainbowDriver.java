import javax.swing.JFrame;																				
public class DrawRainbowDriver {
	public static  void  main(String[] args)
	{
		DrawRainbow panel = new DrawRainbow();
		JFrame drawingFrame = new JFrame();
		
		drawingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawingFrame.add(panel);
		drawingFrame.setSize(500,500);
		drawingFrame.setVisible(true);
	}

}
