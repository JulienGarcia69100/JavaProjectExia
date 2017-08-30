//////////////////////////////	Motion Class	//////////////////////////////

abstract class Motion extends Agent {
	
	protected int life;
	protected int satiety;
	protected int birthDelay;

//////////////////////////////	Enemy Method //////////////////////////////
	
	public void Enemy () {
		
		String [] EnemyArray;
		EnemyArray = new String [3];
		EnemyArray [0] = "Unknown";
		EnemyArray [1] = "Unknown";
		EnemyArray [2] = "Unknown";
	}

//////////////////////////////	Food Method	//////////////////////////////
	
	public void Food () {
		String [] FoodArray;
		FoodArray = new String [2];
		FoodArray [0] = "Unknown";
		FoodArray [1] = "Unknown";
	}

//////////////////////////////	Life Method	//////////////////////////////
	
	public void LifeExpectancy () {
		int life = 0;	
	}

//////////////////////////////	Satiety Method	/////////////////////////

	public void Satiety () {
		int satiety = 0;
	}

//////////////////////////////	Birth Method	//////////////////////////////
	
	public void BirthDelay () {
		int birthDelay = 0;
	}
	
//////////////////////////////	Getters & Setters /////////////////////////
	
	public int getLifeExpectancy () {
		return life;
	}
	
	public void setLifeExpectancy () {
		this.life = life;
	}
	
	public int getSatiety () {
		return satiety;
	}
	
	public void setSatiety () {
		this.satiety = satiety;
	}
	
	public int getBirthDelay () {
		return birthDelay;
	}
	
	public void setBirthDelay () {
		this.birthDelay = birthDelay;
	}
}
