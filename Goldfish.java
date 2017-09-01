//import package
import javax.swing.ImageIcon;

public class Goldfish extends Motion{
	//attribut declaration
    private ImageIcon img;
    private int direction;
    
    //builder
    public Goldfish()
    {
        super("Goldfish");
        img = new ImageIcon("poissonRL.png");
        direction = 1;
    }
    //get name
    public String getSpecie() {
            return super.getName();
    }

    public void setSpecie(String specie) {
            super.setName(specie);
    }
    //get image
    public ImageIcon getImg()
    {
        return img;
    }
    
    public void setImg(String url)
    {
        img = new ImageIcon(url);
    }
    //image choise with direction
    public void setDirection(int d)
    {
        direction = d;
        if(d == -1)
        {
            setImg("poissonLR.png");
        }
        else
        {
            setImg("poissonRL.png");
        }
    }
    
    public int getDirection()
    {
        return direction;
    }
}