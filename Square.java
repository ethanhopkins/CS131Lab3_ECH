/**
* Allows for the user to make their own square object using an input value for
* the side.
*
* @author Ethan Hopkins
* @version 1.0
* Square Class
* Spring Semester/Freshman Year
*/

package arraylist;

public class Square {
	private double side; //will be used to find the area of the square in getArea().
	
	/**
	 * default constructor
	 */
	public Square () {
		side = 0;
	}//end default constructor
	
	/**
	 * preferred constructor
	 * @param s passes a new value to side
	 */
	public Square(double s) {
		side = s;
	}//end preferred constructor
	
	
	/**
	 * getArea method
	 * @return the area of the square
	 */
	public double getArea() {
		return side * side;
	}//end getArea method
	

	/**
	 * toString method
	 * will print all methods and elements
	 */
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}//end toString method
	
//end program
}
