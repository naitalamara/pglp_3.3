package uvsq21807569.exo3_3;

public class Rebotmobile extends Rebot  {
	
	
	public void avancer(int a , int b ) {
		System.out.println("avancer ");
		
		int x=cordx() ;
		x=x+a ;
		setX( x);
		
		int y=cordy() ;
		y=y+b ;
		
		sety( y);
	}

}
