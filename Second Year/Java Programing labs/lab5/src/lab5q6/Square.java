package lab5q6;

public class Square {
	private double length;
	private double width;
	
	public Square(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double squareArea(){
		return length* width;
	}
}





