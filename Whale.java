import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class Whale extends Motion{
	
	private String Enemy;
	private String Food;
	private int LifeExpectancy;

	public Whale () {
		System.out.println("Creation of a " + name + " , enemies: " + Enemy + " , Food : " + Food);
		this.name = "Whale";
		this.Enemy = "Shark";
		this.Food = "JellyFish" + "GoldFish";
		this.LifeExpectancy = 55;
		this.satiety = 25;
		this.birthDelay = 10;
	}
	
	private int posX = -50;
	private int posY = -50;
	
	public void paintComponentWhale(Graphics g){
		try {
		Image img = ImageIO.read(new File ("/Users/juliengarcia/eclipse-workspaceNew2/Test/src/image/baleine.png"));
		   g.drawImage(img, posX, posY, 100, 70, null);
	   } 
	catch (IOException e) {
		   e.printStackTrace();
	}
	}

}
