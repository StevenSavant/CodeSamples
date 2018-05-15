/* Objects of any class that implements this interface
   should provide a resize() method to change their size
	by the factor provided as argument.  For example, 
	calling resize with a factor of 2 should double the
	size of the object */

public interface Resizable
{
	public void resize (double factor);
}