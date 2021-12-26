import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TwoButtons {
	JFrame frame;
	JLabel label;

	
	public static void main(String[] args) {
		
		TwoButtons gui = new TwoButtons();
		gui.go();
	}
	
	public void go() {
		
		frame = new JFrame();
		
		MyDrawPanel panel = new MyDrawPanel();
		
		JButton colorButton = new JButton("Change the color!");
		colorButton.addActionListener(new ColorListener());
		
		JButton labelButton = new JButton("Change the label!");
		labelButton.addActionListener(new LabelListener());
		
		label = new JLabel("change me?");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.NORTH, colorButton);
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.setSize(500,500);
		frame.setVisible(true);
		
	}
		
		class ColorListener implements ActionListener{
			public void actionPerformed(ActionEvent event) {
				frame.repaint();
			}
		}
		
		class LabelListener implements ActionListener{
			public void actionPerformed(ActionEvent event) {
				label.setText("I'm changed!");
			}
		}
	

}

