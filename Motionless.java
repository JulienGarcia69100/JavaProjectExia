
public class Motionless extends Agents{
	//attribut import
    private String name;
    //builder
    public Motionless()
    {
        super();
        name = "";
    }
    //specialisation
    public Motionless(String name)
    {
        super(false);
        this.name = name;
    }
    //getter setter
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
}