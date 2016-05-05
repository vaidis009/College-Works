package lab5q6;

public class Sphere extends Circle {

	public Sphere(double r) {
		super(r);		
	}
	public double sphereArea(){
		return 4*Math.PI*getRadius()*getRadius();
	}
	public double sphereVolume() {
	      return (4.0 / 3.0) * Math.PI * getRadius() * getRadius() * getRadius();
	   }
	

}
