/** 
 *
 *
 * A small program to test the classes in the Shape hierarchy.
 *
 * The Shape hierarchy looks like this:
 *
 *            Shape
 *         _____|_____
 *        /     |     \
 *  Rectangle  Circle  Triangle
 *    
 */

public class Shapes {
        
    public static void main(String[] args) {
 
    	  Shape[] a = new Shape[3];
        a[0] = new Rectangle(3, 4);
        a[1] = new Triangle(3, 4);
        a[2] = new Circle(4);
        
        // Prints the area and perimeter of each object in 'a'.

        for (int i = 0; i < a.length; i++) {
            System.out.printf("%5.2f %5.2f\n",a[i].getArea(),a[i].getPerimeter());
        }
    
	     // Creates another Rectangle object for experimentation
	 	  Rectangle r = new Rectangle (4, 10);
		  System.out.printf("%5.2f %5.2f\n",r.getArea(),r.getPerimeter());
	      shrink (r);
		  System.out.printf("%5.2f %5.2f\n",r.getArea(),r.getPerimeter());

		  // Shape s = new Shape();
		  
	}
	
	public static void shrink (Resizable obj)
	//
	//	Accepts as argument an object of class that implements Resizable, and shrinks
	// it size by half.
	{
		 obj.resize(0.5);
	}
}