package Kabul;

public class university {

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}

		for (int i = 20; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println("Even numbers from 20 to 50  " + i);
			} else if (i % 2 != 0) {
				System.out.println("Odd numbers from 20 to 50  " + i);
			}
		}

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				System.out.println("we found what we were looking for.");
				break;
			}
			System.out.println(i);
		}

	}

}