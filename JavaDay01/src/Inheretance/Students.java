package Inheretance;

class Faculty {
    int numberOfTeacher = 245;
    public void classes () {
    	System.out.println(" this method will be taught in the class 104");
    }
	
}
public class Students extends Faculty {
    	 int numberOfStudents = 4326;
       
	
	public static void main(String[] args) {
		 
		Students count = new Students();
		System.out.println("We have " + count.numberOfTeacher + " teachers in this university.");
		System.out.println("The number of student are "+ count.numberOfStudents);

	}

}	
