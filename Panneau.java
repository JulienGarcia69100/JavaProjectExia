import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

import javax.swing.JPanel;

public class Panneau extends JPanel {
	
  private int posX = -50;
  private int posY = -50;

  public void paintComponent(Graphics g){
	  try {
	      Image img = ImageIO.read(new File("/Users/juliengarcia/eclipse-workspaceNew2/Test/src/image/bleu.jpg"));
	      g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	      //Pour une image de fond
	      //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	    } catch (IOException e) {
	      e.printStackTrace();
	    }          
   try {
	   Image img = ImageIO.read(new File ("/Users/juliengarcia/eclipse-workspaceNew2/Test/src/image/requin.png"));
	   g.drawImage(img, posX, posY, 100, 70, null);
   } catch (IOException e) {
	   e.printStackTrace();
   }
    
  }

  public int getPosX() {
    return posX;
  }

  public void setPosX(int posX) {
    this.posX = posX;
  }

  public int getPosY() {
    return posY;
  }

  public void setPosY(int posY) {
    this.posY = posY;
  }       
  
  
}