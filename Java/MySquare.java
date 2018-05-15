public class MySquare extends Square
{
    private double area;
   
   /**
     * Sets the side of the square
     * @param s the length of a side
     */
    public MySquare(double s)
    {
       super(s);
    }
    
   /**
     * No-argument contructor that defaults side value to 10.0 (and area to 100.0)
     */
    public MySquare()
    {
       super(10.0);
    }
   
   /**
     * Calculates, then returns the area of the square.
     * @return  a <code>double</code> the area of a square>.
     */
    public double getArea()
    {
     double sides = super.getSide();
     return area = sides * sides;
    }
}