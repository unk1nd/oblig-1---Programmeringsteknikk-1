package oppgave2;
public class Rectangle extends GeoObject
{
	private double length, width;
	
	public Rectangle() {
		length = 1.0;
		width = 1.0;
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	@Override
	public double getArea() {
		return (width*length); 
		}

	@Override
	public double getPerimeter() {
		return ((width*2)+(length*2)); 
	}
	
	public String toString() {
		return "Rektangelet med lengden: " + length + " og bredden: " + width +
		" har arealet: " + getArea() + " og omkretsen: " + getPerimeter() + ".\n" + 
		"Rektangelet har fargen: " + getColor() + " og er" + (isFilled() ? " fylt" : " ikke fylt" ) +
		" og er på posisjonen (x/y): " + getXPos() + "/" + getYPos() + ".";
	}
	
}