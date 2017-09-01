
public class Motion extends Agents{
	//Attribut declaration
    private String name;
   //builder 
    public Motion()
    {
        super();
        name = "";
    }
    
    //specialisation
    public Motion(String name)
    {
        super(true);
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