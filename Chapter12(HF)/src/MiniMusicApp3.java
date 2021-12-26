import java.awt.*;
import javax.swing.*;
import javax.sound.midi.*;


public class MiniMusicApp3 {
	static JFrame  f = new JFrame("Beatbox");
	static MyDrawP ml;
	
	
	public static void main(String[] args) {
		
		MiniMusicApp3 player = new MiniMusicApp3();
		player.go();
	} //close main
	
	
	public void go() {
		setUpGui();
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.addControllerEventListener(ml,new int[] {127});
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			int r = 0;
			for(int i = 0; i < 127; i += 1) {
				
				r = (int)((Math.random() *50) + 1);
				track.add(makeEvent(144, 1, r, 100, i));
				track.add(makeEvent(176, 1, 127, 0 , i));
				track.add(makeEvent(128, 1, r, 100, i+2));
			} //end loop
			
			sequencer.setSequence(seq);
			
			sequencer.setTempoInBPM(120);
			sequencer.start();
		}catch(Exception ex) {ex.printStackTrace();}
	} //end go
    
	
	public void setUpGui() {
		ml = new MyDrawP();
		f.setContentPane(ml);
		f.setBounds(30, 30, 300, 300);
		f.setVisible(true);
	} //end setUpGui
	
	
	public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
		}catch(Exception e) {e.printStackTrace();};
		return event;
	} //end makeMidievent
	
	class MyDrawP extends JPanel implements ControllerEventListener{
		boolean msg = false;
		public void paintComponent(Graphics g) {
			
			if(msg) {
				Graphics2D g2 = (Graphics2D)g;
				
				
				int r = (int)(Math.random()*250);
				int gr = (int)(Math.random()*250);
				int b = (int)(Math.random()*250);
				
				g2.setColor(new Color(r, gr, b));
				
				int wd = (int)(Math.random()*120 + 10);
				int ht = (int)(Math.random()*120 + 10);
				
				int x = (int)(Math.random()*40 + 10);
				int y = (int)(Math.random()*40 + 10);
				g2.fillRect(0, 0, this.getWidth(), this.getHeight() );
				
				msg = false;
			}
		}
		
		
		public void controlChange(ShortMessage event) {
		    msg = true;
			repaint();
		}
	}
}
