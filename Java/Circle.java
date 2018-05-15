/**
    Circle class.
 */
public class Circle extends Shape {
    
    // The radius of this circle.
    private double radius;
    
    // Constructs a new circle with the given radius 'r'.
    public Circle(double r) {
         setRadius(r);
    }
	 
	 // Returns the radius
	 public double getRadius()
	 {
	 		return radius;
	 }
	 
	 // Changes the value of the radius, and modifies area and perimeter
	  public void setRadius (double r) {
	  	  radius = r;
	  }

	 // Returns the area of a circle
	  public double getArea()
	  {
	  	  return(Math.PI * radius * radius);
	  }

	  // Returns the perimeter of a circumference
	  public double getPerimeter()
	  {
	  	  return(Math.PI * 2 * radius);
	  }
	  

}