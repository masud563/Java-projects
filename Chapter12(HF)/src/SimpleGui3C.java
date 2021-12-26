import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGui3C implements ActionListener {
	JFrame frame;
	MyDrawPanel panel;
	JButton button;
	
	public static void main(String[] args) {
		
		SimpleGui3C gui = new SimpleGui3C();
		gui.go();
	}
	
	public void go() {
	    frame = new JFrame();
		panel = new MyDrawPanel();
		button = new JButton("Change the color");
		
		button.addActionListener(this);
		
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		panel.repaint();;
	}
}
