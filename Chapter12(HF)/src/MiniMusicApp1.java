import javax.sound.midi.*;
public class MiniMusicApp1 {
	
	
	public static void main(String[] args) {
		
		MiniMusicApp1 player = new MiniMusicApp1();
		player.go();	
	} 
	
	
	public static void go() {
		
		try {
			
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			for (int i = 1; i <= 60; i+=1) {
				
				track.add(makeEvent(144, 1, i, 100, i));
				track.add(makeEvent(128, 1, i, 100, i+10));				
			}
			
			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			sequencer.start();
		}catch(Exception ex) {}	
	}
	
	
	public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
		}catch(Exception ex) {}	
		
		return event;
		
	}

}
