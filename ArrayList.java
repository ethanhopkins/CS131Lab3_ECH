/**
* Allows for the user to create an array list of a generic type and append new
* items with the addItem method.
*
* @author Ethan Hopkins
* @version 1.0
* ArrayList Class
* Spring Semester/Freshman Year
*/

package arraylist;

import java.util.Arrays;

public class ArrayList<T> {

	private final int DEFAULT_SIZE=10; //will set the size of the array list to 10 if no other size has been specified.
   	private int currentItem=0; //keeps track of the current index being adjusted.
   	private T arList[]; //creates a new array list of generic type T.
	
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	// arList=new T[DEFAULT_SIZE];                                        				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  
    }//end preferred constructor
  
 
/**
 * addItem method
 * adds a new item of type T to arrayList
 * @param item will allow a value to be passed in for the current array index
 * @return a boolean value dependent upon whether or not the new item has been added
 */
  public boolean addItem(T item) {
	  arList[currentItem] = item;
	  currentItem++;
	  if (currentItem > 0) {
		  return true;
	  } else {
		  return false;
	  }
  }//end addItem method

  
/**
 * toString method
 * will print all methods and elements
 */
  @Override
  public String toString() {
	  System.out.println("ArrayList [DEFAULT_SIZE=" + DEFAULT_SIZE + ", currentItem=" + currentItem + ", arList="
			  + Arrays.toString(arList) + "]");
	  return "ArrayList [DEFAULT_SIZE=" + DEFAULT_SIZE + ", currentItem=" + currentItem + ", arList="
			  + Arrays.toString(arList) + "]";
  }//end toString method
  
//end program
}