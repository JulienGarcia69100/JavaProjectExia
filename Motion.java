
public class Motion {
	
	private String nameAnimal;
	private String nameEnemy;
	private String nameFood;
	private int satiety;
	private int lifeExpectancy;
	private int reproduction;
	private int movement;
	private int birthDelay;
	
	public Motion () {
		
		System.out.println("Creation of a motion animal");
		nameAnimal = "unknown";
		nameEnemy = "unknown";
		nameFood = "unknown";
		satiety = 0;
		lifeExpectancy = 0;
		reproduction = 0;
		movement = 0;
		}
	
	public Motion (String pName, String pEnemy, int pMovement, int pReproduction) {
		
		System.out.println("Creation of a Goldfish");
		nameAnimal = pName;
		nameEnemy = pEnemy;
		movement = pMovement;
		reproduction = pReproduction;
	    }
	
	public Motion (String fName, String fEnemy, int fMovement, int fReproduction, String fFood, int fSatiety, int fLife, int fBirth ) {
		
		System.out.println("Creation of a Predator");
		nameAnimal = fName;
		nameEnemy = fEnemy;
		movement = fMovement;
		reproduction = fReproduction;
		nameFood = fFood;
		satiety = fSatiety;
		lifeExpectancy = fLife;
		birthDelay = fBirth;
		
	}

}