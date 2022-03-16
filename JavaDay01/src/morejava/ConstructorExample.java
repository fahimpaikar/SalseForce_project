package morejava;

public class ConstructorExample {
  int t,z;
  
  ConstructorExample(int a, int b){
	  System.out.println("This is parameterized constructor");
	  z = a;
	  t = b;
	  System.out.println("Value of y is: "+z);
	  System.out.println("Value of t is: "+t);
  }

}
