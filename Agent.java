//////////////////////////////	Imports //////////////////////////////////////////////

import javax.swing.JPanel;

//////////////////////////////	Agent Class ////////////////////////////////////////

abstract class Agent extends JPanel {
	
	protected int movement;
	protected int pMovement;
	protected int pop;
	protected int pPop;
	protected int nbFish;
	protected int pNbFish;
	protected String name;
	protected String pName;
	protected int positionx;
	protected int positiony;
	protected int deplacement;

//////////////////////////////	Name //////////////////////////////////////////////
	
	public void Name (String name) {
		name = "unknown";
	}

//////////////////////////////	Deplacement //////////////////////////////////////
	
	public void Deplacement (int deplacement) {
		deplacement = 0;
	}
	
//////////////////////////////	Pop			/////////////////////////////////////
	
	public void Pop (int lowerx, int higherx, int lowery, int highery, int randomx, int randomy, int positionx, int positiony) {
		 lowerx= 0;
		 higherx = 450;
		 lowery= -600;
		 highery = 0;
		
		 positionx= (int)(Math.random() * (higherx-lowerx)) + lowerx;
		 positiony = (int)(Math.random() * (highery-lowery)) + lowery;
		
	}
	
//////////////////////////////	Getters & Setters //////////////////////////////
	  
	public int getPositionX() {
	    return positionx;
	  }

	  public void setPositionX(int positionx) {
	    this.positionx = positionx;
	  }

	  public int getPositionY() {
	    return positiony;
	  }

	  public void setPositonY(int positiony) {
	    this.positiony = positiony;
	  }       
	  
	  public String getName() {
		  return name;
	  }
	  
	  public void setName(String name) {
		  this.name = name;
	  }
	  
	  public int getDeplacement() {
		  return deplacement;	  
}
	  public void setDeplacement() {
		  this.deplacement = deplacement;
	  }
	  
}
