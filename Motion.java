
public class Motion {
	
	private String nameAnimal;
	private String nameEnemy1;
	private String nameEnemy2;
	private String nameEnemy3;
	private String nameFood1;
	private String nameFood2;
	private int satiety;
	private int lifeExpectancy;
	private static int reproduction;
	private int movement;
	private int birthDelay;
	private String pName;
	private String pEnemy1;
	private String pEnemy2;
	private String pEnemy3;
	private int pMovement;
	private int pReproduction;
	private String fName;
	private String fEnemy;
	private int fMovement;
	private int fReproduction;
	private String fFood1;
	private String fFood2;
	private int fSatiety;
	private int fLife;
	private int fBirth;
	
	
	public Motion () {
		
		System.out.println("Creation of a motion animal");
		nameAnimal = "unknown";
		nameEnemy1 = "unknown";
		nameFood1 = "unknown";
		satiety = 0;
		lifeExpectancy = 0;
		reproduction = 0;
		movement = 0;
		}
	
	public Motion (String pName, String pEnemy1, String pEnemy2, String pEnemy3, int pMovement, int pReproduction) {
		
		System.out.println("Creation of a " + pName);
		nameAnimal = pName;
		nameEnemy1 = pEnemy1;
		nameEnemy2 = pEnemy2;
		nameEnemy3 = pEnemy3;
		movement = pMovement;
		reproduction = pReproduction;
	    }
	
	public Motion (String fName, String fEnemy, int fMovement, int fReproduction, String fFood1, String fFood2, int fSatiety, int fLife, int fBirth ) {
		
		System.out.println("Creation of a " + fName);
		nameAnimal = fName;
		nameEnemy1 = fEnemy;
		movement = fMovement;
		reproduction = fReproduction;
		nameFood1 = fFood1;
		nameFood2 = fFood2;
		satiety = fSatiety;
		lifeExpectancy = fLife;
		birthDelay = fBirth;
		
	}

	public void setFReproduction() {
		Motion.reproduction = fReproduction;
	}
	
	public int getFReproduction() {
		return fReproduction;
	}
	
}
