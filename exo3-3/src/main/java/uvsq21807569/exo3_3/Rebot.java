package uvsq21807569.exo3_3;

public class Rebot {
	private Position position ;
	private Direction direction ;
	
	
	
	public Rebot(Position position, Direction direction) {
		super();
		this.position = position;
		this.direction = direction;
	}
	public void tourner(float x) {
		System.out.println("tourner d'un ongle  "+x);
		
		direction.setOngle(x);
	}
	
	public float getongle() {
		return direction.getOngle();
	}
	
	
   public int cordx() {
	  return  position.getX();
	   
   }

   public int cordy() {
		  return  position.getY();
	
   }
		  public void setX(int x) {
				position.x = x;
			}
		  public void sety(int y) {
				position.y = y;
			}
}
