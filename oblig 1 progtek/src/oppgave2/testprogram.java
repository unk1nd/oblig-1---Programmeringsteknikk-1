package oppgave2;
//------------------------------------------------------------
// Test program for klassene GeoObject, Circle og Rectangle
//	av Mikael Bendiksen
//------------------------------------------------------------

public class testprogram{
	
	public static void main (String[] arpg)
	{
		GeoObject test = new Circle(4);
		test.setXPos(3);
		test.setYPos(4);
		
		GeoObject test2 = new Rectangle(5,6);
		test2.setXPos(5);
		test2.setYPos(7);
		test2.setColor("black");
		test2.setFilled(true);
		
		
		System.out.println(test.toString() + "\n");
		System.out.println(test2.toString());
	}
}
