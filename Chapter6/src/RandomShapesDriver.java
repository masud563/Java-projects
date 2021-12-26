import javax.swing.JFrame;
public class RandomShapesDriver {
	public static void main(String[] args)
	{
		JFrame application = new JFrame();
		RandomShapes randomShapes = new RandomShapes();
		
		application.add(randomShapes);
		application.setVisible(true);
		application.setSize(500,500);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
