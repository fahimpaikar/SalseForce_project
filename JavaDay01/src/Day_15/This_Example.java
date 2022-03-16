package Day_15;

class Hospital {
	
	String name;
	int age;
	float weight;
	
	Hospital (String name, int age, float weight){
		this();
		this.name = name;
		this.age = age;
		this.weight = weight;
		
	}
	
	Hospital (int age, float weight){
		this();
		System.out.println(" this constructor has only 2 parameters");
	}
	Hospital (){
		
		System.out.println(" This is the default constructor!!");
		
	}
	
	
	public void data() {
		System.out.println("patient name is: "+name+ ", "+"patient is "+age+" years old"+" and"+" the weight is "+ weight+ "Lbs");
	}
}



public class This_Example {

	public static void main(String[] args) {
		
      Hospital info = new Hospital( "fahim", 36, 210);
      Hospital input = new Hospital("Nooryar", 99, 450);
      input.data();
      info.data();
      
	}

}
