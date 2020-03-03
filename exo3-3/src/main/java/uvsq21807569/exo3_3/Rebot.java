package uvsq21807569.exo3_3;

public class Rebot {
	private Position position ;
	private Direction direction ;
	
	
	public void tourner(float x) {
		System.out.println("tourner d'un ongle  "+x);
		
		direction.setOngle(x);
	}

}
