
public class MainClass {
	
	public static void main (String [] args) {
		
		Motion motion = new Motion ();
		Motion motion1 = new Motion ("Goldfish", "Whale", "Shark", "Jellyfish", 2, 2);
		Motion motion2 = new Motion ("Shark", "Jellyfish", 10, 5, "Whale", "Goldfish", 15, 35, 5);
		
		System.out.println(motion.getFReproduction());
		
	}

}
