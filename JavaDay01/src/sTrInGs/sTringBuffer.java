package sTrInGs;

public class sTringBuffer {

	public static void main(String[] args) {
		
		StringBuffer value = new StringBuffer("Fahim ");
		System.out.println(value);
		System.out.println(value.append("Paikar "));
		System.out.println(value.append("weighs "));
		System.out.println(value.append(210 ));
		System.out.println(value.append(" Lbs"));
		System.out.println(value);

		StringBuilder a = new StringBuilder ("Fahim Khan ");
		
		a.append("Is King!");
		System.out.println(a);
	}

}
