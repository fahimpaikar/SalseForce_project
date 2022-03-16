package Kabul;

public class privateSchool {

	public static void main(String[] args) {
		String[] names = { "Ahmad", "Mahmood", "Kalbi", "Maqsood" };

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ", ");
		}

		int[] num = { 44, 34, 6, 43, 78, 43, 87 };
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println(sum);
		
		
		double [][] height = {
				{343.4, 65.43, 343.787},
				{44.3, 55.66, 454.657},
				{66.2, 44.3, 66.06}
		};
		
		for (int row =0; row<height.length; row++) {
			for (int col =0; col < height [row].length; col++) {
				System.out.println(height[row][col]+", ");
			}
		}
		
	}
}