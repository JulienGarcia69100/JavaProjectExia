import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

import javax.imageio.ImageIO;

public class Shark extends Motion{
	

	private int LifeExpectancy;
	private String Enemy;
	private String Food;

	public Shark() {
		
	int shark = 1;
	System.out.println("Creation of a " + name + " , enemies: " + Enemy + " , Food : " + Food);
	this.name = "Shark";
	this.Enemy = "JellyFish";
	this.Food = "Whale" + "GoldFish";
	this.LifeExpectancy = 35;
	this.satiety = 15;
	this.birthDelay = 5;
	}
	  private int posX = -50;
	  private int posY = -50;
	
	public void paintComponentShark(Graphics g){
		try {
		Image img = ImageIO.read(new File ("/Users/juliengarcia/eclipse-workspaceNew2/Test/src/image/requin.png"));
		   g.drawImage(img, posX, posY, 100, 70, null);
	   } 
	catch (IOException e) {
		   e.printStackTrace();
	}
	}
}
