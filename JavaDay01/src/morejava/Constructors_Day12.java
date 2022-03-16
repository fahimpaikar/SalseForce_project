package morejava;

public class Constructors_Day12 {
	
  public Constructors_Day12() {
	  System.out.println("      This is a default constructor form this Class!!!!! ");
  }
	public static void main(String[] args) {
		// default Constructor 
		Day12_Constructor def = new Day12_Constructor();
		Day12_Constructor userDef = new Day12_Constructor(3.5);
		
		def.hello();
		Constructors_Day12 c = new Constructors_Day12();
		Day12_Constructor d = new Day12_Constructor(5, "that");
		Day12_Constructor e = new Day12_Constructor("fahim", "Paikar");
		ConstructorExample f = new ConstructorExample(12, 14);
		
		
	}

}
