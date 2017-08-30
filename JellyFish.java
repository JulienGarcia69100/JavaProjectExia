import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class JellyFish extends Motion{
	
	private String Enemy;
	private String Food;
	private int LifeExpectancy;

	public JellyFish () {
		System.out.println("Creation of a " + name + " , enemies: " + Enemy + " , Food : " + Food);
		this.name = "JellyFish";
		this.Enemy = "Whale";
		this.Food = "GoldFish";
		this.LifeExpectancy = 25;
		this.satiety = 15;
		this.birthDelay = 0;
	}

	private int posX = -50;
	private int posY = -50;
	
	public void paintComponentJelly(Graphics g){
		try {
		Image img = ImageIO.read(new File ("/Users/juliengarcia/eclipse-workspaceNew2/Test/src/image/meduse.png"));
		   g.drawImage(img, posX, posY, 100, 70, null);
	   } 
	catch (IOException e) {
		   e.printStackTrace();
	}
	}
}
