/*
 *Q12. Create a class Rectangle. The class has attributes length and width, each of which defaults to 1. 
 *It has methods that calculate the perimeter and the area of the rectangle. It has set() and get() methods for both length and width.
 * The set() methods should verify that length and width are each floating point numbers larger than 0.0 
 *and less than 20.0. Write a suitable driver program to test each of your methods in class Rectangle.
 *
 *
 */

public class RectangleDriver
{
	public static void main(String args[]){
		
		Rectangle lenght = new Rectangle (10.0, 5.0);		
		
		System.out.println("Area: " + lenght.getArea() );
		System.out.println("Perimeter: " + lenght.getPerimeter());	
		
	}
}