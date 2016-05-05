package lab5q6;

public class ShapeTest
{
   public static void main(String args[])
   {
     Circle c1, circleRef;

     Cylinder cyl, cylRef;

     c1 = new Circle(5);
     cyl = new Cylinder(10, 10);
     //***************my code*******************************************************************
    Sphere sphereObject= new Sphere(15.0);
    Cone coneObject = new Cone (5.0, 5.0);
    Square squareObject = new Square(5.0,15.0);
    //*****************************************************************************************

     System.out.println("Circle (c1) radius: " + c1.getRadius());
     System.out.println("Cylinder (cyl) radius: " + cyl.getRadius());
     System.out.println("Cylinder (cyl) height: " + cyl.getHeight());
     
     //*********************************My Code***************************************************
     System.out.println("----------------------------------------------------------------------"); 
     System.out.println("sphere Area: " + sphereObject.sphereArea()); 
     System.out.println("sphere Volume: " + sphereObject. sphereVolume());
     System.out.println("Cone  Area: " + coneObject.coneArea()); 
     System.out.println("Cone Volume: " + coneObject. coneVolume());     
     System.out.println("Square area: " + squareObject. squareArea());  
     
     
     System.out.println("--------------------------------------------------------------------"); 
     
     // 2. Create an array of superclass references
     Circle[] superclassRef = new Cylinder[5];
     
     superclassRef[0] = new Cylinder(10, 10);
     System.out.println("--------------------"); 
     //System.out.println(superclassRef[0].get);
     System.out.println("------------------------"); 
     //****************************************************************************************
     // Now treat a subclass object as a superclass object
     // circleRef is a superclass reference to a subclass object
     circleRef = cyl;   // assign Cylinder object to circleRef
System.out.println("Cylinder (cyl) radius: " +     circleRef.getRadius());

     // we can only use the superclass methods on this subclass object
     // so the following won't work:
// System.out.println("Cylinder height (via circleRef) : "  +
//       circleRef.getHeight());

// Now cast circleRef to a subclass object. Remeber, circleRef 
// is not a reference to a Circle object, but a reference to a 
// Cylinder object.
     // Following won't work:
     // cylRef = circleRef;
     // Must use a cast:

     cylRef = (Cylinder) circleRef;
System.out.println("Cylinder radius (via cylRef) : " +     cyl.getRadius());
System.out.println("Cylinder height (via cylRef): " + cyl.getHeight());


     // Attempt to treat a Circle object as a subclass object
     // Following won't work - this is like saying "all circle objects
     // are cylinder objects" - but a circle object could also 
     // be subclassed as a cone etc.

    // cylRef = (Cylinder) c1;
     // WRONG! can't treat a superclass object as a subclass object
     // The above line will throw a ClassCastException
  }

}


