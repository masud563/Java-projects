import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class TextArea1 implements ActionListener{
	

	JTextArea text;
	public static void main(String args[]) {
		TextArea1 gui = new TextArea1();
		gui.go();
	}
	
	
	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Just click me");
		
		
		button.addActionListener(this);
		
		
		text = new JTextArea(10, 20);
		JScrollPane scroller = new JScrollPane(text);
		text.setLineWrap(true);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		
		panel.add(scroller);
		
		
		frame.getContentPane().add(BorderLayout.CENTER, scroller);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		
		
		frame.setSize(250, 200);
		frame.setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent event) {
		text.append("button clicked \n");
	}

}
