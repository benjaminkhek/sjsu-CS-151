/**
 * Class represents a cell of the 9x9 sudoku board
 * 
 * @author Aleksandra, Ben, Jefferson
 *
 */
import javax.swing.JLabel;



public class Cell extends JLabel {
	private int x;
	private int y;
	
	/**
	 * Constructor
	 * creates a single cell object
	 * sets up the initial graphic values
	 * @param x X-position of cell
	 * @param y Y-position of cell
	 */
	 public Cell(int x, int y) {
		 super("", CENTER);
		 this.x = x;
         this.y = y;
         
         //set dimensions
         //set boarder
         //set size
         //set color

	    }
	 
	 /**
	  * sets the int value to the cell
	  * and set up the color depending on id help is turned on
	  */
	 public void setValue (){
		 
	 }
	 
	 /**
	  * getter method
	  * @return a positions x of the cell
	  */
	 public int getX(){
		 return x;
	 }
	 
	 /**
	  * getter method
	  * @return a positions y of the cell
	  */
	 public int getY(){
		 return y;
	 }
	 
	 
	 
	 
		      
		         

}
