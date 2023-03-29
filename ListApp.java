/**
* Acts as the application class for ArrayList, Square, and PointThreeD.
*
* @author Ethan Hopkins
* @version 1.0
* ArrayList Application
* Spring Semester/Freshman Year
*/

package arraylist;

public class ListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> stringList= new ArrayList<String>(2);
		ArrayList<Square> squareList= new ArrayList<Square>(2);
		ArrayList<PointThreeD> pointList= new ArrayList<PointThreeD>(2);
		
		
		stringList.addItem("Item1");
		stringList.addItem("Item2");
		
		Square sq1 = new Square(2);
		Square sq2 = new Square(6);
		squareList.addItem(sq1);
		squareList.addItem(sq2);
		
		PointThreeD point1 = new PointThreeD(2, 4, 6);
		PointThreeD point2 = new PointThreeD(8, 10, 12);
		pointList.addItem(point1);
		pointList.addItem(point2);
		
		
		System.out.println("stringList:");
		stringList.toString();
		System.out.println("\n");
		System.out.println("sqaureList:");
		squareList.toString();
		System.out.println("\n");
		System.out.println("pointList:");
		pointList.toString();
		
	}

//end program
}
