package oppgave2;

public abstract class GeoObject {
	private String color = "white";
	private boolean filled;
	private int xPos;
	private int yPos;
	
	protected GeoObject() {
		xPos = 0;
		yPos = 0;
		filled = false;
	}
	
	protected GeoObject(int xPos, int yPos, boolean filled, String color) {
	    this.xPos = xPos;
	    this.yPos = yPos;
	    this.filled = filled;
	    this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
	    this.color = color;
	}
	
	public int getXPos(){
		return xPos;
	}
	
	public int getYPos(){
		return yPos;
	}
	
	public void setXPos(int xPos){
		this.xPos = xPos;
	}
	
	public void setYPos(int yPos){
		this.yPos = yPos;
	}
	
	public boolean isFilled() {
	    return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
}