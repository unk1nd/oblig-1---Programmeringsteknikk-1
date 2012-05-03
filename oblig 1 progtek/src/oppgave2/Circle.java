package oppgave2;


public class Circle extends GeoObject
{
	private final double pi = Math.PI;
	private double radius;
	
	public Circle() {
		radius = 1.0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public double getArea() {
		return  (Math.pow(radius, 2)*pi);
	}

	@Override
	public double getPerimeter() {
		return (2*pi*radius); 
	}
	
	
	public String toString() {
		return "Sirkelen med radius: " + radius +
		" har arealet: " + getArea() + " og omkretsen: " + getPerimeter() + ".\n" + 
		"Sirkelen har fargen: " + getColor() + " og er" + (isFilled() ? " fylt" : " ikke fylt" ) +
		" og er på posisjonen (x/y): " + getXPos() + "/" + getYPos() + ".";
	}
}