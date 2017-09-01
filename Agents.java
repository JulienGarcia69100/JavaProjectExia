
public class Agents {
 //attribut declaration
    private boolean canMove;
 //builder   
    public Agents()
    {
        canMove = false;
    }
  //specialisation
    public Agents(boolean canMove)
    {
        this.canMove = canMove;
    }
  //getters setters  
    public boolean getCanMove()
    {
        return canMove;
    }
    
    public void setCanMove(boolean canMove)
    {
        this.canMove = canMove;
    }
}