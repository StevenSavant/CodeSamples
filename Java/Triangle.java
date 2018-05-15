/*
	Triangle class.
*/

public class Triangle extends Shape {
    
    public double base;
    public double height;
    
	 // Constructs a Triangle using base and height, sets area and perimeter
    public Triangle (double b, double h) {
        base = b;
        height = h;
    }
    
	 // Returns the height
    public double getHeight() {
        return height;
    }
    
	 // Returns the base
	 public double getBase() {
        return base;
    }
	 
	  // Returns the perimeter
	 public double getPerimeter() {
        return (base + height + Math.sqrt (base * base + height * height));
    }

	   // Returns the area
	 public double getArea() {
        return (base * height / 2);
    }
	 
	 // Changes the height value, recomputes area and perimeter
	 public void setHeight (double h) {
	  	  height = h;
	 }

	 // Changes the base value, recomputes area and perimeter
 	 public void setBase (double b) {
	  	  base = b;
	 }
}