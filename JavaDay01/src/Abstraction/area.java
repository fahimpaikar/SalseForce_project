package Abstraction;

public class area extends shape {

	int rectangleArea(int a, int b) {
		int z = a*b;
		return z;
	}

    int squareArea(int A, int B) {
		
		return B*A;
	}

	double circleArea(double f) {
		
		return 2*e*f;
	}

	public static void main(String[] args) {
		
		area Area = new area();
	    
        System.out.println(Area.rectangleArea(20, 40));
	    System.out.println(Area.squareArea(10, 10));
		System.out.println(Area.circleArea(15));

	}

}
