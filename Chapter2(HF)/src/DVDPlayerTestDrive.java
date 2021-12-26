
public class DVDPlayerTestDrive {
	
	public static void main(String[] args) {
	
	Player d = new Player();
	
	d.canRecord = true;
	
	if (d.canRecord == true) {
		
		d.recordDVD();
	}
	
	
}
}