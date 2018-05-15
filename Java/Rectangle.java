/*
	Rectangle class
*/

// A rectangle.
public class Rectangle extends Shape implements Resizable {
    
    // The height of this rectangle.
    public double length;
    
    // The width of this rectangle.
    public double width;
    
    // Constructs a new rectangle with height 'h' and width 'w'.
    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    
	 // Returns the length of the Rectangle
    public double getLength() {
        return length;
    }
    
	 // Modifies the length of the Rectangle
	 public void setLength (double l) {
	  	  length = l;
	 }

	 // Returns the width of the Rectangle
	 public double getWidth() {
        return width;
    }
	 
	 // Modifies the width of the Rectangle
	 public void setWidth (double w) {
	  	  width = w;;
	 }
    
  	 public double getArea ( ) 
	 { 
	 	return width * length;
	 }
         
	 public double getPerimeter ( )
	 {  
	 	return (width * 2) + (length * 2);
	 }
    
   public void resize (double factor)
   {
      width = width * factor;
      length = length * factor;
   }
  
}