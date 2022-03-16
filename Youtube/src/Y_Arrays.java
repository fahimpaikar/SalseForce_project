import java.util.Arrays;
import java.util.Scanner;

public class Y_Arrays {

	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		int size = input.nextInt();
//		int[] grades = new int [size];
////		grades[3] = 232;
//		
////		int [] gradess = {3,6,232,67,233,77,31,2};
////		
////		System.out.println(gradess[4]);
////		System.out.println(Arrays.toString(gradess));
//		
//		
//		
//		for( int i = 0; i <size; i++) {
//			int x = input.nextInt();
//			grades[i] = x;
//			
//		}
//		
//		System.out.println(Arrays.toString(grades));
//		
		
		int [] grades = {10,20,46,3,6,30,40,50,2};
		 Arrays.sort(grades);
		 System.out.println(Arrays.toString(grades));
		 
		Arrays.fill(grades, 67);// to fill an array
		System.out.println(Arrays.toString(grades));
		
		
	
		

	}

}
