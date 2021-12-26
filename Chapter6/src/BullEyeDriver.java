import javax.swing.JFrame;
public class BullEyeDriver {
	public static void main(String[] args)
	{
		BullEye bullEye = new BullEye();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(500,500);
		application.setVisible(true);
		application.add(bullEye);
	}

}
