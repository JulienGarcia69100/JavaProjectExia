//import package
import javax.swing.ImageIcon;


public class Algae extends Motionless{
//attribut declaration
    private ImageIcon img;
//builder   
    public Algae()
    {
        super("Algae");
        img = new ImageIcon("algue.png");
    }
//getter and setter    
    public ImageIcon getImage()
    {
        return img;
    }
}