public class Square 
{
    private double side;
    
	/**
     * Sets the side of the square
     * @param s the length of a side
     */
    public Square (double s)
    { 
	 	 side = s;
	}
	
	 /**
     * Update the side of the square
     * @param s the length of a side
     */
    public void setSide(double s)
    { 
	 	 side = s;
	 }

    /**
     * Returns the current value of a side.
     * @return  a <code>double</code> the length of a side>.
     */
    public double getSide()
    {  
	 	return side; 
	 }

	 /**
     * Returns a message containing the value of the side
     * @return  a <code>String</code> with the length of a side.
     */
    public String toString()
    { 
	 	return "Square with side " + side; 
	 }
}

