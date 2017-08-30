//////////////////////////////	Imports	////////////////////////////////////////

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.time.Duration;


public class World extends JPanel {
	public void updateTime()
	{
	    int timeOfDay= Statistics.duration % 200;
	    if (timeOfDay <= 50){
	        // it's dawn...
	    } else if (timeOfDay > 50 && timeOfDay <= 100) {
	        // it's noon...
	    } else if (timeOfDay > 100 && timeOfDay <= 150) {
	        // it's dusk...
	    } else {
	        // it's night...
	    }
	}
	
	public void TimeCycle() {
	
		int time = 0;
		if (time < 100) {
			time ++;
		}
		else {
			time = 0;
		}
	}
	
	
 



}