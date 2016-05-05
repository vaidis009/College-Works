package lab5q6;

public class Cone extends Cylinder{

	public Cone(double r, double h) {
		super(r, h);
		}
	
	public double coneArea(){
		return Math.PI*getRadius()*(getRadius()*getRadius()+getHeight()*getHeight())+Math.PI*getRadius()*getRadius();
	}
	public double coneVolume(){
		return 1.0/3.0 *Math.PI*getRadius()*getRadius()* getHeight();
	}
}

