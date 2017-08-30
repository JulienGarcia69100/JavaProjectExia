import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GoldFish extends Motion{
	
	private String Enemy;
	private String Food;
	private int LifeExpectancy;

	public GoldFish () {
		System.out.println("Creation of a " + name + " , enemies: " + Enemy + " , Food : " + Food);
		this.name = "GoldFish";
		this.Enemy = "Shark" + "Whale" + "JellyFish";
		this.Food = "JellyFish" + "GoldFish";
		this.LifeExpectancy = 55;
		this.satiety = 25;
		this.birthDelay = 10;
	}
	
	private int posX = -50;
	private int posY = -50;

	public void paintComponentGold(Graphics g){
		try {
		Image img = ImageIO.read(new File ("/Users/juliengarcia/eclipse-workspaceNew2/Test/src/image/poisson.png"));
		   g.drawImage(img, posX, posY, 100, 70, null);
	   } 
	catch (IOException e) {
		   e.printStackTrace();
	}
	}
}
