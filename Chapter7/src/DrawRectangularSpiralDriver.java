import javax.swing.JFrame;
public class DrawRectangularSpiralDriver {
	
	public static void main(String[] args) {
		
		DrawRectangularSpiral panel = new DrawRectangularSpiral();
		JFrame drawingFrame = new JFrame();
		
		
		drawingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawingFrame.add(panel);
		drawingFrame.setSize(500, 500);
		drawingFrame.setVisible(true);
	}
	
}
