
/**
 * Jamii DickWiggles
 * Nine Harakiri
 */
package lab3;

public class Course {

	private int Days;
	private String Name;
	private double Price;

	public Course(){

	}

	public void finalize() throws Throwable {

	}
	public void setDays (int Length){
		if (Length >= 1 || Length <= 10)
			Days = Length;
	}
	
	public String toString() {
		return "Name: " + Name + "Length: " + Days + "Price: " + Price;
	}
}//end Course