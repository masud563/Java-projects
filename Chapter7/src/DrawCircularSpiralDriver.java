import javax.swing.JFrame;
public class DrawCircularSpiralDriver {
	public static void main(String[] args) {
		
		DrawCircularSpiral panel = new DrawCircularSpiral();
		JFrame drawingFrame = new JFrame();
		
		drawingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawingFrame.add(panel);
		drawingFrame.setVisible(true);
		drawingFrame.setSize(500, 500);
	}
}
