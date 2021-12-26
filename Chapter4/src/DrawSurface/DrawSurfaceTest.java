package DrawSurface;
import javax.swing.JFrame;
public class DrawSurfaceTest {




	
		public static void main(String[] args) {
			
			DrawSurface panel = new DrawSurface();
			JFrame application = new JFrame();
			
			application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			application.add(panel);
			application.setSize(500,500);
			application.setVisible(true);
			
			
		}
	}

