package uvsq21807569.exo3_3;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		
		Position p=new Position(0,0);
		Direction d =new Direction(0);
		
		Rebot r =new Rebot(p,d);
		r.tourner(40);
		assertTrue(r.getongle()==40);
		
		
		Rebotmobile a = new Rebotmobile(p,d);
		a.tourner(40);
		assertTrue(a.getongle()==40);
		a.avancer(4, 8);
		assertTrue(a.cordx() == 4);
		assertTrue(a.cordy() == 8);
		
	}

}
