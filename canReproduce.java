
public class canReproduce extends Encounter {
	//attribut declaration
	private boolean canReproduce;
	//builder
	public canReproduce() {
		canReproduce = false;
	}
	//specialistation
	public canReproduce (boolean canReproduce) {
		this.canReproduce = canReproduce;
	}
	//getter setter
	public boolean getcanReproduce()
    {
        return canReproduce;
    }
    
    public void setcanReproduce(boolean canReproduce)
    {
        this.canReproduce= canReproduce;
    }
}
