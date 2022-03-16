package Kabul;

public class stadium {

	public static void main(String[] args) {
		int a = 140;
		int b = 230;
		int c = 330;
		double val1 = 89.09;
		double val2 = 90.34;
		
		if (a >b && b>c ) {
			System.out.println("A is the greatest value.");
		}else if (b>a && b>c) {
			System.out.println("B has the greatest value.");
		}else if (c>a && c> b) {
			System.out.println("C has the greatest value.");
		}else {
			System.out.println("All the valures are equal.");
		}
		if (val1 == val2) {	
			System.out.println("The values are equal");
		} else if (val1>val2 && val2> 0) {
			System.out.println(val1+ "is greater than"+ val2);
		}else {
			System.out.println(val2+ " Is greater than "+val1);
		}

	}

}
