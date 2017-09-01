
public class canEat extends Encounter {
	//attribut declaration
	private boolean canEat;
	//builder
	public canEat() {
		canEat = false;
	}
	//specialisation
	public canEat (boolean canEat) {
		this.canEat = canEat;
	}
	//getter and setter
	public boolean getcanEat()
    {
        return canEat;
    }
    
    public void setcanEat(boolean canEat)
    {
        this.canEat = canEat;
    }
}
