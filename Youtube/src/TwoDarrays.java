import java.util.ArrayList;
import java.util.List;

public class TwoDarrays {

	public static void main(String[] args) {
		
		int [][] grades = {
				{1,3,5},
				{8,4,2,6,7,9,2,1},
				{3,6,8},
				{},
				{5}
		};
		//System.out.println(grades.length);
		//System.out.println(grades[1].length);
		//System.out.println(grades[2].length);
		
		for(int row = 0; row< grades.length; row++) {
			for(int column = 0; column< grades[row].length; column++) {
				System.out.print(grades[row][column] + " ");
			}
		}
		 
		List<Integer> grades1 = new ArrayList <Integer>();
		
		


	}

}
