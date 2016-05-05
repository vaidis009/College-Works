public class Rectangle
{
	private double area;
	private double width;
	private double lenght;
	private double perimeter;
	
	public Rectangle(double leng, double wid)
	{
		setArea(leng, wid);
		setPerimeter(leng, wid);
	}

	public void setArea(double leng, double wid)
	{
		area=leng*wid;
	}
	
	public double getArea()
	{
		return area;
	}
	public void setPerimeter(double leng, double wid)
	{
		perimeter=(leng*2)+(wid*2);
	}
	public double getPerimeter()
	{
		return perimeter;
	}
	
}






