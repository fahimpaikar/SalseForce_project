package iterator_01;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	int rollNumber;
	String Name;
	int age;
	
	Student (int rollNu, String studentName, int studentAge){
		this.rollNumber = rollNu;
		this.Name = studentName;
		this.age = studentAge;
		
	}
}


public class Iterator_02 {

	public static void main(String[] args) {
		
		Student studentOne = new Student(01, " Monir ", 40);
		Student studentTwo = new Student(02, " Hameed ", 34);
		
		ArrayList<Student> s = new ArrayList <Student> ();
		s.add(studentOne);
		s.add(studentTwo);
		
		Iterator<Student> i = s.iterator();
		while (i.hasNext()) {
			Student b = i.next();
			System.out.println(b.rollNumber + b.Name + b.age);
		}
		
		
		
		
	}

}
