/**
* Allows for the user to create a three-dimensional point using values for
* an x, y, and z axis.
*
* @author Ethan Hopkins
* @version 1.0
* PointThreeD Class
* Spring Semester/Freshman Year
*/

package arraylist;

public class PointThreeD {
	private double xPoint; //determines where the point is on the x-axis.
	private double yPoint; //determines where the point is on the y-axis.
	private double zPoint; //determines where the point is on the z-axis.
	
	/**
	 * default constructor
	 */
	public PointThreeD() {
		xPoint = 0;
		yPoint = 0;
		zPoint = 0;
	}//end default constructor
	
	/**
	 * preferred constructor
	 * @param x passes a new value for x
	 * @param y passes a new value for y
	 * @param z passes a new value for z
	 */
	public PointThreeD(double x, double y, double z) {
		xPoint = x;
		yPoint = y;
		zPoint = z;
	}//end preferred constructor

	
	/**
	 * toString method
	 * will print all methods and elements
	 */
	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}//end toString method
	
//end program
}
